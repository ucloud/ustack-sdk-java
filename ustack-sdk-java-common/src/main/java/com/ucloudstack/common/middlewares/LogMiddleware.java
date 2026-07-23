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
package com.ucloudstack.common.middlewares;

import com.ucloudstack.common.exception.OpenAPIException;
import com.ucloudstack.common.middleware.BaseMiddleware;
import com.ucloudstack.common.middleware.Context;
import com.ucloudstack.common.middleware.Middleware;
import com.ucloudstack.common.request.Request;
import com.ucloudstack.common.response.Response;

import com.google.gson.Gson;

import org.slf4j.Logger;

/** LogMiddleware is the middleware to print logs */
public class LogMiddleware extends BaseMiddleware implements Middleware {

    @Override
    public Request handleRequest(Context context) throws OpenAPIException {
        Logger logger = context.getConfig().getLogger();
        logger.info(new Gson().toJson(context.getRequest().encode()));
        return super.handleRequest(context);
    }

    @Override
    public Response handleResponse(Context context) throws OpenAPIException {
        Logger logger = context.getConfig().getLogger();
        logger.info(
                String.format(
                        "[%s] %s",
                        context.getResponse().getRequestId(),
                        new Gson().toJson(context.getResponse())));
        return super.handleResponse(context);
    }

    @Override
    public void handleException(Context context) throws OpenAPIException {
        Logger logger = context.getConfig().getLogger();
        logger.error(new Gson().toJson(context.getException().getMessage()));
        super.handleException(context);
    }
}
