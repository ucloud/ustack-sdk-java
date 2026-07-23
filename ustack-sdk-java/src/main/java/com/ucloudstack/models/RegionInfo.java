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

public class RegionInfo {

    /** 物理地址，地域数据中心的详细地址 */
    @SerializedName("Address")
    private String addressParam;

    /** 处理器可分配核心数，表示当前可用于新建虚拟机的处理器核心数量，计算方式为总数减去已用数量和锁定数量 */
    @SerializedName("CPUAllocable")
    private Integer cPUAllocableParam;

    /** 处理器总核心数，表示该地域所有物理服务器的处理器核心总数，用于资源容量规划和监控 */
    @SerializedName("CPUCount")
    private Integer cPUCountParam;

    /** 处理器锁定核心数，表示被预留或锁定不可分配的处理器核心数量，用于资源保护和调度优化 */
    @SerializedName("CPULocked")
    private Integer cPULockedParam;

    /** 处理器已使用核心数，表示当前已分配给虚拟机和容器的处理器核心数量，用于资源使用率监控 */
    @SerializedName("CPUUsed")
    private Integer cPUUsedParam;

    /** 城市名称，地域所属的行政城市 */
    @SerializedName("City")
    private String cityParam;

    /** 创建时间，Unix时间戳格式，表示该地域首次纳管到系统中的时间，用于审计和统计 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 服务端点地址，地域服务对外访问的入口地址 */
    @SerializedName("EndPoints")
    private String endPointsParam;

    /** 过期时间，Unix时间戳格式，表示该地域授权的有效期结束时间，超过该时间后将无法使用该地域资源 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 图形处理器可分配数量，表示当前可用于虚拟化或直通分配的图形处理器数量，用于资源调度 */
    @SerializedName("GPUAllocable")
    private Integer gPUAllocableParam;

    /** 物理图形处理器总数量，表示该地域所有物理服务器上安装的图形处理器总数，包含各种型号 */
    @SerializedName("GPUCount")
    private Integer gPUCountParam;

    /** 图形处理器锁定数量，表示被预留或锁定不可分配的图形处理器数量，用于资源保护和维护 */
    @SerializedName("GPULocked")
    private Integer gPULockedParam;

    /** 图形处理器已使用数量，表示当前已分配给虚拟机或容器的图形处理器数量，包含直通和虚拟化方式 */
    @SerializedName("GPUUsed")
    private Integer gPUUsedParam;

    /** 健康状态，取值范围：OK（正常）、Failed（故障） */
    @SerializedName("HealthState")
    private String healthStateParam;

    /** 内存可分配量，单位兆字节，表示当前可用于创建新虚拟机的内存容量，已扣除已用、锁定和保留量 */
    @SerializedName("MemoryAllocable")
    private Double memoryAllocableParam;

    /** 内存总容量，单位兆字节，表示该地域所有物理服务器的内存总容量，用于内存资源规划 */
    @SerializedName("MemoryCap")
    private Double memoryCapParam;

    /** 内存锁定量，单位兆字节，表示被预留或锁定不可分配的内存容量，用于系统保护和突发需求 */
    @SerializedName("MemoryLocked")
    private Double memoryLockedParam;

    /** 物理内存已使用量，单位兆字节，表示物理服务器实际使用的内存量，不包含虚拟化预分配 */
    @SerializedName("MemoryPhysicUsed")
    private Double memoryPhysicUsedParam;

    /** 内存保留量，单位兆字节，表示为系统稳定性和突发需求预留的内存容量，不可分配给用户 */
    @SerializedName("MemoryReserved")
    private Double memoryReservedParam;

    /** 内存已使用量，单位兆字节，表示当前已分配给虚拟机和系统的内存总量，包含虚拟化开销 */
    @SerializedName("MemoryUsed")
    private Double memoryUsedParam;

    /** 网络延迟信息列表，包含该地域到各目标的网络延迟检测结果，用于网络质量监控 */
    @SerializedName("NetworkLatency")
    private List<RegionNetworkLatency> networkLatencyParam;

