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

public class BMCStep {

    /** 请求体模板 */
    @SerializedName("BodyTpl")
    private String bodyTplParam;

    /** 数据提取规则 */
    @SerializedName("DataExtractionRules")
    private List<KeyValuePair> dataExtractionRulesParam;

    /** 动态请求头 */
    @SerializedName("DynamicHeaders")
    private List<KeyValuePair> dynamicHeadersParam;

    /** 静态请求头 */
    @SerializedName("Headers")
    private List<KeyValuePair> headersParam;

    /** 是否为最终JNLP步骤 */
    @SerializedName("IsFinalJNLPStep")
    private Boolean isFinalJNLPStepParam;

    /** 是否为JNLP URL步骤 */
    @SerializedName("IsJNLPUrlStep")
    private Boolean isJNLPUrlStepParam;

    /** JNLP URL JSON字段 */
    @SerializedName("JNLPUrlJsonField")
    private String jNLPUrlJsonFieldParam;

    /** HTTP方法 */
    @SerializedName("Method")
    private String methodParam;

    /** 步骤名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 传递Cookie的步骤 */
    @SerializedName("PassCookiesFromStep")
    private String passCookiesFromStepParam;

    /** 数据后处理规则 */
    @SerializedName("PostProcessRules")
    private List<KeyValuePair> postProcessRulesParam;

    /** 请求URL */
    @SerializedName("URL")
    private String uRLParam;


    public String getBodyTpl() {
        return bodyTplParam;
    }

    public void setBodyTpl(String bodyTplParam) {
        this.bodyTplParam = bodyTplParam;
    }

    public List<KeyValuePair> getDataExtractionRules() {
        return dataExtractionRulesParam;
    }

    public void setDataExtractionRules(List<KeyValuePair> dataExtractionRulesParam) {
        this.dataExtractionRulesParam = dataExtractionRulesParam;
    }

    public List<KeyValuePair> getDynamicHeaders() {
        return dynamicHeadersParam;
    }

    public void setDynamicHeaders(List<KeyValuePair> dynamicHeadersParam) {
        this.dynamicHeadersParam = dynamicHeadersParam;
    }

    public List<KeyValuePair> getHeaders() {
        return headersParam;
    }

    public void setHeaders(List<KeyValuePair> headersParam) {
        this.headersParam = headersParam;
    }

    public Boolean getIsFinalJNLPStep() {
        return isFinalJNLPStepParam;
    }

    public void setIsFinalJNLPStep(Boolean isFinalJNLPStepParam) {
        this.isFinalJNLPStepParam = isFinalJNLPStepParam;
    }

    public Boolean getIsJNLPUrlStep() {
        return isJNLPUrlStepParam;
    }

    public void setIsJNLPUrlStep(Boolean isJNLPUrlStepParam) {
        this.isJNLPUrlStepParam = isJNLPUrlStepParam;
    }

    public String getJNLPUrlJsonField() {
        return jNLPUrlJsonFieldParam;
    }

    public void setJNLPUrlJsonField(String jNLPUrlJsonFieldParam) {
        this.jNLPUrlJsonFieldParam = jNLPUrlJsonFieldParam;
    }

    public String getMethod() {
        return methodParam;
    }

    public void setMethod(String methodParam) {
        this.methodParam = methodParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPassCookiesFromStep() {
        return passCookiesFromStepParam;
    }

    public void setPassCookiesFromStep(String passCookiesFromStepParam) {
        this.passCookiesFromStepParam = passCookiesFromStepParam;
    }

    public List<KeyValuePair> getPostProcessRules() {
        return postProcessRulesParam;
    }

    public void setPostProcessRules(List<KeyValuePair> postProcessRulesParam) {
        this.postProcessRulesParam = postProcessRulesParam;
    }

    public String getURL() {
        return uRLParam;
    }

    public void setURL(String uRLParam) {
        this.uRLParam = uRLParam;
    }

}
