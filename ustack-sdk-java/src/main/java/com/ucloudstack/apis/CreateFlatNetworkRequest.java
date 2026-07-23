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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateFlatNetworkRequest extends Request {

    /** 网段CIDR，定义扁平网络的IP地址范围 */
    
    @OpenAPIParam("CIDR")
    private String cIDRParam;

    /** DHCP服务器IP地址，指定DHCP服务监听的IP地址，启用DHCP时建议传入，不启用时为空 */
    
    @OpenAPIParam("DHCPServerIP")
    private String dHCPServerIPParam;

    /** DNS配置，指定DNS服务器地址，多个服务器用逗号分隔，格式为IP地址列表 */
    
    @OpenAPIParam("DNS")
    private String dNSParam;

    /** 物理网卡设备名称，指定扁平网络绑定的物理网络接口 */
    @NotEmpty
    @OpenAPIParam("Device")
    private String deviceParam;

    /** 是否开启DHCP服务，启用后将为接入网络的主机自动分配IP地址 */
    
    @OpenAPIParam("EnableDHCP")
    private Boolean enableDHCPParam;

    /** 网关IP地址，指定网络的默认网关IP，必须在网段CIDR范围内 */
    
    @OpenAPIParam("GatewayIP")
    private String gatewayIPParam;

    /** 可用IP范围，指定从网段中可分配的IP地址范围，支持多个范围用逗号分隔，格式为192.168.1.10-192.168.1.20 */
    
    @OpenAPIParam("IPRange")
    private String iPRangeParam;

    /** 扁平网络名称，用于标识扁平网络资源，长度为1-128个字符，名称只能包含中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 权限配置，指定可访问该扁平网络的租户范围；传all表示所有租户可用，传租户ID列表(逗号分隔)表示仅指定租户可用 */
    @NotEmpty
    @OpenAPIParam("Permission")
    private String permissionParam;

    /** 权限模式，控制租户访问权限的模式，可选值：all（所有租户可用，默认值）、whitelist（白名单，仅指定租户可用）、blacklist（黑名单，仅指定租户不可用） */
    
    @OpenAPIParam("PermissionMode")
    private String permissionModeParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注信息，用于说明和注释，长度0-100字符，禁止http://或https://等非法字符 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 标签键值对，格式为Base64编码的key:value字符串，用于资源标记和分类管理 */
    
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** VLAN标识，用于网络隔离和流量标记，可选，取值范围1-4094，不传或传0表示不设置VLAN */
    
    @OpenAPIParam("Vlan")
    private String vlanParam;


    public String getCIDR() {
        return cIDRParam;
    }

    public void setCIDR(String cIDRParam) {
        this.cIDRParam = cIDRParam;
    }

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

    public Boolean getEnableDHCP() {
        return enableDHCPParam;
    }

    public void setEnableDHCP(Boolean enableDHCPParam) {
        this.enableDHCPParam = enableDHCPParam;
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

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPermission() {
        return permissionParam;
    }

    public void setPermission(String permissionParam) {
        this.permissionParam = permissionParam;
    }

    public String getPermissionMode() {
        return permissionModeParam;
    }

    public void setPermissionMode(String permissionModeParam) {
        this.permissionModeParam = permissionModeParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

    public String getVlan() {
        return vlanParam;
    }

    public void setVlan(String vlanParam) {
        this.vlanParam = vlanParam;
    }

}
