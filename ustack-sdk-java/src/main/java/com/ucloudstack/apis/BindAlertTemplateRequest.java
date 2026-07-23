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

public class BindAlertTemplateRequest extends Request {

    /** 地域，目标资源所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 目标资源ID，待绑定告警模板的资源ID */
    @NotEmpty
    @OpenAPIParam("TargetID")
    private String targetIDParam;

    /** 告警模板ID，待绑定的告警模板ID，非管理员租户需验证模板归属权限，仅允许绑定自有模板 */
    @NotEmpty
    @OpenAPIParam("TemplateID")
    private String templateIDParam;


    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getTargetID() {
        return targetIDParam;
    }

    public void setTargetID(String targetIDParam) {
        this.targetIDParam = targetIDParam;
    }

    public String getTemplateID() {
        return templateIDParam;
    }

    public void setTemplateID(String templateIDParam) {
        this.templateIDParam = templateIDParam;
    }

}
