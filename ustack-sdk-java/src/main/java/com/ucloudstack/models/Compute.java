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

public class Compute {

    /** CPU可分配，剩余可分配CPU核心数 */
    @SerializedName("CPUAllocable")
    private Integer cPUAllocableParam;

    /** CPU数量，CPU核心总数 */
    @SerializedName("CPUCount")
    private Integer cPUCountParam;

    /** CPU锁定量，已锁定CPU数量 */
    @SerializedName("CPULocked")
    private Integer cPULockedParam;

    /** CPU类型，用于标识类型 */
    @SerializedName("CPUType")
    private String cPUTypeParam;

    /** CPU已用，已分配CPU核心数 */
    @SerializedName("CPUUsed")
    private Integer cPUUsedParam;

    /** GPU可分配，剩余可分配GPU数量 */
    @SerializedName("GPUAllocable")
    private Integer gPUAllocableParam;

    /** GPU数量，GPU总数 */
    @SerializedName("GPUCount")
    private Integer gPUCountParam;

    /** GPU详情，物理GPU使用详情 */
    @SerializedName("GPUInfos")
    private List<HostGPUUsedInfo> gPUInfosParam;

    /** GPU锁定量，已锁定GPU数量 */
    @SerializedName("GPULocked")
    private Integer gPULockedParam;

    /** GPU类型，用于标识类型 */
    @SerializedName("GPUType")
    private String gPUTypeParam;

    /** GPU已用，已分配GPU数量 */
    @SerializedName("GPUUsed")
    private Integer gPUUsedParam;

    /** 内存可分配，剩余可分配内存容量 */
    @SerializedName("MemoryAllocable")
    private Double memoryAllocableParam;

    /** 内存总量，内存总容量 */
    @SerializedName("MemoryCap")
    private Double memoryCapParam;

    /** 内存锁定量，已锁定内存容量 */
    @SerializedName("MemoryLocked")
    private Double memoryLockedParam;

    /** 物理内存已用，系统占用内存容量 */
    @SerializedName("MemoryPhysicUsed")
    private Double memoryPhysicUsedParam;

    /** 内存预留量，系统预留内存容量 */
    @SerializedName("MemoryReserved")
    private Double memoryReservedParam;

    /** 内存已用，已分配内存容量 */
    @SerializedName("MemoryUsed")
    private Double memoryUsedParam;

    /** 资源总数，节点资源总数 */
    @SerializedName("ResourceCount")
    private Integer resourceCountParam;

    /** 集群ID，用于标识集群 */
    @SerializedName("SetID")
    private String setIDParam;

    /** 集群类型，用于标识类型 */
    @SerializedName("SetType")
    private String setTypeParam;

    /** vGPU驱动是否就绪，标识vGPU驱动是否就绪 */
    @SerializedName("VGPUDriverNotReady")
    private Boolean vGPUDriverNotReadyParam;

    /** vGPU详情，虚拟GPU使用详情 */
    @SerializedName("VGPUInfos")
    private List<HostVGPUUsedInfo> vGPUInfosParam;

    /** 权重，调度权重值 */
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

    public Integer getCPULocked() {
        return cPULockedParam;
    }

    public void setCPULocked(Integer cPULockedParam) {
        this.cPULockedParam = cPULockedParam;
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

    public Integer getGPULocked() {
        return gPULockedParam;
    }

    public void setGPULocked(Integer gPULockedParam) {
        this.gPULockedParam = gPULockedParam;
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
