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

public class Transaction {

    /** 账号ID，交易操作的账号ID，与CompanyID相同 */
    @SerializedName("AccountID")
    private Integer accountIDParam;

    /** 账号名称，交易操作的账号名称，与AccountID对应 */
    @SerializedName("AccountName")
    private String accountNameParam;

    /** 余额，交易后的账户余额（外部账户），单位为元，精确到分 */
    @SerializedName("BalanceSurplus")
    private Double balanceSurplusParam;

    /** 租户ID，交易所属的租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，交易所属的租户名称，与CompanyID对应 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，交易记录的创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，交易所属的租户邮箱，与CompanyID对应 */
    @SerializedName("Email")
    private String emailParam;

    /** 交易金额，支出的金额，单位为元，扣费和提现时此字段有值 */
    @SerializedName("ExpenseAmount")
    private Double expenseAmountParam;

    /** 内部账号余额，交易后的内部账号余额（赠金），单位为元，精确到分 */
    @SerializedName("FreeBalanceSurplus")
    private Double freeBalanceSurplusParam;

    /** 收入金额，收入的金额，单位为元，充值和退款时此字段有值 */
    @SerializedName("IncomeAmount")
    private Double incomeAmountParam;

    /** 地域，交易所属的地域，充值提现类交易无地域属性 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的显示名称，从DescribeRegion接口获取 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 状态，交易的状态编码，0表示成功 */
    @SerializedName("State")
    private Integer stateParam;

    /** 交易号，交易的业务流水号，对于订单关联的交易为订单号 */
    @SerializedName("TradeNO")
    private String tradeNOParam;

    /** 交易号，交易记录的唯一标识 */
    @SerializedName("TransactionNO")
    private String transactionNOParam;

    /** 交易类型，交易的类型编码，1表示扣费，2表示充值，3表示退款，4表示提现 */
    @SerializedName("TransactionType")
    private Integer transactionTypeParam;


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

    public Double getBalanceSurplus() {
        return balanceSurplusParam;
    }

    public void setBalanceSurplus(Double balanceSurplusParam) {
        this.balanceSurplusParam = balanceSurplusParam;
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

    public Double getExpenseAmount() {
        return expenseAmountParam;
    }

    public void setExpenseAmount(Double expenseAmountParam) {
        this.expenseAmountParam = expenseAmountParam;
    }

    public Double getFreeBalanceSurplus() {
        return freeBalanceSurplusParam;
    }

    public void setFreeBalanceSurplus(Double freeBalanceSurplusParam) {
        this.freeBalanceSurplusParam = freeBalanceSurplusParam;
    }

    public Double getIncomeAmount() {
        return incomeAmountParam;
    }

    public void setIncomeAmount(Double incomeAmountParam) {
        this.incomeAmountParam = incomeAmountParam;
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

    public Integer getState() {
        return stateParam;
    }

    public void setState(Integer stateParam) {
        this.stateParam = stateParam;
    }

    public String getTradeNO() {
        return tradeNOParam;
    }

    public void setTradeNO(String tradeNOParam) {
        this.tradeNOParam = tradeNOParam;
    }

    public String getTransactionNO() {
        return transactionNOParam;
    }

    public void setTransactionNO(String transactionNOParam) {
        this.transactionNOParam = transactionNOParam;
    }

    public Integer getTransactionType() {
        return transactionTypeParam;
    }

    public void setTransactionType(Integer transactionTypeParam) {
        this.transactionTypeParam = transactionTypeParam;
    }

}
