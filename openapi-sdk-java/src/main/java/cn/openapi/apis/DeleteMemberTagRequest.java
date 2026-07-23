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

public class DeleteMemberTagRequest extends Request {

    /** 成员ID，用于指定需移除授权的账号 */
    @NotEmpty
    @OpenAPIParam("MemberID")
    private Integer memberIDParam;

    /** 项目组ID，租户级别用户必填；系统级/区域级授权可为空 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 角色ID，用于指定要移除的角色 */
    @NotEmpty
    @OpenAPIParam("RoleID")
    private String roleIDParam;


    public Integer getMemberID() {
        return memberIDParam;
    }

    public void setMemberID(Integer memberIDParam) {
        this.memberIDParam = memberIDParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getRoleID() {
        return roleIDParam;
    }

    public void setRoleID(String roleIDParam) {
        this.roleIDParam = roleIDParam;
    }

}
