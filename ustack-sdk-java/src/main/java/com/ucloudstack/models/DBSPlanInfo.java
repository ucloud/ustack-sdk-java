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

public class DBSPlanInfo {

    /** 备份数量，计划下备份数量 */
    @SerializedName("BackupCount")
    private Integer backupCountParam;

    /** 备份库表，备份库表范围 */
    @SerializedName("BackupTables")
    private List<String> backupTablesParam;

    /** 备份类型，取值Logical/Physical/Snapshot/Incremental */
    @SerializedName("BackupType")
    private String backupTypeParam;

    /** 租户邮箱，租户联系邮箱 */
    @SerializedName("CompanyEmail")
    private String companyEmailParam;

    /** 租户ID，备份计划所属租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，租户显示名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，备份计划创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** Email，租户联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 增量备份周期，增量备份间隔 */
    @SerializedName("IncrementalInterval")
    private Integer incrementalIntervalParam;

    /** 增量备份源ID，增量备份源资源ID */
    @SerializedName("IncrementalSrcResourceID")
    private String incrementalSrcResourceIDParam;

    /** 名称，备份计划名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 暂停原因，备份计划暂停原因 */
    @SerializedName("PauseReason")
    private String pauseReasonParam;

    /** 备份计划ID，计划唯一标识 */
    @SerializedName("PlanID")
    private String planIDParam;

    /** 失败原因，备份计划失败原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 关联的全量备份计划ID，增量备份关联的全量备份计划ID */
    @SerializedName("RelatedPlanID")
    private String relatedPlanIDParam;

    /** 备注，备份计划描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 保留时间，备份保留时长 */
    @SerializedName("RetentionTime")
    private Integer retentionTimeParam;

    /** 调度类型，取值Manual或Timer */
    @SerializedName("ScheduleType")
    private String scheduleTypeParam;

    /** 备份源ID，备份源资源ID */
    @SerializedName("SrcID")
    private String srcIDParam;

    /** 备份源名称，备份源资源名称 */
    @SerializedName("SrcName")
    private String srcNameParam;

    /** 备份源地域，备份源资源所属地域 */
    @SerializedName("SrcRegion")
    private String srcRegionParam;

    /** 备份源类型，备份源资源类型 */
    @SerializedName("SrcType")
    private String srcTypeParam;

    /** 状态，备份计划状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 存储池ID，备份存储池ID */
    @SerializedName("StorageID")
    private String storageIDParam;

    /** 存储池名称，备份存储池名称 */
    @SerializedName("StorageName")
    private String storageNameParam;

    /** 备份资源存储集群架构，备份存储集群架构 */
    @SerializedName("StorageSetArch")
    private String storageSetArchParam;

    /** 执行日期，TimerType为TIMER_TYPE_MONTHLY时必填 */
    @SerializedName("TimerDays")
    private List<Integer> timerDaysParam;

    /** 执行小时，TimerType为TIMER_TYPE_DAILY时必填 */
    @SerializedName("TimerHours")
    private List<Integer> timerHoursParam;

    /** 定时器ID，定时器唯一标识 */
    @SerializedName("TimerID")
    private String timerIDParam;

    /** 定时器类型，ScheduleType为Timer时必填 */
    @SerializedName("TimerType")
    private String timerTypeParam;

    /** 执行星期，TimerType为TIMER_TYPE_WEEKLY时必填 */
    @SerializedName("TimerWeeks")
    private List<Integer> timerWeeksParam;

