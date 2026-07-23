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

public class WithdrawTradeInfo {

    /** 账号ID，与CompanyID相同 */
    @SerializedName("AccountID")
    private Integer accountIDParam;

    /** 账号名称，与CompanyName对应 */
    @SerializedName("AccountName")
    private String accountNameParam;

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 提现单号，提现的序列号 */
    @SerializedName("SerialNo")
    private String serialNoParam;

    /** 源账户类型，FREE表示赠金账户，REAL表示现金账户 */
    @SerializedName("SrcAccountType")
    private String srcAccountTypeParam;

    /** 交易单号，提现生成的交易唯一标识 */
    @SerializedName("TradeNo")
    private String tradeNoParam;

    /** 提现金额，单位为元，精确到分 */
    @SerializedName("WithdrawAmount")
    private Double withdrawAmountParam;


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

    public String getSerialNo() {
        return serialNoParam;
    }

    public void setSerialNo(String serialNoParam) {
        this.serialNoParam = serialNoParam;
    }

    public String getSrcAccountType() {
        return srcAccountTypeParam;
    }

    public void setSrcAccountType(String srcAccountTypeParam) {
        this.srcAccountTypeParam = srcAccountTypeParam;
    }

    public String getTradeNo() {
        return tradeNoParam;
    }

    public void setTradeNo(String tradeNoParam) {
        this.tradeNoParam = tradeNoParam;
    }

    public Double getWithdrawAmount() {
        return withdrawAmountParam;
    }

    public void setWithdrawAmount(Double withdrawAmountParam) {
        this.withdrawAmountParam = withdrawAmountParam;
    }

}
