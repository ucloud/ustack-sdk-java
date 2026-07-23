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

public class AlertTemplateTargetInfo {

    /** 绑定的目标资源ID，目标资源ID */
    @SerializedName("TargetID")
    private String targetIDParam;

    /** 绑定的目标资源名称，目标资源名称 */
    @SerializedName("TargetName")
    private String targetNameParam;

    /** 告警模板ID，告警模板ID */
    @SerializedName("TemplateID")
    private String templateIDParam;

    /** 告警模板名称，告警模板名称 */
    @SerializedName("TemplateName")
    private String templateNameParam;


    public String getTargetID() {
        return targetIDParam;
    }

    public void setTargetID(String targetIDParam) {
        this.targetIDParam = targetIDParam;
    }

    public String getTargetName() {
        return targetNameParam;
    }

    public void setTargetName(String targetNameParam) {
        this.targetNameParam = targetNameParam;
    }

    public String getTemplateID() {
        return templateIDParam;
    }

    public void setTemplateID(String templateIDParam) {
        this.templateIDParam = templateIDParam;
    }

    public String getTemplateName() {
        return templateNameParam;
    }

    public void setTemplateName(String templateNameParam) {
        this.templateNameParam = templateNameParam;
    }

}
