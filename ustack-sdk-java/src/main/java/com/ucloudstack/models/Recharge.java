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

public class Recharge {

    /** 账号ID，充值操作的账号ID，与CompanyID相同 */
    @SerializedName("AccountID")
    private Integer accountIDParam;

    /** 账号名称，充值操作的账号名称，与AccountID对应 */
    @SerializedName("AccountName")
    private String accountNameParam;

    /** 租户ID，充值所属的租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，充值所属的租户名称，与CompanyID对应 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，充值记录的创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，充值所属的租户邮箱，与CompanyID对应 */
    @SerializedName("Email")
    private String emailParam;

    /** 来源类型，充值的来源渠道，ALIPAY表示支付宝、WECHAT_PAY表示微信支付、INNER表示内部充值、OFFLINE表示线下充值 */
    @SerializedName("FromType")
    private String fromTypeParam;

    /** 充值类型，充值的类型分类，FREE表示赠金，REAL表示现金 */
    @SerializedName("RechargeType")
    private String rechargeTypeParam;

    /** 序列号，充值的序列号或凭证号，用于防止重复充值 */
    @SerializedName("SerialNo")
    private String serialNoParam;

    /** 充值金额，本次充值的金额，单位为元，精确到分 */
    @SerializedName("TradeAmount")
    private Double tradeAmountParam;

    /** 交易号，充值交易的唯一标识 */
    @SerializedName("TransactonNO")
    private String transactonNOParam;

    /** 更新时间，充值记录的最后更新时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public Integer getAccountID() {
        return accountIDParam;
    }

    public void setAccountID(Integer accountIDParam) {
        this.accountIDParam = accountIDParam;
    }

    public String getAccountName() {
        return accountNameParam;
    }

    public void setAccountName(String accountNameParam) {
        this.accountNameParam = accountNameParam;
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

    public String getFromType() {
        return fromTypeParam;
    }

    public void setFromType(String fromTypeParam) {
        this.fromTypeParam = fromTypeParam;
    }

    public String getRechargeType() {
        return rechargeTypeParam;
    }

    public void setRechargeType(String rechargeTypeParam) {
        this.rechargeTypeParam = rechargeTypeParam;
    }

    public String getSerialNo() {
        return serialNoParam;
    }

    public void setSerialNo(String serialNoParam) {
        this.serialNoParam = serialNoParam;
    }

    public Double getTradeAmount() {
        return tradeAmountParam;
    }

    public void setTradeAmount(Double tradeAmountParam) {
        this.tradeAmountParam = tradeAmountParam;
    }

    public String getTransactonNO() {
        return transactonNOParam;
    }

    public void setTransactonNO(String transactonNOParam) {
        this.transactonNOParam = transactonNOParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
