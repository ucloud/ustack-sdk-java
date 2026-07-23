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

public class VCPUUsageInfo {

    /** CPU可分配，集群中剩余可分配的CPU核数 */
    @SerializedName("CPUAllocable")
    private Integer cPUAllocableParam;

    /** CPU总量，集群中所有宿主机的逻辑CPU核数总和 */
    @SerializedName("CPUCount")
    private Integer cPUCountParam;

    /** 物理CPU总量，集群中所有宿主机的物理CPU核数总和 */
    @SerializedName("CPUPhysicCount")
    private Integer cPUPhysicCountParam;

    /** CPU使用率，已使用CPU占总量的百分比 */
    @SerializedName("CPUUsageRate")
    private Double cPUUsageRateParam;

    /** CPU已使用，集群中已分配给虚拟机的CPU核数 */
    @SerializedName("CPUUsed")
    private Integer cPUUsedParam;

    /** 地域ID */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 集群ID，计算集群的唯一标识符 */
    @SerializedName("SetID")
    private String setIDParam;


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

    public Integer getCPUPhysicCount() {
        return cPUPhysicCountParam;
    }

    public void setCPUPhysicCount(Integer cPUPhysicCountParam) {
        this.cPUPhysicCountParam = cPUPhysicCountParam;
    }

    public Double getCPUUsageRate() {
        return cPUUsageRateParam;
    }

    public void setCPUUsageRate(Double cPUUsageRateParam) {
        this.cPUUsageRateParam = cPUUsageRateParam;
    }

    public Integer getCPUUsed() {
        return cPUUsedParam;
    }

    public void setCPUUsed(Integer cPUUsedParam) {
        this.cPUUsedParam = cPUUsedParam;
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
