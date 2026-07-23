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

public class NUMANodeCPU {

    /** CPU核心ID，物理CPU核心唯一标识 */
    @SerializedName("CPUID")
    private Integer cPUIDParam;

    /** 未运行虚拟机列表，绑定到该CPU核心但当前未运行的虚拟机 */
    @SerializedName("NotRunningVMs")
    private List<NUMANodeVMInfo> notRunningVMsParam;

    /** 预留标识，标识该CPU核心是否被系统预留 */
    @SerializedName("Reserved")
    private Boolean reservedParam;

    /** 运行中虚拟机列表，绑定到该CPU核心且正在运行的虚拟机 */
    @SerializedName("RunningVMs")
    private List<NUMANodeVMInfo> runningVMsParam;


    public Integer getCPUID() {
        return cPUIDParam;
    }

    public void setCPUID(Integer cPUIDParam) {
        this.cPUIDParam = cPUIDParam;
    }

    public List<NUMANodeVMInfo> getNotRunningVMs() {
        return notRunningVMsParam;
    }

    public void setNotRunningVMs(List<NUMANodeVMInfo> notRunningVMsParam) {
        this.notRunningVMsParam = notRunningVMsParam;
    }

    public Boolean getReserved() {
        return reservedParam;
    }

    public void setReserved(Boolean reservedParam) {
        this.reservedParam = reservedParam;
    }

    public List<NUMANodeVMInfo> getRunningVMs() {
        return runningVMsParam;
    }

    public void setRunningVMs(List<NUMANodeVMInfo> runningVMsParam) {
        this.runningVMsParam = runningVMsParam;
    }

}