    /** 更新时间，备份计划更新时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public Integer getBackupCount() {
        return backupCountParam;
    }

    public void setBackupCount(Integer backupCountParam) {
        this.backupCountParam = backupCountParam;
    }

    public List<String> getBackupTables() {
        return backupTablesParam;
    }

    public void setBackupTables(List<String> backupTablesParam) {
        this.backupTablesParam = backupTablesParam;
    }

    public String getBackupType() {
        return backupTypeParam;
    }

    public void setBackupType(String backupTypeParam) {
        this.backupTypeParam = backupTypeParam;
    }

    public String getCompanyEmail() {
        return companyEmailParam;
    }

    public void setCompanyEmail(String companyEmailParam) {
        this.companyEmailParam = companyEmailParam;
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

    public Integer getIncrementalInterval() {
        return incrementalIntervalParam;
    }

    public void setIncrementalInterval(Integer incrementalIntervalParam) {
        this.incrementalIntervalParam = incrementalIntervalParam;
    }

    public String getIncrementalSrcResourceID() {
        return incrementalSrcResourceIDParam;
    }

    public void setIncrementalSrcResourceID(String incrementalSrcResourceIDParam) {
        this.incrementalSrcResourceIDParam = incrementalSrcResourceIDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPauseReason() {
        return pauseReasonParam;
    }

    public void setPauseReason(String pauseReasonParam) {
        this.pauseReasonParam = pauseReasonParam;
    }

    public String getPlanID() {
        return planIDParam;
    }

    public void setPlanID(String planIDParam) {
        this.planIDParam = planIDParam;
    }

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
    }

    public String getRelatedPlanID() {
        return relatedPlanIDParam;
    }

    public void setRelatedPlanID(String relatedPlanIDParam) {
        this.relatedPlanIDParam = relatedPlanIDParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public Integer getRetentionTime() {
        return retentionTimeParam;
    }

    public void setRetentionTime(Integer retentionTimeParam) {
        this.retentionTimeParam = retentionTimeParam;
    }

    public String getScheduleType() {
        return scheduleTypeParam;
    }

    public void setScheduleType(String scheduleTypeParam) {
        this.scheduleTypeParam = scheduleTypeParam;
    }

    public String getSrcID() {
        return srcIDParam;
    }

    public void setSrcID(String srcIDParam) {
        this.srcIDParam = srcIDParam;
    }

    public String getSrcName() {
        return srcNameParam;
    }

    public void setSrcName(String srcNameParam) {
        this.srcNameParam = srcNameParam;
    }

    public String getSrcRegion() {
        return srcRegionParam;
    }

    public void setSrcRegion(String srcRegionParam) {
        this.srcRegionParam = srcRegionParam;
    }

    public String getSrcType() {
        return srcTypeParam;
    }

    public void setSrcType(String srcTypeParam) {
        this.srcTypeParam = srcTypeParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getStorageID() {
        return storageIDParam;
    }

    public void setStorageID(String storageIDParam) {
        this.storageIDParam = storageIDParam;
    }

    public String getStorageName() {
        return storageNameParam;
    }

    public void setStorageName(String storageNameParam) {
        this.storageNameParam = storageNameParam;
    }

    public String getStorageSetArch() {
        return storageSetArchParam;
    }

    public void setStorageSetArch(String storageSetArchParam) {
        this.storageSetArchParam = storageSetArchParam;
    }

    public List<Integer> getTimerDays() {
        return timerDaysParam;
    }

    public void setTimerDays(List<Integer> timerDaysParam) {
        this.timerDaysParam = timerDaysParam;
    }

    public List<Integer> getTimerHours() {
        return timerHoursParam;
    }

    public void setTimerHours(List<Integer> timerHoursParam) {
        this.timerHoursParam = timerHoursParam;
    }

    public String getTimerID() {
        return timerIDParam;
    }

    public void setTimerID(String timerIDParam) {
        this.timerIDParam = timerIDParam;
    }

    public String getTimerType() {
        return timerTypeParam;
    }

    public void setTimerType(String timerTypeParam) {
        this.timerTypeParam = timerTypeParam;
    }

    public List<Integer> getTimerWeeks() {
        return timerWeeksParam;
    }

    public void setTimerWeeks(List<Integer> timerWeeksParam) {
        this.timerWeeksParam = timerWeeksParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
