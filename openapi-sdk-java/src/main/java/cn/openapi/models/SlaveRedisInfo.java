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

public class SlaveRedisInfo {

    /** 计算集群架构，从库实例计算架构 */
    @SerializedName("Arch")
    private String archParam;

    /** 计费类型，取值Dynamic/Month/Year，分别对应HOUR/MONTH/YEAR */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，从库实例所属租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 配置文件ID，从库实例配置模板ID */
    @SerializedName("ConfigID")
    private String configIDParam;

    /** 创建时间，Unix时间戳（秒） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，租户联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 网络信息，从库实例访问地址列表 */
    @SerializedName("Endpoints")
    private List<RedisEndpoint> endpointsParam;

    /** 过期时间，Unix时间戳（秒） */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 高可用类型，Standalone或ActiveStandy */
    @SerializedName("HighAvailability")
    private String highAvailabilityParam;

    /** 主Redis实例ID，从库对应的主库ID */
    @SerializedName("MasterID")
    private String masterIDParam;

    /** 内存大小，单位MiB */
    @SerializedName("Memory")
    private Integer memoryParam;

    /** 内存使用情况，从库内存使用信息 */
    @SerializedName("MemoryUsage")
    private MemoryUsage memoryUsageParam;

    /** 名称，从库实例名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目ID，从库实例所属项目 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，从库实例所属项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，从库创建失败原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** Redis实例ID，从库实例ID */
    @SerializedName("RedisID")
    private String redisIDParam;

    /** 地域ID，从库实例所属地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 备注，从库实例备注信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 角色，实例角色类型 */
    @SerializedName("Role")
    private String roleParam;

    /** 计算集群类型，从库实例所属计算集群类型 */
    @SerializedName("SetType")
    private String setTypeParam;

    /** 资源状态，实例状态字符串 */
    @SerializedName("Status")
    private String statusParam;

    /** 存储集群类型，从库实例数据盘所属存储集群类型 */
    @SerializedName("StorageSetType")
    private String storageSetTypeParam;

    /** 子网ID，从库实例所属子网ID */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称，从库实例所属子网名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;

    /** 标签，从库实例标签列表 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 删除保护策略，0开启，1关闭 */
    @SerializedName("TerminationPolicy")
    private Integer terminationPolicyParam;

    /** 线程数量，Redis7.0有效 */
    @SerializedName("Threads")
    private Integer threadsParam;

    /** 更新时间，Unix时间戳（秒） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** VPCID，从库实例所属VPCID */
    @SerializedName("VPCID")
    private String vPCIDParam;

    /** VPC名称，从库实例所属VPC名称 */
    @SerializedName("VPCName")
    private String vPCNameParam;

    /** Redis版本，从库实例版本 */
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

    public String getMasterID() {
        return masterIDParam;
    }

    public void setMasterID(String masterIDParam) {
        this.masterIDParam = masterIDParam;
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
