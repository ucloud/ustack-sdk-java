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

public class LoginByPasswordRequest extends Request {

    /** OAuth2客户端ID，用于触发登录后的授权流程 */
    
    @UCloudStackParam("ClientID")
    private String clientIDParam;

    /** 账号邮箱，登录身份标识并用于查询账号权限，需符合邮箱格式 */
    @NotEmpty
    @UCloudStackParam("Email")
    private String emailParam;

    /** 登录密码，用于认证；若使用 X-Auth-Method: plain 则需 Base64 输入，服务端转为 AES 加密 */
    @NotEmpty
    @UCloudStackParam("Password")
    private String passwordParam;

    /** OAuth2重定向地址，ClientID存在时必填，需为合法URI */
    
    @UCloudStackParam("RedirectURI")
    private String redirectURIParam;

    /** OAuth2响应类型，ClientID存在时必填且仅支持code */
    
    @UCloudStackParam("ResponseType")
    private String responseTypeParam;

    /** OAuth2状态参数，ClientID存在时必填，用于防CSRF */
    
    @UCloudStackParam("State")
    private String stateParam;

    /** 用户邮箱，传递给登录模块用于兼容用户主体关联的邮箱信息,若为空则默认使用Email */
    
    @UCloudStackParam("UserEmail")
    private String userEmailParam;


    public String getClientID() {
        return clientIDParam;
    }

    public void setClientID(String clientIDParam) {
        this.clientIDParam = clientIDParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getPassword() {
        return passwordParam;
    }

    public void setPassword(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    public String getRedirectURI() {
        return redirectURIParam;
    }

    public void setRedirectURI(String redirectURIParam) {
        this.redirectURIParam = redirectURIParam;
    }

    public String getResponseType() {
        return responseTypeParam;
    }

    public void setResponseType(String responseTypeParam) {
        this.responseTypeParam = responseTypeParam;
    }

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public String getUserEmail() {
        return userEmailParam;
    }

    public void setUserEmail(String userEmailParam) {
        this.userEmailParam = userEmailParam;
    }

}
