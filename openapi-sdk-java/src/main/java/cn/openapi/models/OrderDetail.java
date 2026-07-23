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

public class OrderDetail {

    /** 计费因子，计费规则的因子值，用于价格计算，与产品计费方式相关 */
    @SerializedName("Factor")
    private Integer factorParam;

    /** 产品名称，订单关联的产品显示名称，例如磁盘、云主机等 */
    @SerializedName("ProductName")
    private String productNameParam;

    /** 集群类型，资源所属的集群类型标识，用于区分不同的存储或计算集群 */
    @SerializedName("Property")
    private String propertyParam;

    /** 资源数量，本次操作涉及的资源数量，例如创建磁盘的数量或购买的容量大小，单位与产品类型相关 */
    @SerializedName("Quantity")
    private Integer quantityParam;

    /** 资源ID，订单关联的资源唯一标识，例如磁盘订单对应磁盘ID */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 计量单位，资源的计量单位，例如GB、个、核等 */
    @SerializedName("Unit")
    private String unitParam;


    public Integer getFactor() {
        return factorParam;
    }

    public void setFactor(Integer factorParam) {
        this.factorParam = factorParam;
    }

    public String getProductName() {
        return productNameParam;
    }

    public void setProductName(String productNameParam) {
        this.productNameParam = productNameParam;
    }

    public String getProperty() {
        return propertyParam;
    }

    public void setProperty(String propertyParam) {
        this.propertyParam = propertyParam;
    }

    public Integer getQuantity() {
        return quantityParam;
    }

    public void setQuantity(Integer quantityParam) {
        this.quantityParam = quantityParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public String getUnit() {
        return unitParam;
    }

    public void setUnit(String unitParam) {
        this.unitParam = unitParam;
    }

}
