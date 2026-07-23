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

public class Dimension {

    /** 维度名称，对应集群类型的名称 */
    @SerializedName("DimensionName")
    private String dimensionNameParam;

    /** 维度值，对应集群类型的值 */
    @SerializedName("DimensionValue")
    private String dimensionValueParam;


    public String getDimensionName() {
        return dimensionNameParam;
    }

    public void setDimensionName(String dimensionNameParam) {
        this.dimensionNameParam = dimensionNameParam;
    }

    public String getDimensionValue() {
        return dimensionValueParam;
    }

    public void setDimensionValue(String dimensionValueParam) {
        this.dimensionValueParam = dimensionValueParam;
    }

}
