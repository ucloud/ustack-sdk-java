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

public class CreateUserRequest extends Request {

    /** 审批开关，请求传入并设置租户资源变动是否进入人工审批流程；开通租户策略配置场景使用；取值'1','Y','Yes','YES','True','true'为开启，其它为关闭 */
    @NotEmpty
    @UCloudStackParam("Audit")
    private String auditParam;

    /** 自动审批开关，请求传入并设置满足条件的资源申请是否自动通过；开通租户策略配置场景使用；取值'1','Y','Yes','YES','True','true'为开启，其它为关闭 */
    @NotEmpty
    @UCloudStackParam("AutoAudit")
    private String autoAuditParam;

    /** 租户邮箱，请求传入并写入租户与主账号邮箱字段，作为租户身份全局唯一标识，用于登录、找回密码和接收系统通知；创建租户场景使用；邮箱重复会导致创建失败 */
    @NotEmpty
    @UCloudStackParam("Email")
    private String emailParam;

    /** 租户名称，请求传入并写入租户及主账号显示名称，用于组织识别与展示；创建租户场景使用，长度为1-30个字符，只能包含中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** 登录密码，请求传入并设置为主账号初始登录密码，作为后续登录凭据；创建租户场景使用；采用Base64(AES-CBC加密)编码传入；密码长度和复杂度由系统配置决定（PASSWORD_LENGTH、PASSWORD_COMPLEXITY），支持字符包括：大小写字母、数字、特殊符号()、反引号、~!@#$%^&*-+=_|{}[]:;'<>,.?/ */
    @NotEmpty
    @UCloudStackParam("PassWord")
    private String passWordParam;

    /** 手机号，请求传入并写入租户与主账号联系方式，用于短信验证码及敏感操作二次验证；创建或安全校验场景使用；需符合手机号校验规则 */
    
    @UCloudStackParam("Phone")
    private String phoneParam;

    /** 备注，说明或备注信息 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 重置密码开关，请求传入并控制租户首次登录是否必须修改初始密码；初始化安全策略场景使用；取值'1','Y','Yes','YES','True','true'为开启，其它为关闭；默认No */
    
    @UCloudStackParam("ResetPassword")
    private String resetPasswordParam;

    /** 管理员邮箱，历史兼容字段，请求传入但当前创建逻辑忽略该值并以Email为准；旧客户端兼容场景使用 */
    
    @UCloudStackParam("UserEmail")
    private String userEmailParam;

    /** 管理员姓名，历史兼容字段，请求传入但当前创建逻辑忽略该值并以Name为准；旧客户端兼容场景使用，长度为1-30个字符，只能包含中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @UCloudStackParam("UserName")
    private String userNameParam;


    public String getAudit() {
        return auditParam;
    }

    public void setAudit(String auditParam) {
        this.auditParam = auditParam;
    }

    public String getAutoAudit() {
        return autoAuditParam;
    }

    public void setAutoAudit(String autoAuditParam) {
        this.autoAuditParam = autoAuditParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPassWord() {
        return passWordParam;
    }

    public void setPassWord(String passWordParam) {
        this.passWordParam = passWordParam;
    }

    public String getPhone() {
        return phoneParam;
    }

    public void setPhone(String phoneParam) {
        this.phoneParam = phoneParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getResetPassword() {
        return resetPasswordParam;
    }

    public void setResetPassword(String resetPasswordParam) {
        this.resetPasswordParam = resetPasswordParam;
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
