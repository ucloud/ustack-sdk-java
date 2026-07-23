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

public class HostInfo {

    /** 可用CPU，剩余可分配的CPU核心数 */
    @SerializedName("CPUAllocable")
    private Integer cPUAllocableParam;

    /** CPU总数，物理CPU核心总数 */
    @SerializedName("CPUCount")
    private Integer cPUCountParam;

    /** CPU类型，处理器型号信息 */
    @SerializedName("CPUType")
    private String cPUTypeParam;

    /** 已用CPU，已分配的CPU核心数 */
    @SerializedName("CPUUsed")
    private Integer cPUUsedParam;

    /** 创建时间，资源创建的秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 可用GPU，剩余可分配的GPU数量 */
    @SerializedName("GPUAllocable")
    private Integer gPUAllocableParam;

    /** GPU总量，物理GPU设备总数 */
    @SerializedName("GPUCount")
    private Integer gPUCountParam;

    /** GPU信息，物理GPU使用详情 */
    @SerializedName("GPUInfos")
    private List<HostGPUUsedInfo> gPUInfosParam;

    /** GPU类型，GPU设备型号 */
    @SerializedName("GPUType")
    private String gPUTypeParam;

    /** 已用GPU，已分配的GPU数量 */
    @SerializedName("GPUUsed")
    private Integer gPUUsedParam;

    /** 物理机ID，物理机唯一标识（通常为IP） */
    @SerializedName("HostID")
    private String hostIDParam;

    /** 物理机IP，物理机管理IP地址 */
    @SerializedName("HostIP")
    private String hostIPParam;

    /** 物理机IPv6，物理机管理IPv6地址 */
    @SerializedName("HostIPv6")
    private String hostIPv6Param;

    /** 物理机状态，当前运行状态 */
    @SerializedName("HostStatus")
    private String hostStatusParam;

    /** 可用内存，剩余可分配的内存容量，单位GiB */
    @SerializedName("MemoryAllocable")
    private Integer memoryAllocableParam;

    /** 总内存，内存总容量，单位GiB */
    @SerializedName("MemoryCap")
    private Integer memoryCapParam;

    /** 系统内存，物理机自身使用的内存，单位GiB */
    @SerializedName("MemoryPhysicUsed")
    private Integer memoryPhysicUsedParam;

    /** 预留内存，系统预留的内存，单位GiB */
    @SerializedName("MemoryReserved")
    private Integer memoryReservedParam;

    /** 已用内存，已分配的内存容量，单位GiB */
    @SerializedName("MemoryUsed")
    private Integer memoryUsedParam;

    /** NUMA节点数，物理机的NUMA节点数量 */
    @SerializedName("NumaNodes")
    private Integer numaNodesParam;

    /** 地域ID，资源所属的地理标识 */
    @SerializedName("Region")
    private String regionParam;

    /** 资源数量，运行的实例（如VM）数量 */
    @SerializedName("ResourceCount")
    private Integer resourceCountParam;

    /** 计算集群ID，所属计算集群标识 */
    @SerializedName("SetID")
    private String setIDParam;

    /** 集群类型，所属计算集群类型 */
    @SerializedName("SetType")
    private String setTypeParam;

    /** 更新时间，资源更新的秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 绑定启用，标识是否启用vCPU绑定 */
    @SerializedName("VCPUBindingEnabled")
    private Boolean vCPUBindingEnabledParam;

    /** 驱动未就绪，标识vGPU驱动是否异常 */
    @SerializedName("VGPUDriverNotReady")
    private Boolean vGPUDriverNotReadyParam;

    /** vGPU信息，虚拟GPU使用详情 */
    @SerializedName("VGPUInfos")
    private List<HostVGPUUsedInfo> vGPUInfosParam;

    /** 调度权重，负载均衡调度权重值 */
    @SerializedName("Weight")
    private Integer weightParam;


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

    public String getCPUType() {
        return cPUTypeParam;
    }

