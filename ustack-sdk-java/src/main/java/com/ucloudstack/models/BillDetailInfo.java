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

public class BillDetailInfo {

    /** 金额，账单详情的总金额，单位为元 */
    @SerializedName("Amount")
    private Double amountParam;

    /** 内部账号金额，内部账号支付的金额，单位为元 */
    @SerializedName("AmountFree")
    private Double amountFreeParam;

    /** 外部账号金额，外部账号支付的金额，单位为元 */
    @SerializedName("AmountReal")
    private Double amountRealParam;

    /** 计费类型，计费的方式 */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户邮箱，租户的邮箱地址 */
    @SerializedName("CompanyEmail")
    private String companyEmailParam;

    /** 租户ID，账单详情所属的租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，租户的显示名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，账单详情的创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 结束时间，计费的结束时间戳 */
    @SerializedName("EndTime")
    private Integer endTimeParam;

    /** 订单号，关联的订单编号 */
    @SerializedName("OrderNO")
    private String orderNOParam;

    /** 订单类型，订单的类型 */
    @SerializedName("OrderType")
    private String orderTypeParam;

    /** 产品类型，产品的类型 */
    @SerializedName("ProductType")
    private String productTypeParam;

    /** 项目组ID，账单详情所属的项目组ID */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目组名称，项目组的显示名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 地域，账单详情所属的地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 资源ID，资源的唯一标识，14位随机字符 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源名称，资源的显示名称 */
    @SerializedName("ResourceName")
    private String resourceNameParam;

    /** 开始时间，计费的开始时间戳 */
    @SerializedName("StartTime")
    private Integer startTimeParam;

    /** 交易号，关联的交易编号 */
    @SerializedName("TransactionNO")
    private String transactionNOParam;

    /** 交易类型，交易的类型 */
    @SerializedName("TransactionType")
    private String transactionTypeParam;


    public Double getAmount() {
        return amountParam;
    }

    public void setAmount(Double amountParam) {
        this.amountParam = amountParam;
    }

    public Double getAmountFree() {
        return amountFreeParam;
    }

    public void setAmountFree(Double amountFreeParam) {
        this.amountFreeParam = amountFreeParam;
    }

    public Double getAmountReal() {
        return amountRealParam;
    }

    public void setAmountReal(Double amountRealParam) {
        this.amountRealParam = amountRealParam;
    }

    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public String getCompanyEmail() {
        return companyEmailParam;
    }

    public void setCompanyEmail(String companyEmailParam) {
        this.companyEmailParam = companyEmailParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getCompanyName() {
        return companyNameParam;
    }

    public void setCompanyName(String companyNameParam) {
        this.companyNameParam = companyNameParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
    }

    public String getOrderNO() {
        return orderNOParam;
    }

    public void setOrderNO(String orderNOParam) {
        this.orderNOParam = orderNOParam;
    }

    public String getOrderType() {
        return orderTypeParam;
    }

    public void setOrderType(String orderTypeParam) {
        this.orderTypeParam = orderTypeParam;
    }

    public String getProductType() {
        return productTypeParam;
    }

    public void setProductType(String productTypeParam) {
        this.productTypeParam = productTypeParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getProjectName() {
        return projectNameParam;
    }

    public void setProjectName(String projectNameParam) {
        this.projectNameParam = projectNameParam;
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

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public String getResourceName() {
        return resourceNameParam;
    }

    public void setResourceName(String resourceNameParam) {
        this.resourceNameParam = resourceNameParam;
    }

    public Integer getStartTime() {
        return startTimeParam;
    }

    public void setStartTime(Integer startTimeParam) {
        this.startTimeParam = startTimeParam;
    }

    public String getTransactionNO() {
        return transactionNOParam;
    }

    public void setTransactionNO(String transactionNOParam) {
        this.transactionNOParam = transactionNOParam;
    }

    public String getTransactionType() {
        return transactionTypeParam;
    }

    public void setTransactionType(String transactionTypeParam) {
        this.transactionTypeParam = transactionTypeParam;
    }

}
