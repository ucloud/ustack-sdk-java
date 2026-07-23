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

public class Permission {

    /** 操作类型，标识该权限所属分类 */
    @SerializedName("ActionType")
    private String actionTypeParam;

    /** 是否授权，标识是否拥有该动作权限；0表示否，1表示是 */
    @SerializedName("IsPermission")
    private Integer isPermissionParam;

    /** 权限名称，对应API的Action标识 */
    @SerializedName("Name")
    private String nameParam;

    /** 权限值，内部使用的权限位标识 */
    @SerializedName("Permission")
    private Integer permissionParam;

    /** 备注，对该权限功能的业务描述 */
    @SerializedName("Remark")
    private String remarkParam;


    public String getActionType() {
        return actionTypeParam;
    }

    public void setActionType(String actionTypeParam) {
        this.actionTypeParam = actionTypeParam;
    }

    public Integer getIsPermission() {
        return isPermissionParam;
    }

    public void setIsPermission(Integer isPermissionParam) {
        this.isPermissionParam = isPermissionParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public Integer getPermission() {
        return permissionParam;
    }

    public void setPermission(Integer permissionParam) {
        this.permissionParam = permissionParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

}
