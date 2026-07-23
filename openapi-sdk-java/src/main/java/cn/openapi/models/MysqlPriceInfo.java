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

public class MysqlPriceInfo {

    /** 计费类型，用于指定计费模式，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费） */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 订单类型，0表示无变更，3表示升级，7表示降级 */
    @SerializedName("OrderType")
    private String orderTypeParam;

    /** 价格，订单价格 */
    @SerializedName("Price")
    private Double priceParam;


    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public String getOrderType() {
        return orderTypeParam;
    }

    public void setOrderType(String orderTypeParam) {
        this.orderTypeParam = orderTypeParam;
    }

    public Double getPrice() {
        return priceParam;
    }

    public void setPrice(Double priceParam) {
        this.priceParam = priceParam;
    }

}
