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

public class BMCType {

    /** 创建时间 */
    @SerializedName("CreatedAt")
    private Integer createdAtParam;

    /** 描述 */
    @SerializedName("Description")
    private String descriptionParam;

    /** ID */
    @SerializedName("ID")
    private String iDParam;

    /** 初始数据准备规则 */
    @SerializedName("InitialDataRules")
    private String initialDataRulesParam;

    /** JNLP模板 */
    @SerializedName("JNLPTemplate")
    private String jNLPTemplateParam;

    /** JNLP请求体模板 */
    @SerializedName("JnlpBodyTpl")
    private String jnlpBodyTplParam;

    /** JNLP文件类型 */
    @SerializedName("JnlpFileType")
    private String jnlpFileTypeParam;

    /** JNLP请求头 */
    @SerializedName("JnlpHeaders")
    private String jnlpHeadersParam;

    /** JNLP请求方法 */
    @SerializedName("JnlpMethod")
    private String jnlpMethodParam;

    /** JNLP获取方式类型 */
    @SerializedName("JnlpProcessType")
    private String jnlpProcessTypeParam;

    /** JNLP URL */
    @SerializedName("JnlpURL")
    private String jnlpURLParam;

    /** 登录请求体模板 */
    @SerializedName("LoginBodyTpl")
    private String loginBodyTplParam;

    /** 登录请求头 */
    @SerializedName("LoginHeaders")
    private String loginHeadersParam;

    /** 登录方法 */
    @SerializedName("LoginMethod")
    private String loginMethodParam;

    /** 登录URL */
    @SerializedName("LoginURL")
    private String loginURLParam;

    /** BMC类型名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 会话提取器 */
    @SerializedName("SessionExtractor")
    private String sessionExtractorParam;

    /** 多步流程定义 */
    @SerializedName("Steps")
    private List<BMCStep> stepsParam;

    /** 更新时间 */
    @SerializedName("UpdatedAt")
    private Integer updatedAtParam;


    public Integer getCreatedAt() {
        return createdAtParam;
    }

    public void setCreatedAt(Integer createdAtParam) {
        this.createdAtParam = createdAtParam;
    }

    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
    }

    public String getID() {
        return iDParam;
    }

    public void setID(String iDParam) {
        this.iDParam = iDParam;
    }

    public String getInitialDataRules() {
        return initialDataRulesParam;
    }

    public void setInitialDataRules(String initialDataRulesParam) {
        this.initialDataRulesParam = initialDataRulesParam;
    }

    public String getJNLPTemplate() {
        return jNLPTemplateParam;
    }

    public void setJNLPTemplate(String jNLPTemplateParam) {
        this.jNLPTemplateParam = jNLPTemplateParam;
    }

    public String getJnlpBodyTpl() {
        return jnlpBodyTplParam;
    }

    public void setJnlpBodyTpl(String jnlpBodyTplParam) {
        this.jnlpBodyTplParam = jnlpBodyTplParam;
    }

    public String getJnlpFileType() {
        return jnlpFileTypeParam;
    }

    public void setJnlpFileType(String jnlpFileTypeParam) {
        this.jnlpFileTypeParam = jnlpFileTypeParam;
    }

    public String getJnlpHeaders() {
        return jnlpHeadersParam;
    }

    public void setJnlpHeaders(String jnlpHeadersParam) {
        this.jnlpHeadersParam = jnlpHeadersParam;
    }

    public String getJnlpMethod() {
        return jnlpMethodParam;
    }

    public void setJnlpMethod(String jnlpMethodParam) {
        this.jnlpMethodParam = jnlpMethodParam;
    }

    public String getJnlpProcessType() {
        return jnlpProcessTypeParam;
    }

    public void setJnlpProcessType(String jnlpProcessTypeParam) {
        this.jnlpProcessTypeParam = jnlpProcessTypeParam;
    }

    public String getJnlpURL() {
        return jnlpURLParam;
    }

    public void setJnlpURL(String jnlpURLParam) {
        this.jnlpURLParam = jnlpURLParam;
    }

    public String getLoginBodyTpl() {
        return loginBodyTplParam;
    }

    public void setLoginBodyTpl(String loginBodyTplParam) {
        this.loginBodyTplParam = loginBodyTplParam;
    }

    public String getLoginHeaders() {
        return loginHeadersParam;
    }

    public void setLoginHeaders(String loginHeadersParam) {
        this.loginHeadersParam = loginHeadersParam;
    }

    public String getLoginMethod() {
        return loginMethodParam;
    }

    public void setLoginMethod(String loginMethodParam) {
        this.loginMethodParam = loginMethodParam;
    }

    public String getLoginURL() {
        return loginURLParam;
    }

    public void setLoginURL(String loginURLParam) {
        this.loginURLParam = loginURLParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getSessionExtractor() {
        return sessionExtractorParam;
    }

    public void setSessionExtractor(String sessionExtractorParam) {
        this.sessionExtractorParam = sessionExtractorParam;
    }

    public List<BMCStep> getSteps() {
        return stepsParam;
    }

    public void setSteps(List<BMCStep> stepsParam) {
        this.stepsParam = stepsParam;
    }

    public Integer getUpdatedAt() {
        return updatedAtParam;
    }

    public void setUpdatedAt(Integer updatedAtParam) {
        this.updatedAtParam = updatedAtParam;
    }

}
