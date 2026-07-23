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

public class QuotaInfo {

    /** 配额因子列表，配额管理中可用的计量维度 */
    @SerializedName("FactorTypes")
    private List<String> factorTypesParam;

    /** 产品类型列表，配额管理中可用的产品类型 */
    @SerializedName("ProductTypes")
    private List<String> productTypesParam;


    public List<String> getFactorTypes() {
        return factorTypesParam;
    }

    public void setFactorTypes(List<String> factorTypesParam) {
        this.factorTypesParam = factorTypesParam;
    }

    public List<String> getProductTypes() {
        return productTypesParam;
    }

    public void setProductTypes(List<String> productTypesParam) {
        this.productTypesParam = productTypesParam;
    }

}
