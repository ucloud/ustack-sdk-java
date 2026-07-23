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

public class SetInfo {

    /** 绑定镜像ID列表，当前计算集群绑定的镜像ID，以逗号分隔，值为all表示绑定所有镜像，可通过UpdateVMSetBoundImage修改 */
    @SerializedName("BoundImageIDs")
    private String boundImageIDsParam;

    /** 逻辑绑定存储集群列表，当前计算集群绑定的存储集群列表，逻辑绑定，软限制，可通过UpdateVMSetBoundStorageSet修改，从物理绑定列表中筛选 */
    @SerializedName("BoundStorageClassList")
    private List<StorageClassItem> boundStorageClassListParam;

    /** CPU可分配量，当前可用于分配的CPU核心数，计算方式为CPUCount-CPUUsed-CPULocked */
    @SerializedName("CPUAllocable")
    private Integer cPUAllocableParam;

    /** CPU分配比例，CPU超分比例，表示物理CPU可以虚拟化出多少倍的逻辑CPU */
    @SerializedName("CPUAllocationRatio")
    private Double cPUAllocationRatioParam;

    /** CPU数量，集群中可分配的总CPU核心数，考虑超分比例后的逻辑数量 */
    @SerializedName("CPUCount")
    private Integer cPUCountParam;

    /** CPU已锁定量，已锁定但尚未分配的CPU核心数，如虚拟机创建中 */
    @SerializedName("CPULocked")
    private Integer cPULockedParam;

    /** CPU型号列表，集群中包含的CPU制造商和型号信息 */
    @SerializedName("CPUManufacturer")
    private List<String> cPUManufacturerParam;

    /** CPU模型差集，集群内部分主机支持但非全部主机支持的CPU模型列表 */
    @SerializedName("CPUModelDiffsection")
    private List<CPUModelInfo> cPUModelDiffsectionParam;

    /** CPU模型交集，集群内所有主机都支持的CPU模型列表，用于确保虚拟机在集群内任意主机间迁移时的兼容性 */
    @SerializedName("CPUModelIntersection")
    private List<CPUModelInfo> cPUModelIntersectionParam;

    /** 物理CPU数量，集群中实际物理CPU核心总数 */
    @SerializedName("CPUPhysicCount")
    private Integer cPUPhysicCountParam;

    /** CPU使用量，已分配给虚拟机的CPU核心数 */
    @SerializedName("CPUUsed")
    private Integer cPUUsedParam;

    /** 创建时间，Unix时间戳，单位为秒 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** GPU可分配量，当前可用于分配的GPU卡数，计算方式为GPUCount-GPUUsed-GPULocked */
    @SerializedName("GPUAllocable")
    private Integer gPUAllocableParam;

    /** GPU数量，集群中可分配的总GPU卡数 */
    @SerializedName("GPUCount")
    private Integer gPUCountParam;

    /** 物理GPU使用信息列表，包含各种物理GPU型号的数量、使用量、可分配量等统计信息 */
    @SerializedName("GPUInfos")
    private List<SetGPUUsedInfo> gPUInfosParam;

    /** GPU已锁定量，已锁定但尚未分配的GPU卡数，如虚拟机创建中 */
    @SerializedName("GPULocked")
    private Integer gPULockedParam;

    /** GPU使用量，已分配给虚拟机的GPU卡数 */
    @SerializedName("GPUUsed")
    private Integer gPUUsedParam;

    /** 内存可分配量，当前可用于分配的内存容量，计算方式为MemoryCap-MemoryUsed-MemoryReserved-MemoryLocked，单位为GB */
    @SerializedName("MemoryAllocable")
    private Double memoryAllocableParam;

    /** 内存容量，集群中可分配的总内存容量，单位为GB */
    @SerializedName("MemoryCap")
    private Double memoryCapParam;

    /** 内存已锁定量，已锁定但尚未分配的内存容量，单位为GB，如虚拟机创建中 */
    @SerializedName("MemoryLocked")
    private Double memoryLockedParam;

