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

public class Order {

    /** 内部账户金额，从内部账户（赠金）扣除的金额，单位为元 */
    @SerializedName("AmountFree")
    private Double amountFreeParam;

    /** 外部账户金额，从外部账户扣除的金额，单位为元 */
    @SerializedName("AmountReal")
    private Double amountRealParam;

    /** 总金额，订单的总金额，等于外部账户金额加内部账户金额，单位为元 */
    @SerializedName("AmountTotal")
    private Double amountTotalParam;

    /** 计费类型，资源的计费方式，Hour表示按小时计费、Month表示按月计费、Year表示按年计费 */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，订单所属的租户唯一标识 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，订单所属的租户显示名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，订单的创建时间戳，单位为秒 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，订单所属的租户邮箱地址 */
    @SerializedName("Email")
    private String emailParam;

    /** 订单详情列表，包含订单中各个资源的详细计费信息 */
    @SerializedName("OrderDetails")
    private List<OrderDetail> orderDetailsParam;

    /** 订单编号，订单的唯一标识 */
    @SerializedName("OrderNO")
    private String orderNOParam;

    /** 订单类型，订单的业务类型，BUY表示购买、RENEW表示续费、REFUND表示退款 */
    @SerializedName("OrderType")
    private String orderTypeParam;

    /** 地域，订单资源所属的地域标识 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，订单资源所属的地域显示名称，从DescribeRegion接口获取 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 资源ID，订单关联的资源唯一标识，例如磁盘订单对应磁盘ID */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源名称，订单关联资源的显示名称，若资源不存在则显示资源ID */
    @SerializedName("ResourceName")
    private String resourceNameParam;


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

    public Double getAmountTotal() {
        return amountTotalParam;
    }

    public void setAmountTotal(Double amountTotalParam) {
        this.amountTotalParam = amountTotalParam;
    }

    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
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

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetailsParam;
    }

    public void setOrderDetails(List<OrderDetail> orderDetailsParam) {
        this.orderDetailsParam = orderDetailsParam;
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

}
