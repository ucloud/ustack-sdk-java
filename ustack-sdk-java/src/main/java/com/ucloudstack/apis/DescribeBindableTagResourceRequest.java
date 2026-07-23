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

public class DescribeBindableTagResourceRequest extends Request {

    /** 租户ID，用于标识资源所属的租户，实现多租户环境下的资源隔离，普通租户需填写自身CompanyID；当CompanyID=200000231（系统管理员租户）时仅能查询SEGMENT/DIRECTCONNECT/FLATNETWORK/TRAFFICMIRROR等运维资源 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 标签键名，用于查询可绑定该标签键的资源列表 */
    @NotEmpty
    @OpenAPIParam("Key")
    private String keyParam;

    /** 分页大小，指定每页返回的记录数，用于控制返回数据量 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，用于实现分页查询 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源类型，标识要查询的资源种类，支持包括DISK、VM等多种资源类型，如果传入无效类型会返回StatusResourceTypeInvalid错误 */
    @NotEmpty
    @OpenAPIParam("ResourceType")
    private String resourceTypeParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getKey() {
        return keyParam;
    }

    public void setKey(String keyParam) {
        this.keyParam = keyParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

}
