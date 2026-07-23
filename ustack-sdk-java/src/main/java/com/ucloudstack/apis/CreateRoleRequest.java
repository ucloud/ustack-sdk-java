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

public class CreateRoleRequest extends Request {

    /** 角色名称，用于标识自定义角色并在控制台显示，长度为1-50个字符，只能包含中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 权限定义，指定角色拥有的API操作权限集，格式：Action-1（允许）、Action-0（禁止） */
    @NotEmpty
    @OpenAPIParam("Permission")
    private String permissionParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符， */
    
    @OpenAPIParam("Remark")
    private String remarkParam;


    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPermission() {
        return permissionParam;
    }

    public void setPermission(String permissionParam) {
        this.permissionParam = permissionParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

}
