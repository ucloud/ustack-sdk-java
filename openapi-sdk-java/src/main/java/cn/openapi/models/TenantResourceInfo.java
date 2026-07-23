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

public class TenantResourceInfo {

    /** 是否支持回收站，查询结果返回；true表示可回收 */
    @SerializedName("IsRecycled")
    private Boolean isRecycledParam;

    /** 资源名称，查询结果返回的资源可读名称，用于展示 */
    @SerializedName("Name")
    private String nameParam;

    /** 资源ID，查询结果返回的租户下云资源唯一标识，用于资源定位 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源类型，查询结果返回的资源所属类型，用于区分不同资源 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 资源状态，查询结果返回的资源生命周期状态，用于状态展示 */
    @SerializedName("Status")
    private String statusParam;


    public Boolean getIsRecycled() {
        return isRecycledParam;
    }

    public void setIsRecycled(Boolean isRecycledParam) {
        this.isRecycledParam = isRecycledParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
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

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

}
