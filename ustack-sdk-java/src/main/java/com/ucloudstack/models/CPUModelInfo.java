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

public class CPUModelInfo {

    /** CPU模型，CPU的具体型号标识，用于虚拟机迁移时的兼容性判断 */
    @SerializedName("CPUModel")
    private String cPUModelParam;

    /** 是否被禁用，该CPU模型是否被管理员禁用，禁用后虚拟机无法使用该模型 */
    @SerializedName("Disabled")
    private Boolean disabledParam;

    /** 支持该CPU模型的物理机列表，列出集群中支持该CPU模型的所有物理机主机名 */
    @SerializedName("SupportedHosts")
    private List<String> supportedHostsParam;


    public String getCPUModel() {
        return cPUModelParam;
    }

    public void setCPUModel(String cPUModelParam) {
        this.cPUModelParam = cPUModelParam;
    }

    public Boolean getDisabled() {
        return disabledParam;
    }

    public void setDisabled(Boolean disabledParam) {
        this.disabledParam = disabledParam;
    }

    public List<String> getSupportedHosts() {
        return supportedHostsParam;
    }

    public void setSupportedHosts(List<String> supportedHostsParam) {
        this.supportedHostsParam = supportedHostsParam;
    }

}
