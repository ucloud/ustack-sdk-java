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

public class MySQLSlaveInfo {

    /** 集群架构，实例计算架构 */
    @SerializedName("Arch")
    private String archParam;

    /** 带宽，单位：Mbps */
    @SerializedName("Bandwidth")
    private Integer bandwidthParam;

    /** 计费类型，用于指定计费模式，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费） */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，用于标识资源所属的租户，实现多租户环境下的资源隔离 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，Unix时间戳（秒级） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 磁盘ID，实例数据盘ID */
    @SerializedName("DiskID")
    private String diskIDParam;

    /** 存储容量，单位：GiB */
    @SerializedName("DiskSpace")
    private Integer diskSpaceParam;

    /** 租户邮箱，租户注册时提供的用于接收通知和联系的邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** MySQL网络信息，实例网络信息列表 */
    @SerializedName("Endpoints")
    private List<MysqlEndpoint> endpointsParam;

    /** 过期时间，Unix时间戳（秒级） */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** IOPS，单位：IOPS */
    @SerializedName("IOPS")
    private Integer iOPSParam;

    /** legacy 配置是否已完成归一化，true 表示已归一化并退出兼容 bypass */
    @SerializedName("LegacyConfigNormalized")
    private String legacyConfigNormalizedParam;

    /** legacy 升级来源标记，仅用于标识老版本升级进入 2.13.x 的兼容实例 */
    @SerializedName("LegacyUpgradeFrom")
    private String legacyUpgradeFromParam;

    /** 内存大小，单位：MiB */
    @SerializedName("Memory")
    private Integer memoryParam;

    /** MySQL实例ID，实例唯一标识 */
    @SerializedName("MySQLID")
    private String mySQLIDParam;

    /** MySQL名称，实例名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目组ID，用于资源分组管理 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目组名称，项目组的名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 创建失败原因，实例创建失败原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，地域，一批可共享的物理资源使用集合 */
    @SerializedName("Region")
    private String regionParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用的http://或https://等非法字符，可为空 */
    @SerializedName("Remark")
    private String remarkParam;

    /** MySQL角色，取值范围：1、Master（主节点）2、Slave（从节点） */
    @SerializedName("Role")
    private String roleParam;

    /** MySQL资源状态，实例状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 存储集群ID，实例存储集群ID */
    @SerializedName("StorageSetType")
    private String storageSetTypeParam;

    /** 存储集群名称，实例存储集群名称 */
    @SerializedName("StorageSetTypeAlias")
    private String storageSetTypeAliasParam;

    /** 子网ID，实例所属子网ID */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称，实例所属子网名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;

    /** 标签，资源标签列表 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 是否开启删除保护，0:开启;1:关闭 */
    @SerializedName("TerminationPolicy")
    private Integer terminationPolicyParam;

    /** 更新时间，Unix时间戳（秒级） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 计算集群类型，实例所属计算集群类型 */
    @SerializedName("VMType")
    private String vMTypeParam;

    /** 计算集群名称，实例所属计算集群名称 */
    @SerializedName("VMTypeAlias")
    private String vMTypeAliasParam;

    /** VPCID，实例所属VPCID */
    @SerializedName("VPCID")
    private String vPCIDParam;

    /** VPC名称，实例所属VPC名称 */
    @SerializedName("VPCName")
    private String vPCNameParam;

    /** MySQL版本，必须为'MySQL 5.7'或者'MySQL 8.0' */
    @SerializedName("Version")
    private String versionParam;


    public String getArch() {
        return archParam;
    }

    public void setArch(String archParam) {
        this.archParam = archParam;
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

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getDiskID() {
        return diskIDParam;
    }

    public void setDiskID(String diskIDParam) {
        this.diskIDParam = diskIDParam;
    }

    public Integer getDiskSpace() {
        return diskSpaceParam;
    }

    public void setDiskSpace(Integer diskSpaceParam) {
        this.diskSpaceParam = diskSpaceParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public List<MysqlEndpoint> getEndpoints() {
        return endpointsParam;
    }

    public void setEndpoints(List<MysqlEndpoint> endpointsParam) {
        this.endpointsParam = endpointsParam;
    }

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
    }

    public Integer getIOPS() {
        return iOPSParam;
    }

    public void setIOPS(Integer iOPSParam) {
        this.iOPSParam = iOPSParam;
    }

    public String getLegacyConfigNormalized() {
        return legacyConfigNormalizedParam;
    }

    public void setLegacyConfigNormalized(String legacyConfigNormalizedParam) {
        this.legacyConfigNormalizedParam = legacyConfigNormalizedParam;
    }

    public String getLegacyUpgradeFrom() {
        return legacyUpgradeFromParam;
    }

    public void setLegacyUpgradeFrom(String legacyUpgradeFromParam) {
        this.legacyUpgradeFromParam = legacyUpgradeFromParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public String getMySQLID() {
        return mySQLIDParam;
    }

    public void setMySQLID(String mySQLIDParam) {
        this.mySQLIDParam = mySQLIDParam;
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

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getRole() {
        return roleParam;
    }

    public void setRole(String roleParam) {
        this.roleParam = roleParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getStorageSetType() {
        return storageSetTypeParam;
    }

    public void setStorageSetType(String storageSetTypeParam) {
        this.storageSetTypeParam = storageSetTypeParam;
    }

    public String getStorageSetTypeAlias() {
        return storageSetTypeAliasParam;
    }

    public void setStorageSetTypeAlias(String storageSetTypeAliasParam) {
        this.storageSetTypeAliasParam = storageSetTypeAliasParam;
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

    public String getVMTypeAlias() {
        return vMTypeAliasParam;
    }

    public void setVMTypeAlias(String vMTypeAliasParam) {
        this.vMTypeAliasParam = vMTypeAliasParam;
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

    public String getVersion() {
        return versionParam;
    }

    public void setVersion(String versionParam) {
        this.versionParam = versionParam;
    }

}
