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

public class VMNumaInfo {

    /** GPU列表，绑定到该NUMA节点的GPU设备 */
    @SerializedName("GPUInfos")
    private List<NumaGPUInfo> gPUInfosParam;

    /** 物理NUMAID，宿主机的NUMA节点索引 */
    @SerializedName("HostNumaID")
    private Integer hostNumaIDParam;

    /** 内存容量，分配给该NUMA节点的内存大小，单位：MiB */
    @SerializedName("Memory")
    private Integer memoryParam;

    /** 虚拟NUMAID，虚拟机内部的NUMA节点索引 */
    @SerializedName("NumaID")
    private Integer numaIDParam;

    /** vCPU集合，绑定到该NUMA节点的vCPU列表 */
    @SerializedName("VCPUSet")
    private String vCPUSetParam;


    public List<NumaGPUInfo> getGPUInfos() {
        return gPUInfosParam;
    }

    public void setGPUInfos(List<NumaGPUInfo> gPUInfosParam) {
        this.gPUInfosParam = gPUInfosParam;
    }

    public Integer getHostNumaID() {
        return hostNumaIDParam;
    }

    public void setHostNumaID(Integer hostNumaIDParam) {
        this.hostNumaIDParam = hostNumaIDParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public Integer getNumaID() {
        return numaIDParam;
    }

    public void setNumaID(Integer numaIDParam) {
        this.numaIDParam = numaIDParam;
    }

    public String getVCPUSet() {
        return vCPUSetParam;
    }

    public void setVCPUSet(String vCPUSetParam) {
        this.vCPUSetParam = vCPUSetParam;
    }

}
