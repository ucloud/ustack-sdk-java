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

public class TaskInfo {

    /** 开始时间，任务实际开始执行的秒级Unix时间戳 */
    @SerializedName("BeginTime")
    private Integer beginTimeParam;

    /** 创建时间，任务记录创建时刻的秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 结束时间，任务执行完成的秒级Unix时间戳 */
    @SerializedName("EndTime")
    private Integer endTimeParam;

    /** 错误码，任务执行返回码，0表示成功，非0表示失败 */
    @SerializedName("ErrCode")
    private Integer errCodeParam;

    /** 任务执行备注，记录执行过程中的关键信息或错误描述 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 资源ID，该任务操作的目标资源唯一标识符 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 任务执行结果ID，任务成功后生成的结果资源标识，不同任务类型对应不同结果资源 */
    @SerializedName("TargetID")
    private String targetIDParam;

    /** 任务类型，该次执行的具体业务操作类型 */
    @SerializedName("Task")
    private String taskParam;

    /** 任务执行记录ID，单次任务执行的唯一标识符，用于追踪与审计 */
    @SerializedName("TaskID")
    private String taskIDParam;

    /** 任务执行状态，表示任务执行进度与结果，取值：Executing（执行中，任务正在处理）、Waiting（等待中，任务已创建但未开始）、Cancel（已取消，任务被手动取消）、Success（成功，任务执行完成且成功）、Failure（失败，任务执行失败）、Expired（已过期，任务超时未执行） */
    @SerializedName("TaskStatus")
    private String taskStatusParam;

    /** 定时器ID，关联本次执行记录的定时器唯一标识符 */
    @SerializedName("TimerID")
    private String timerIDParam;


    public Integer getBeginTime() {
        return beginTimeParam;
    }

    public void setBeginTime(Integer beginTimeParam) {
        this.beginTimeParam = beginTimeParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
    }

    public Integer getErrCode() {
        return errCodeParam;
    }

    public void setErrCode(Integer errCodeParam) {
        this.errCodeParam = errCodeParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public String getTargetID() {
        return targetIDParam;
    }

    public void setTargetID(String targetIDParam) {
        this.targetIDParam = targetIDParam;
    }

    public String getTask() {
        return taskParam;
    }

    public void setTask(String taskParam) {
        this.taskParam = taskParam;
    }

    public String getTaskID() {
        return taskIDParam;
    }

    public void setTaskID(String taskIDParam) {
        this.taskIDParam = taskIDParam;
    }

    public String getTaskStatus() {
        return taskStatusParam;
    }

    public void setTaskStatus(String taskStatusParam) {
        this.taskStatusParam = taskStatusParam;
    }

    public String getTimerID() {
        return timerIDParam;
    }

    public void setTimerID(String timerIDParam) {
        this.timerIDParam = timerIDParam;
    }

}
