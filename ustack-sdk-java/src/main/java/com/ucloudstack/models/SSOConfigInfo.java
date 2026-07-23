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

public class SSOConfigInfo {

    /** 连续登录失败锁定用户时长，单位为秒或分钟 */
    @SerializedName("FailedLoginsLockTime")
    private String failedLoginsLockTimeParam;

    /** 连续登录失败次数上限，超过此次数将锁定用户 */
    @SerializedName("FailedLoginsMax")
    private String failedLoginsMaxParam;

    /** 多次登录失败冻结账号开关，true表示开启失败冻结，false表示关闭 */
    @SerializedName("LoginProtect")
    private String loginProtectParam;

    /** 是否允许用户注册，true表示允许注册新用户，false表示关闭注册 */
    @SerializedName("Registerable")
    private String registerableParam;

    /** 密码不符合要求时是否强制修改，true表示强制用户修改密码，false表示不强制 */
    @SerializedName("SSOPasswordInvalidChange")
    private Boolean sSOPasswordInvalidChangeParam;

    /** 登录密码复杂度要求，如需包含大小写字母、数字、特殊字符等 */
    @SerializedName("SSORegisterPasswordComplexity")
    private String sSORegisterPasswordComplexityParam;

    /** 登录密码最低长度要求 */
    @SerializedName("SSORegisterPasswordLength")
    private Integer sSORegisterPasswordLengthParam;

    /** 系统激活状态，true表示系统已激活（已有地域信息），false表示未激活 */
    @SerializedName("SystemActiveStatus")
    private String systemActiveStatusParam;


    public String getFailedLoginsLockTime() {
        return failedLoginsLockTimeParam;
    }

    public void setFailedLoginsLockTime(String failedLoginsLockTimeParam) {
        this.failedLoginsLockTimeParam = failedLoginsLockTimeParam;
    }

    public String getFailedLoginsMax() {
        return failedLoginsMaxParam;
    }

    public void setFailedLoginsMax(String failedLoginsMaxParam) {
        this.failedLoginsMaxParam = failedLoginsMaxParam;
    }

    public String getLoginProtect() {
        return loginProtectParam;
    }

    public void setLoginProtect(String loginProtectParam) {
        this.loginProtectParam = loginProtectParam;
    }

    public String getRegisterable() {
        return registerableParam;
    }

    public void setRegisterable(String registerableParam) {
        this.registerableParam = registerableParam;
    }

    public Boolean getSSOPasswordInvalidChange() {
        return sSOPasswordInvalidChangeParam;
    }

    public void setSSOPasswordInvalidChange(Boolean sSOPasswordInvalidChangeParam) {
        this.sSOPasswordInvalidChangeParam = sSOPasswordInvalidChangeParam;
    }

    public String getSSORegisterPasswordComplexity() {
        return sSORegisterPasswordComplexityParam;
    }

    public void setSSORegisterPasswordComplexity(String sSORegisterPasswordComplexityParam) {
        this.sSORegisterPasswordComplexityParam = sSORegisterPasswordComplexityParam;
    }

    public Integer getSSORegisterPasswordLength() {
        return sSORegisterPasswordLengthParam;
    }

    public void setSSORegisterPasswordLength(Integer sSORegisterPasswordLengthParam) {
        this.sSORegisterPasswordLengthParam = sSORegisterPasswordLengthParam;
    }

    public String getSystemActiveStatus() {
        return systemActiveStatusParam;
    }

    public void setSystemActiveStatus(String systemActiveStatusParam) {
        this.systemActiveStatusParam = systemActiveStatusParam;
    }

}
