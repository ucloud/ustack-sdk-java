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

public class SMCInfo {

    /** 源端CPU架构，如x86_64或aarch64 */
    @SerializedName("Arch")
    private String archParam;

    /** 带宽限速，单位Mbps，用于控制迁移数据传输的网络速率，0表示不限速 */
    @SerializedName("Bandwidth")
    private Integer bandwidthParam;

    /** 源端启动加载器类型，如BIOS或UEFI，影响目标VM启动配置 */
    @SerializedName("BootloaderType")
    private String bootloaderTypeParam;

    /** 租户ID，SMC任务所属的租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，租户的可读化展示名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 源端CPU核心数，影响迁移性能 */
    @SerializedName("Cores")
    private Integer coresParam;

    /** 创建时间，Unix时间戳，表示SMC任务创建的时间 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 磁盘映射关系列表，包含源端磁盘与目标云硬盘的映射信息 */
    @SerializedName("DiskMappings")
    private List<DiskMapping> diskMappingsParam;

    /** 源端操作系统发行版，如CentOS、Ubuntu、Debian等 */
    @SerializedName("Distribution")
    private String distributionParam;

    /** 源端操作系统发行版版本号，如7.9、20.04等 */
    @SerializedName("DistributionVersion")
    private String distributionVersionParam;

    /** 已完成的子任务数量，用于计算迁移进度 */
    @SerializedName("DoneSubtask")
    private Integer doneSubtaskParam;

    /** 租户邮箱，用于联系租户的邮件地址 */
    @SerializedName("Email")
    private String emailParam;

    /** 传输IP地址，目标VM的内网IP地址，用于SSH数据传输 */
    @SerializedName("Host")
    private String hostParam;

    /** 源端主机名，源服务器的网络标识 */
    @SerializedName("Hostname")
    private String hostnameParam;

    /** 源端IP地址，用于与源服务器通信 */
    @SerializedName("IP")
    private String iPParam;

    /** 源端操作系统内核版本号，如3.10.0-1160等 */
    @SerializedName("Kernel")
    private String kernelParam;

    /** 最后同步时间，Unix时间戳，表示任务最后一次同步成功的时间 */
    @SerializedName("LastSyncedTime")
    private Integer lastSyncedTimeParam;

    /** 是否已锁定，锁定后不能再进行SetupSMC配置修改，可以防止误操作 */
    @SerializedName("Locked")
    private Boolean lockedParam;

    /** 源端内存大小，单位MB */
    @SerializedName("Memory")
    private Integer memoryParam;

    /** SMC任务名称，由用户创建时指定的任务标识名 */
    @SerializedName("Name")
    private String nameParam;

    /** 源端操作系统类型，如Linux或Windows */
    @SerializedName("OS")
    private String oSParam;

    /** 项目ID，SMC任务所属的项目，用于资源分组管理 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，项目的可读化展示名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 原因或错误信息，当任务处于异常状态时，此字段记录失败原因或错误信息 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，SMC任务所属的物理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的可读化展示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注说明，由用户创建时填写的任务备注信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** SMC任务唯一标识ID，全局唯一标识符 */
    @SerializedName("SMCID")
    private String sMCIDParam;

    /** 当前任务状态，当资源状态为非AVAILABLE时，此字段显示资源状态而非SMC状态，如CREATING、DELETING、EXCEPTION等 */
    @SerializedName("State")
    private String stateParam;

    /** 子任务列表，包含各个子任务的详细信息 */
    @SerializedName("Subtasks")
    private List<SMCSubtask> subtasksParam;

    /** 标签列表，用户为该SMC任务添加的标签 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 子任务总数量，迁移任务分解的总子任务数 */
    @SerializedName("TotalSubtask")
    private Integer totalSubtaskParam;

    /** 更新时间，Unix时间戳，表示SMC任务最后一次修改的时间 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 目标虚拟机SSH用户名，用于数据传输的认证 */
    @SerializedName("User")
    private String userParam;

    /** 目标传输虚拟机ID，接收迁移数据的目标VM */
    @SerializedName("VMID")
    private String vMIDParam;


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

    public String getBootloaderType() {
        return bootloaderTypeParam;
    }

    public void setBootloaderType(String bootloaderTypeParam) {
        this.bootloaderTypeParam = bootloaderTypeParam;
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

    public Integer getCores() {
        return coresParam;
    }

    public void setCores(Integer coresParam) {
        this.coresParam = coresParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public List<DiskMapping> getDiskMappings() {
        return diskMappingsParam;
    }

    public void setDiskMappings(List<DiskMapping> diskMappingsParam) {
        this.diskMappingsParam = diskMappingsParam;
    }

    public String getDistribution() {
        return distributionParam;
    }

    public void setDistribution(String distributionParam) {
        this.distributionParam = distributionParam;
    }

    public String getDistributionVersion() {
        return distributionVersionParam;
    }

    public void setDistributionVersion(String distributionVersionParam) {
        this.distributionVersionParam = distributionVersionParam;
    }

    public Integer getDoneSubtask() {
        return doneSubtaskParam;
    }

    public void setDoneSubtask(Integer doneSubtaskParam) {
        this.doneSubtaskParam = doneSubtaskParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getHost() {
        return hostParam;
    }

    public void setHost(String hostParam) {
        this.hostParam = hostParam;
    }

    public String getHostname() {
        return hostnameParam;
    }

    public void setHostname(String hostnameParam) {
        this.hostnameParam = hostnameParam;
    }

    public String getIP() {
        return iPParam;
    }

    public void setIP(String iPParam) {
        this.iPParam = iPParam;
    }

    public String getKernel() {
        return kernelParam;
    }

    public void setKernel(String kernelParam) {
        this.kernelParam = kernelParam;
    }

    public Integer getLastSyncedTime() {
        return lastSyncedTimeParam;
    }

    public void setLastSyncedTime(Integer lastSyncedTimeParam) {
        this.lastSyncedTimeParam = lastSyncedTimeParam;
    }

    public Boolean getLocked() {
        return lockedParam;
    }

    public void setLocked(Boolean lockedParam) {
        this.lockedParam = lockedParam;
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

    public String getOS() {
        return oSParam;
    }

    public void setOS(String oSParam) {
        this.oSParam = oSParam;
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

    public String getSMCID() {
        return sMCIDParam;
    }

    public void setSMCID(String sMCIDParam) {
        this.sMCIDParam = sMCIDParam;
    }

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public List<SMCSubtask> getSubtasks() {
        return subtasksParam;
    }

    public void setSubtasks(List<SMCSubtask> subtasksParam) {
        this.subtasksParam = subtasksParam;
    }

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public Integer getTotalSubtask() {
        return totalSubtaskParam;
    }

    public void setTotalSubtask(Integer totalSubtaskParam) {
        this.totalSubtaskParam = totalSubtaskParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getUser() {
        return userParam;
    }

    public void setUser(String userParam) {
        this.userParam = userParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
