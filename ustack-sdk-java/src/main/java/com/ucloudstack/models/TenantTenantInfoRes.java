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

public class TenantTenantInfoRes {

    /** 租户余额，计费账户可用资金额度，用于余额展示与审核 */
    @SerializedName("Amount")
    private Double amountParam;

    /** 信用额度，授予的欠费限制额度，用于信用额度展示 */
    @SerializedName("AmountCredit")
    private Double amountCreditParam;

    /** 免费额度，系统发放的免额余额，用于抵扣展示 */
    @SerializedName("AmountFree")
    private Double amountFreeParam;

    /** 审批开关，标识资源申请是否需审批；1表示开启审批，0表示关闭 */
    @SerializedName("Audit")
    private Integer auditParam;

    /** 自动审批开关，标识资源申请是否自动通过；1表示开启自动审批，0表示关闭 */
    @SerializedName("AutoAudit")
    private Integer autoAuditParam;

    /** 租户ID，查询结果返回的租户唯一标识，用于资源归属与权限隔离 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，租户创建的Unix时间戳，用于时间排序与审计展示 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，查询结果返回的主账号邮箱，用于登录与通知展示 */
    @SerializedName("Email")
    private String emailParam;

    /** 管理员邮箱，后台管理联系邮箱字段，当前与Email一致 */
    @SerializedName("ManagerEmail")
    private String managerEmailParam;

    /** 成员ID，查询结果返回的租户主账号成员ID，用于账号级权限与状态展示 */
    @SerializedName("MemberID")
    private Integer memberIDParam;

    /** 成员状态，主账号生命周期状态；AVAILABLE可用、FREEZE冻结、LOCKED锁定 */
    @SerializedName("MemberStatus")
    private String memberStatusParam;

    /** 租户名称，组织显示名称，用于租户识别与展示 */
    @SerializedName("Name")
    private String nameParam;

    /** 手机号，查询结果返回的主账号安全手机号，用于短信验证码及敏感操作二次验证展示 */
    @SerializedName("Phone")
    private String phoneParam;

    /** API私钥，API调用请求签名RSA私钥，用于请求签名 */
    @SerializedName("PrivateKey")
    private String privateKeyParam;

    /** API公钥，API调用身份验证RSA公钥，用于签名验证 */
    @SerializedName("PublicKey")
    private String publicKeyParam;

    /** 备注，说明或备注信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 租户状态，租户生命周期状态；AVAILABLE可用、FREEZE冻结 */
    @SerializedName("Status")
    private String statusParam;

    /** 更新时间，租户信息最近变更的Unix时间戳，用于展示最近变更时间 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 用户ID，查询结果返回的租户主账号ID；当前与CompanyID一致 */
    @SerializedName("UserID")
    private Integer userIDParam;


    public Double getAmount() {
        return amountParam;
    }

    public void setAmount(Double amountParam) {
        this.amountParam = amountParam;
    }

    public Double getAmountCredit() {
        return amountCreditParam;
    }

    public void setAmountCredit(Double amountCreditParam) {
        this.amountCreditParam = amountCreditParam;
    }

    public Double getAmountFree() {
        return amountFreeParam;
    }

    public void setAmountFree(Double amountFreeParam) {
        this.amountFreeParam = amountFreeParam;
    }

    public Integer getAudit() {
        return auditParam;
    }

    public void setAudit(Integer auditParam) {
        this.auditParam = auditParam;
    }

    public Integer getAutoAudit() {
        return autoAuditParam;
    }

    public void setAutoAudit(Integer autoAuditParam) {
        this.autoAuditParam = autoAuditParam;
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

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getManagerEmail() {
        return managerEmailParam;
    }

    public void setManagerEmail(String managerEmailParam) {
        this.managerEmailParam = managerEmailParam;
    }

    public Integer getMemberID() {
        return memberIDParam;
    }

    public void setMemberID(Integer memberIDParam) {
        this.memberIDParam = memberIDParam;
    }

    public String getMemberStatus() {
        return memberStatusParam;
    }

    public void setMemberStatus(String memberStatusParam) {
        this.memberStatusParam = memberStatusParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPhone() {
        return phoneParam;
    }

    public void setPhone(String phoneParam) {
        this.phoneParam = phoneParam;
    }

    public String getPrivateKey() {
        return privateKeyParam;
    }

    public void setPrivateKey(String privateKeyParam) {
        this.privateKeyParam = privateKeyParam;
    }

    public String getPublicKey() {
        return publicKeyParam;
    }

    public void setPublicKey(String publicKeyParam) {
        this.publicKeyParam = publicKeyParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public Integer getUserID() {
        return userIDParam;
    }

    public void setUserID(Integer userIDParam) {
        this.userIDParam = userIDParam;
    }

}
