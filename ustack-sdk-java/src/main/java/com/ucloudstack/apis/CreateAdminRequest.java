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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateAdminRequest extends Request {

    /** 授权等级，用于决定管理员的管理边界；取值：System（系统级）、Region（地域级） */
    @NotEmpty
    @OpenAPIParam("GrantLevel")
    private String grantLevelParam;

    /** 账号邮箱，管理员登录身份标识，需符合邮箱格式 */
    @NotEmpty
    @OpenAPIParam("MemberEmail")
    private String memberEmailParam;

    /** 成员名称，管理员展示名称用于管理界面显示，长度为1-30个字符，只能包含中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("MemberName")
    private String memberNameParam;

    /** 登录密码，用于管理员登录；若使用 X-Auth-Method: plain 则需 Base64 输入并在服务端转为 AES 加密；需满足 GlobalConfigKeyPasswordLength 与 GlobalConfigKeyPasswordComplexity 规则 */
    @NotEmpty
    @OpenAPIParam("Password")
    private String passwordParam;

    /** 手机号，用于安全通知或验证码接收，需为合法手机号 */
    
    @OpenAPIParam("Phone")
    private String phoneParam;

    /** 只读权限（兼容字段），新调用建议使用 RoleIDs 明确授权；取值：1, Y, Yes, true 表示是，其他表示否 */
    
    @OpenAPIParam("ReadOnly")
    private String readOnlyParam;

    /** 地域ID列表，当GrantLevel=Region时必填且至少一个，用于在创建管理员时原子完成地域授权 */
    @NotEmpty
    @OpenAPIParam("Regions")
    private List<String> regionsParam;

    /** 重置密码，指定首次登录时是否强制修改密码；取值：1, Y, Yes, true 表示是，其他表示否 */
    
    @OpenAPIParam("ResetPassword")
    private String resetPasswordParam;

    /** 角色ID列表，为空时根据 ReadOnly 推导默认角色，用于指定管理员所属角色集合 */
    @NotEmpty
    @OpenAPIParam("RoleIDs")
    private List<String> roleIDsParam;


    public String getGrantLevel() {
        return grantLevelParam;
    }

    public void setGrantLevel(String grantLevelParam) {
        this.grantLevelParam = grantLevelParam;
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

    public String getReadOnly() {
        return readOnlyParam;
    }

    public void setReadOnly(String readOnlyParam) {
        this.readOnlyParam = readOnlyParam;
    }

    public List<String> getRegions() {
        return regionsParam;
    }

    public void setRegions(List<String> regionsParam) {
        this.regionsParam = regionsParam;
    }

    public String getResetPassword() {
        return resetPasswordParam;
    }

    public void setResetPassword(String resetPasswordParam) {
        this.resetPasswordParam = resetPasswordParam;
    }

    public List<String> getRoleIDs() {
        return roleIDsParam;
    }

    public void setRoleIDs(List<String> roleIDsParam) {
        this.roleIDsParam = roleIDsParam;
    }

}
