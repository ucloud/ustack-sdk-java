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

public class LBInfo {

    /** CPU核数，负载均衡的CPU核数 */
    @SerializedName("CPU")
    private Integer cPUParam;

    /** 计费类型，取值范围：Dynamic、Month、Year；兼容历史值：hour、month、year，别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR，hour->HOUR、month->MONTH、year->YEAR */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，用于展示所属租户组织名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 删除时间，秒级Unix时间戳 */
    @SerializedName("DeleteTime")
    private Integer deleteTimeParam;

    /** 租户邮箱，用于展示租户联系人邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 过期时间，秒级Unix时间戳 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 高可用模式，负载均衡的高可用配置方式 */
    @SerializedName("HighAvailability")
    private String highAvailabilityParam;

    /** 负载均衡ID，负载均衡的唯一标识 */
    @SerializedName("LBID")
    private String lBIDParam;

    /** 负载均衡状态，用于展示负载均衡当前生命周期状态 */
    @SerializedName("LBStatus")
    private String lBStatusParam;

    /** 负载均衡类型，用于标识访问范围，取值LAN（内网）、WAN（外网） */
    @SerializedName("LBType")
    private String lBTypeParam;

    /** 访问日志开关，是否开启访问日志，取值范围：On、Off */
    @SerializedName("LogAccessEnable")
    private String logAccessEnableParam;

    /** 日志存储OSSID，用于存储访问日志的OSS实例ID */
    @SerializedName("LogOssID")
    private String logOssIDParam;

    /** 名称，负载均衡的名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 内网IP，负载均衡的内网访问地址；LBType为WAN时可能为空 */
    @SerializedName("PrivateIP")
    private String privateIPParam;

    /** 项目ID，用于标识负载均衡所属项目分组 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，用于展示所属项目分组名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 外网IP，负载均衡的公网访问地址；LBType为LAN时为空 */
    @SerializedName("PublicIP")
    private String publicIPParam;

    /** 失败原因，创建或操作失败的原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域名称，用于展示地域名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，负载均衡的描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 安全组ID，负载均衡绑定的安全组唯一标识 */
    @SerializedName("SGID")
    private String sGIDParam;

    /** 安全组名称，用于展示负载均衡绑定的安全组名称 */
    @SerializedName("SGName")
    private String sGNameParam;

    /** 计算集群架构，计算集群的架构 */
    @SerializedName("SetArch")
    private String setArchParam;

    /** 存储集群类型，存储集群的类型 */
    @SerializedName("StorageSetType")
    private String storageSetTypeParam;

    /** 子网ID，负载均衡所属子网的唯一标识 */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称，用于展示负载均衡所属子网名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;

    /** 标签列表，用于展示负载均衡关联标签 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 删除保护开关，用于防止误删除；0表示开启删除保护，1表示关闭删除保护 */
    @SerializedName("TerminationPolicy")
    private Integer terminationPolicyParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 计算集群类型，用于标识负载均衡运行的计算集群 */
    @SerializedName("VMType")
    private String vMTypeParam;

    /** VPCID，负载均衡所属VPC的唯一标识 */
    @SerializedName("VPCID")
    private String vPCIDParam;

    /** VPC名称，用于展示负载均衡所属VPC名称 */
    @SerializedName("VPCName")
    private String vPCNameParam;

    /** 虚拟服务器数量，负载均衡关联的监听器数量 */
    @SerializedName("VSCount")
    private Integer vSCountParam;


    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
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

    public Integer getDeleteTime() {
        return deleteTimeParam;
    }

    public void setDeleteTime(Integer deleteTimeParam) {
        this.deleteTimeParam = deleteTimeParam;
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

    public String getLBID() {
        return lBIDParam;
    }

    public void setLBID(String lBIDParam) {
        this.lBIDParam = lBIDParam;
    }

    public String getLBStatus() {
        return lBStatusParam;
    }

    public void setLBStatus(String lBStatusParam) {
        this.lBStatusParam = lBStatusParam;
    }

    public String getLBType() {
        return lBTypeParam;
    }

    public void setLBType(String lBTypeParam) {
        this.lBTypeParam = lBTypeParam;
    }

    public String getLogAccessEnable() {
        return logAccessEnableParam;
    }

    public void setLogAccessEnable(String logAccessEnableParam) {
        this.logAccessEnableParam = logAccessEnableParam;
    }

    public String getLogOssID() {
        return logOssIDParam;
    }

    public void setLogOssID(String logOssIDParam) {
        this.logOssIDParam = logOssIDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPrivateIP() {
        return privateIPParam;
    }

    public void setPrivateIP(String privateIPParam) {
        this.privateIPParam = privateIPParam;
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

    public String getPublicIP() {
        return publicIPParam;
    }

    public void setPublicIP(String publicIPParam) {
        this.publicIPParam = publicIPParam;
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

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

    public String getSGName() {
        return sGNameParam;
    }

    public void setSGName(String sGNameParam) {
        this.sGNameParam = sGNameParam;
    }

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
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

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
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

    public Integer getVSCount() {
        return vSCountParam;
    }

    public void setVSCount(Integer vSCountParam) {
        this.vSCountParam = vSCountParam;
    }

}
