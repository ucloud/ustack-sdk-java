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

public class DiskPriceInfo {

    /** 计费类型，计费模式，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费）；兼容历史值：hour、month、year，别名映射：Dynamic→HOUR、Month→MONTH、Year→YEAR */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 价格，磁盘的计费价格，单位随计费类型变化 */
    @SerializedName("Price")
    private Double priceParam;

    /** 购买价值，计费侧返回的购买价值信息 */
    @SerializedName("PurchaseValue")
    private String purchaseValueParam;


    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public Double getPrice() {
        return priceParam;
    }

    public void setPrice(Double priceParam) {
        this.priceParam = priceParam;
    }

    public String getPurchaseValue() {
        return purchaseValueParam;
    }

    public void setPurchaseValue(String purchaseValueParam) {
        this.purchaseValueParam = purchaseValueParam;
    }

}
