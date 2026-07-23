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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class OSSInfo {

    /** 带宽，磁盘吞吐量（MB/s） */
    @SerializedName("Bandwidth")
    private Integer bandwidthParam;

    /** CPU核数，对象存储实例CPU规格 */
    @SerializedName("CPU")
    private Integer cPUParam;

    /** 计费类型，计费模式，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费）；兼容历史值：hour、month、year，别名映射：Dynamic→HOUR、Month→MONTH、Year→YEAR */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，对象存储所属租户标识 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，对象存储所属租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，Unix 时间戳（秒级） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 存储容量，单位GiB */
    @SerializedName("DiskSpace")
    private Integer diskSpaceParam;

    /** 租户邮箱，对象存储所属租户联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 网络信息，对象存储访问终端信息 */
    @SerializedName("Endpoints")
    private List<OssEndpoint> endpointsParam;

    /** 过期时间，Unix 时间戳（秒级） */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** IOPS，磁盘每秒输入输出操作次数 */
    @SerializedName("IOPS")
    private Integer iOPSParam;

    /** 名称，对象存储服务名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 对象存储ID，对象存储标识 */
    @SerializedName("OSSID")
    private String oSSIDParam;

    /** 项目组ID，对象存储所属项目组 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目组名称，对象存储所属项目组名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，创建或回收失败的原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域，对象存储所属地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，用于展示 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，用于说明对象存储用途 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 计算集群架构，取值范围：x86_64、AArch64 */
    @SerializedName("SetArch")
    private String setArchParam;

    /** 状态，对象存储运行状态，包含Running、Stopped、Starting、Stopping、Upgrading、Changingpwd、Downgrading、StorageMigrating等PaaS状态，资源版本落后时显示VersionUpgrading，处于删除/失败等平台状态时返回Deleting、Failed等RStatus */
    @SerializedName("Status")
    private String statusParam;

    /** 存储集群架构，数据盘所在存储集群架构 */
    @SerializedName("StorageSetArch")
    private String storageSetArchParam;

    /** 存储集群类型，数据盘所在存储集群类型 */
    @SerializedName("StorageSetType")
    private String storageSetTypeParam;

    /** 存储集群名称，数据盘所在存储集群名称 */
    @SerializedName("StorageSetTypeAlias")
    private String storageSetTypeAliasParam;

    /** 子网ID，对象存储所属子网标识 */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称，对象存储所属子网名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;

    /** 标签，资源标签列表 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 删除保护策略，取值范围：0（开启删除保护）、1（关闭删除保护） */
    @SerializedName("TerminationPolicy")
    private Integer terminationPolicyParam;

    /** 更新时间，Unix 时间戳（秒级） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 计算集群类型，对象存储所在计算集群类型 */
    @SerializedName("VMType")
    private String vMTypeParam;

    /** 计算集群名称，对象存储所在计算集群名称 */
    @SerializedName("VMTypeAlias")
    private String vMTypeAliasParam;

    /** VPC ID，对象存储所属VPC标识 */
    @SerializedName("VPCID")
    private String vPCIDParam;

    /** VPC名称，对象存储所属VPC名称 */
    @SerializedName("VPCName")
    private String vPCNameParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

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

    public List<OssEndpoint> getEndpoints() {
        return endpointsParam;
    }

    public void setEndpoints(List<OssEndpoint> endpointsParam) {
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

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getOSSID() {
        return oSSIDParam;
    }

    public void setOSSID(String oSSIDParam) {
        this.oSSIDParam = oSSIDParam;
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

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getStorageSetArch() {
        return storageSetArchParam;
    }

    public void setStorageSetArch(String storageSetArchParam) {
        this.storageSetArchParam = storageSetArchParam;
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

}
