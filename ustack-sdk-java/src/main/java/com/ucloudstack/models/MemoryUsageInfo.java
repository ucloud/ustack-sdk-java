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

public class MemoryUsageInfo {

    /** 内存可分配，集群中剩余可分配的内存容量，单位MB */
    @SerializedName("MemoryAllocable")
    private Integer memoryAllocableParam;

    /** 内存总量，集群中所有宿主机的内存容量总和，单位MB */
    @SerializedName("MemoryCap")
    private Integer memoryCapParam;

    /** 物理内存已使用，集群中实际消耗的物理内存容量，单位MB */
    @SerializedName("MemoryPhysicUsed")
    private Integer memoryPhysicUsedParam;

    /** 内存预留量，系统预留的内存容量，单位MB */
    @SerializedName("MemoryReserved")
    private Integer memoryReservedParam;

    /** 内存使用率，已使用内存占总量的百分比 */
    @SerializedName("MemoryUsageRate")
    private Double memoryUsageRateParam;

    /** 内存已使用，集群中已分配给虚拟机的内存容量，单位MB */
    @SerializedName("MemoryUsed")
    private Integer memoryUsedParam;

    /** 地域ID */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 集群ID，计算集群的唯一标识符 */
    @SerializedName("SetID")
    private String setIDParam;


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

    public Double getMemoryUsageRate() {
        return memoryUsageRateParam;
    }

    public void setMemoryUsageRate(Double memoryUsageRateParam) {
        this.memoryUsageRateParam = memoryUsageRateParam;
    }

    public Integer getMemoryUsed() {
        return memoryUsedParam;
    }

    public void setMemoryUsed(Integer memoryUsedParam) {
        this.memoryUsedParam = memoryUsedParam;
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

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

}
