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

public class CreateMemberTagRequest extends Request {

    /** 成员ID，用于指定被授权的账号 */
    @NotEmpty
    @OpenAPIParam("MemberID")
    private Integer memberIDParam;

    /** 项目组ID列表，租户级别用户必填且至少一个项目组ID；系统级/区域级授权可为空 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 角色ID列表，用于指定要授予的角色集合 */
    @NotEmpty
    @OpenAPIParam("RoleIDs")
    private List<String> roleIDsParam;


    public Integer getMemberID() {
        return memberIDParam;
    }

    public void setMemberID(Integer memberIDParam) {
        this.memberIDParam = memberIDParam;
    }

    public List<String> getProjectIDs() {
        return projectIDsParam;
    }

    public void setProjectIDs(List<String> projectIDsParam) {
        this.projectIDsParam = projectIDsParam;
    }

    public List<String> getRoleIDs() {
        return roleIDsParam;
    }

    public void setRoleIDs(List<String> roleIDsParam) {
        this.roleIDsParam = roleIDsParam;
    }

}