    public void setCPUType(String cPUTypeParam) {
        this.cPUTypeParam = cPUTypeParam;
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

    public List<HostGPUUsedInfo> getGPUInfos() {
        return gPUInfosParam;
    }

    public void setGPUInfos(List<HostGPUUsedInfo> gPUInfosParam) {
        this.gPUInfosParam = gPUInfosParam;
    }

    public String getGPUType() {
        return gPUTypeParam;
    }

    public void setGPUType(String gPUTypeParam) {
        this.gPUTypeParam = gPUTypeParam;
    }

    public Integer getGPUUsed() {
        return gPUUsedParam;
    }

    public void setGPUUsed(Integer gPUUsedParam) {
        this.gPUUsedParam = gPUUsedParam;
    }

    public String getHostID() {
        return hostIDParam;
    }

    public void setHostID(String hostIDParam) {
        this.hostIDParam = hostIDParam;
    }

    public String getHostIP() {
        return hostIPParam;
    }

    public void setHostIP(String hostIPParam) {
        this.hostIPParam = hostIPParam;
    }

    public String getHostIPv6() {
        return hostIPv6Param;
    }

    public void setHostIPv6(String hostIPv6Param) {
        this.hostIPv6Param = hostIPv6Param;
    }

    public String getHostStatus() {
        return hostStatusParam;
    }

    public void setHostStatus(String hostStatusParam) {
        this.hostStatusParam = hostStatusParam;
    }

    public Integer getMemoryAllocable() {
        return memoryAllocableParam;
    }

    public void setMemoryAllocable(Integer memoryAllocableParam) {
        this.memoryAllocableParam = memoryAllocableParam;
    }

    public Integer getMemoryCap() {
        return memoryCapParam;
    }

    public void setMemoryCap(Integer memoryCapParam) {
        this.memoryCapParam = memoryCapParam;
    }

    public Integer getMemoryPhysicUsed() {
        return memoryPhysicUsedParam;
    }

    public void setMemoryPhysicUsed(Integer memoryPhysicUsedParam) {
        this.memoryPhysicUsedParam = memoryPhysicUsedParam;
    }

    public Integer getMemoryReserved() {
        return memoryReservedParam;
    }

    public void setMemoryReserved(Integer memoryReservedParam) {
        this.memoryReservedParam = memoryReservedParam;
    }

    public Integer getMemoryUsed() {
        return memoryUsedParam;
    }

    public void setMemoryUsed(Integer memoryUsedParam) {
        this.memoryUsedParam = memoryUsedParam;
    }

    public Integer getNumaNodes() {
        return numaNodesParam;
    }

    public void setNumaNodes(Integer numaNodesParam) {
        this.numaNodesParam = numaNodesParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public Integer getResourceCount() {
        return resourceCountParam;
    }

    public void setResourceCount(Integer resourceCountParam) {
        this.resourceCountParam = resourceCountParam;
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

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public Boolean getVCPUBindingEnabled() {
        return vCPUBindingEnabledParam;
    }

    public void setVCPUBindingEnabled(Boolean vCPUBindingEnabledParam) {
        this.vCPUBindingEnabledParam = vCPUBindingEnabledParam;
    }

    public Boolean getVGPUDriverNotReady() {
        return vGPUDriverNotReadyParam;
    }

    public void setVGPUDriverNotReady(Boolean vGPUDriverNotReadyParam) {
        this.vGPUDriverNotReadyParam = vGPUDriverNotReadyParam;
    }

    public List<HostVGPUUsedInfo> getVGPUInfos() {
        return vGPUInfosParam;
    }

    public void setVGPUInfos(List<HostVGPUUsedInfo> vGPUInfosParam) {
        this.vGPUInfosParam = vGPUInfosParam;
    }

    public Integer getWeight() {
        return weightParam;
    }

    public void setWeight(Integer weightParam) {
        this.weightParam = weightParam;
    }

}
