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

public class DescribeSecurityGroupRuleRequest extends Request {

    /** 租户ID，指定查询范围内的租户组织，若不指定则返回当前租户的规则 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 流量方向筛选，取值1为入站、0为出站；为空时返回全部方向规则 */
    
    @OpenAPIParam("IsIn")
    private String isInParam;

    /** 分页大小，指定每页返回的记录数 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域ID，用于标识安全组所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 安全组ID，指定要查询规则的安全组唯一标识符 */
    @NotEmpty
    @OpenAPIParam("SGID")
    private String sGIDParam;

    /** 安全组规则ID列表，用于精确查询指定的规则 */
    
    @OpenAPIParam("SGRuleIDs")
    private List<String> sGRuleIDsParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getIsIn() {
        return isInParam;
    }

    public void setIsIn(String isInParam) {
        this.isInParam = isInParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
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

    public List<String> getSGRuleIDs() {
        return sGRuleIDsParam;
    }

    public void setSGRuleIDs(List<String> sGRuleIDsParam) {
        this.sGRuleIDsParam = sGRuleIDsParam;
    }

}
