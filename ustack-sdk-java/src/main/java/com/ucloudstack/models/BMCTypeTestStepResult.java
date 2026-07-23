/**
 * Copyright 2021 OpenAPI Technology Co., Ltd.
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

public class BMCTypeTestStepResult {

    /** 上下文数据快照 */
    @SerializedName("ContextDataSnapshot")
    private List<KeyValuePair> contextDataSnapshotParam;

    /** 执行时长（毫秒） */
    @SerializedName("Duration")
    private Integer durationParam;

    /** 错误信息 */
    @SerializedName("Error")
    private String errorParam;

    /** 提取的数据 */
    @SerializedName("ExtractedData")
    private List<KeyValuePair> extractedDataParam;

    /** 结果信息 */
    @SerializedName("Message")
    private String messageParam;

    /** 请求体 */
    @SerializedName("RequestBody")
    private String requestBodyParam;

    /** 请求头 */
    @SerializedName("RequestHeaders")
    private List<KeyValuePair> requestHeadersParam;

    /** 请求方法 */
    @SerializedName("RequestMethod")
    private String requestMethodParam;

    /** 请求URL */
    @SerializedName("RequestURL")
    private String requestURLParam;

    /** 响应内容（部分） */
    @SerializedName("Response")
    private String responseParam;

    /** 响应体 */
    @SerializedName("ResponseBody")
    private String responseBodyParam;

    /** 响应头 */
    @SerializedName("ResponseHeaders")
    private List<KeyValuesPair> responseHeadersParam;

    /** 响应状态码 */
    @SerializedName("ResponseStatus")
    private Integer responseStatusParam;

    /** 步骤索引 */
    @SerializedName("StepIndex")
    private Integer stepIndexParam;

    /** 步骤名称 */
    @SerializedName("StepName")
    private String stepNameParam;

    /** 是否成功 */
    @SerializedName("Success")
    private Boolean successParam;


    public List<KeyValuePair> getContextDataSnapshot() {
        return contextDataSnapshotParam;
    }

    public void setContextDataSnapshot(List<KeyValuePair> contextDataSnapshotParam) {
        this.contextDataSnapshotParam = contextDataSnapshotParam;
    }

    public Integer getDuration() {
        return durationParam;
    }

    public void setDuration(Integer durationParam) {
        this.durationParam = durationParam;
    }

    public String getError() {
        return errorParam;
    }

    public void setError(String errorParam) {
        this.errorParam = errorParam;
    }

    public List<KeyValuePair> getExtractedData() {
        return extractedDataParam;
    }

    public void setExtractedData(List<KeyValuePair> extractedDataParam) {
        this.extractedDataParam = extractedDataParam;
    }

    public String getMessage() {
        return messageParam;
    }

    public void setMessage(String messageParam) {
        this.messageParam = messageParam;
    }

    public String getRequestBody() {
        return requestBodyParam;
    }

    public void setRequestBody(String requestBodyParam) {
        this.requestBodyParam = requestBodyParam;
    }

    public List<KeyValuePair> getRequestHeaders() {
        return requestHeadersParam;
    }

    public void setRequestHeaders(List<KeyValuePair> requestHeadersParam) {
        this.requestHeadersParam = requestHeadersParam;
    }

    public String getRequestMethod() {
        return requestMethodParam;
    }

    public void setRequestMethod(String requestMethodParam) {
        this.requestMethodParam = requestMethodParam;
    }

    public String getRequestURL() {
        return requestURLParam;
    }

    public void setRequestURL(String requestURLParam) {
        this.requestURLParam = requestURLParam;
    }

    public String getResponse() {
        return responseParam;
    }

    public void setResponse(String responseParam) {
        this.responseParam = responseParam;
    }

    public String getResponseBody() {
        return responseBodyParam;
    }

    public void setResponseBody(String responseBodyParam) {
        this.responseBodyParam = responseBodyParam;
    }

    public List<KeyValuesPair> getResponseHeaders() {
        return responseHeadersParam;
    }

    public void setResponseHeaders(List<KeyValuesPair> responseHeadersParam) {
        this.responseHeadersParam = responseHeadersParam;
    }

    public Integer getResponseStatus() {
        return responseStatusParam;
    }

    public void setResponseStatus(Integer responseStatusParam) {
        this.responseStatusParam = responseStatusParam;
    }

    public Integer getStepIndex() {
        return stepIndexParam;
    }

    public void setStepIndex(Integer stepIndexParam) {
        this.stepIndexParam = stepIndexParam;
    }

    public String getStepName() {
        return stepNameParam;
    }

    public void setStepName(String stepNameParam) {
        this.stepNameParam = stepNameParam;
    }

    public Boolean getSuccess() {
        return successParam;
    }

    public void setSuccess(Boolean successParam) {
        this.successParam = successParam;
    }

}