    /** 内存物理使用量，虚拟机实际使用的物理内存总量，单位为GB */
    @SerializedName("MemoryPhysicUsed")
    private Double memoryPhysicUsedParam;

    /** 内存预留量，系统预留的内存容量，不可分配给虚拟机，单位为GB */
    @SerializedName("MemoryReserved")
    private Double memoryReservedParam;

    /** 内存使用量，已分配给虚拟机的内存总量，单位为GB */
    @SerializedName("MemoryUsed")
    private Double memoryUsedParam;

    /** 物理网卡信息列表，集群中各节点的物理网卡（PF）信息，包含VF资源使用情况，用于SR-IOV网卡直通 */
    @SerializedName("PFNodeInfos")
    private List<PFNodeInfo> pFNodeInfosParam;

    /** 地域ID，计算集群所属的物理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 集群别名，计算集群的自定义名称 */
    @SerializedName("SetAlias")
    private String setAliasParam;

    /** 集群架构，计算集群的硬件架构类型 */
    @SerializedName("SetArch")
    private String setArchParam;

    /** 集群ID，计算集群的唯一标识，由底层Huanghe系统生成和管理 */
    @SerializedName("SetID")
    private String setIDParam;

    /** 集群类型，计算集群的类型标识 */
    @SerializedName("SetType")
    private String setTypeParam;

    /** 物理绑定存储集群列表，当前计算集群可用的存储集群列表，物理绑定，硬限制，由底层物理网络拓扑决定 */
    @SerializedName("StorageClassList")
    private List<StorageClassItem> storageClassListParam;

    /** DRS是否暂停 */
    @SerializedName("Suspend")
    private Boolean suspendParam;

    /** 更新时间，Unix时间戳，单位为秒 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 虚拟GPU使用信息列表，包含各种vGPU型号的数量、使用量、可分配量等统计信息 */
    @SerializedName("VGPUInfos")
    private List<SetVGPUUsedInfo> vGPUInfosParam;


    public String getBoundImageIDs() {
        return boundImageIDsParam;
    }

    public void setBoundImageIDs(String boundImageIDsParam) {
        this.boundImageIDsParam = boundImageIDsParam;
    }

    public List<StorageClassItem> getBoundStorageClassList() {
        return boundStorageClassListParam;
    }

    public void setBoundStorageClassList(List<StorageClassItem> boundStorageClassListParam) {
        this.boundStorageClassListParam = boundStorageClassListParam;
    }

    public Integer getCPUAllocable() {
        return cPUAllocableParam;
    }

    public void setCPUAllocable(Integer cPUAllocableParam) {
        this.cPUAllocableParam = cPUAllocableParam;
    }

    public Double getCPUAllocationRatio() {
        return cPUAllocationRatioParam;
    }

    public void setCPUAllocationRatio(Double cPUAllocationRatioParam) {
        this.cPUAllocationRatioParam = cPUAllocationRatioParam;
    }

    public Integer getCPUCount() {
        return cPUCountParam;
    }

    public void setCPUCount(Integer cPUCountParam) {
        this.cPUCountParam = cPUCountParam;
    }

    public Integer getCPULocked() {
        return cPULockedParam;
    }

    public void setCPULocked(Integer cPULockedParam) {
        this.cPULockedParam = cPULockedParam;
    }

    public List<String> getCPUManufacturer() {
        return cPUManufacturerParam;
    }

    public void setCPUManufacturer(List<String> cPUManufacturerParam) {
        this.cPUManufacturerParam = cPUManufacturerParam;
    }

    public List<CPUModelInfo> getCPUModelDiffsection() {
        return cPUModelDiffsectionParam;
    }

    public void setCPUModelDiffsection(List<CPUModelInfo> cPUModelDiffsectionParam) {
        this.cPUModelDiffsectionParam = cPUModelDiffsectionParam;
    }

