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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class AuthorizationInfo {

    /** 创建时间，授权关系建立的Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 账号邮箱，被授权账号的登录邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 成员ID，被授予角色权限的账号标识 */
    @SerializedName("MemberID")
    private Integer memberIDParam;

    /** 项目ID，用于对云资源进行逻辑分组的唯一标识符 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，资源所属项目的显示名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 角色ID，系统生成的权限定义唯一标识符 */
    @SerializedName("RoleID")
    private String roleIDParam;

    /** 角色名称，用于展示的权限角色名称 */
    @SerializedName("RoleName")
    private String roleNameParam;

    /** 角色类型，标识授权角色来源，取值：System或Custom */
    @SerializedName("RoleType")
    private String roleTypeParam;


    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

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

    public String getProjectName() {
        return projectNameParam;
    }

    public void setProjectName(String projectNameParam) {
        this.projectNameParam = projectNameParam;
    }

    public String getRoleID() {
        return roleIDParam;
    }

    public void setRoleID(String roleIDParam) {
        this.roleIDParam = roleIDParam;
    }

    public String getRoleName() {
        return roleNameParam;
    }

    public void setRoleName(String roleNameParam) {
        this.roleNameParam = roleNameParam;
    }

    public String getRoleType() {
        return roleTypeParam;
    }

    public void setRoleType(String roleTypeParam) {
        this.roleTypeParam = roleTypeParam;
    }

}
