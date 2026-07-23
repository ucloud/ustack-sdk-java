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

public class Specification {

    /** 创建时间，Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 是否为默认规格，Yes表示默认，No表示非默认 */
    @SerializedName("Default")
    private String defaultParam;

    /** 规格维度信息 */
    @SerializedName("Dimension")
    private Dimension dimensionParam;

    /** 产品类型 */
    @SerializedName("ProductType")
    private String productTypeParam;

    /** 地域ID */
    @SerializedName("Region")
    private String regionParam;

    /** 资源类型 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 集群类型，标识规格所属的集群类型 */
    @SerializedName("SetType")
    private String setTypeParam;

    /** 规格ID，规格的唯一标识符 */
    @SerializedName("SpecificationID")
    private String specificationIDParam;

    /** 规格名称 */
    @SerializedName("SpecificationName")
    private String specificationNameParam;

    /** 更新时间，Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 规格值，规格的具体配置值 */
    @SerializedName("Value")
    private String valueParam;


    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getDefault() {
        return defaultParam;
    }

    public void setDefault(String defaultParam) {
        this.defaultParam = defaultParam;
    }

    public Dimension getDimension() {
        return dimensionParam;
    }

    public void setDimension(Dimension dimensionParam) {
        this.dimensionParam = dimensionParam;
    }

    public String getProductType() {
        return productTypeParam;
    }

    public void setProductType(String productTypeParam) {
        this.productTypeParam = productTypeParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

    public String getSpecificationID() {
        return specificationIDParam;
    }

    public void setSpecificationID(String specificationIDParam) {
        this.specificationIDParam = specificationIDParam;
    }

    public String getSpecificationName() {
        return specificationNameParam;
    }

    public void setSpecificationName(String specificationNameParam) {
        this.specificationNameParam = specificationNameParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getValue() {
        return valueParam;
    }

    public void setValue(String valueParam) {
        this.valueParam = valueParam;
    }

}
