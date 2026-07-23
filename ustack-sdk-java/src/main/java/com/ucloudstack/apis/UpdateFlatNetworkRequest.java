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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateFlatNetworkRequest extends Request {

    /** DHCP服务器IP地址，传值表示启用DHCP并设置服务IP，传空表示禁用DHCP */
    
    @OpenAPIParam("DHCPServerIP")
    private String dHCPServerIPParam;

    /** DNS配置，指定DNS服务器地址，多个服务器用逗号分隔，格式为IP地址列表；传空表示清除DNS配置 */
    
    @OpenAPIParam("DNS")
    private String dNSParam;

    /** 物理网卡设备名称，更新网络绑定的物理网络接口 */
    
    @OpenAPIParam("Device")
    private String deviceParam;

    /** 扁平网络ID，指定要更新的扁平网络唯一标识 */
    @NotEmpty
    @OpenAPIParam("FlatNetworkID")
    private String flatNetworkIDParam;

    /** 网关IP地址，更新网络的默认网关IP，必须在网段CIDR范围内 */
    
    @OpenAPIParam("GatewayIP")
    private String gatewayIPParam;

    /** 可用IP范围，更新网络的可分配IP地址段，支持多个范围用逗号分隔，格式为192.168.1.10-192.168.1.20 */
    
    @OpenAPIParam("IPRange")
    private String iPRangeParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 更新模式，指定更新的字段范围，IPRange仅更新IP范围，Device更新设备和VLAN，DHCPServerIP更新DHCP配置，DNS更新DNS配置，GatewayIP更新网关IP，All全部更新；不指定时默认IPRange */
    
    @OpenAPIParam("UpdateMode")
    private String updateModeParam;

    /** VLAN标识，更新网络的VLAN隔离标记，可选，取值范围1-4094，不传或传0表示不设置VLAN */
    
    @OpenAPIParam("Vlan")
    private String vlanParam;


    public String getDHCPServerIP() {
        return dHCPServerIPParam;
    }

    public void setDHCPServerIP(String dHCPServerIPParam) {
        this.dHCPServerIPParam = dHCPServerIPParam;
    }

    public String getDNS() {
        return dNSParam;
    }

    public void setDNS(String dNSParam) {
        this.dNSParam = dNSParam;
    }

    public String getDevice() {
        return deviceParam;
    }

    public void setDevice(String deviceParam) {
        this.deviceParam = deviceParam;
    }

    public String getFlatNetworkID() {
        return flatNetworkIDParam;
    }

    public void setFlatNetworkID(String flatNetworkIDParam) {
        this.flatNetworkIDParam = flatNetworkIDParam;
    }

    public String getGatewayIP() {
        return gatewayIPParam;
    }

    public void setGatewayIP(String gatewayIPParam) {
        this.gatewayIPParam = gatewayIPParam;
    }

    public String getIPRange() {
        return iPRangeParam;
    }

    public void setIPRange(String iPRangeParam) {
        this.iPRangeParam = iPRangeParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getUpdateMode() {
        return updateModeParam;
    }

    public void setUpdateMode(String updateModeParam) {
        this.updateModeParam = updateModeParam;
    }

    public String getVlan() {
        return vlanParam;
    }

    public void setVlan(String vlanParam) {
        this.vlanParam = vlanParam;
    }

}
