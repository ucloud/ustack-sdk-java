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

public class UserAccessInfo {

    /** 总余额，账户可支配资金总额，单位为元 */
    @SerializedName("Amount")
    private Double amountParam;

    /** 外部余额，通过充值获得的余额，单位为元 */
    @SerializedName("AmountCredit")
    private Double amountCreditParam;

    /** 内部余额，系统发放的免额额度，单位为元 */
    @SerializedName("AmountFree")
    private Double amountFreeParam;

    /** 审批开关，标识租户资源变更是否需人工审批 */
    @SerializedName("Audit")
    private Integer auditParam;

    /** 租户ID，账号所属租户标识 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户状态，标识账号所属租户当前是否可用 */
    @SerializedName("CompanyStatus")
    private String companyStatusParam;

    /** 创建时间，账号首次建立的Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 账号邮箱，登录与通知邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 授权等级列表，标识账号可管理的层级范围 */
    @SerializedName("GrantLevels")
    private List<String> grantLevelsParam;

    /** 成员ID，当前账号唯一标识 */
    @SerializedName("MemberID")
    private Integer memberIDParam;

    /** 成员名称，账号展示名称用于管理界面显示 */
    @SerializedName("MemberName")
    private String memberNameParam;

    /** OAuth2唯一标识ID，用于绑定外部SSO系统的用户身份 */
    @SerializedName("OAuth2UniqueID")
    private String oAuth2UniqueIDParam;

    /** 手机号，用于安全通知或验证码接收 */
    @SerializedName("Phone")
    private String phoneParam;

    /** API私钥，用于请求签名，需妥善保管 */
    @SerializedName("PrivateKey")
    private String privateKeyParam;

    /** 权限级别，标识账号在租户内的管理范围 */
    @SerializedName("Privileges")
    private String privilegesParam;

    /** API公钥，用于请求签名校验与鉴权 */
    @SerializedName("PublicKey")
    private String publicKeyParam;

    /** 账号状态，标识账号当前可用性 */
    @SerializedName("Status")
    private String statusParam;

    /** 更新时间，账号信息最后一次修改的Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 用户邮箱，用于关联用户主体邮箱 */
    @SerializedName("UserEmail")
    private String userEmailParam;

    /** 用户名称，兼容字段用于展示 */
    @SerializedName("UserName")
    private String userNameParam;


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

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getCompanyStatus() {
        return companyStatusParam;
    }

    public void setCompanyStatus(String companyStatusParam) {
        this.companyStatusParam = companyStatusParam;
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

    public List<String> getGrantLevels() {
        return grantLevelsParam;
    }

    public void setGrantLevels(List<String> grantLevelsParam) {
        this.grantLevelsParam = grantLevelsParam;
    }

    public Integer getMemberID() {
        return memberIDParam;
    }

    public void setMemberID(Integer memberIDParam) {
        this.memberIDParam = memberIDParam;
    }

    public String getMemberName() {
        return memberNameParam;
    }

    public void setMemberName(String memberNameParam) {
        this.memberNameParam = memberNameParam;
    }

    public String getOAuth2UniqueID() {
        return oAuth2UniqueIDParam;
    }

    public void setOAuth2UniqueID(String oAuth2UniqueIDParam) {
        this.oAuth2UniqueIDParam = oAuth2UniqueIDParam;
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

    public String getPrivileges() {
        return privilegesParam;
    }

    public void setPrivileges(String privilegesParam) {
        this.privilegesParam = privilegesParam;
    }

    public String getPublicKey() {
        return publicKeyParam;
    }

    public void setPublicKey(String publicKeyParam) {
        this.publicKeyParam = publicKeyParam;
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

    public String getUserEmail() {
        return userEmailParam;
    }

    public void setUserEmail(String userEmailParam) {
        this.userEmailParam = userEmailParam;
    }

    public String getUserName() {
        return userNameParam;
    }

    public void setUserName(String userNameParam) {
        this.userNameParam = userNameParam;
    }

}
