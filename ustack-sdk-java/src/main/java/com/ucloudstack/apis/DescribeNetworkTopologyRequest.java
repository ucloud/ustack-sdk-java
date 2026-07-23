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

public class DescribeNetworkTopologyRequest extends Request {

    /** 租户ID，指定要查询网络拓扑的租户，若不指定则查询所有租户 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 专线ID列表，已弃用，参数无效 */
    
    @UCloudStackParam("DirectConnectIDs")
    private List<String> directConnectIDsParam;

    /** 扁平网络ID列表，指定要查询的扁平网络范围 */
    
    @UCloudStackParam("FlatNetworkIDs")
    private List<String> flatNetworkIDsParam;

    /** 分页大小，指定每页返回的记录数，若不指定则默认为10 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 项目组ID列表，指定要查询网络拓扑的项目组范围，ProjectID 采用 project- 前缀加14位随机字符格式 */
    
    @UCloudStackParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定要查询网络拓扑的地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 资源ID列表，指定要查询网络拓扑的资源范围，每个ResourceID格式为类型前缀-14位随机字符 */
    
    @UCloudStackParam("ResourceIDs")
    private List<String> resourceIDsParam;

    /** 资源类型列表，指定要查询网络拓扑的资源类型 */
    
    @UCloudStackParam("ResourceTypes")
    private List<String> resourceTypesParam;

    /** 外网线路ID列表，指定要查询的外网线路范围 */
    
    @UCloudStackParam("SegmentIDs")
    private List<String> segmentIDsParam;

    /** 子网ID列表，指定要查询的子网范围 */
    
    @UCloudStackParam("SubnetIDs")
    private List<String> subnetIDsParam;

    /** 子网查询情况下的IP协议版本，支持IPv4或IPv6，若不指定则查询所有协议 */
    
    @UCloudStackParam("SubnetIPVersion")
    private String subnetIPVersionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getDirectConnectIDs() {
        return directConnectIDsParam;
    }

    public void setDirectConnectIDs(List<String> directConnectIDsParam) {
        this.directConnectIDsParam = directConnectIDsParam;
    }

    public List<String> getFlatNetworkIDs() {
        return flatNetworkIDsParam;
    }

    public void setFlatNetworkIDs(List<String> flatNetworkIDsParam) {
        this.flatNetworkIDsParam = flatNetworkIDsParam;
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

    public List<String> getResourceIDs() {
        return resourceIDsParam;
    }

    public void setResourceIDs(List<String> resourceIDsParam) {
        this.resourceIDsParam = resourceIDsParam;
    }

    public List<String> getResourceTypes() {
        return resourceTypesParam;
    }

    public void setResourceTypes(List<String> resourceTypesParam) {
        this.resourceTypesParam = resourceTypesParam;
    }

    public List<String> getSegmentIDs() {
        return segmentIDsParam;
    }

    public void setSegmentIDs(List<String> segmentIDsParam) {
        this.segmentIDsParam = segmentIDsParam;
    }

    public List<String> getSubnetIDs() {
        return subnetIDsParam;
    }

    public void setSubnetIDs(List<String> subnetIDsParam) {
        this.subnetIDsParam = subnetIDsParam;
    }

    public String getSubnetIPVersion() {
        return subnetIPVersionParam;
    }

    public void setSubnetIPVersion(String subnetIPVersionParam) {
        this.subnetIPVersionParam = subnetIPVersionParam;
    }

}
