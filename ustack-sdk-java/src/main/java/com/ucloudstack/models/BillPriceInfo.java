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

public class BillPriceInfo {

    /** 最小范围，价格阶梯的最小数量 */
    @SerializedName("LowerMultiple")
    private Integer lowerMultipleParam;

    /** 价格，该阶梯范围内的单价，单位为元 */
    @SerializedName("Price")
    private Double priceParam;

    /** 最大范围，价格阶梯的最大数量 */
    @SerializedName("UpperMultiple")
    private Integer upperMultipleParam;


    public Integer getLowerMultiple() {
        return lowerMultipleParam;
    }

    public void setLowerMultiple(Integer lowerMultipleParam) {
        this.lowerMultipleParam = lowerMultipleParam;
    }

    public Double getPrice() {
        return priceParam;
    }

    public void setPrice(Double priceParam) {
        this.priceParam = priceParam;
    }

    public Integer getUpperMultiple() {
        return upperMultipleParam;
    }

    public void setUpperMultiple(Integer upperMultipleParam) {
        this.upperMultipleParam = upperMultipleParam;
    }

}