    /** 地域ID，标识一批物理资源共享的地理行政区域标识码，用于地域划分与资源归属 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域名称，用于展示和检索地域信息 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，用于说明该地域的用途或状态 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 授权状态，取值范围：state_none（未设置）、authorized（已授权）、unauthorized（未授权）、expired（已过期） */
    @SerializedName("State")
    private String stateParam;

    /** 存储总容量，单位吉字节，表示该地域所有存储设备的总容量，包含固态和机械等各类存储 */
    @SerializedName("StorageCount")
    private Integer storageCountParam;

    /** 物理存储已使用量，单位吉字节，表示存储设备实际占用的物理空间，不包含预分配空间 */
    @SerializedName("StoragePhysicUsed")
    private Integer storagePhysicUsedParam;

    /** 存储已使用量，单位吉字节，表示当前已分配给虚拟机和系统的存储空间总量 */
    @SerializedName("StorageUsed")
    private Integer storageUsedParam;

    /** 更新时间，Unix时间戳格式，表示该地域信息最后一次更新的时间，用于数据同步和缓存 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 虚拟图形处理器总数量，表示通过图形处理器虚拟化创建的虚拟图形处理器实例总数，用于资源的细粒度分配 */
    @SerializedName("VGPUCount")
    private Integer vGPUCountParam;

    /** 虚拟图形处理器锁定数量，表示被预留或锁定不可分配的虚拟图形处理器数量，用于资源保护 */
    @SerializedName("VGPULocked")
    private Integer vGPULockedParam;

    /** 虚拟图形处理器已使用数量，表示当前已分配给虚拟机的虚拟图形处理器实例数量，用于资源使用率监控 */
    @SerializedName("VGPUUsed")
    private Integer vGPUUsedParam;


    public String getAddress() {
        return addressParam;
    }

    public void setAddress(String addressParam) {
        this.addressParam = addressParam;
    }

    public Integer getCPUAllocable() {
        return cPUAllocableParam;
    }

    public void setCPUAllocable(Integer cPUAllocableParam) {
        this.cPUAllocableParam = cPUAllocableParam;
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

    public Integer getCPUUsed() {
        return cPUUsedParam;
    }

    public void setCPUUsed(Integer cPUUsedParam) {
        this.cPUUsedParam = cPUUsedParam;
    }

    public String getCity() {
        return cityParam;
    }

    public void setCity(String cityParam) {
        this.cityParam = cityParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getEndPoints() {
        return endPointsParam;
    }

    public void setEndPoints(String endPointsParam) {
        this.endPointsParam = endPointsParam;
    }

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
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

    public String getHealthState() {
        return healthStateParam;
    }

    public void setHealthState(String healthStateParam) {
        this.healthStateParam = healthStateParam;
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

    public List<RegionNetworkLatency> getNetworkLatency() {
        return networkLatencyParam;
    }

    public void setNetworkLatency(List<RegionNetworkLatency> networkLatencyParam) {
        this.networkLatencyParam = networkLatencyParam;
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

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public Integer getStorageCount() {
        return storageCountParam;
    }

    public void setStorageCount(Integer storageCountParam) {
        this.storageCountParam = storageCountParam;
    }

    public Integer getStoragePhysicUsed() {
        return storagePhysicUsedParam;
    }

    public void setStoragePhysicUsed(Integer storagePhysicUsedParam) {
        this.storagePhysicUsedParam = storagePhysicUsedParam;
    }

    public Integer getStorageUsed() {
        return storageUsedParam;
    }

    public void setStorageUsed(Integer storageUsedParam) {
        this.storageUsedParam = storageUsedParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public Integer getVGPUCount() {
        return vGPUCountParam;
    }

    public void setVGPUCount(Integer vGPUCountParam) {
        this.vGPUCountParam = vGPUCountParam;
    }

    public Integer getVGPULocked() {
        return vGPULockedParam;
    }

    public void setVGPULocked(Integer vGPULockedParam) {
        this.vGPULockedParam = vGPULockedParam;
    }

    public Integer getVGPUUsed() {
        return vGPUUsedParam;
    }

    public void setVGPUUsed(Integer vGPUUsedParam) {
        this.vGPUUsedParam = vGPUUsedParam;
    }

}
