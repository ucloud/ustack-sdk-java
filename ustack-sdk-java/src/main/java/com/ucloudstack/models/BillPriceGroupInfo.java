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

public class BillPriceGroupInfo {

    /** 产品ID列表，价格管理中可用的产品ID */
    @SerializedName("ProductIDs")
    private List<String> productIDsParam;

    /** 集群类型列表，价格管理中可用的集群类型 */
    @SerializedName("SetTypes")
    private List<String> setTypesParam;


    public List<String> getProductIDs() {
        return productIDsParam;
    }

    public void setProductIDs(List<String> productIDsParam) {
        this.productIDsParam = productIDsParam;
    }

    public List<String> getSetTypes() {
        return setTypesParam;
    }

    public void setSetTypes(List<String> setTypesParam) {
        this.setTypesParam = setTypesParam;
    }

}
