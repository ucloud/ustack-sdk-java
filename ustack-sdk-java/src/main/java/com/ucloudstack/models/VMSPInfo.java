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

public class VMSPInfo {

    /** 核心数，快照时的vCPU核心数量 */
    @SerializedName("CPU")
    private Integer cPUParam;

    /** 集群类型，快照所属的计算集群类型 */
    @SerializedName("ComputeSetType")
    private String computeSetTypeParam;

    /** 创建时间，快照创建的秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 当前快照，标识是否为当前活动快照 */
    @SerializedName("IsCurrent")
    private Boolean isCurrentParam;

    /** 内存容量，快照时的内存大小，单位：MiB */
    @SerializedName("Memory")
    private Integer memoryParam;

    /** 备注信息，对快照的补充说明 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 快照ID，快照的唯一标识 */
    @SerializedName("SPID")
    private String sPIDParam;

    /** 快照名称，快照的显示名称 */
    @SerializedName("SPName")
    private String sPNameParam;

    /** 快照大小，快照占用的存储空间，单位：GiB */
    @SerializedName("SPSize")
    private Integer sPSizeParam;

    /** 快照状态，快照当前的生命周期状态 */
    @SerializedName("SPStatus")
    private String sPStatusParam;

    /** 包含磁盘，标识快照是否包含磁盘数据 */
    @SerializedName("WithDisk")
    private Boolean withDiskParam;

    /** 包含内存，标识快照是否包含内存数据 */
    @SerializedName("WithMemory")
    private Boolean withMemoryParam;


    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
    }

    public String getComputeSetType() {
        return computeSetTypeParam;
    }

    public void setComputeSetType(String computeSetTypeParam) {
        this.computeSetTypeParam = computeSetTypeParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public Boolean getIsCurrent() {
        return isCurrentParam;
    }

    public void setIsCurrent(Boolean isCurrentParam) {
        this.isCurrentParam = isCurrentParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getSPID() {
        return sPIDParam;
    }

    public void setSPID(String sPIDParam) {
        this.sPIDParam = sPIDParam;
    }

    public String getSPName() {
        return sPNameParam;
    }

    public void setSPName(String sPNameParam) {
        this.sPNameParam = sPNameParam;
    }

    public Integer getSPSize() {
        return sPSizeParam;
    }

    public void setSPSize(Integer sPSizeParam) {
        this.sPSizeParam = sPSizeParam;
    }

    public String getSPStatus() {
        return sPStatusParam;
    }

    public void setSPStatus(String sPStatusParam) {
        this.sPStatusParam = sPStatusParam;
    }

    public Boolean getWithDisk() {
        return withDiskParam;
    }

    public void setWithDisk(Boolean withDiskParam) {
        this.withDiskParam = withDiskParam;
    }

    public Boolean getWithMemory() {
        return withMemoryParam;
    }

    public void setWithMemory(Boolean withMemoryParam) {
        this.withMemoryParam = withMemoryParam;
    }

}
