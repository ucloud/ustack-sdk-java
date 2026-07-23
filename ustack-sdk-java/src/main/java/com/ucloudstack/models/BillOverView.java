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

public class BillOverView {

    /** 统计周期金额，该周期内的总金额，单位为元 */
    @SerializedName("CycleAmount")
    private Double cycleAmountParam;

    /** 统计周期内部账号金额，该周期内的内部账号金额，单位为元 */
    @SerializedName("CycleAmountFree")
    private Double cycleAmountFreeParam;

    /** 统计周期外部账号金额，该周期内的外部账号金额，单位为元 */
    @SerializedName("CycleAmountReal")
    private Double cycleAmountRealParam;

    /** 统计周期数量，该周期内的记录数量 */
    @SerializedName("CycleCount")
    private Integer cycleCountParam;

    /** 详情，该周期内各维度的详细统计信息 */
    @SerializedName("CycleDetails")
    private List<BillOverViewDetail> cycleDetailsParam;

    /** 统计周期单位，时间周期的单位，如hour、day、month等 */
    @SerializedName("CycleUnit")
    private String cycleUnitParam;

    /** 时间，统计周期的时间戳 */
    @SerializedName("Time")
    private Integer timeParam;


    public Double getCycleAmount() {
        return cycleAmountParam;
    }

    public void setCycleAmount(Double cycleAmountParam) {
        this.cycleAmountParam = cycleAmountParam;
    }

    public Double getCycleAmountFree() {
        return cycleAmountFreeParam;
    }

    public void setCycleAmountFree(Double cycleAmountFreeParam) {
        this.cycleAmountFreeParam = cycleAmountFreeParam;
    }

    public Double getCycleAmountReal() {
        return cycleAmountRealParam;
    }

    public void setCycleAmountReal(Double cycleAmountRealParam) {
        this.cycleAmountRealParam = cycleAmountRealParam;
    }

    public Integer getCycleCount() {
        return cycleCountParam;
    }

    public void setCycleCount(Integer cycleCountParam) {
        this.cycleCountParam = cycleCountParam;
    }

    public List<BillOverViewDetail> getCycleDetails() {
        return cycleDetailsParam;
    }

    public void setCycleDetails(List<BillOverViewDetail> cycleDetailsParam) {
        this.cycleDetailsParam = cycleDetailsParam;
    }

    public String getCycleUnit() {
        return cycleUnitParam;
    }

    public void setCycleUnit(String cycleUnitParam) {
        this.cycleUnitParam = cycleUnitParam;
    }

    public Integer getTime() {
        return timeParam;
    }

    public void setTime(Integer timeParam) {
        this.timeParam = timeParam;
    }

}
