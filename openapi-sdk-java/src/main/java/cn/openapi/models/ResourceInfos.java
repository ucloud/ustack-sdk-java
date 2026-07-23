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

public class ResourceInfos {

    /** 租户ID，资源所属的租户，系统资源为0 */
    @SerializedName("CompanyID")
    private String companyIDParam;

    /** 资源创建时间，Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 资源名称，若资源不存在则可能为空或系统预定义名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 地域ID */
    @SerializedName("Region")
    private String regionParam;

    /** 资源ID，资源的唯一标识符 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源类型，如VM、DISK、IP等 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;


    public String getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(String companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
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
