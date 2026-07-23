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

public class DRS {

    /** 是否自动迁移 */
    @SerializedName("AutoMigrate")
    private Boolean autoMigrateParam;

    /** 黑名单列表 */
    @SerializedName("BlackListVMs")
    private List<BlackListVM> blackListVMsParam;

    /** DRS执行Cron表达式 */
    @SerializedName("Cron")
    private String cronParam;

    /** DRS周期结束时间 */
    @SerializedName("FinishTime")
    private Integer finishTimeParam;

    /** 历史保留批次 */
    @SerializedName("MaxJobKeep")
    private Integer maxJobKeepParam;

    /** 最大可迁出虚拟机CPU */
    @SerializedName("MaxMigratableVMCPU")
    private Integer maxMigratableVMCPUParam;

    /** 最大可迁出虚拟机内存(GiB) */
    @SerializedName("MaxMigratableVMMemory")
    private Integer maxMigratableVMMemoryParam;

    /** 节点健康阈值 */
    @SerializedName("NodeHealthScore")
    private Integer nodeHealthScoreParam;

    /** 计算集群ID */
    @SerializedName("SetID")
    private String setIDParam;

    /** 计算集群类型 */
    @SerializedName("SetType")
    private String setTypeParam;

    /** DRS周期开启时间 */
    @SerializedName("StartTime")
    private Integer startTimeParam;

    /** DRS是否暂停 */
    @SerializedName("Suspend")
    private Boolean suspendParam;

    /** 虚拟机迁出排序策略 */
    @SerializedName("VMMigrationPolicy")
    private String vMMigrationPolicyParam;


    public Boolean getAutoMigrate() {
        return autoMigrateParam;
    }

    public void setAutoMigrate(Boolean autoMigrateParam) {
        this.autoMigrateParam = autoMigrateParam;
    }

    public List<BlackListVM> getBlackListVMs() {
        return blackListVMsParam;
    }

    public void setBlackListVMs(List<BlackListVM> blackListVMsParam) {
        this.blackListVMsParam = blackListVMsParam;
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

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
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
