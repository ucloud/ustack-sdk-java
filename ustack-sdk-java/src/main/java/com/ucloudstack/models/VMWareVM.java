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

public class VMWareVM {

    /** 核心数，虚拟机的vCPU核心数量 */
    @SerializedName("CPU")
    private Integer cPUParam;

    /** 存储库路径，VMware虚拟机在存储库中的路径 */
    @SerializedName("InventoryPath")
    private String inventoryPathParam;

    /** 内存容量，虚拟机的内存大小，单位：MiB */
    @SerializedName("Memory")
    private Integer memoryParam;

    /** 虚拟机名称，VMware虚拟机显示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 电源状态，VMware虚拟机的运行状态 */
    @SerializedName("PowerState")
    private String powerStateParam;

    /** 虚拟机ID，VMware虚拟机标识 */
    @SerializedName("VMID")
    private String vMIDParam;


    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
    }

    public String getInventoryPath() {
        return inventoryPathParam;
    }

    public void setInventoryPath(String inventoryPathParam) {
        this.inventoryPathParam = inventoryPathParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPowerState() {
        return powerStateParam;
    }

    public void setPowerState(String powerStateParam) {
        this.powerStateParam = powerStateParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
