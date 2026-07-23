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

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class ChangeMemberPasswordRequest extends Request {

    /** 新密码，用于管理员重置账号密码，需满足 GlobalConfigKeyPasswordLength 与 GlobalConfigKeyPasswordComplexity 规则 */
    @NotEmpty
    @OpenAPIParam("Password")
    private String passwordParam;

    /** 成员ID，指定要修改密码的目标账号 */
    @NotEmpty
    @OpenAPIParam("SpecMemberID")
    private Integer specMemberIDParam;


    public String getPassword() {
        return passwordParam;
    }

    public void setPassword(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    public Integer getSpecMemberID() {
        return specMemberIDParam;
    }

    public void setSpecMemberID(Integer specMemberIDParam) {
        this.specMemberIDParam = specMemberIDParam;
    }

}
