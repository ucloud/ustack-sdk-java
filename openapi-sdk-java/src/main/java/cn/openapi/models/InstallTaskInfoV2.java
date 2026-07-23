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

public class InstallTaskInfoV2 {

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 配置快照 (JSON) */
    @SerializedName("ConfigSnapshot")
    private String configSnapshotParam;

    /** 创建时间 */
    @SerializedName("CreatedAt")
    private Integer createdAtParam;

    /** 当前阶段 */
    @SerializedName("CurrentStage")
    private String currentStageParam;

    /** 租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 结束时间 */
    @SerializedName("EndTime")
    private Integer endTimeParam;

    /** 错误信息 */
    @SerializedName("ErrorMessage")
    private String errorMessageParam;

    /** 预计完成时间 */
    @SerializedName("EstimatedCompletionTime")
    private Integer estimatedCompletionTimeParam;

    /** 主机名 */
    @SerializedName("Hostname")
    private String hostnameParam;

    /** 镜像ID（用于克隆模式） */
    @SerializedName("ImageID")
    private String imageIDParam;

    /** 镜像URL（用于克隆模式） */
    @SerializedName("ImageURL")
    private String imageURLParam;

    /** 安装模式: clone, kickstart */
    @SerializedName("InstallMode")
    private String installModeParam;

    /** 安装重试次数 */
    @SerializedName("InstallRetries")
    private Integer installRetriesParam;

    /** 系统镜像名称 */
    @SerializedName("MediaName")
    private String mediaNameParam;

    /** 系统镜像类型 */
    @SerializedName("MediaType")
    private String mediaTypeParam;

    /** 网络配置 (JSON) */
    @SerializedName("NetworkConfig")
    private String networkConfigParam;

    /** 裸金属ID */
    @SerializedName("PMID")
    private String pMIDParam;

    /** 进度 (0-100) */
    @SerializedName("Progress")
    private Integer progressParam;

    /** 项目ID */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 序列号 */
    @SerializedName("SN")
    private String sNParam;

    /** 开始时间 */
    @SerializedName("StartTime")
    private Integer startTimeParam;

    /** 状态: waiting, installing, completed, failed, canceled */
    @SerializedName("Status")
    private String statusParam;

    /** 目标磁盘 */
    @SerializedName("TargetDisk")
    private String targetDiskParam;

    /** 任务ID */
    @SerializedName("TaskID")
    private String taskIDParam;

    /** 更新时间 */
    @SerializedName("UpdatedAt")
    private Integer updatedAtParam;


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

    public String getConfigSnapshot() {
        return configSnapshotParam;
    }

    public void setConfigSnapshot(String configSnapshotParam) {
        this.configSnapshotParam = configSnapshotParam;
    }

    public Integer getCreatedAt() {
        return createdAtParam;
    }

    public void setCreatedAt(Integer createdAtParam) {
        this.createdAtParam = createdAtParam;
    }

    public String getCurrentStage() {
        return currentStageParam;
    }

    public void setCurrentStage(String currentStageParam) {
        this.currentStageParam = currentStageParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
    }

    public String getErrorMessage() {
        return errorMessageParam;
    }

    public void setErrorMessage(String errorMessageParam) {
        this.errorMessageParam = errorMessageParam;
    }

    public Integer getEstimatedCompletionTime() {
        return estimatedCompletionTimeParam;
    }

    public void setEstimatedCompletionTime(Integer estimatedCompletionTimeParam) {
        this.estimatedCompletionTimeParam = estimatedCompletionTimeParam;
    }

    public String getHostname() {
        return hostnameParam;
    }

    public void setHostname(String hostnameParam) {
        this.hostnameParam = hostnameParam;
    }

    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
    }

    public String getImageURL() {
        return imageURLParam;
    }

    public void setImageURL(String imageURLParam) {
        this.imageURLParam = imageURLParam;
    }

    public String getInstallMode() {
        return installModeParam;
    }

    public void setInstallMode(String installModeParam) {
        this.installModeParam = installModeParam;
    }

    public Integer getInstallRetries() {
        return installRetriesParam;
    }

    public void setInstallRetries(Integer installRetriesParam) {
        this.installRetriesParam = installRetriesParam;
    }

    public String getMediaName() {
        return mediaNameParam;
    }

    public void setMediaName(String mediaNameParam) {
        this.mediaNameParam = mediaNameParam;
    }

    public String getMediaType() {
        return mediaTypeParam;
    }

    public void setMediaType(String mediaTypeParam) {
        this.mediaTypeParam = mediaTypeParam;
    }

    public String getNetworkConfig() {
        return networkConfigParam;
    }

    public void setNetworkConfig(String networkConfigParam) {
        this.networkConfigParam = networkConfigParam;
    }

    public String getPMID() {
        return pMIDParam;
    }

    public void setPMID(String pMIDParam) {
        this.pMIDParam = pMIDParam;
    }

    public Integer getProgress() {
        return progressParam;
    }

    public void setProgress(Integer progressParam) {
        this.progressParam = progressParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSN() {
        return sNParam;
    }

    public void setSN(String sNParam) {
        this.sNParam = sNParam;
    }

    public Integer getStartTime() {
        return startTimeParam;
    }

    public void setStartTime(Integer startTimeParam) {
        this.startTimeParam = startTimeParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getTargetDisk() {
        return targetDiskParam;
    }

    public void setTargetDisk(String targetDiskParam) {
        this.targetDiskParam = targetDiskParam;
    }

    public String getTaskID() {
        return taskIDParam;
    }

    public void setTaskID(String taskIDParam) {
        this.taskIDParam = taskIDParam;
    }

    public Integer getUpdatedAt() {
        return updatedAtParam;
    }

    public void setUpdatedAt(Integer updatedAtParam) {
        this.updatedAtParam = updatedAtParam;
    }

}
