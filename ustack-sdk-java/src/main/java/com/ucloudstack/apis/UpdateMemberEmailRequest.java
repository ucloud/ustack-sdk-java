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

public class UpdateMemberEmailRequest extends Request {

    /** 租户ID，用于授权校验与账号归属识别 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 成员ID，指定要修改邮箱的账号标识 */
    @NotEmpty
    @OpenAPIParam("MemberID")
    private Integer memberIDParam;

    /** 账号邮箱，用于更新账号的登录与通知邮箱 */
    @NotEmpty
    @OpenAPIParam("UserEmail")
    private String userEmailParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getMemberID() {
        return memberIDParam;
    }

    public void setMemberID(Integer memberIDParam) {
        this.memberIDParam = memberIDParam;
    }

    public String getUserEmail() {
        return userEmailParam;
    }

    public void setUserEmail(String userEmailParam) {
        this.userEmailParam = userEmailParam;
    }

}
