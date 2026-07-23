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

public class InstallPhysicalConfig {

    /** 是否使用 DHCP */
    @SerializedName("DHCP")
    private Boolean dHCPParam;

    /** IP地址列表 */
    @SerializedName("IPs")
    private List<InstallIPConfig> iPsParam;

    /** 物理网卡名称或 MAC 地址 */
    @SerializedName("Interface")
    private String interfaceParam;

    /** 所属 Bond 名称 */
    @SerializedName("Master")
    private String masterParam;


    public Boolean getDHCP() {
        return dHCPParam;
    }

    public void setDHCP(Boolean dHCPParam) {
        this.dHCPParam = dHCPParam;
    }

    public List<InstallIPConfig> getIPs() {
        return iPsParam;
    }

    public void setIPs(List<InstallIPConfig> iPsParam) {
        this.iPsParam = iPsParam;
    }

    public String getInterface() {
        return interfaceParam;
    }

    public void setInterface(String interfaceParam) {
        this.interfaceParam = interfaceParam;
    }

    public String getMaster() {
        return masterParam;
    }

    public void setMaster(String masterParam) {
        this.masterParam = masterParam;
    }

}
