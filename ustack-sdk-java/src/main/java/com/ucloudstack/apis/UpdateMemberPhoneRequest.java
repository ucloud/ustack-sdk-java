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

public class UpdateMemberPhoneRequest extends Request {

    /** 成员ID，指定要更新手机号的账号标识 */
    @NotEmpty
    @UCloudStackParam("MemberID")
    private Integer memberIDParam;

    /** 手机号，用于安全通知或验证码接收，需为合法手机号 */
    @NotEmpty
    @UCloudStackParam("PhoneNum")
    private String phoneNumParam;


    public Integer getMemberID() {
        return memberIDParam;
    }

    public void setMemberID(Integer memberIDParam) {
        this.memberIDParam = memberIDParam;
    }

    public String getPhoneNum() {
        return phoneNumParam;
    }

    public void setPhoneNum(String phoneNumParam) {
        this.phoneNumParam = phoneNumParam;
    }

}
