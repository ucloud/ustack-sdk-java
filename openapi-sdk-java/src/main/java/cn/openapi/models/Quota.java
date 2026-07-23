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

public class Quota {

    /** 集群配额分配JSON字符串，记录计算或存储集群的配额分配 */
    @SerializedName("Allocation")
    private String allocationParam;

    /** 租户ID，标识配额所属的租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

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

    /** 配额状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 配额单位 */
    @SerializedName("Unit")
    private String unitParam;

    /** 更新时间，Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public String getAllocation() {
        return allocationParam;
    }

    public void setAllocation(String allocationParam) {
        this.allocationParam = allocationParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

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

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getUnit() {
        return unitParam;
    }

    public void setUnit(String unitParam) {
        this.unitParam = unitParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
