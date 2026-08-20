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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class SGResourceInfo {

    /** 网卡类型，资源绑定安全组时的网络接口类型；取值LAN/WAN */
    @SerializedName("NICType")
    private String nICTypeParam;

    /** 资源名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 资源ID，绑定安全组的资源唯一标识符 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源类型，绑定安全组的资源类型；取值包括VM、ELASTIC_NIC、MYSQL、REDIS、OSS、FS等 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 安全组ID，资源绑定的安全组唯一标识符 */
    @SerializedName("SGID")
    private String sGIDParam;


    public String getNICType() {
        return nICTypeParam;
    }

    public void setNICType(String nICTypeParam) {
        this.nICTypeParam = nICTypeParam;
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

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

}
