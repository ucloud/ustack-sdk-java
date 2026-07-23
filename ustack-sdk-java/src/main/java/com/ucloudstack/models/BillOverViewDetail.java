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

public class BillOverViewDetail {

    /** 金额，该维度的总金额，单位为元 */
    @SerializedName("Amount")
    private Double amountParam;

    /** 内部账号金额，该维度的内部账号金额，单位为元 */
    @SerializedName("AmountFree")
    private Double amountFreeParam;

    /** 外部账号金额，该维度的外部账号金额，单位为元 */
    @SerializedName("AmountReal")
    private Double amountRealParam;

    /** 维度，统计的维度类型，如product、region等 */
    @SerializedName("Dimension")
    private String dimensionParam;

    /** 名称，维度对应的名称 */
    @SerializedName("Name")
    private String nameParam;


    public Double getAmount() {
        return amountParam;
    }

    public void setAmount(Double amountParam) {
        this.amountParam = amountParam;
    }

    public Double getAmountFree() {
        return amountFreeParam;
    }

    public void setAmountFree(Double amountFreeParam) {
        this.amountFreeParam = amountFreeParam;
    }

    public Double getAmountReal() {
        return amountRealParam;
    }

    public void setAmountReal(Double amountRealParam) {
        this.amountRealParam = amountRealParam;
    }

    public String getDimension() {
        return dimensionParam;
    }

    public void setDimension(String dimensionParam) {
        this.dimensionParam = dimensionParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

}
