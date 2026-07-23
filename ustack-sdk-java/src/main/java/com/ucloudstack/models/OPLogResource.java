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

public class OPLogResource {

    /** 关联IP列表，记录操作发生时关联的IP信息 */
    @SerializedName("IPs")
    private List<OPLogIPInfo> iPsParam;

    /** 资源ID，关联资源的唯一标识 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源名称，操作发生时记录的资源名称 */
    @SerializedName("ResourceName")
    private String resourceNameParam;

    /** 资源类型，关联资源的类型标识 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;


    public List<OPLogIPInfo> getIPs() {
        return iPsParam;
    }

    public void setIPs(List<OPLogIPInfo> iPsParam) {
        this.iPsParam = iPsParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public String getResourceName() {
        return resourceNameParam;
    }

    public void setResourceName(String resourceNameParam) {
        this.resourceNameParam = resourceNameParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

}
