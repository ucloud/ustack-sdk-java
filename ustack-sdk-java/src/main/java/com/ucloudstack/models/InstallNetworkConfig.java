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

public class InstallNetworkConfig {

    /** Bond配置 */
    @SerializedName("Bond")
    private InstallBondConfig bondParam;

    /** 网络名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 物理网卡配置列表 */
    @SerializedName("Physicals")
    private InstallPhysicalConfig physicalsParam;

    /** 网络类型 */
    @SerializedName("Type")
    private String typeParam;

    /** VLAN配置 */
    @SerializedName("VLAN")
    private InstallVLANConfig vLANParam;

    /** 交换机端口模式，来自该网卡最近一次装机时选择的值；access表示交换机端口为Access模式，trunk或空表示Trunk模式 */
    @SerializedName("VlanMode")
    private String vlanModeParam;


    public InstallBondConfig getBond() {
        return bondParam;
    }

    public void setBond(InstallBondConfig bondParam) {
        this.bondParam = bondParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public InstallPhysicalConfig getPhysicals() {
        return physicalsParam;
    }

    public void setPhysicals(InstallPhysicalConfig physicalsParam) {
        this.physicalsParam = physicalsParam;
    }

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

    public InstallVLANConfig getVLAN() {
        return vLANParam;
    }

    public void setVLAN(InstallVLANConfig vLANParam) {
        this.vLANParam = vLANParam;
    }

    public String getVlanMode() {
        return vlanModeParam;
    }

    public void setVlanMode(String vlanModeParam) {
        this.vlanModeParam = vlanModeParam;
    }

}
