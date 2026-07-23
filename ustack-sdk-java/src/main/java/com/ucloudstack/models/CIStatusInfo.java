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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class CIStatusInfo {

    /** CIID，容器实例标识（如果适用） */
    @SerializedName("CIID")
    private String cIIDParam;

    /** CI状态，容器实例的运行状态 */
    @SerializedName("CIStatus")
    private String cIStatusParam;

    /** 资源ID，对应的虚拟机等资源标识 */
    @SerializedName("ResourceID")
    private String resourceIDParam;


    public String getCIID() {
        return cIIDParam;
    }

    public void setCIID(String cIIDParam) {
        this.cIIDParam = cIIDParam;
    }

    public String getCIStatus() {
        return cIStatusParam;
    }

    public void setCIStatus(String cIStatusParam) {
        this.cIStatusParam = cIStatusParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

}
