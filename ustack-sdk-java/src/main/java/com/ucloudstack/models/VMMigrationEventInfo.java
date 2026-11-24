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

public class VMMigrationEventInfo {

    /** 租户邮箱，租户的邮箱地址，从DescribeUser接口返回 */
    @SerializedName("CompanyEmail")
    private String companyEmailParam;

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 目标主机IP，迁移完成后补齐，可能暂为空 */
    @SerializedName("DstHostIP")
    private String dstHostIPParam;

    /** 目标主机集合ID */
    @SerializedName("DstSetID")
    private String dstSetIDParam;

    /** 迁移完成时间，Unix时间戳(秒)，0表示尚未观察到迁移完成 */
    @SerializedName("FinishTime")
    private Integer finishTimeParam;

    /** 备注信息 */
    @SerializedName("Message")
    private String messageParam;

    /** 迁移开始时间，Unix时间戳(秒)，即触发迁移的时间 */
    @SerializedName("MigrateTime")
    private Integer migrateTimeParam;

    /** 迁移类型：NodeDown(宕机迁移)、DRS(自动迁移)、Manual(手动迁移) */
    @SerializedName("MigrationType")
    private String migrationTypeParam;

    /** 地域ID */
    @SerializedName("Region")
    private String regionParam;

    /** 源主机IP */
    @SerializedName("SrcHostIP")
    private String srcHostIPParam;

    /** 源主机集合ID */
    @SerializedName("SrcSetID")
    private String srcSetIDParam;

    /** 虚拟机ID */
    @SerializedName("VMID")
    private String vMIDParam;

    /** 虚拟机名称 */
    @SerializedName("VMName")
    private String vMNameParam;


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

    public String getDstHostIP() {
        return dstHostIPParam;
    }

    public void setDstHostIP(String dstHostIPParam) {
        this.dstHostIPParam = dstHostIPParam;
    }

    public String getDstSetID() {
        return dstSetIDParam;
    }

    public void setDstSetID(String dstSetIDParam) {
        this.dstSetIDParam = dstSetIDParam;
    }

    public Integer getFinishTime() {
        return finishTimeParam;
    }

    public void setFinishTime(Integer finishTimeParam) {
        this.finishTimeParam = finishTimeParam;
    }

    public String getMessage() {
        return messageParam;
    }

    public void setMessage(String messageParam) {
        this.messageParam = messageParam;
    }

    public Integer getMigrateTime() {
        return migrateTimeParam;
    }

    public void setMigrateTime(Integer migrateTimeParam) {
        this.migrateTimeParam = migrateTimeParam;
    }

    public String getMigrationType() {
        return migrationTypeParam;
    }

    public void setMigrationType(String migrationTypeParam) {
        this.migrationTypeParam = migrationTypeParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSrcHostIP() {
        return srcHostIPParam;
    }

    public void setSrcHostIP(String srcHostIPParam) {
        this.srcHostIPParam = srcHostIPParam;
    }

    public String getSrcSetID() {
        return srcSetIDParam;
    }

    public void setSrcSetID(String srcSetIDParam) {
        this.srcSetIDParam = srcSetIDParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

    public String getVMName() {
        return vMNameParam;
    }

    public void setVMName(String vMNameParam) {
        this.vMNameParam = vMNameParam;
    }

}
