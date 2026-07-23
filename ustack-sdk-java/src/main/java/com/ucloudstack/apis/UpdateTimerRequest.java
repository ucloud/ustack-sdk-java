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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateTimerRequest extends Request {

    /** 特定参数，任务策略配置的key:value数组，可用键：PolicySetID、PolicyCompanyIDs、PolicyProjectIDs、PolicyResourceTypes、PolicyDays、PolicyDirPath、PolicyNotifyGroup、PolicyNotifyWhenWarning */
    
    @UCloudStackParam("Annotations")
    private List<String> annotationsParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 日期，当调度类型为TIMER_TYPE_MONTHLY时必填，指定每月执行日期列表，取值范围1-32，其中32表示每月最后一天（自动适配大小月和二月） */
    
    @UCloudStackParam("Days")
    private List<Integer> daysParam;

    /** 固定间隔，当调度类型为TIMER_TYPE_FIXED_INTERVAL时必填，取值范围60-86400秒 */
    
    @UCloudStackParam("FixedInterval")
    private Integer fixedIntervalParam;

    /** 小时，当调度类型为TIMER_TYPE_DAILY、TIMER_TYPE_WEEKLY、TIMER_TYPE_MONTHLY时必填，指定每天执行小时列表，取值范围0-23 */
    
    @UCloudStackParam("Hours")
    private List<Integer> hoursParam;

    /** 保留数量，当Task为CreateSnapshot/CreateInspection/CreateResUsed时使用，取值范围1-42，默认10 */
    
    @UCloudStackParam("KeepNum")
    private Integer keepNumParam;

    /** 定时器名称，更新后的名称用于标识和区分定时任务 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** 项目ID，定时器所属项目分组标识，更新时保持不变 */
    
    @UCloudStackParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，用于标识定时器所属的地理区域，更新时可变更定时器所属地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注信息，更新后用于补充说明定时器用途或业务场景 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 资源ID列表，当Task为CreateSnapshot时必填，用于指定快照目标资源 */
    
    @UCloudStackParam("ResourceIDs")
    private List<String> resourceIDsParam;

    /** 资源类型，当Task为CreateSnapshot时有效，默认DISK，DIRECTORY表示文件目录 */
    
    @UCloudStackParam("ResourceType")
    private String resourceTypeParam;

    /** 保留时长（单位：天），当Task为PlatformFileBackup/PlatformDBBackup时使用，默认10天 */
    
    @UCloudStackParam("Retention")
    private Integer retentionParam;

    /** 任务类型，定时器执行的业务操作类型，取值：CreateSnapshot（为云硬盘创建快照，用于数据备份和恢复）、DBSBackUP（数据库备份任务）、CreateInspection（平台巡检任务，用于系统健康检查）、CreateResUsed（资源用量统计任务，用于生成资源使用报表）PlatformDBBackup(平台数据库备份) PlatformFileBackup(平台配置文件备份) */
    @NotEmpty
    @UCloudStackParam("Task")
    private String taskParam;

    /** 定时器ID，用于指定需要更新的定时器，要求定时器处于可用状态 */
    @NotEmpty
    @UCloudStackParam("TimerID")
    private String timerIDParam;

    /** 单次触发时间，当调度类型为TIMER_TYPE_ONCE时必填，秒级Unix时间戳且必须大于当前时间 */
    
    @UCloudStackParam("TriggerTime")
    private Integer triggerTimeParam;

    /** 调度类型，定义定时器触发规则，取值：TIMER_TYPE_ONCE（单次执行，在指定时间点执行一次）、TIMER_TYPE_DAILY（每日执行，每天在指定时间执行）、TIMER_TYPE_WEEKLY（每周执行，每周在指定星期和时间执行）、TIMER_TYPE_MONTHLY（每月执行，每月在指定日期和时间执行）、TIMER_TYPE_FIXED_INTERVAL（固定间隔执行，按指定时间间隔周期性执行） */
    @NotEmpty
    @UCloudStackParam("Type")
    private String typeParam;

    /** 星期，当调度类型为TIMER_TYPE_WEEKLY时必填，指定每周执行星期列表，取值范围0-7对应周一到周日 */
    
    @UCloudStackParam("Weeks")
    private List<Integer> weeksParam;


    public List<String> getAnnotations() {
        return annotationsParam;
    }

    public void setAnnotations(List<String> annotationsParam) {
        this.annotationsParam = annotationsParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<Integer> getDays() {
        return daysParam;
    }

    public void setDays(List<Integer> daysParam) {
        this.daysParam = daysParam;
    }

    public Integer getFixedInterval() {
        return fixedIntervalParam;
    }

    public void setFixedInterval(Integer fixedIntervalParam) {
        this.fixedIntervalParam = fixedIntervalParam;
    }

    public List<Integer> getHours() {
        return hoursParam;
    }

    public void setHours(List<Integer> hoursParam) {
        this.hoursParam = hoursParam;
    }

    public Integer getKeepNum() {
        return keepNumParam;
    }

    public void setKeepNum(Integer keepNumParam) {
        this.keepNumParam = keepNumParam;
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

    public List<String> getResourceIDs() {
        return resourceIDsParam;
    }

    public void setResourceIDs(List<String> resourceIDsParam) {
        this.resourceIDsParam = resourceIDsParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public Integer getRetention() {
        return retentionParam;
    }

    public void setRetention(Integer retentionParam) {
        this.retentionParam = retentionParam;
    }

    public String getTask() {
        return taskParam;
    }

    public void setTask(String taskParam) {
        this.taskParam = taskParam;
    }

    public String getTimerID() {
        return timerIDParam;
    }

    public void setTimerID(String timerIDParam) {
        this.timerIDParam = timerIDParam;
    }

    public Integer getTriggerTime() {
        return triggerTimeParam;
    }

    public void setTriggerTime(Integer triggerTimeParam) {
        this.triggerTimeParam = triggerTimeParam;
    }

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

    public List<Integer> getWeeks() {
        return weeksParam;
    }

    public void setWeeks(List<Integer> weeksParam) {
        this.weeksParam = weeksParam;
    }

}
