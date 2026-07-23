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

public class ResetOSSPasswordRequest extends Request {

    /** 租户ID，资源所属租户标识 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 对象存储ID，要重置密码的对象存储标识，仅状态为Running时可执行 */
    @NotEmpty
    @OpenAPIParam("OSSID")
    private String oSSIDParam;

    /** 密码，新的登录密码 */
    @NotEmpty
    @OpenAPIParam("Password")
    private String passwordParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getOSSID() {
        return oSSIDParam;
    }

    public void setOSSID(String oSSIDParam) {
        this.oSSIDParam = oSSIDParam;
    }

    public String getPassword() {
        return passwordParam;
    }

    public void setPassword(String passwordParam) {
        this.passwordParam = passwordParam;
    }

}
