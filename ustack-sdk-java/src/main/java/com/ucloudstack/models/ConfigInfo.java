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

public class ConfigInfo {

    /** 所属类别标识 */
    @SerializedName("Category")
    private String categoryParam;

    /** 所属类别名称，支持国际化 */
    @SerializedName("CategoryName")
    private String categoryNameParam;

    /** 配置键，配置项的唯一标识符 */
    @SerializedName("ConfigKey")
    private String configKeyParam;

    /** 配置排序位置，用于前端展示排序 */
    @SerializedName("ConfigPosition")
    private Integer configPositionParam;

    /** 配置类型，用于分类过滤 */
    @SerializedName("ConfigType")
    private String configTypeParam;

    /** 配置值，当前配置项的取值 */
    @SerializedName("ConfigValue")
    private String configValueParam;

    /** 配置描述，说明配置项的用途和含义，支持国际化 */
    @SerializedName("Description")
    private String descriptionParam;

    /** 是否可编辑，true表示可编辑，false表示只读 */
    @SerializedName("Editable")
    private String editableParam;

    /** 配置提示信息，帮助用户理解如何使用该配置，支持国际化 */
    @SerializedName("Hint")
    private String hintParam;

    /** 配置值单位，如秒、MB等，支持国际化 */
    @SerializedName("Unit")
    private String unitParam;

    /** 配置值范围，可选值或取值范围说明，支持国际化 */
    @SerializedName("ValueRange")
    private String valueRangeParam;

    /** 配置值类型，如string、int、bool等 */
    @SerializedName("ValueType")
    private String valueTypeParam;


    public String getCategory() {
        return categoryParam;
    }

    public void setCategory(String categoryParam) {
        this.categoryParam = categoryParam;
    }

    public String getCategoryName() {
        return categoryNameParam;
    }

    public void setCategoryName(String categoryNameParam) {
        this.categoryNameParam = categoryNameParam;
    }

    public String getConfigKey() {
        return configKeyParam;
    }

    public void setConfigKey(String configKeyParam) {
        this.configKeyParam = configKeyParam;
    }

    public Integer getConfigPosition() {
        return configPositionParam;
    }

    public void setConfigPosition(Integer configPositionParam) {
        this.configPositionParam = configPositionParam;
    }

    public String getConfigType() {
        return configTypeParam;
    }

    public void setConfigType(String configTypeParam) {
        this.configTypeParam = configTypeParam;
    }

    public String getConfigValue() {
        return configValueParam;
    }

    public void setConfigValue(String configValueParam) {
        this.configValueParam = configValueParam;
    }

    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
    }

    public String getEditable() {
        return editableParam;
    }

    public void setEditable(String editableParam) {
        this.editableParam = editableParam;
    }

    public String getHint() {
        return hintParam;
    }

    public void setHint(String hintParam) {
        this.hintParam = hintParam;
    }

    public String getUnit() {
        return unitParam;
    }

    public void setUnit(String unitParam) {
        this.unitParam = unitParam;
    }

    public String getValueRange() {
        return valueRangeParam;
    }

    public void setValueRange(String valueRangeParam) {
        this.valueRangeParam = valueRangeParam;
    }

    public String getValueType() {
        return valueTypeParam;
    }

    public void setValueType(String valueTypeParam) {
        this.valueTypeParam = valueTypeParam;
    }

}
