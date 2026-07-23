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

public class OrchTaskInfo {

    /** 租户ID，任务所属租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，任务所属租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 资源筛选条件，动态选择资源的条件 */
    @SerializedName("Condition")
    private String conditionParam;

    /** 创建时间，任务创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，任务所属租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 最新执行信息，任务最新执行结果和时间信息 */
    @SerializedName("Execution")
    private TaskExecution executionParam;

    /** 任务名称，编排任务名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目组ID，任务所属项目组 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目组名称，任务所属项目组名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，任务失败原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域，任务所属地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 任务备注，编排任务描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 资源类型，任务作用的资源类型 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 任务状态，资源状态非AVAILABLE时返回资源状态字符串，否则返回任务业务状态；当任务记录不存在时返回Invalied */
    @SerializedName("Status")
    private String statusParam;

    /** 步骤信息列表，任务执行步骤信息 */
    @SerializedName("Steps")
    private List<TaskStep> stepsParam;

    /** 任务ID，编排任务唯一标识 */
    @SerializedName("TaskID")
    private String taskIDParam;

    /** 任务类型，编排任务类型 */
    @SerializedName("TaskType")
    private String taskTypeParam;

    /** 更新时间，任务更新时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


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

    public String getCondition() {
        return conditionParam;
    }

    public void setCondition(String conditionParam) {
        this.conditionParam = conditionParam;
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

    public TaskExecution getExecution() {
        return executionParam;
    }

    public void setExecution(TaskExecution executionParam) {
        this.executionParam = executionParam;
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

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public List<TaskStep> getSteps() {
        return stepsParam;
    }

    public void setSteps(List<TaskStep> stepsParam) {
        this.stepsParam = stepsParam;
    }

    public String getTaskID() {
        return taskIDParam;
    }

    public void setTaskID(String taskIDParam) {
        this.taskIDParam = taskIDParam;
    }

    public String getTaskType() {
        return taskTypeParam;
    }

    public void setTaskType(String taskTypeParam) {
        this.taskTypeParam = taskTypeParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
