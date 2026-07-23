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

public class DetachDiskRequest extends Request {

    /** 租户ID，资源所属租户标识 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 磁盘ID，要解绑的磁盘标识，共享盘解绑时只会移除当前ResourceID的绑定，不会影响其他绑定实例 */
    @NotEmpty
    @UCloudStackParam("DiskID")
    private String diskIDParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 资源ID，要解绑磁盘的目标资源标识 */
    @NotEmpty
    @UCloudStackParam("ResourceID")
    private String resourceIDParam;

    /** 资源类型，挂载目标的资源类型，当前仅用于兼容调用 */
    
    @UCloudStackParam("ResourceType")
    private String resourceTypeParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getDiskID() {
        return diskIDParam;
    }

    public void setDiskID(String diskIDParam) {
        this.diskIDParam = diskIDParam;
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
