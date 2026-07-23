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

public class ListExpiredResourcesRequest extends Request {

    /** 租户ID，指定要查询过期资源的租户 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 地域ID，指定要查询过期资源的地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 资源类型列表，指定要查询的资源类型，若不指定则查询所有类型 */
    @NotEmpty
    @UCloudStackParam("ResourceType")
    private List<String> resourceTypeParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(List<String> resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

}
