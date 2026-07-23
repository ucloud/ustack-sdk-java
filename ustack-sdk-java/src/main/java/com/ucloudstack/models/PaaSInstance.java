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

public class PaaSInstance {

    /** CPU数量，虚拟机的CPU核心数 */
    @SerializedName("CPU")
    private Integer cPUParam;

    /** 是否允许取消迁移，true表示当前可以取消正在进行的迁移，false表示不允许取消 */
    @SerializedName("CanMigrateAbort")
    private Boolean canMigrateAbortParam;

    /** 磁盘大小，虚拟机的磁盘容量（单位：GB） */
    @SerializedName("Disk")
    private Integer diskParam;

    /** 目标计算集群或存储集群ID */
    @SerializedName("DstSetID")
    private String dstSetIDParam;

    /** 宿主机IP，虚拟机所在物理宿主机的IP地址 */
    @SerializedName("HostIP")
    private String hostIPParam;

    /** 实例ID，具体实例（虚拟机）的ID标识 */
    @SerializedName("InstanceID")
    private String instanceIDParam;

    /** 实例IP，虚拟机的内网IP地址 */
    @SerializedName("InstanceIP")
    private String instanceIPParam;

    /** 实例状态，虚拟机的运行状态，如Running、Stopped等 */
    @SerializedName("InstanceStatus")
    private String instanceStatusParam;

    /** 是否是主实例，true表示主实例，false表示从实例或备份实例 */
    @SerializedName("IsPrimary")
    private Boolean isPrimaryParam;

    /** 内存大小，虚拟机的内存容量（单位：MB） */
    @SerializedName("Memory")
    private Integer memoryParam;

    /** 存储热迁移带宽，当前存储热迁移的带宽限制（单位：MB/s） */
    @SerializedName("MigrateBandWidth")
    private Integer migrateBandWidthParam;

    /** 迁移进度，当前计算迁移或存储迁移的进度，0-100 */
    @SerializedName("Progress")
    private Integer progressParam;

    /** 异常信息，实例异常时的错误描述信息 */
    @SerializedName("Reason")
    private String reasonParam;

    /** PaaS资源ID，PaaS产品的资源标识 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** PaaS资源类型，PaaS产品的类型，如MYSQL、REDIS、LB、NATGW、VPNGW等 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 计算集群别名，计算集群的友好名称 */
    @SerializedName("SetAlias")
    private String setAliasParam;

    /** 计算集群架构，计算集群的CPU架构类型，如x86_64、arm64等 */
    @SerializedName("SetArch")
    private String setArchParam;

    /** 计算集群ID，虚拟机所在计算集群的ID */
    @SerializedName("SetID")
    private String setIDParam;

    /** 存储集群别名，存储集群的友好名称 */
    @SerializedName("StorageSetAlias")
    private String storageSetAliasParam;

    /** 存储集群架构，存储集群的CPU架构类型，如x86_64、arm64等 */
    @SerializedName("StorageSetArch")
    private String storageSetArchParam;

    /** 存储集群ID，虚拟机磁盘所在存储集群的ID */
    @SerializedName("StorageSetID")
    private String storageSetIDParam;

    /** 存储集群类型，存储集群的类型，如SSD、HDD等 */
    @SerializedName("StorageSetType")
    private String storageSetTypeParam;

    /** 计算集群类型，虚拟机所在计算集群的类型标识 */
    @SerializedName("VMType")
    private String vMTypeParam;


    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
    }

    public Boolean getCanMigrateAbort() {
        return canMigrateAbortParam;
    }

    public void setCanMigrateAbort(Boolean canMigrateAbortParam) {
        this.canMigrateAbortParam = canMigrateAbortParam;
    }

    public Integer getDisk() {
        return diskParam;
    }

    public void setDisk(Integer diskParam) {
        this.diskParam = diskParam;
    }

    public String getDstSetID() {
        return dstSetIDParam;
    }

    public void setDstSetID(String dstSetIDParam) {
        this.dstSetIDParam = dstSetIDParam;
    }

    public String getHostIP() {
        return hostIPParam;
    }

    public void setHostIP(String hostIPParam) {
        this.hostIPParam = hostIPParam;
    }

    public String getInstanceID() {
        return instanceIDParam;
    }

    public void setInstanceID(String instanceIDParam) {
        this.instanceIDParam = instanceIDParam;
    }

    public String getInstanceIP() {
        return instanceIPParam;
    }

    public void setInstanceIP(String instanceIPParam) {
        this.instanceIPParam = instanceIPParam;
    }

    public String getInstanceStatus() {
        return instanceStatusParam;
    }

    public void setInstanceStatus(String instanceStatusParam) {
        this.instanceStatusParam = instanceStatusParam;
    }

    public Boolean getIsPrimary() {
        return isPrimaryParam;
    }

    public void setIsPrimary(Boolean isPrimaryParam) {
        this.isPrimaryParam = isPrimaryParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public Integer getMigrateBandWidth() {
        return migrateBandWidthParam;
    }

    public void setMigrateBandWidth(Integer migrateBandWidthParam) {
        this.migrateBandWidthParam = migrateBandWidthParam;
    }

    public Integer getProgress() {
        return progressParam;
    }

    public void setProgress(Integer progressParam) {
        this.progressParam = progressParam;
    }

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public String getSetAlias() {
        return setAliasParam;
    }

    public void setSetAlias(String setAliasParam) {
        this.setAliasParam = setAliasParam;
    }

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public String getStorageSetAlias() {
        return storageSetAliasParam;
    }

    public void setStorageSetAlias(String storageSetAliasParam) {
        this.storageSetAliasParam = storageSetAliasParam;
    }

    public String getStorageSetArch() {
        return storageSetArchParam;
    }

    public void setStorageSetArch(String storageSetArchParam) {
        this.storageSetArchParam = storageSetArchParam;
    }

    public String getStorageSetID() {
        return storageSetIDParam;
    }

    public void setStorageSetID(String storageSetIDParam) {
        this.storageSetIDParam = storageSetIDParam;
    }

    public String getStorageSetType() {
        return storageSetTypeParam;
    }

    public void setStorageSetType(String storageSetTypeParam) {
        this.storageSetTypeParam = storageSetTypeParam;
    }

    public String getVMType() {
        return vMTypeParam;
    }

    public void setVMType(String vMTypeParam) {
        this.vMTypeParam = vMTypeParam;
    }

}
