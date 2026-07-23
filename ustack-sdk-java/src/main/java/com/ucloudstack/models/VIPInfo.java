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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class VIPInfo {

    /** 关联资源类型，VM表示虚拟机，ELASTIC_NIC表示弹性网卡 */
    @SerializedName("AssociatedResourceType")
    private String associatedResourceTypeParam;

    /** 关联资源列表，已绑定到该VIP的虚拟机或弹性网卡资源信息 */
    @SerializedName("AssociatedResources")
    private List<AssociatedResources> associatedResourcesParam;

    /** 带宽，单位Mbps */
    @SerializedName("Bandwidth")
    private Integer bandwidthParam;

    /** 计费类型，取值范围：Dynamic（动态）、Month（按月计费）、Year（按年计费），兼容hour/month/year，计费类型别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR，hour->HOUR、month->MONTH、year->YEAR */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 过期时间，秒级Unix时间戳 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** IP地址，VIP的实际IP地址 */
    @SerializedName("IP")
    private String iPParam;

    /** VIP名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目ID */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，资源状态为失败时的原因描述 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 外网线路ID，WAN类型VIP的运营商网段标识符 */
    @SerializedName("SegmentID")
    private String segmentIDParam;

    /** 外网线路名称 */
    @SerializedName("SegmentName")
    private String segmentNameParam;

    /** 外网网段，WAN类型VIP的网段CIDR */
    @SerializedName("SegmentNetwork")
    private String segmentNetworkParam;

    /** 资源生命周期状态，当资源状态非Available时返回资源状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 子网ID，VIP所属的子网标识符 */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;

    /** 子网网段，VIP所属子网的网段CIDR */
    @SerializedName("SubnetNetwork")
    private String subnetNetworkParam;

    /** 标签列表 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** VIPID，VIP的唯一标识符 */
    @SerializedName("VIPID")
    private String vIPIDParam;

    /** VIP类型，LAN为内网VIP，WAN为外网VIP */
    @SerializedName("VIPType")
    private String vIPTypeParam;

    /** VPCID，VIP所属的VPC网络标识符 */
    @SerializedName("VPCID")
    private String vPCIDParam;

    /** VPC名称 */
    @SerializedName("VPCName")
    private String vPCNameParam;

    /** VPC网段，VIP所属VPC的网段CIDR */
    @SerializedName("VPCNetwork")
    private String vPCNetworkParam;


    public String getAssociatedResourceType() {
        return associatedResourceTypeParam;
    }

    public void setAssociatedResourceType(String associatedResourceTypeParam) {
        this.associatedResourceTypeParam = associatedResourceTypeParam;
    }

    public List<AssociatedResources> getAssociatedResources() {
        return associatedResourcesParam;
    }

    public void setAssociatedResources(List<AssociatedResources> associatedResourcesParam) {
        this.associatedResourcesParam = associatedResourcesParam;
    }

    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getCompanyName() {
        return companyNameParam;
    }

    public void setCompanyName(String companyNameParam) {
        this.companyNameParam = companyNameParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
    }

    public String getIP() {
        return iPParam;
    }

    public void setIP(String iPParam) {
        this.iPParam = iPParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getProjectName() {
        return projectNameParam;
    }

    public void setProjectName(String projectNameParam) {
        this.projectNameParam = projectNameParam;
    }

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRegionAlias() {
        return regionAliasParam;
    }

    public void setRegionAlias(String regionAliasParam) {
        this.regionAliasParam = regionAliasParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getSegmentID() {
        return segmentIDParam;
    }

    public void setSegmentID(String segmentIDParam) {
        this.segmentIDParam = segmentIDParam;
    }

    public String getSegmentName() {
        return segmentNameParam;
    }

    public void setSegmentName(String segmentNameParam) {
        this.segmentNameParam = segmentNameParam;
    }

    public String getSegmentNetwork() {
        return segmentNetworkParam;
    }

    public void setSegmentNetwork(String segmentNetworkParam) {
        this.segmentNetworkParam = segmentNetworkParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getSubnetID() {
        return subnetIDParam;
    }

    public void setSubnetID(String subnetIDParam) {
        this.subnetIDParam = subnetIDParam;
    }

    public String getSubnetName() {
        return subnetNameParam;
    }

    public void setSubnetName(String subnetNameParam) {
        this.subnetNameParam = subnetNameParam;
    }

    public String getSubnetNetwork() {
        return subnetNetworkParam;
    }

    public void setSubnetNetwork(String subnetNetworkParam) {
        this.subnetNetworkParam = subnetNetworkParam;
    }

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getVIPID() {
        return vIPIDParam;
    }

    public void setVIPID(String vIPIDParam) {
        this.vIPIDParam = vIPIDParam;
    }

    public String getVIPType() {
        return vIPTypeParam;
    }

    public void setVIPType(String vIPTypeParam) {
        this.vIPTypeParam = vIPTypeParam;
    }

    public String getVPCID() {
        return vPCIDParam;
    }

    public void setVPCID(String vPCIDParam) {
        this.vPCIDParam = vPCIDParam;
    }

    public String getVPCName() {
        return vPCNameParam;
    }

    public void setVPCName(String vPCNameParam) {
        this.vPCNameParam = vPCNameParam;
    }

    public String getVPCNetwork() {
        return vPCNetworkParam;
    }

    public void setVPCNetwork(String vPCNetworkParam) {
        this.vPCNetworkParam = vPCNetworkParam;
    }

}
