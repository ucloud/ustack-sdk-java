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

public class CreateAlertTemplateRequest extends Request {

    /** 租户ID，标识告警模板所属租户，管理员可创建所有类型模板，普通租户仅可创建非REGION类型的资源模板，可通过DescribeMetric获取允许的TemplateType列表 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 告警模板名称，长度1-128字符，支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 地域ID，指定告警模板所属的物理区域，告警模板仅在该地域生效 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注信息，用于对告警模板的补充说明，长度0-100字符，不能包含http://或https://等URL */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 告警模板类型，指定监控的资源类型（应与ResourceType保持一致），管理员租户支持全部类型（含REGION），普通租户仅支持非REGION类型，可通过DescribeMetric获取支持的类型列表 */
    @NotEmpty
    @OpenAPIParam("TemplateType")
    private String templateTypeParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
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

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getTemplateType() {
        return templateTypeParam;
    }

    public void setTemplateType(String templateTypeParam) {
        this.templateTypeParam = templateTypeParam;
    }

}
