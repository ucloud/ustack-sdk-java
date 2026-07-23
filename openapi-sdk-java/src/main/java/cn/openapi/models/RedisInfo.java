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

public class RedisInfo {

    /** 计算集群架构，实例计算架构 */
    @SerializedName("Arch")
    private String archParam;

    /** 计费类型，取值Dynamic/Month/Year，分别对应HOUR/MONTH/YEAR */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，用于标识资源所属的租户，实现多租户环境下的资源隔离 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，租户显示名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 配置文件ID，实例使用的配置模板ID */
    @SerializedName("ConfigID")
    private String configIDParam;

    /** 创建时间，Unix时间戳（秒级） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，租户注册时提供的用于接收通知和联系的邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 网络信息，实例访问地址列表 */
    @SerializedName("Endpoints")
    private List<RedisEndpoint> endpointsParam;

    /** 过期时间，Unix时间戳（秒） */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 高可用类型，Standalone或ActiveStandy */
    @SerializedName("HighAvailability")
    private String highAvailabilityParam;

    /** 内存大小，单位GiB */
    @SerializedName("Memory")
    private Integer memoryParam;

    /** 内存使用情况，实例内存使用信息 */
    @SerializedName("MemoryUsage")
    private MemoryUsage memoryUsageParam;

    /** Redis名称，实例名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目组ID，用于资源分组管理 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目组名称，项目组显示名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 创建失败原因，实例创建失败原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** Redis实例ID，实例唯一标识 */
    @SerializedName("RedisID")
    private String redisIDParam;

    /** 地域ID，地域，一批可共享的物理资源使用集合 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域展示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用的http://或https://等非法字符，可为空 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 角色，实例角色类型 */
    @SerializedName("Role")
    private String roleParam;

    /** 计算集群类型，实例所属计算集群类型 */
    @SerializedName("SetType")
    private String setTypeParam;

    /** 从节点数量，从库数量 */
    @SerializedName("SlaveCount")
    private Integer slaveCountParam;

    /** 从库信息，从库实例列表 */
    @SerializedName("SlaveInfos")
    private List<SlaveRedisInfo> slaveInfosParam;

    /** 资源状态，实例状态字符串 */
    @SerializedName("Status")
    private String statusParam;

    /** 存储集群类型，实例数据盘所属存储集群类型 */
    @SerializedName("StorageSetType")
    private String storageSetTypeParam;

    /** 子网ID，实例所属子网ID */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称，实例所属子网名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;

    /** 标签，用于资源标记和分类管理，格式为key:value的字符串，传入Base64编码的字符串， */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 删除保护策略，0开启，1关闭 */
    @SerializedName("TerminationPolicy")
    private Integer terminationPolicyParam;

    /** 线程数量，Redis7.0有效 */
    @SerializedName("Threads")
    private Integer threadsParam;

    /** 更新时间，Unix时间戳（秒级） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** VPCID，实例所属VPCID */
    @SerializedName("VPCID")
    private String vPCIDParam;

    /** VPC名称，实例所属VPC名称 */
    @SerializedName("VPCName")
    private String vPCNameParam;

    /** Redis版本，实例版本 */
    @SerializedName("Version")
    private String versionParam;


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

    public String getConfigID() {
        return configIDParam;
    }

    public void setConfigID(String configIDParam) {
        this.configIDParam = configIDParam;
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

    public List<RedisEndpoint> getEndpoints() {
        return endpointsParam;
    }

    public void setEndpoints(List<RedisEndpoint> endpointsParam) {
        this.endpointsParam = endpointsParam;
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

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public MemoryUsage getMemoryUsage() {
        return memoryUsageParam;
    }

    public void setMemoryUsage(MemoryUsage memoryUsageParam) {
        this.memoryUsageParam = memoryUsageParam;
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

    public String getRedisID() {
        return redisIDParam;
    }

    public void setRedisID(String redisIDParam) {
        this.redisIDParam = redisIDParam;
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

    public String getRole() {
        return roleParam;
    }

    public void setRole(String roleParam) {
        this.roleParam = roleParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

    public Integer getSlaveCount() {
        return slaveCountParam;
    }

    public void setSlaveCount(Integer slaveCountParam) {
        this.slaveCountParam = slaveCountParam;
    }

    public List<SlaveRedisInfo> getSlaveInfos() {
        return slaveInfosParam;
    }

    public void setSlaveInfos(List<SlaveRedisInfo> slaveInfosParam) {
        this.slaveInfosParam = slaveInfosParam;
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

    public Integer getThreads() {
        return threadsParam;
    }

    public void setThreads(Integer threadsParam) {
        this.threadsParam = threadsParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
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
