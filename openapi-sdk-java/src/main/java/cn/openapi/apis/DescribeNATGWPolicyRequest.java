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
package cn.openapi.apis;

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class DescribeNATGWPolicyRequest extends Request {

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 搜索关键词，用于按规则关键字模糊搜索DNAT规则 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，用于控制返回数据量 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** NAT网关ID，用于筛选指定NAT网关的DNAT规则 */
    
    @OpenAPIParam("NATGWID")
    private String nATGWIDParam;

    /** 分页偏移量，指定跳过的记录数，用于实现分页查询 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** DNAT规则ID列表，用于筛选指定DNAT规则 */
    
    @OpenAPIParam("PolicyIDs")
    private List<String> policyIDsParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getKeyword() {
        return keywordParam;
    }

    public void setKeyword(String keywordParam) {
        this.keywordParam = keywordParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public String getNATGWID() {
        return nATGWIDParam;
    }

    public void setNATGWID(String nATGWIDParam) {
        this.nATGWIDParam = nATGWIDParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public List<String> getPolicyIDs() {
        return policyIDsParam;
    }

    public void setPolicyIDs(List<String> policyIDsParam) {
        this.policyIDsParam = policyIDsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
