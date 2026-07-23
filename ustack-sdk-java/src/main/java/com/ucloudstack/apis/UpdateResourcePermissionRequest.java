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

public class UpdateResourcePermissionRequest extends Request {

    /** 权限配置，当PermissionMode为whitelist或blacklist时，传入以逗号分隔的租户ID列表（如1001,1002,1003） */
    
    @UCloudStackParam("Permission")
    private String permissionParam;

    /** 权限模式，控制租户访问权限的模式，可选值：all（所有租户可用，默认值）、whitelist（白名单，仅指定租户可用）、blacklist（黑名单，仅指定租户不可用） */
    
    @UCloudStackParam("PermissionMode")
    private String permissionModeParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 资源ID，指定要修改权限的资源唯一标识 */
    @NotEmpty
    @UCloudStackParam("ResourceID")
    private String resourceIDParam;

    /** 资源类型，指定资源的类型，支持COMPUTE_SET、STORAGE_SET、BASE_IMAGE、SEGMENT、DC（DirectConnect专线）、FLATNETWORK（扁平网络），用于确定资源的类别 */
    @NotEmpty
    @UCloudStackParam("ResourceType")
    private String resourceTypeParam;


    public String getPermission() {
        return permissionParam;
    }

    public void setPermission(String permissionParam) {
        this.permissionParam = permissionParam;
    }

    public String getPermissionMode() {
        return permissionModeParam;
    }

    public void setPermissionMode(String permissionModeParam) {
        this.permissionModeParam = permissionModeParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

}
