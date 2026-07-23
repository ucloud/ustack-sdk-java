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

public class DescribeMulticastGroupRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 关键词，用于模糊匹配组播组名称进行搜索 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，用于控制返回数据量，取值范围：1-100，默认值：10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 组播组ID列表，用于精确查询指定组播组的集合；当同时指定VPCID时，底层接口不支持组合查询会返回参数不支持错误，因此建议二者只选择其一 */
    
    @OpenAPIParam("MulticastGroupIDs")
    private List<String> multicastGroupIDsParam;

    /** 分页偏移量，指定跳过的记录数，用于实现分页查询，取值范围：≥0，默认值：0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目ID列表，用于按项目维度筛选资源集合 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** VPC ID，虚拟私有网络的唯一标识符，用于筛选指定VPC的全部组播组；与MulticastGroupIDs不能复合使用，否则底层会返回查询条件不支持错误 */
    
    @OpenAPIParam("VPCID")
    private String vPCIDParam;


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

    public List<String> getMulticastGroupIDs() {
        return multicastGroupIDsParam;
    }

    public void setMulticastGroupIDs(List<String> multicastGroupIDsParam) {
        this.multicastGroupIDsParam = multicastGroupIDsParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public List<String> getProjectIDs() {
        return projectIDsParam;
    }

    public void setProjectIDs(List<String> projectIDsParam) {
        this.projectIDsParam = projectIDsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getVPCID() {
        return vPCIDParam;
    }

    public void setVPCID(String vPCIDParam) {
        this.vPCIDParam = vPCIDParam;
    }

}
