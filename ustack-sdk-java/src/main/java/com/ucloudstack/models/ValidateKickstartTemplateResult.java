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

public class ValidateKickstartTemplateResult {

    /** 错误列表 */
    @SerializedName("Errors")
    private List<String> errorsParam;

    /** 从模板中提取的变量列表 */
    @SerializedName("ExtractedVars")
    private List<String> extractedVarsParam;

    /** 父模板名称（如果使用继承） */
    @SerializedName("ParentTemplate")
    private String parentTemplateParam;

    /** 模板名称 */
    @SerializedName("TemplateName")
    private String templateNameParam;

    /** 是否使用模板继承 */
    @SerializedName("UsesInheritance")
    private Boolean usesInheritanceParam;

    /** 是否有效 */
    @SerializedName("Valid")
    private Boolean validParam;

    /** 警告列表 */
    @SerializedName("Warnings")
    private List<String> warningsParam;


    public List<String> getErrors() {
        return errorsParam;
    }

    public void setErrors(List<String> errorsParam) {
        this.errorsParam = errorsParam;
    }

    public List<String> getExtractedVars() {
        return extractedVarsParam;
    }

    public void setExtractedVars(List<String> extractedVarsParam) {
        this.extractedVarsParam = extractedVarsParam;
    }

    public String getParentTemplate() {
        return parentTemplateParam;
    }

    public void setParentTemplate(String parentTemplateParam) {
        this.parentTemplateParam = parentTemplateParam;
    }

    public String getTemplateName() {
        return templateNameParam;
    }

    public void setTemplateName(String templateNameParam) {
        this.templateNameParam = templateNameParam;
    }

    public Boolean getUsesInheritance() {
        return usesInheritanceParam;
    }

    public void setUsesInheritance(Boolean usesInheritanceParam) {
        this.usesInheritanceParam = usesInheritanceParam;
    }

    public Boolean getValid() {
        return validParam;
    }

    public void setValid(Boolean validParam) {
        this.validParam = validParam;
    }

    public List<String> getWarnings() {
        return warningsParam;
    }

    public void setWarnings(List<String> warningsParam) {
        this.warningsParam = warningsParam;
    }

}
