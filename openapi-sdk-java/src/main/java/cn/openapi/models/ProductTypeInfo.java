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

public class ProductTypeInfo {

    /** 是否授权，标识产品是否对租户开放 */
    @SerializedName("Authorized")
    private String authorizedParam;

    /** 产品分类，标识产品所属分类 */
    @SerializedName("Category")
    private String categoryParam;

    /** 产品分类名称，分类的显示名称 */
    @SerializedName("CategoryName")
    private String categoryNameParam;

    /** 租户总数，地域内租户数量 */
    @SerializedName("CompanyCount")
    private Integer companyCountParam;

    /** 是否启用，标识产品在地域内是否启用 */
    @SerializedName("Enable")
    private String enableParam;

    /** 已启用租户数量，启用该产品的租户数量 */
    @SerializedName("EnableCompanyCount")
    private Integer enableCompanyCountParam;

    /** 是否不可见，标识产品是否对用户隐藏 */
    @SerializedName("Invisible")
    private Boolean invisibleParam;

    /** 产品名称，产品显示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 产品ID，产品唯一标识 */
    @SerializedName("ProductKey")
    private String productKeyParam;

    /** 产品类型，产品的类型标识 */
    @SerializedName("ProductType")
    private String productTypeParam;

    /** 地域ID，产品所属地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 产品描述，产品能力说明 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 子服务列表，产品包含的子服务集合 */
    @SerializedName("Services")
    private List<Service> servicesParam;


    public String getAuthorized() {
        return authorizedParam;
    }

    public void setAuthorized(String authorizedParam) {
        this.authorizedParam = authorizedParam;
    }

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

    public Integer getCompanyCount() {
        return companyCountParam;
    }

    public void setCompanyCount(Integer companyCountParam) {
        this.companyCountParam = companyCountParam;
    }

    public String getEnable() {
        return enableParam;
    }

    public void setEnable(String enableParam) {
        this.enableParam = enableParam;
    }

    public Integer getEnableCompanyCount() {
        return enableCompanyCountParam;
    }

    public void setEnableCompanyCount(Integer enableCompanyCountParam) {
        this.enableCompanyCountParam = enableCompanyCountParam;
    }

    public Boolean getInvisible() {
        return invisibleParam;
    }

    public void setInvisible(Boolean invisibleParam) {
        this.invisibleParam = invisibleParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getProductKey() {
        return productKeyParam;
    }

    public void setProductKey(String productKeyParam) {
        this.productKeyParam = productKeyParam;
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

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public List<Service> getServices() {
        return servicesParam;
    }

    public void setServices(List<Service> servicesParam) {
        this.servicesParam = servicesParam;
    }

}
