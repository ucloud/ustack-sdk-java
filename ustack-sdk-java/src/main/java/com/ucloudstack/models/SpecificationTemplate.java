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

public class SpecificationTemplate {

    /** 规格允许值，定义规格的可选值范围 */
    @SerializedName("AllowedValues")
    private String allowedValuesParam;

    /** 规格描述，说明规格的用途和含义 */
    @SerializedName("Description")
    private String descriptionParam;

    /** 产品类型 */
    @SerializedName("ProductType")
    private String productTypeParam;

    /** 资源类型 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 集群分类，标识规格所属的集群分类 */
    @SerializedName("SetClassification")
    private String setClassificationParam;

    /** 规格名称 */
    @SerializedName("SpecificationName")
    private String specificationNameParam;

    /** 模板ID，规格模板的唯一标识符 */
    @SerializedName("TemplateID")
    private String templateIDParam;

    /** 单位，规格值的计量单位 */
    @SerializedName("Unit")
    private String unitParam;

    /** 规格值格式，定义规格值的格式要求 */
    @SerializedName("ValueFormat")
    private String valueFormatParam;

    /** 规格值类型，如string、int等 */
    @SerializedName("ValueType")
    private String valueTypeParam;


    public String getAllowedValues() {
        return allowedValuesParam;
    }

    public void setAllowedValues(String allowedValuesParam) {
        this.allowedValuesParam = allowedValuesParam;
    }

    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
    }

    public String getProductType() {
        return productTypeParam;
    }

    public void setProductType(String productTypeParam) {
        this.productTypeParam = productTypeParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public String getSetClassification() {
        return setClassificationParam;
    }

    public void setSetClassification(String setClassificationParam) {
        this.setClassificationParam = setClassificationParam;
    }

    public String getSpecificationName() {
        return specificationNameParam;
    }

    public void setSpecificationName(String specificationNameParam) {
        this.specificationNameParam = specificationNameParam;
    }

    public String getTemplateID() {
        return templateIDParam;
    }

    public void setTemplateID(String templateIDParam) {
        this.templateIDParam = templateIDParam;
    }

    public String getUnit() {
        return unitParam;
    }

    public void setUnit(String unitParam) {
        this.unitParam = unitParam;
    }

    public String getValueFormat() {
        return valueFormatParam;
    }

    public void setValueFormat(String valueFormatParam) {
        this.valueFormatParam = valueFormatParam;
    }

    public String getValueType() {
        return valueTypeParam;
    }

    public void setValueType(String valueTypeParam) {
        this.valueTypeParam = valueTypeParam;
    }

}
