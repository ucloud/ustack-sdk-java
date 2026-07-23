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

public class DTSTaskInfo {

    /** 是否允许启动，0表示不允许，1表示允许 */
    @SerializedName("AllowStart")
    private Integer allowStartParam;

    /** 架构，DTS实例架构 */
    @SerializedName("Arch")
    private String archParam;

    /** 单批写入大小，用于控制 sinker 每次批量写入的记录数；为0时使用系统默认值1000 */
    @SerializedName("BatchSize")
    private Integer batchSizeParam;

    /** CPU核数，DTS实例CPU配置 */
    @SerializedName("CPU")
    private Integer cPUParam;

    /** 计费类型，取值范围：Dynamic、Month、Year；兼容历史值：hour、month、year，别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，资源所属租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 计算集群类型，DTS实例所在计算集群 */
    @SerializedName("ComputeClass")
    private String computeClassParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** DTS任务ID，数据传输任务唯一标识 */
    @SerializedName("DTSID")
    private String dTSIDParam;

    /** 目标实例ID，当目标为Internal时返回 */
    @SerializedName("DestinationEndpointInstanceID")
    private String destinationEndpointInstanceIDParam;

    /** 目标实例名称，目标端内部实例名称 */
    @SerializedName("DestinationEndpointInstanceName")
    private String destinationEndpointInstanceNameParam;

    /** 目标实例数据库类型，取值范围：MYSQL、REDIS */
    @SerializedName("DestinationEngine")
    private String destinationEngineParam;

    /** 弹性公网IP地址，绑定到DTS实例的公网地址 */
    @SerializedName("EIP")
    private String eIPParam;

    /** 弹性公网IPID，绑定到DTS实例的EIP */
    @SerializedName("EIPID")
    private String eIPIDParam;

    /** 弹性公网IP名称，绑定到DTS实例的EIP名称 */
    @SerializedName("EIPName")
    private String eIPNameParam;

    /** 租户邮箱，资源所属租户的联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 过期时间，秒级Unix时间戳 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 增量同步阶段的 DTS 自恢复策略；为空表示沿用 DTS 默认自恢复策略 */
    @SerializedName("IncrementalRestart")
    private DTSServiceRestartPolicy incrementalRestartParam;

    /** 最大每秒同步记录数，用于限制同步速率，取值最小范围为100，最大范围根据DTS实例CPU核数确定，1核上限为20000，2核上限为40000 */
    @SerializedName("MaxRPS")
    private Integer maxRPSParam;

    /** 内存大小，单位GB，DTS实例内存配置 */
    @SerializedName("Memory")
    private Integer memoryParam;

    /** DTS任务名称，用于展示资源名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目ID，资源所属项目分组 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，资源所属项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，任务失败时的错误信息 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域名称，地域显示名 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，数据传输任务的描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 源实例ID，当源为Internal时返回 */
    @SerializedName("SourceEndpointInstanceID")
    private String sourceEndpointInstanceIDParam;

    /** 源实例名称，源端内部实例名称 */
    @SerializedName("SourceEndpointInstanceName")
    private String sourceEndpointInstanceNameParam;

    /** 源实例数据库类型，取值范围：MYSQL、REDIS */
    @SerializedName("SourceEngine")
    private String sourceEngineParam;

    /** 状态，DTS任务状态，来自资源状态与运行状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 存储集群类型，DTS实例系统盘所在存储集群 */
    @SerializedName("StorageClass")
    private String storageClassParam;

    /** 标签列表，用于资源标记和分类管理 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 任务类型，数据传输任务同步模式 */
    @SerializedName("TaskMode")
    private String taskModeParam;

    /** 任务阶段状态列表，包含各阶段状态 */
    @SerializedName("TaskStages")
    private List<TaskStage> taskStagesParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public Integer getAllowStart() {
        return allowStartParam;
    }

    public void setAllowStart(Integer allowStartParam) {
        this.allowStartParam = allowStartParam;
    }

    public String getArch() {
        return archParam;
    }

    public void setArch(String archParam) {
        this.archParam = archParam;
    }

    public Integer getBatchSize() {
        return batchSizeParam;
    }

    public void setBatchSize(Integer batchSizeParam) {
        this.batchSizeParam = batchSizeParam;
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

    public String getComputeClass() {
        return computeClassParam;
    }

    public void setComputeClass(String computeClassParam) {
        this.computeClassParam = computeClassParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getDTSID() {
        return dTSIDParam;
    }

    public void setDTSID(String dTSIDParam) {
        this.dTSIDParam = dTSIDParam;
    }

    public String getDestinationEndpointInstanceID() {
        return destinationEndpointInstanceIDParam;
    }

    public void setDestinationEndpointInstanceID(String destinationEndpointInstanceIDParam) {
        this.destinationEndpointInstanceIDParam = destinationEndpointInstanceIDParam;
    }

    public String getDestinationEndpointInstanceName() {
        return destinationEndpointInstanceNameParam;
    }

    public void setDestinationEndpointInstanceName(String destinationEndpointInstanceNameParam) {
        this.destinationEndpointInstanceNameParam = destinationEndpointInstanceNameParam;
    }

    public String getDestinationEngine() {
        return destinationEngineParam;
    }

    public void setDestinationEngine(String destinationEngineParam) {
        this.destinationEngineParam = destinationEngineParam;
    }

    public String getEIP() {
        return eIPParam;
    }

    public void setEIP(String eIPParam) {
        this.eIPParam = eIPParam;
    }

    public String getEIPID() {
        return eIPIDParam;
    }

    public void setEIPID(String eIPIDParam) {
        this.eIPIDParam = eIPIDParam;
    }

    public String getEIPName() {
        return eIPNameParam;
    }

    public void setEIPName(String eIPNameParam) {
        this.eIPNameParam = eIPNameParam;
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

    public DTSServiceRestartPolicy getIncrementalRestart() {
        return incrementalRestartParam;
    }

    public void setIncrementalRestart(DTSServiceRestartPolicy incrementalRestartParam) {
        this.incrementalRestartParam = incrementalRestartParam;
    }

    public Integer getMaxRPS() {
        return maxRPSParam;
    }

    public void setMaxRPS(Integer maxRPSParam) {
        this.maxRPSParam = maxRPSParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
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

    public String getSourceEndpointInstanceID() {
        return sourceEndpointInstanceIDParam;
    }

    public void setSourceEndpointInstanceID(String sourceEndpointInstanceIDParam) {
        this.sourceEndpointInstanceIDParam = sourceEndpointInstanceIDParam;
    }

    public String getSourceEndpointInstanceName() {
        return sourceEndpointInstanceNameParam;
    }

    public void setSourceEndpointInstanceName(String sourceEndpointInstanceNameParam) {
        this.sourceEndpointInstanceNameParam = sourceEndpointInstanceNameParam;
    }

    public String getSourceEngine() {
        return sourceEngineParam;
    }

    public void setSourceEngine(String sourceEngineParam) {
        this.sourceEngineParam = sourceEngineParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getStorageClass() {
        return storageClassParam;
    }

    public void setStorageClass(String storageClassParam) {
        this.storageClassParam = storageClassParam;
    }

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public String getTaskMode() {
        return taskModeParam;
    }

    public void setTaskMode(String taskModeParam) {
        this.taskModeParam = taskModeParam;
    }

    public List<TaskStage> getTaskStages() {
        return taskStagesParam;
    }

    public void setTaskStages(List<TaskStage> taskStagesParam) {
        this.taskStagesParam = taskStagesParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
