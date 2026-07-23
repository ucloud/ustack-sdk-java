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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class HttpInfo {

    /** 请求体，HTTP请求正文内容 */
    @SerializedName("RequestBody")
    private String requestBodyParam;

    /** 请求头，HTTP请求头的JSON字符串 */
    @SerializedName("RequestHeader")
    private String requestHeaderParam;

    /** 请求方法，HTTP请求的方法类型 */
    @SerializedName("RequestMethods")
    private String requestMethodsParam;

    /** 请求参数，HTTP请求的查询参数 */
    @SerializedName("RequestParams")
    private String requestParamsParam;

    /** 请求协议，HTTP或HTTPS协议类型 */
    @SerializedName("RequestProtocolType")
    private String requestProtocolTypeParam;

    /** 请求URI，HTTP请求的目标路径 */
    @SerializedName("RequestURI")
    private String requestURIParam;

    /** 响应体，HTTP响应正文内容 */
    @SerializedName("ResponseBody")
    private String responseBodyParam;

    /** 响应头，HTTP响应头的JSON字符串 */
    @SerializedName("ResponseHeader")
    private String responseHeaderParam;

    /** HTTP状态码，响应的HTTP状态码 */
    @SerializedName("ResponseStatusCode")
    private Integer responseStatusCodeParam;


    public String getRequestBody() {
        return requestBodyParam;
    }

    public void setRequestBody(String requestBodyParam) {
        this.requestBodyParam = requestBodyParam;
    }

    public String getRequestHeader() {
        return requestHeaderParam;
    }

    public void setRequestHeader(String requestHeaderParam) {
        this.requestHeaderParam = requestHeaderParam;
    }

    public String getRequestMethods() {
        return requestMethodsParam;
    }

    public void setRequestMethods(String requestMethodsParam) {
        this.requestMethodsParam = requestMethodsParam;
    }

    public String getRequestParams() {
        return requestParamsParam;
    }

    public void setRequestParams(String requestParamsParam) {
        this.requestParamsParam = requestParamsParam;
    }

    public String getRequestProtocolType() {
        return requestProtocolTypeParam;
    }

    public void setRequestProtocolType(String requestProtocolTypeParam) {
        this.requestProtocolTypeParam = requestProtocolTypeParam;
    }

    public String getRequestURI() {
        return requestURIParam;
    }

    public void setRequestURI(String requestURIParam) {
        this.requestURIParam = requestURIParam;
    }

    public String getResponseBody() {
        return responseBodyParam;
    }

    public void setResponseBody(String responseBodyParam) {
        this.responseBodyParam = responseBodyParam;
    }

    public String getResponseHeader() {
        return responseHeaderParam;
    }

    public void setResponseHeader(String responseHeaderParam) {
        this.responseHeaderParam = responseHeaderParam;
    }

    public Integer getResponseStatusCode() {
        return responseStatusCodeParam;
    }

    public void setResponseStatusCode(Integer responseStatusCodeParam) {
        this.responseStatusCodeParam = responseStatusCodeParam;
    }

}
