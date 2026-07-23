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
package com.ucloudstack.apis;

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class GetMigratePaaSStoragePriceResponse extends Response {

    /** 订单类型，表示差价的订单类型，如upgrade（升级）、downgrade（降级） */
    @SerializedName("OrderType")
    private String orderTypeParam;

    /** 价格，存储迁移的差价金额（单位：元），正数表示需补差价，负数表示退款 */
    @SerializedName("Price")
    private Double priceParam;


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
