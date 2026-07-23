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
package com.ucloudstack.apis;

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class GetPaymentOfPremiumResponse extends Response {

    /** 订单类型，标识变更的性质，取值：0（无变更）、3（升级）、7（降级） */
    @SerializedName("OrderType")
    private String orderTypeParam;

    /** 差价，变更配置所需的预估费用，单位：元 */
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
