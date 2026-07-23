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

public class UnBindTagRequest extends Request {

    /** 租户ID，用于标识资源所属的租户，实现多租户环境下的资源隔离 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 标签键名列表，指定要解绑的标签键，支持批量解绑多个标签键，解绑操作会删除资源与标签的绑定关系，但不会删除标签定义本身 */
    @NotEmpty
    @OpenAPIParam("Keys")
    private List<String> keysParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 待解绑资源ID列表，支持批量从多个资源解绑标签 */
    @NotEmpty
    @OpenAPIParam("ResourceIDs")
    private List<String> resourceIDsParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getKeys() {
        return keysParam;
    }

    public void setKeys(List<String> keysParam) {
        this.keysParam = keysParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getResourceIDs() {
        return resourceIDsParam;
    }

    public void setResourceIDs(List<String> resourceIDsParam) {
        this.resourceIDsParam = resourceIDsParam;
    }

}
