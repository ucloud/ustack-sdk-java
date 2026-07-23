package com.ucloudstack.common.client;

import static org.junit.Assert.assertEquals;

import com.ucloudstack.common.config.Config;
import com.ucloudstack.common.credential.Credential;
import com.ucloudstack.common.exception.UCloudStackException;
import com.ucloudstack.common.request.Request;
import com.ucloudstack.common.response.Response;
import com.ucloudstack.common.transport.DefaultTransport;

import org.apache.http.*;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.junit.Test;
import org.mockito.Mockito;

public class ClientTest {

    @Test
    public void testCaseOK() {
        Request request = new Request();
        request.setAction("GetRegion");

        Response response = new Response();
        response.setRetCode(0);
        this.testInvoke(request, response, null, false);
    }

    @Test
    public void testCaseNotFound() {
        Request request = new Request();
        request.setAction("NotFound");

        Response response = new Response();
        response.setRetCode(161);
        this.testInvoke(request, response, null, true);
    }

    @Test
    public void testCaseException() {
        Request request = new Request();
        request.setAction("GetRegion");

        Response response = new Response();
        response.setRetCode(0);
        this.testInvoke(request, response, new HttpException("some exception occurs") {}, true);
    }

    //    @Test
    //    public void testCaseRemote() {
    //        Request request = new Request();
    //        request.setAction("GetRegion");
    //
    //        Response response = new Response();
    //        response.setRetCode(0);
    //        this.testInvoke(request, null, null, false);
    //    }

    public void testInvoke(
            Request request, Response response, Exception injectedException, Boolean hasException) {
        Config config = new Config();
        config.setUserAgent("Demo/0.42");
        Credential credential = new Credential("foo", "bar");
        DefaultClient client = new DefaultClient(config, credential);
        DefaultTransport transport = (DefaultTransport) client.getTransport();

        if (injectedException != null) {
            // inject exception into http client of transport
            CloseableHttpClient httpClient = Mockito.mock(CloseableHttpClient.class);
            try {
                HttpPost httpPost = new HttpPost();
                Mockito.doThrow(injectedException).when(httpClient).execute(httpPost);
            } catch (Exception e) {
                e.printStackTrace();
            }
            transport.setHttpClient(httpClient);
        } else if (response != null) {
            transport = Mockito.mock(DefaultTransport.class);
            try {
                Mockito.when(transport.invoke(request, response.getClass())).thenReturn(response);
            } catch (UCloudStackException e) {
                e.printStackTrace();
            }
        } else {
            response = new Response();
        }

        client.setTransport(transport);

        try {
            client.invoke(request, response.getClass());
        } catch (UCloudStackException e) {
            e.printStackTrace();
            assertEquals(true, hasException);
            return;
        }
        assertEquals(false, hasException);
    }
}
