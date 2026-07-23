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

public class DeleteSecurityGroupRuleRequest extends Request {

    /** 租户ID，标识安全组所属的租户组织，用于多租户资源隔离与权限控制 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 地域ID，用于标识安全组所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 安全组ID，指定规则所属的安全组唯一标识符 */
    @NotEmpty
    @UCloudStackParam("SGID")
    private String sGIDParam;

    /** 安全组规则ID，指定要删除的规则唯一标识符 */
    @NotEmpty
    @UCloudStackParam("SGRuleID")
    private String sGRuleIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

    public String getSGRuleID() {
        return sGRuleIDParam;
    }

    public void setSGRuleID(String sGRuleIDParam) {
        this.sGRuleIDParam = sGRuleIDParam;
    }

}
