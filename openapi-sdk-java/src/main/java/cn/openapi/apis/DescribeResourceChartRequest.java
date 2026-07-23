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

public class DescribeResourceChartRequest extends Request {

    /** 地域ID，指定要查询资源图表的地域，若不指定则查询所有有权限的地域 */
    
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源类型，指定要查询的资源图表类型，支持COMPUTE_SET(计算集群)、STORAGE_SET(存储集群)、REGION(地域) */
    @NotEmpty
    @OpenAPIParam("ResourceType")
    private String resourceTypeParam;

    /** 类型为 REGION 时, 是否只展示用户虚拟机；为 true 时仅统计用户 VM（过滤管理虚拟机），为 false 时包含所有虚拟机（过滤 sandbox） */
    
    @OpenAPIParam("ShowUserVMOnly")
    private Boolean showUserVMOnlyParam;


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

    public Boolean getShowUserVMOnly() {
        return showUserVMOnlyParam;
    }

    public void setShowUserVMOnly(Boolean showUserVMOnlyParam) {
        this.showUserVMOnlyParam = showUserVMOnlyParam;
    }

}
