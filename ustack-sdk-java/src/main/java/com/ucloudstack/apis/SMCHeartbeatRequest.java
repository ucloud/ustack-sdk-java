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

public class SMCHeartbeatRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，可选参数 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 已完成的子任务数量，用于计算当前迁移进度百分比，DoneSubtask/TotalSubtask = 进度 */
    
    @UCloudStackParam("DoneSubtask")
    private Integer doneSubtaskParam;

    /** 地域ID，指定SMC任务所属的物理区域，与SMCID对应的区域必须相同 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** SMC任务唯一标识ID，标识心跳数据关联的迁移任务 */
    @NotEmpty
    @UCloudStackParam("SMCID")
    private String sMCIDParam;

    /** 迁移Agent上报的当前任务状态，允许取值：Unknown、Online、Offline、Preparing、Stopping、Syncing、Exception、Synced、Completing、Completed、Deleted，状态转换规则：ONLINE→PREPARING、SYNCED→PREPARING、SYNCING→STOPPING；状态为SYNCED时服务端会更新LastSyncedTime，状态为COMPLETED、COMPLETING、EXCEPTION时不再更新进度 */
    @NotEmpty
    @UCloudStackParam("State")
    private String stateParam;

    /** 子任务列表，包含各个子任务的名称、进度百分比和传输速率等详细信息 */
    
    @UCloudStackParam("Subtasks")
    private List<SMCSubtask> subtasksParam;

    /** 子任务总数量，表示本次迁移任务分解的总子任务数，用于计算迁移进度 */
    
    @UCloudStackParam("TotalSubtask")
    private Integer totalSubtaskParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getDoneSubtask() {
        return doneSubtaskParam;
    }

    public void setDoneSubtask(Integer doneSubtaskParam) {
        this.doneSubtaskParam = doneSubtaskParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
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

    public Integer getTotalSubtask() {
        return totalSubtaskParam;
    }

    public void setTotalSubtask(Integer totalSubtaskParam) {
        this.totalSubtaskParam = totalSubtaskParam;
    }

}
