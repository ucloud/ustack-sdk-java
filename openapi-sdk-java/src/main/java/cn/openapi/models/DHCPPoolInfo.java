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

public class DHCPPoolInfo {

    /** 是否启用 */
    @SerializedName("Enabled")
    private Boolean enabledParam;

    /** PXE 地址池结束 IP */
    @SerializedName("EndIP")
    private String endIPParam;

    /** 地址池ID */
    @SerializedName("ID")
    private Integer iDParam;

    /** 机房名称，如 B-408机房，仅用于展示 */
    @SerializedName("Name")
    private String nameParam;

    /** PXE 地址池网段 CIDR，如 192.170.61.0/27 */
    @SerializedName("Network")
    private String networkParam;

    /** 跨网段路由网关（为空表示与 DHCP Server 同二层，无需路由） */
    @SerializedName("RouteGateway")
    private String routeGatewayParam;

    /** PXE 地址池起始 IP */
    @SerializedName("StartIP")
    private String startIPParam;


    public Boolean getEnabled() {
        return enabledParam;
    }

    public void setEnabled(Boolean enabledParam) {
        this.enabledParam = enabledParam;
    }

    public String getEndIP() {
        return endIPParam;
    }

    public void setEndIP(String endIPParam) {
        this.endIPParam = endIPParam;
    }

    public Integer getID() {
        return iDParam;
    }

    public void setID(Integer iDParam) {
        this.iDParam = iDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getNetwork() {
        return networkParam;
    }

    public void setNetwork(String networkParam) {
        this.networkParam = networkParam;
    }

    public String getRouteGateway() {
        return routeGatewayParam;
    }

    public void setRouteGateway(String routeGatewayParam) {
        this.routeGatewayParam = routeGatewayParam;
    }

    public String getStartIP() {
        return startIPParam;
    }

    public void setStartIP(String startIPParam) {
        this.startIPParam = startIPParam;
    }

}
