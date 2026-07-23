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

public class ChartItem {

    /** 显示值，数据项经过单位换算后的显示数值 */
    @SerializedName("DisplayValue")
    private Double displayValueParam;

    /** 项目ID，数据项的唯一标识 */
    @SerializedName("ItemID")
    private String itemIDParam;

    /** 图表项名称，数据项的显示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 子图表元素列表，包含该数据项的细分数据 */
    @SerializedName("SubItems")
    private List<ChartSubItem> subItemsParam;

    /** 单位，数据项的计量单位 */
    @SerializedName("Unit")
    private String unitParam;

    /** 图表值，数据项的原始数值 */
    @SerializedName("Value")
    private Double valueParam;


    public Double getDisplayValue() {
        return displayValueParam;
    }

    public void setDisplayValue(Double displayValueParam) {
        this.displayValueParam = displayValueParam;
    }

    public String getItemID() {
        return itemIDParam;
    }

    public void setItemID(String itemIDParam) {
        this.itemIDParam = itemIDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public List<ChartSubItem> getSubItems() {
        return subItemsParam;
    }

    public void setSubItems(List<ChartSubItem> subItemsParam) {
        this.subItemsParam = subItemsParam;
    }

    public String getUnit() {
        return unitParam;
    }

    public void setUnit(String unitParam) {
        this.unitParam = unitParam;
    }

    public Double getValue() {
        return valueParam;
    }

    public void setValue(Double valueParam) {
        this.valueParam = valueParam;
    }

}
