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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class AttachExternalDiskRequest extends Request {

    /** 缓存类型，取值 directsync、none、writeback */
    
    @OpenAPIParam("CacheMode")
    private String cacheModeParam;

    /** 租户ID，资源所属租户的权限上下文 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 磁盘ID，待绑定的外置存储盘资源ID */
    @NotEmpty
    @OpenAPIParam("DiskID")
    private String diskIDParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源ID，绑定目标资源的ID */
    @NotEmpty
    @OpenAPIParam("ResourceID")
    private String resourceIDParam;

    /** 资源类型，绑定目标资源的类型标识 */
    
    @OpenAPIParam("ResourceType")
    private String resourceTypeParam;


    public String getCacheMode() {
        return cacheModeParam;
    }

    public void setCacheMode(String cacheModeParam) {
        this.cacheModeParam = cacheModeParam;
    }

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
