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

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateSubMemberRequest extends Request {

    /** 租户ID，标识子账号归属的租户实体，通常由登录上下文确定 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 账号邮箱，子账号登录身份标识，需符合邮箱格式 */
    @NotEmpty
    @UCloudStackParam("MemberEmail")
    private String memberEmailParam;

    /** 成员名称，子账号展示名称用于管理界面显示 */
    @NotEmpty
    @UCloudStackParam("MemberName")
    private String memberNameParam;

    /** OAuth2唯一标识ID，用于绑定外部身份认证系统的用户身份 */
    
    @UCloudStackParam("OAuth2UniqueID")
    private String oAuth2UniqueIDParam;

    /** 登录密码，用于子账号登录；若使用 X-Auth-Method: plain 则需 Base64 输入并在服务端转为 AES 加密；需满足 GlobalConfigKeyPasswordLength 与 GlobalConfigKeyPasswordComplexity 规则 */
    @NotEmpty
    @UCloudStackParam("Password")
    private String passwordParam;

    /** 手机号，用于安全通知或验证码接收，需为合法手机号 */
    
    @UCloudStackParam("Phone")
    private String phoneParam;

    /** 重置密码，指定子账号首次登录时是否必须修改密码；取值：1, Y, Yes, true 表示是，其他表示否 */
    
    @UCloudStackParam("ResetPassword")
    private String resetPasswordParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getMemberEmail() {
        return memberEmailParam;
    }

    public void setMemberEmail(String memberEmailParam) {
        this.memberEmailParam = memberEmailParam;
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

    public String getPassword() {
        return passwordParam;
    }

    public void setPassword(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    public String getPhone() {
        return phoneParam;
    }

    public void setPhone(String phoneParam) {
        this.phoneParam = phoneParam;
    }

    public String getResetPassword() {
        return resetPasswordParam;
    }

    public void setResetPassword(String resetPasswordParam) {
        this.resetPasswordParam = resetPasswordParam;
    }

}