    public List<CPUModelInfo> getCPUModelIntersection() {
        return cPUModelIntersectionParam;
    }

    public void setCPUModelIntersection(List<CPUModelInfo> cPUModelIntersectionParam) {
        this.cPUModelIntersectionParam = cPUModelIntersectionParam;
    }

    public Integer getCPUPhysicCount() {
        return cPUPhysicCountParam;
    }

    public void setCPUPhysicCount(Integer cPUPhysicCountParam) {
        this.cPUPhysicCountParam = cPUPhysicCountParam;
    }

    public Integer getCPUUsed() {
        return cPUUsedParam;
    }

    public void setCPUUsed(Integer cPUUsedParam) {
        this.cPUUsedParam = cPUUsedParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public Integer getGPUAllocable() {
        return gPUAllocableParam;
    }

    public void setGPUAllocable(Integer gPUAllocableParam) {
        this.gPUAllocableParam = gPUAllocableParam;
    }

    public Integer getGPUCount() {
        return gPUCountParam;
    }

    public void setGPUCount(Integer gPUCountParam) {
        this.gPUCountParam = gPUCountParam;
    }

    public List<SetGPUUsedInfo> getGPUInfos() {
        return gPUInfosParam;
    }

    public void setGPUInfos(List<SetGPUUsedInfo> gPUInfosParam) {
        this.gPUInfosParam = gPUInfosParam;
    }

    public Integer getGPULocked() {
        return gPULockedParam;
    }

    public void setGPULocked(Integer gPULockedParam) {
        this.gPULockedParam = gPULockedParam;
    }

    public Integer getGPUUsed() {
        return gPUUsedParam;
    }

    public void setGPUUsed(Integer gPUUsedParam) {
        this.gPUUsedParam = gPUUsedParam;
    }

    public Double getMemoryAllocable() {
        return memoryAllocableParam;
    }

    public void setMemoryAllocable(Double memoryAllocableParam) {
        this.memoryAllocableParam = memoryAllocableParam;
    }

    public Double getMemoryCap() {
        return memoryCapParam;
    }

    public void setMemoryCap(Double memoryCapParam) {
        this.memoryCapParam = memoryCapParam;
    }

    public Double getMemoryLocked() {
        return memoryLockedParam;
    }

    public void setMemoryLocked(Double memoryLockedParam) {
        this.memoryLockedParam = memoryLockedParam;
    }

    public Double getMemoryPhysicUsed() {
        return memoryPhysicUsedParam;
    }

    public void setMemoryPhysicUsed(Double memoryPhysicUsedParam) {
        this.memoryPhysicUsedParam = memoryPhysicUsedParam;
    }

    public Double getMemoryReserved() {
        return memoryReservedParam;
    }

    public void setMemoryReserved(Double memoryReservedParam) {
        this.memoryReservedParam = memoryReservedParam;
    }

    public Double getMemoryUsed() {
        return memoryUsedParam;
    }

    public void setMemoryUsed(Double memoryUsedParam) {
        this.memoryUsedParam = memoryUsedParam;
    }

    public List<PFNodeInfo> getPFNodeInfos() {
        return pFNodeInfosParam;
    }

    public void setPFNodeInfos(List<PFNodeInfo> pFNodeInfosParam) {
        this.pFNodeInfosParam = pFNodeInfosParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
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

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

    public List<StorageClassItem> getStorageClassList() {
        return storageClassListParam;
    }

    public void setStorageClassList(List<StorageClassItem> storageClassListParam) {
        this.storageClassListParam = storageClassListParam;
    }

    public Boolean getSuspend() {
        return suspendParam;
    }

    public void setSuspend(Boolean suspendParam) {
        this.suspendParam = suspendParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public List<SetVGPUUsedInfo> getVGPUInfos() {
        return vGPUInfosParam;
    }

    public void setVGPUInfos(List<SetVGPUUsedInfo> vGPUInfosParam) {
        this.vGPUInfosParam = vGPUInfosParam;
    }

}
