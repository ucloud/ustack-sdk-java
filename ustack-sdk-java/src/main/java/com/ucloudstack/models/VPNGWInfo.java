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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class VPNGWInfo {

    /** 架构，VPN网关实例架构 */
    @SerializedName("Arch")
    private String archParam;

    /** 计费类型，取值范围：Dynamic、Month、Year；兼容历史值：hour、month、year，别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，资源所属租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 弹性公网IPID，绑定到VPN网关的EIP */
    @SerializedName("EIPID")
    private String eIPIDParam;

    /** 弹性公网IP地址，绑定到VPN网关的公网地址 */
    @SerializedName("EIPIP")
    private String eIPIPParam;

    /** 租户邮箱，资源所属租户的联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 过期时间，秒级Unix时间戳 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 高可用模式，VPN网关高可用配置方式 */
    @SerializedName("HighAvailability")
    private String highAvailabilityParam;

    /** VPN网关名称，用于展示资源名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目ID，资源所属项目分组 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，资源所属项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 创建失败原因，创建失败时的错误信息 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域名称，地域显示名 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，VPN网关的描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** VPN网关状态，来自资源状态与底层VPN状态，常见值包括Running、Stopped、Creating、Deleting、Failed、VersionUpgrading、StorageMigrate等 */
    @SerializedName("State")
    private String stateParam;

    /** 存储集群类型，VPN网关系统盘所在存储集群 */
    @SerializedName("StorageSetType")
    private String storageSetTypeParam;

    /** 子网ID，VPN网关所属子网 */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称，用于展示VPN网关所属子网名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;

    /** 标签列表，用于资源标记和分类管理 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 删除保护开关，0表示开启删除保护，1表示关闭删除保护 */
    @SerializedName("TerminationPolicy")
    private Integer terminationPolicyParam;

    /** 隧道数量，VPN隧道的数量 */
    @SerializedName("TunnelCount")
    private Integer tunnelCountParam;

    /** 计算集群类型，VPN网关虚拟机所在计算集群 */
    @SerializedName("VMType")
    private String vMTypeParam;

    /** VPCID，VPN网关所属VPC */
    @SerializedName("VPCID")
    private String vPCIDParam;

    /** VPC名称，用于展示VPN网关所属VPC名称 */
    @SerializedName("VPCName")
    private String vPCNameParam;

    /** VPN网关ID，VPN网关唯一标识 */
    @SerializedName("VPNGWID")
    private String vPNGWIDParam;


    public String getArch() {
        return archParam;
    }

    public void setArch(String archParam) {
        this.archParam = archParam;
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

    public String getEIPID() {
        return eIPIDParam;
    }

    public void setEIPID(String eIPIDParam) {
        this.eIPIDParam = eIPIDParam;
    }

    public String getEIPIP() {
        return eIPIPParam;
    }

    public void setEIPIP(String eIPIPParam) {
        this.eIPIPParam = eIPIPParam;
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

    public String getHighAvailability() {
        return highAvailabilityParam;
    }

    public void setHighAvailability(String highAvailabilityParam) {
        this.highAvailabilityParam = highAvailabilityParam;
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

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public String getStorageSetType() {
        return storageSetTypeParam;
    }

    public void setStorageSetType(String storageSetTypeParam) {
        this.storageSetTypeParam = storageSetTypeParam;
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

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public Integer getTerminationPolicy() {
        return terminationPolicyParam;
    }

    public void setTerminationPolicy(Integer terminationPolicyParam) {
        this.terminationPolicyParam = terminationPolicyParam;
    }

    public Integer getTunnelCount() {
        return tunnelCountParam;
    }

    public void setTunnelCount(Integer tunnelCountParam) {
        this.tunnelCountParam = tunnelCountParam;
    }

    public String getVMType() {
        return vMTypeParam;
    }

    public void setVMType(String vMTypeParam) {
        this.vMTypeParam = vMTypeParam;
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

    public String getVPNGWID() {
        return vPNGWIDParam;
    }

    public void setVPNGWID(String vPNGWIDParam) {
        this.vPNGWIDParam = vPNGWIDParam;
    }

}
