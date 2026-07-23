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
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateIPGroupRequest extends Request {

    /** 租户ID，标识IP组所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** IP组ID，指定要更新的IP组唯一标识符 */
    @NotEmpty
    @OpenAPIParam("IPGroupID")
    private String iPGroupIDParam;

    /** 地域ID，用于标识IP组所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** IP地址规则，新的IP地址列表，将替换现有规则；逗号分隔，支持单个IP或CIDR地址段 */
    @NotEmpty
    @OpenAPIParam("Rules")
    private String rulesParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getIPGroupID() {
        return iPGroupIDParam;
    }

    public void setIPGroupID(String iPGroupIDParam) {
        this.iPGroupIDParam = iPGroupIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRules() {
        return rulesParam;
    }

    public void setRules(String rulesParam) {
        this.rulesParam = rulesParam;
    }

}
