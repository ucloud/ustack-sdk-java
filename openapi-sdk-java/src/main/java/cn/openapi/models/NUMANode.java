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

public class NUMANode {

    /** NUMA节点CPU列表，该NUMA节点包含的CPU核心详情 */
    @SerializedName("CPUs")
    private List<NUMANodeCPU> cPUsParam;

    /** NUMA节点ID，物理NUMA拓扑节点标识 */
    @SerializedName("NUMAID")
    private Integer nUMAIDParam;

    /** 物理NUMA内存 */
    @SerializedName("TotalMemory")
    private Integer totalMemoryParam;

    /** 物理NUMA已被虚拟机使用的内存 */
    @SerializedName("UsedMemory")
    private Integer usedMemoryParam;


    public List<NUMANodeCPU> getCPUs() {
        return cPUsParam;
    }

    public void setCPUs(List<NUMANodeCPU> cPUsParam) {
        this.cPUsParam = cPUsParam;
    }

    public Integer getNUMAID() {
        return nUMAIDParam;
    }

    public void setNUMAID(Integer nUMAIDParam) {
        this.nUMAIDParam = nUMAIDParam;
    }

    public Integer getTotalMemory() {
        return totalMemoryParam;
    }

    public void setTotalMemory(Integer totalMemoryParam) {
        this.totalMemoryParam = totalMemoryParam;
    }

    public Integer getUsedMemory() {
        return usedMemoryParam;
    }

    public void setUsedMemory(Integer usedMemoryParam) {
        this.usedMemoryParam = usedMemoryParam;
    }

}
