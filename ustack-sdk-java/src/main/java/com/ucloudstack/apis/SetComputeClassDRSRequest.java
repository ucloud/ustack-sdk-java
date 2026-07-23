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

public class SetComputeClassDRSRequest extends Request {

    /** 是否自动迁移，为true时DRS会在满足条件后直接迁移，为false仅生成建议供人工确认 */
    
    @UCloudStackParam("AutoMigrate")
    private Boolean autoMigrateParam;

    /** 租户ID，用于按租户隔离DRS配置与权限，非空时按租户过滤返回数据 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** DRS执行Cron表达式，采用标准5字段格式（分 时 日 月 周），如0 2 * * * 表示每日02:00触发 */
    
    @UCloudStackParam("Cron")
    private String cronParam;

    /** DRS周期结束时间，秒级Unix时间戳，需大于StartTime，不填表示长期生效 */
    
    @UCloudStackParam("FinishTime")
    private Integer finishTimeParam;

    /** 历史保留批次，控制最多保留的DRS任务记录数量，0表示沿用默认10个 */
    
    @UCloudStackParam("MaxJobKeep")
    private Integer maxJobKeepParam;

    /** 最大可迁出虚拟机CPU核数，限制单个任务迁移的最大vCPU数量，0表示沿用默认16核 */
    
    @UCloudStackParam("MaxMigratableVMCPU")
    private Integer maxMigratableVMCPUParam;

    /** 最大可迁出虚拟机内存容量，限制单个任务迁移的最大内存，单位GiB，0表示沿用默认32GiB */
    
    @UCloudStackParam("MaxMigratableVMMemory")
    private Integer maxMigratableVMMemoryParam;

    /** 节点健康阈值，取值0-100，0表示沿用默认80，DRS会对低于阈值的节点触发均衡 */
    
    @UCloudStackParam("NodeHealthScore")
    private Integer nodeHealthScoreParam;

    /** 地域ID，指定请求操作的物理区域，用于路由到对应的Huanghe集群 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 计算集群ID，指定要配置DRS策略的ComputeClass */
    @NotEmpty
    @UCloudStackParam("SetID")
    private String setIDParam;

    /** DRS周期开启时间，秒级Unix时间戳，不填表示立即生效 */
    
    @UCloudStackParam("StartTime")
    private Integer startTimeParam;

    /** DRS是否暂停，为true时仅保留配置不再触发巡检 */
    
    @UCloudStackParam("Suspend")
    private Boolean suspendParam;

    /** 虚拟机迁出排序策略，按资源占用排序迁移，支持FromLarge（大优先）、FromMedium（中位数优先）、FromSmall（小优先），空值默认为FromMedium */
    
    @UCloudStackParam("VMMigrationPolicy")
    private String vMMigrationPolicyParam;


    public Boolean getAutoMigrate() {
        return autoMigrateParam;
    }

    public void setAutoMigrate(Boolean autoMigrateParam) {
        this.autoMigrateParam = autoMigrateParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getCron() {
        return cronParam;
    }

    public void setCron(String cronParam) {
        this.cronParam = cronParam;
    }

    public Integer getFinishTime() {
        return finishTimeParam;
    }

    public void setFinishTime(Integer finishTimeParam) {
        this.finishTimeParam = finishTimeParam;
    }

    public Integer getMaxJobKeep() {
        return maxJobKeepParam;
    }

    public void setMaxJobKeep(Integer maxJobKeepParam) {
        this.maxJobKeepParam = maxJobKeepParam;
    }

    public Integer getMaxMigratableVMCPU() {
        return maxMigratableVMCPUParam;
    }

    public void setMaxMigratableVMCPU(Integer maxMigratableVMCPUParam) {
        this.maxMigratableVMCPUParam = maxMigratableVMCPUParam;
    }

    public Integer getMaxMigratableVMMemory() {
        return maxMigratableVMMemoryParam;
    }

    public void setMaxMigratableVMMemory(Integer maxMigratableVMMemoryParam) {
        this.maxMigratableVMMemoryParam = maxMigratableVMMemoryParam;
    }

    public Integer getNodeHealthScore() {
        return nodeHealthScoreParam;
    }

    public void setNodeHealthScore(Integer nodeHealthScoreParam) {
        this.nodeHealthScoreParam = nodeHealthScoreParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public Integer getStartTime() {
        return startTimeParam;
    }

    public void setStartTime(Integer startTimeParam) {
        this.startTimeParam = startTimeParam;
    }

    public Boolean getSuspend() {
        return suspendParam;
    }

    public void setSuspend(Boolean suspendParam) {
        this.suspendParam = suspendParam;
    }

    public String getVMMigrationPolicy() {
        return vMMigrationPolicyParam;
    }

    public void setVMMigrationPolicy(String vMMigrationPolicyParam) {
        this.vMMigrationPolicyParam = vMMigrationPolicyParam;
    }

}
