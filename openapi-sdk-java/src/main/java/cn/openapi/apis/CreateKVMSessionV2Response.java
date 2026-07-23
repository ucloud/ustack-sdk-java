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
package cn.openapi.apis;

import cn.openapi.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class CreateKVMSessionV2Response extends Response {

    /** 过期时间，Unix时间戳（秒），会话在此时间后自动失效，需要重新创建新会话 */
    @SerializedName("ExpiresAt")
    private Integer expiresAtParam;

    /** 访问密码，用于VNC客户端连接的密码，若不需要密码则可为空 */
    @SerializedName("Password")
    private String passwordParam;

    /** 会话ID，创建成功的KVM会话唯一标识 */
    @SerializedName("SessionID")
    private String sessionIDParam;

    /** 访问令牌，用于认证KVM会话访问权限的授权令牌 */
    @SerializedName("Token")
    private String tokenParam;

    /** 访问URL，用于访问VNC KVM控制台的HTTP/HTTPS地址 */
    @SerializedName("URL")
    private String uRLParam;


    public Integer getExpiresAt() {
        return expiresAtParam;
    }

    public void setExpiresAt(Integer expiresAtParam) {
        this.expiresAtParam = expiresAtParam;
    }

    public String getPassword() {
        return passwordParam;
    }

    public void setPassword(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    public String getSessionID() {
        return sessionIDParam;
    }

    public void setSessionID(String sessionIDParam) {
        this.sessionIDParam = sessionIDParam;
    }

    public String getToken() {
        return tokenParam;
    }

    public void setToken(String tokenParam) {
        this.tokenParam = tokenParam;
    }

    public String getURL() {
        return uRLParam;
    }

    public void setURL(String uRLParam) {
        this.uRLParam = uRLParam;
    }

}
