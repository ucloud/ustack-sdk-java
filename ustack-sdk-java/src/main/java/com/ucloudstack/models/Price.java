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

public class Price {

    /** 计费规则，详细的计费规则说明，GRADIENT表示阶梯定价，FIXED表示固定价格 */
    @SerializedName("ChargeRule")
    private String chargeRuleParam;

    /** 计费类型，资源的计费方式，Hour表示按小时计费、Month表示按月计费、Year表示按年计费 */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 创建时间，价格信息的创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 折扣，折扣比例，100表示无折扣，50表示五折，仅当CompanyID指定时有效 */
    @SerializedName("Discount")
    private Double discountParam;

    /** 折扣信息，包含不同数量阶梯的折扣价格信息，仅当CompanyID指定时返回租户专属折扣 */
    @SerializedName("DiscountInfos")
    private List<BillPriceInfo> discountInfosParam;

    /** 账单价格信息，包含不同数量阶梯的价格信息，根据ChargeRule返回阶梯价格或固定价格 */
    @SerializedName("Infos")
    private List<BillPriceInfo> infosParam;

    /** 产品名称，产品的显示名称，根据locale返回对应语言 */
    @SerializedName("Product")
    private String productParam;

    /** 产品ID，产品的唯一标识，从ListProductResources获取 */
    @SerializedName("ProductID")
    private String productIDParam;

    /** 地域，价格所属的地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的显示名称，从DescribeRegion接口获取 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 集群类型，资源所属的集群类型，从DescribeSet接口获取 */
    @SerializedName("SetType")
    private String setTypeParam;

    /** 集群别名，集群类型的显示名称，从DescribeSet接口返回 */
    @SerializedName("SetTypeAlias")
    private String setTypeAliasParam;

    /** 单位，价格的计量单位 */
    @SerializedName("Unit")
    private String unitParam;

    /** 更新时间，价格信息的最后更新时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public String getChargeRule() {
        return chargeRuleParam;
    }

    public void setChargeRule(String chargeRuleParam) {
        this.chargeRuleParam = chargeRuleParam;
    }

    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public Double getDiscount() {
        return discountParam;
    }

    public void setDiscount(Double discountParam) {
        this.discountParam = discountParam;
    }

    public List<BillPriceInfo> getDiscountInfos() {
        return discountInfosParam;
    }

    public void setDiscountInfos(List<BillPriceInfo> discountInfosParam) {
        this.discountInfosParam = discountInfosParam;
    }

    public List<BillPriceInfo> getInfos() {
        return infosParam;
    }

    public void setInfos(List<BillPriceInfo> infosParam) {
        this.infosParam = infosParam;
    }

    public String getProduct() {
        return productParam;
    }

    public void setProduct(String productParam) {
        this.productParam = productParam;
    }

    public String getProductID() {
        return productIDParam;
    }

    public void setProductID(String productIDParam) {
        this.productIDParam = productIDParam;
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

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

    public String getSetTypeAlias() {
        return setTypeAliasParam;
    }

    public void setSetTypeAlias(String setTypeAliasParam) {
        this.setTypeAliasParam = setTypeAliasParam;
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
