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

public class UnbindAlertTemplateRequest extends Request {

    /** 地域，目标资源所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 目标资源ID，待解绑告警模板的资源ID，非管理员租户需验证资源归属权限 */
    @NotEmpty
    @OpenAPIParam("TargetID")
    private String targetIDParam;


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

}
