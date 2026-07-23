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

public class VMMigrationReport {

    /** CPU利用率，来源于资源标签CPUUtilization */
    @SerializedName("CPUUtilization")
    private Double cPUUtilizationParam;

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 任务完成时间，秒级Unix时间戳 */
    @SerializedName("CompletionTime")
    private Integer completionTimeParam;

    /** 任务创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** DRS任务ID */
    @SerializedName("JobID")
    private String jobIDParam;

    /** 内存使用率，来源于资源标签MemUsage */
    @SerializedName("MemUsage")
    private Double memUsageParam;

    /** 迁移详情 */
    @SerializedName("MigrationInfo")
    private VMMigrationInfo migrationInfoParam;

    /** 虚拟机名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 虚拟机备注 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 虚拟机用途 */
    @SerializedName("Usage")
    private String usageParam;

    /** 虚拟机ID */
    @SerializedName("VMID")
    private String vMIDParam;


    public Double getCPUUtilization() {
        return cPUUtilizationParam;
    }

    public void setCPUUtilization(Double cPUUtilizationParam) {
        this.cPUUtilizationParam = cPUUtilizationParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCompletionTime() {
        return completionTimeParam;
    }

    public void setCompletionTime(Integer completionTimeParam) {
        this.completionTimeParam = completionTimeParam;
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

    public String getJobID() {
        return jobIDParam;
    }

    public void setJobID(String jobIDParam) {
        this.jobIDParam = jobIDParam;
    }

    public Double getMemUsage() {
        return memUsageParam;
    }

    public void setMemUsage(Double memUsageParam) {
        this.memUsageParam = memUsageParam;
    }

    public VMMigrationInfo getMigrationInfo() {
        return migrationInfoParam;
    }

    public void setMigrationInfo(VMMigrationInfo migrationInfoParam) {
        this.migrationInfoParam = migrationInfoParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getUsage() {
        return usageParam;
    }

    public void setUsage(String usageParam) {
        this.usageParam = usageParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
