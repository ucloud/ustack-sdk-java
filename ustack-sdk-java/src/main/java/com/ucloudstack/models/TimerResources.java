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

public class TimerResources {

    /** 资源ID，定时器绑定的目标资源唯一标识符 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源名称，资源显示名称 */
    @SerializedName("ResourceName")
    private String resourceNameParam;


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

}
