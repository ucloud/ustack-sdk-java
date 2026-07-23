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

public class DescribeVMInstanceRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 宿主机IP，过滤运行在指定宿主机的虚拟机 */
    
    @UCloudStackParam("HostIP")
    private String hostIPParam;

    /** 隔离组ID，过滤指定隔离组下的虚拟机 */
    
    @UCloudStackParam("IGID")
    private String iGIDParam;

    /** 关键词，用于模糊匹配虚拟机名称或备注 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 网络类型，筛选虚拟机网络接入类型 */
    
    @UCloudStackParam("NetworkType")
    private String networkTypeParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 项目ID列表，用于资源分组管理 */
    
    @UCloudStackParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 搜索字段，指定关键词匹配的字段，取值：Name（仅按名称字段模糊匹配）；不传或空值表示全字段匹配 */
    
    @UCloudStackParam("SearchField")
    private String searchFieldParam;

    /** 计算集群ID，过滤指定计算集群下的虚拟机 */
    
    @UCloudStackParam("SetID")
    private String setIDParam;

    /** 是否仅查询简略信息 */
    
    @UCloudStackParam("SimpleInfo")
    private Boolean simpleInfoParam;

    /** 排序方向，指定排序的升降序，取值：Ascending（升序）、Descending（降序） */
    
    @UCloudStackParam("Sort")
    private String sortParam;

    /** 排序字段，指定返回结果的排序依据，取值：CreateTime（创建时间）、CPUUtilization（CPU利用率）、MemUsage（内存利用率）、SpaceUsage（空间利用率） */
    
    @UCloudStackParam("SortBy")
    private String sortByParam;

    /** 状态列表，过滤虚拟机的运行状态 */
    
    @UCloudStackParam("States")
    private List<String> statesParam;

    /** 子网ID，过滤指定子网下的虚拟机 */
    
    @UCloudStackParam("SubnetID")
    private String subnetIDParam;

    /** 虚拟机ID列表，精确匹配虚拟机标识 */
    
    @UCloudStackParam("VMIDs")
    private List<String> vMIDsParam;

    /** VPCID，过滤指定VPC下的虚拟机 */
    
    @UCloudStackParam("VPCID")
    private String vPCIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getHostIP() {
        return hostIPParam;
    }

    public void setHostIP(String hostIPParam) {
        this.hostIPParam = hostIPParam;
    }

    public String getIGID() {
        return iGIDParam;
    }

    public void setIGID(String iGIDParam) {
        this.iGIDParam = iGIDParam;
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

    public String getNetworkType() {
        return networkTypeParam;
    }

    public void setNetworkType(String networkTypeParam) {
        this.networkTypeParam = networkTypeParam;
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

    public String getSearchField() {
        return searchFieldParam;
    }

    public void setSearchField(String searchFieldParam) {
        this.searchFieldParam = searchFieldParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public Boolean getSimpleInfo() {
        return simpleInfoParam;
    }

    public void setSimpleInfo(Boolean simpleInfoParam) {
        this.simpleInfoParam = simpleInfoParam;
    }

    public String getSort() {
        return sortParam;
    }

    public void setSort(String sortParam) {
        this.sortParam = sortParam;
    }

    public String getSortBy() {
        return sortByParam;
    }

    public void setSortBy(String sortByParam) {
        this.sortByParam = sortByParam;
    }

    public List<String> getStates() {
        return statesParam;
    }

    public void setStates(List<String> statesParam) {
        this.statesParam = statesParam;
    }

    public String getSubnetID() {
        return subnetIDParam;
    }

    public void setSubnetID(String subnetIDParam) {
        this.subnetIDParam = subnetIDParam;
    }

    public List<String> getVMIDs() {
        return vMIDsParam;
    }

    public void setVMIDs(List<String> vMIDsParam) {
        this.vMIDsParam = vMIDsParam;
    }

    public String getVPCID() {
        return vPCIDParam;
    }

    public void setVPCID(String vPCIDParam) {
        this.vPCIDParam = vPCIDParam;
    }

}
