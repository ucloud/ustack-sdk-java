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

public class OldTimerInfo {

    /** 特定参数，定时器策略配置信息 */
    @SerializedName("Annotations")
    private List<String> annotationsParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 日期，当调度类型为TIMER_TYPE_MONTHLY时生效 */
    @SerializedName("Days")
    private List<Integer> daysParam;

    /** 租户邮箱，定时器所属租户的联系邮箱地址 */
    @SerializedName("Email")
    private String emailParam;

    /** 固定间隔（单位：秒），当调度类型为TIMER_TYPE_FIXED_INTERVAL时生效 */
    @SerializedName("FixedInterval")
    private Integer fixedIntervalParam;

    /** 小时，当调度类型为TIMER_TYPE_DAILY/TIMER_TYPE_WEEKLY/TIMER_TYPE_MONTHLY时生效 */
    @SerializedName("Hours")
    private List<Integer> hoursParam;

    /** 保留数量，当任务类型为CreateSnapshot/CreateInspection/CreateResUsed时生效 */
    @SerializedName("KeepNum")
    private Integer keepNumParam;

    /** 定时器名称，用于标识定时任务 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目ID，定时器所属项目分组标识 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，定时器所属项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 地域ID，定时器所属的地理标识 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的人性化显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注信息，补充说明定时器用途 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 资源类型，定时任务操作的资源类别，如DISK（云硬盘）、DIRECTORY（文件目录） */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 保留时长（单位：天），当任务类型为PlatformFileBackup/PlatformDBBackup时生效 */
    @SerializedName("Retention")
    private Integer retentionParam;

    /** 任务类型，定时器执行的业务操作类型 */
    @SerializedName("Task")
    private String taskParam;

    /** 定时器ID，定时器唯一标识符 */
    @SerializedName("TimerID")
    private String timerIDParam;

    /** 关联的资源列表，定时器绑定的目标资源信息 */
    @SerializedName("TimerResources")
    private List<TimerResources> timerResourcesParam;

    /** 定时器状态，取值：Normal（正常运行，任务会按调度规则执行）、Paused（已暂停，任务暂时不执行）、Deleting（删除中）、Deleted（已删除）；当资源状态非Available时返回资源状态 */
    @SerializedName("TimerStatus")
    private String timerStatusParam;

    /** 单次触发时间，秒级Unix时间戳 */
    @SerializedName("TriggerTime")
    private Integer triggerTimeParam;

    /** 调度类型，定时器触发规则 */
    @SerializedName("Type")
    private String typeParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 星期，当调度类型为TIMER_TYPE_WEEKLY时生效，取值范围0-7对应周一到周日 */
    @SerializedName("Weeks")
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

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public List<Integer> getDays() {
        return daysParam;
    }

    public void setDays(List<Integer> daysParam) {
        this.daysParam = daysParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
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

    public String getProjectName() {
        return projectNameParam;
    }

    public void setProjectName(String projectNameParam) {
        this.projectNameParam = projectNameParam;
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

    public List<TimerResources> getTimerResources() {
        return timerResourcesParam;
    }

    public void setTimerResources(List<TimerResources> timerResourcesParam) {
        this.timerResourcesParam = timerResourcesParam;
    }

    public String getTimerStatus() {
        return timerStatusParam;
    }

    public void setTimerStatus(String timerStatusParam) {
        this.timerStatusParam = timerStatusParam;
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

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public List<Integer> getWeeks() {
        return weeksParam;
    }

    public void setWeeks(List<Integer> weeksParam) {
        this.weeksParam = weeksParam;
    }

}
