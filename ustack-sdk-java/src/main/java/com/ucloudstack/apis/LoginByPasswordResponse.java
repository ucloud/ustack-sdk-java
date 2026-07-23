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
package com.ucloudstack.apis;

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class LoginByPasswordResponse extends Response {

    /** OAuth2授权码，用于换取访问令牌的临时凭据 */
    @SerializedName("Code")
    private String codeParam;

    /** 租户ID，登录成功后返回的租户标识，用于后续资源访问 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 账号邮箱，当前登录账号的邮箱信息 */
    @SerializedName("Email")
    private String emailParam;

    /** 成员ID，登录成功后返回的账号标识，用于账号关联 */
    @SerializedName("MemberID")
    private Integer memberIDParam;

    /** 登录会话Nonce，仅在需要短信验证时返回（RetCode=22002），需在后续 SendVerificationCode 和 VerifyFactor 中携带 */
    @SerializedName("PendingNonce")
    private String pendingNonceParam;

    /** 掩码手机号，仅在需要短信验证时返回（RetCode=22002），用于前端展示，格式如 138****8888 */
    @SerializedName("Phone")
    private String phoneParam;

    /** SSO令牌，跨系统登录使用的会话凭据 */
    @SerializedName("SSOToken")
    private String sSOTokenParam;

    /** OAuth2状态参数，回传以校验请求完整性 */
    @SerializedName("State")
    private String stateParam;


    public String getCode() {
        return codeParam;
    }

    public void setCode(String codeParam) {
        this.codeParam = codeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public Integer getMemberID() {
        return memberIDParam;
    }

    public void setMemberID(Integer memberIDParam) {
        this.memberIDParam = memberIDParam;
    }

    public String getPendingNonce() {
        return pendingNonceParam;
    }

    public void setPendingNonce(String pendingNonceParam) {
        this.pendingNonceParam = pendingNonceParam;
    }

    public String getPhone() {
        return phoneParam;
    }

    public void setPhone(String phoneParam) {
        this.phoneParam = phoneParam;
    }

    public String getSSOToken() {
        return sSOTokenParam;
    }

    public void setSSOToken(String sSOTokenParam) {
        this.sSOTokenParam = sSOTokenParam;
    }

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

}
