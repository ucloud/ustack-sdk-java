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
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateRolePermissionRequest extends Request {

    /** 是否开启权限，0表示关闭，'1','Y','Yes','YES','True','true'表示开启 */
    
    @OpenAPIParam("IsPermission")
    private Integer isPermissionParam;

    /** 角色权限，指定需要变更的Action名称 */
    @NotEmpty
    @OpenAPIParam("Permission")
    private String permissionParam;

    /** 角色ID，用于唯一标识角色 */
    @NotEmpty
    @OpenAPIParam("RoleID")
    private String roleIDParam;


    public Integer getIsPermission() {
        return isPermissionParam;
    }

    public void setIsPermission(Integer isPermissionParam) {
        this.isPermissionParam = isPermissionParam;
    }

    public String getPermission() {
        return permissionParam;
    }

    public void setPermission(String permissionParam) {
        this.permissionParam = permissionParam;
    }

    public String getRoleID() {
        return roleIDParam;
    }

    public void setRoleID(String roleIDParam) {
        this.roleIDParam = roleIDParam;
    }

}
