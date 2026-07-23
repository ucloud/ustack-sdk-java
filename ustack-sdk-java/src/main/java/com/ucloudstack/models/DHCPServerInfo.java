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

public class DHCPServerInfo {

    /** 探测 IP，绑定到 lo，如 192.170.60.66 */
    @SerializedName("EndIP")
    private String endIPParam;

    /** 配置模式：single=单网段，multi=多网段（DHCP Relay） */
    @SerializedName("Mode")
    private String modeParam;

    /** DHCP Server 所在网段 CIDR，如 192.170.60.64/28 */
    @SerializedName("Network")
    private String networkParam;

    /** 兼容模式下的 dhcp-range 结束 IP（dhcp_pools 为空时使用） */
    @SerializedName("PoolEndIP")
    private String poolEndIPParam;

    /** 兼容模式下的 dhcp-range 起始 IP（dhcp_pools 为空时使用） */
    @SerializedName("PoolStartIP")
    private String poolStartIPParam;

    /** DHCP Server IP，绑定到 bond0，如 192.170.60.65 */
    @SerializedName("StartIP")
    private String startIPParam;

    /** VLAN ID */
    @SerializedName("VLANID")
    private Integer vLANIDParam;


    public String getEndIP() {
        return endIPParam;
    }

    public void setEndIP(String endIPParam) {
        this.endIPParam = endIPParam;
    }

    public String getMode() {
        return modeParam;
    }

    public void setMode(String modeParam) {
        this.modeParam = modeParam;
    }

    public String getNetwork() {
        return networkParam;
    }

    public void setNetwork(String networkParam) {
        this.networkParam = networkParam;
    }

    public String getPoolEndIP() {
        return poolEndIPParam;
    }

    public void setPoolEndIP(String poolEndIPParam) {
        this.poolEndIPParam = poolEndIPParam;
    }

    public String getPoolStartIP() {
        return poolStartIPParam;
    }

    public void setPoolStartIP(String poolStartIPParam) {
        this.poolStartIPParam = poolStartIPParam;
    }

    public String getStartIP() {
        return startIPParam;
    }

    public void setStartIP(String startIPParam) {
        this.startIPParam = startIPParam;
    }

    public Integer getVLANID() {
        return vLANIDParam;
    }

    public void setVLANID(Integer vLANIDParam) {
        this.vLANIDParam = vLANIDParam;
    }

}
