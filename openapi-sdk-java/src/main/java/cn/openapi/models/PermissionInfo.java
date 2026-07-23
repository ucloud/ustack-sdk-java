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

public class PermissionInfo {

    /** API操作名，用于标识权限动作 */
    @SerializedName("Action")
    private String actionParam;

    /** 权限结果，标识是否拥有该action权限 */
    @SerializedName("Permission")
    private Boolean permissionParam;


    public String getAction() {
        return actionParam;
    }

    public void setAction(String actionParam) {
        this.actionParam = actionParam;
    }

    public Boolean getPermission() {
        return permissionParam;
    }

    public void setPermission(Boolean permissionParam) {
        this.permissionParam = permissionParam;
    }

}
