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

public class QuotaUsage {

    /** 配额因子，计量维度 */
    @SerializedName("FactorType")
    private String factorTypeParam;

    /** 产品类型 */
    @SerializedName("ProductType")
    private String productTypeParam;

    /** 配额总量 */
    @SerializedName("Quota")
    private Integer quotaParam;

    /** 地域ID */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 资源类型 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 配额单位 */
    @SerializedName("Unit")
    private String unitParam;

    /** 已使用配额量 */
    @SerializedName("Usage")
    private Integer usageParam;


    public String getFactorType() {
        return factorTypeParam;
    }

    public void setFactorType(String factorTypeParam) {
        this.factorTypeParam = factorTypeParam;
    }

    public String getProductType() {
        return productTypeParam;
    }

    public void setProductType(String productTypeParam) {
        this.productTypeParam = productTypeParam;
    }

    public Integer getQuota() {
        return quotaParam;
    }

    public void setQuota(Integer quotaParam) {
        this.quotaParam = quotaParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRegionAlias() {
        return regionAliasParam;
    }

    public void setRegionAlias(String regionAliasParam) {
        this.regionAliasParam = regionAliasParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public String getUnit() {
        return unitParam;
    }

    public void setUnit(String unitParam) {
        this.unitParam = unitParam;
    }

    public Integer getUsage() {
        return usageParam;
    }

    public void setUsage(Integer usageParam) {
        this.usageParam = usageParam;
    }

}
