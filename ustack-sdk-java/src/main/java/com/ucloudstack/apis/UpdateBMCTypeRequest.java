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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateBMCTypeRequest extends Request {

    /** 描述 */
    
    @OpenAPIParam("Description")
    private String descriptionParam;

    /** 初始数据准备规则 */
    
    @OpenAPIParam("InitialDataRules")
    private String initialDataRulesParam;

    /** JNLP模板 */
    
    @OpenAPIParam("JNLPTemplate")
    private String jNLPTemplateParam;

    /** JNLP请求体模板 */
    
    @OpenAPIParam("JnlpBodyTpl")
    private String jnlpBodyTplParam;

    /** JNLP文件类型 */
    
    @OpenAPIParam("JnlpFileType")
    private String jnlpFileTypeParam;

    /** JNLP请求头 */
    
    @OpenAPIParam("JnlpHeaders")
    private String jnlpHeadersParam;

    /** JNLP请求方法 */
    
    @OpenAPIParam("JnlpMethod")
    private String jnlpMethodParam;

    /** JNLP获取方式类型 */
    
    @OpenAPIParam("JnlpProcessType")
    private String jnlpProcessTypeParam;

    /** JNLP URL */
    
    @OpenAPIParam("JnlpURL")
    private String jnlpURLParam;

    /** 登录请求体模板 */
    
    @OpenAPIParam("LoginBodyTpl")
    private String loginBodyTplParam;

    /** 登录请求头 */
    
    @OpenAPIParam("LoginHeaders")
    private String loginHeadersParam;

    /** 登录方法 */
    
    @OpenAPIParam("LoginMethod")
    private String loginMethodParam;

    /** 登录URL */
    
    @OpenAPIParam("LoginURL")
    private String loginURLParam;

    /** BMC类型名称 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 会话提取器 */
    
    @OpenAPIParam("SessionExtractor")
    private String sessionExtractorParam;

    /** 多步流程定义 */
    
    @OpenAPIParam("Steps")
    private String stepsParam;


    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSessionExtractor() {
        return sessionExtractorParam;
    }

    public void setSessionExtractor(String sessionExtractorParam) {
        this.sessionExtractorParam = sessionExtractorParam;
    }

    public String getSteps() {
        return stepsParam;
    }

    public void setSteps(String stepsParam) {
        this.stepsParam = stepsParam;
    }

}
