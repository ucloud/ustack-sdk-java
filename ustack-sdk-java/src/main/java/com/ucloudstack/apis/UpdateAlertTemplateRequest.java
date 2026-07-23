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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateAlertTemplateRequest extends Request {

    /** 告警模板名称，长度1-128字符，支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** 备注信息，用于对告警模板的补充说明，长度0-100字符，不能包含http://或https://等URL */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 告警模板ID，指定要更新的告警模板ID，必须为当前租户可管理的模板 */
    @NotEmpty
    @UCloudStackParam("TemplateID")
    private String templateIDParam;


    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getTemplateID() {
        return templateIDParam;
    }

    public void setTemplateID(String templateIDParam) {
        this.templateIDParam = templateIDParam;
    }

}
