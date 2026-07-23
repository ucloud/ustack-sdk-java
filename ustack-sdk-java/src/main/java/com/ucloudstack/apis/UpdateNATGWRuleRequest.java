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

public class UpdateNATGWRuleRequest extends Request {

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @OpenAPIParam("CompanyID")
    private String companyIDParam;

    /** 弹性公网IPID，SNAT规则使用的新EIP，必须已绑定到该NAT网关 */
    @NotEmpty
    @OpenAPIParam("EIPID")
    private String eIPIDParam;

    /** NAT网关ID，用于定位SNAT规则所属的NAT网关实例，该NAT网关必须处于运行状态 */
    @NotEmpty
    @OpenAPIParam("NATGWID")
    private String nATGWIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** SNAT规则ID，用于定位需要修改的SNAT规则 */
    @NotEmpty
    @OpenAPIParam("RuleID")
    private String ruleIDParam;


    public String getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(String companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getEIPID() {
        return eIPIDParam;
    }

    public void setEIPID(String eIPIDParam) {
        this.eIPIDParam = eIPIDParam;
    }

    public String getNATGWID() {
        return nATGWIDParam;
    }

    public void setNATGWID(String nATGWIDParam) {
        this.nATGWIDParam = nATGWIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRuleID() {
        return ruleIDParam;
    }

    public void setRuleID(String ruleIDParam) {
        this.ruleIDParam = ruleIDParam;
    }

}
