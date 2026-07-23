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

public class SetResourceTagsRequest extends Request {

    /** 租户ID，用于标识资源所属的租户，实现多租户环境下的资源隔离，普通租户需填写自身CompanyID；当CompanyID=200000231（系统管理员租户）时仅能操作SEGMENT/DIRECTCONNECT/FLATNETWORK/TRAFFICMIRROR等运维资源 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 标签键值对列表，格式为key:value（均为Base64编码），此操作会先清空资源的所有标签，然后按列表重新绑定；留空表示清空全部标签，键和值会在解码后校验非空且键名不可重复（tagutils.ParseKeyValuePairs），批量上限50个 */
    @NotEmpty
    @OpenAPIParam("KeyValuePairs")
    private List<String> keyValuePairsParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源ID，指定要设置标签的目标资源，资源必须满足：1）属于指定租户（StatusResourceNotBelongsToTenant）；2）状态为可用（StatusResourceStatusInvalid）；3）资源存在（StatusResourceNotExist）；4）资源类型匹配（StatusParamInvalid），设置操作会替换资源的所有标签，绑定时会自动检查标签是否存在（StatusTagNotFound） */
    @NotEmpty
    @OpenAPIParam("ResourceID")
    private String resourceIDParam;

    /** 资源类型，标识要设置标签的资源种类，支持包括DISK、VM等多种资源类型，无效类型返回StatusResourceTypeInvalid，类型与资源ID不匹配返回StatusParamInvalid */
    @NotEmpty
    @OpenAPIParam("ResourceType")
    private String resourceTypeParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getKeyValuePairs() {
        return keyValuePairsParam;
    }

    public void setKeyValuePairs(List<String> keyValuePairsParam) {
        this.keyValuePairsParam = keyValuePairsParam;
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
