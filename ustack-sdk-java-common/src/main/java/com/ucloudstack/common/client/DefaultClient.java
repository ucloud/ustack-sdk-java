/**
 * Copyright 2026 UCloud Technology Co., Ltd.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ucloudstack.common.client;

import com.ucloudstack.common.config.Config;
import com.ucloudstack.common.credential.Credential;
import com.ucloudstack.common.exception.OpenAPIException;
import com.ucloudstack.common.exception.RetCodeException;
import com.ucloudstack.common.middleware.Context;
import com.ucloudstack.common.middleware.Middleware;
import com.ucloudstack.common.middlewares.CredentialMiddleware;
import com.ucloudstack.common.middlewares.LogMiddleware;
import com.ucloudstack.common.middlewares.ValidationMiddleware;
import com.ucloudstack.common.request.Request;
import com.ucloudstack.common.response.Response;
import com.ucloudstack.common.transport.DefaultTransport;
import com.ucloudstack.common.transport.Transport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DefaultClient implements Client {
    private Transport transport;

    private Config config;

    private Credential credential;

    private final List<Middleware> middlewares;

    public DefaultClient(Config config, Credential credential) {
        this.setConfig(config);
        this.setCredential(credential);
        this.setTransport(
                new DefaultTransport(
                        this.getConfig().getBaseUrl(), this.getConfig().getUserAgent()));
        this.middlewares = new ArrayList<>();
        this.useMiddleware(new ValidationMiddleware());
        this.useMiddleware(new CredentialMiddleware());
        this.useMiddleware(new LogMiddleware());
    }

    @Override
    public Response invoke(Request request, Class<? extends Response> clazz)
            throws OpenAPIException {
        Context ctx = new Context();
        ctx.setConfig(this.getConfig());
        ctx.setCredential(this.getCredential());

        // resolve request
        ctx.setRequest(request);
        for (Middleware middleware : this.middlewares) {
            ctx.setRequest(middleware.handleRequest(ctx));
        }

        // do invoking
        Response response = null;
        try {
            response = call(ctx, request, clazz);
        } catch (OpenAPIException e) {
            ctx.setException(e);
            for (Middleware middleware : this.middlewares) {
                middleware.handleException(ctx);
            }
            throw e;
        }

        // resolve response
        ctx.setResponse(response);
        for (Middleware middleware : this.middlewares) {
            ctx.setResponse(middleware.handleResponse(ctx));
        }
        return ctx.getResponse();
    }

    private Response call(Context ctx, Request request, Class<? extends Response> clazz)
            throws OpenAPIException {
        Response response = null;
        Integer maxRetries = request.loadMaxRetries();
        for (int i = 0; i <= maxRetries; i++) {
            // TODO: use backoff retry
            try {
                response = this.transport.invoke(ctx.getRequest(), clazz);
                break;
            } catch (OpenAPIException e) {
                if (i == maxRetries) {
                    throw e;
                }
            }
        }

        // check if return code is not zero, mark it as openapi server exception
        if (response != null && response.getRetCode() != 0) {
            throw new RetCodeException(
                    response.getRetCode(), response.getMessage(), response.getRequestId());
        }
        return response;
    }

    public void useMiddleware(Middleware middleware) {
        this.middlewares.add(middleware);
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    @Override
    public void close() throws IOException {
        this.transport.close();
    }
}
