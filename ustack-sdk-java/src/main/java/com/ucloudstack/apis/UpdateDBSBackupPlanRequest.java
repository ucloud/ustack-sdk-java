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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateDBSBackupPlanRequest extends Request {

    /** 备份库表，备份库表范围，格式为db.table用逗号分隔，MySQL逻辑备份需为*.* */
    
    @OpenAPIParam("BackupTables")
    private String backupTablesParam;

    /** 备份类型，取值Logical/Physical/Snapshot/Incremental */
    @NotEmpty
    @OpenAPIParam("BackupType")
    private String backupTypeParam;

    /** 租户ID，备份计划所属租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 增量备份间隔，单位分钟，增量备份更新时必填，且必须≥5分钟 */
    
    @OpenAPIParam("IncrementalInterval")
    private Integer incrementalIntervalParam;

    /** 名称，备份计划名称，长度1-128字符，支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 计划ID，待更新的备份计划ID */
    @NotEmpty
    @OpenAPIParam("PlanID")
    private String planIDParam;

    /** 备注，备份计划描述信息，长度0-100字符，禁止http://或https://等非法字符 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 保留时间，备份保留时长 */
    @NotEmpty
    @OpenAPIParam("RetentionTime")
    private Integer retentionTimeParam;

    /** 调度类型，取值Manual或Timer */
    @NotEmpty
    @OpenAPIParam("ScheduleType")
    private String scheduleTypeParam;

    /** 源资源ID，备份源资源ID */
    @NotEmpty
    @OpenAPIParam("SrcResourceID")
    private String srcResourceIDParam;

    /** 源数据地域，备份源资源所属地域 */
    @NotEmpty
    @OpenAPIParam("SrcResourceRegion")
    private String srcResourceRegionParam;

    /** 源数据类型，备份源资源类型 */
    @NotEmpty
    @OpenAPIParam("SrcResourceType")
    private String srcResourceTypeParam;

    /** 存储系统ID，备份存储池ID；备份类型为Snapshot时可为空 */
    
    @OpenAPIParam("StorageID")
    private String storageIDParam;

    /** 执行日期，TimerType为TIMER_TYPE_MONTHLY时必填 */
    
    @OpenAPIParam("TimerDays")
    private List<Integer> timerDaysParam;

    /** 执行小时，TimerType为TIMER_TYPE_DAILY/TIMER_TYPE_WEEKLY/TIMER_TYPE_MONTHLY时必填 */
    
    @OpenAPIParam("TimerHours")
    private List<Integer> timerHoursParam;

    /** 定时器类型，ScheduleType为Timer时必填 */
    
    @OpenAPIParam("TimerType")
    private String timerTypeParam;

    /** 执行星期，TimerType为TIMER_TYPE_WEEKLY时必填 */
    
    @OpenAPIParam("TimerWeeks")
    private List<Integer> timerWeeksParam;


    public String getBackupTables() {
        return backupTablesParam;
    }

    public void setBackupTables(String backupTablesParam) {
        this.backupTablesParam = backupTablesParam;
    }

    public String getBackupType() {
        return backupTypeParam;
    }

    public void setBackupType(String backupTypeParam) {
        this.backupTypeParam = backupTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getIncrementalInterval() {
        return incrementalIntervalParam;
    }

    public void setIncrementalInterval(Integer incrementalIntervalParam) {
        this.incrementalIntervalParam = incrementalIntervalParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPlanID() {
        return planIDParam;
    }

    public void setPlanID(String planIDParam) {
        this.planIDParam = planIDParam;
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

    public String getSrcResourceID() {
        return srcResourceIDParam;
    }

    public void setSrcResourceID(String srcResourceIDParam) {
        this.srcResourceIDParam = srcResourceIDParam;
    }

    public String getSrcResourceRegion() {
        return srcResourceRegionParam;
    }

    public void setSrcResourceRegion(String srcResourceRegionParam) {
        this.srcResourceRegionParam = srcResourceRegionParam;
    }

    public String getSrcResourceType() {
        return srcResourceTypeParam;
    }

    public void setSrcResourceType(String srcResourceTypeParam) {
        this.srcResourceTypeParam = srcResourceTypeParam;
    }

    public String getStorageID() {
        return storageIDParam;
    }

    public void setStorageID(String storageIDParam) {
        this.storageIDParam = storageIDParam;
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

}
