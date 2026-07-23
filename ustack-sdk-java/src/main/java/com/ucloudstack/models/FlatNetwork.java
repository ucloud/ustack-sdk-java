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

public class FlatNetwork {

    /** 可用IP数量，剩余可分配的IP地址数 */
    @SerializedName("AvailableCount")
    private Integer availableCountParam;

    /** 网段CIDR，网络的IP地址范围 */
    @SerializedName("CIDR")
    private String cIDRParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** DHCP服务器IP地址，DHCP服务监听的IP */
    @SerializedName("DHCPServerIP")
    private String dHCPServerIPParam;

    /** DNS配置，DNS服务器地址列表，多个地址用逗号分隔 */
    @SerializedName("DNS")
    private String dNSParam;

    /** 备注信息，网络的用途说明 */
    @SerializedName("Description")
    private String descriptionParam;

    /** 物理网卡设备名称，绑定的物理网络接口 */
    @SerializedName("Device")
    private String deviceParam;

    /** 是否开启DHCP服务，启用后自动分配IP */
    @SerializedName("EnableDHCP")
    private Boolean enableDHCPParam;

    /** 扁平网络ID，网络的唯一标识 */
    @SerializedName("FlatNetworkID")
    private String flatNetworkIDParam;

    /** 网关IP地址，网络的默认网关IP */
    @SerializedName("GatewayIP")
    private String gatewayIPParam;

    /** 可用IP范围，可分配的IP地址段 */
    @SerializedName("IPRanges")
    private String iPRangesParam;

    /** IP协议版本，IPv4或IPv6 */
    @SerializedName("IPVersion")
    private String iPVersionParam;

    /** 扁平网络名称，用于标识网络资源 */
    @SerializedName("Name")
    private String nameParam;

    /** 权限配置，all表示所有租户可用，租户ID列表表示仅指定租户可用 */
    @SerializedName("Permission")
    private String permissionParam;

    /** 权限模式，控制租户访问权限的模式，可选值：all（所有租户可用）、whitelist（白名单，仅指定租户可用）、blacklist（黑名单，仅指定租户不可用） */
    @SerializedName("PermissionMode")
    private String permissionModeParam;

    /** 是否为平台专用，true表示平台内部使用的网络 */
    @SerializedName("Platform")
    private Boolean platformParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 路由配置，默认路由或路由目标列表 */
    @SerializedName("Routing")
    private String routingParam;

    /** 资源生命周期状态，当资源状态非Available时返回资源状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 标签列表，资源的标记和分类信息 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 已用IP数量，已分配的IP地址数 */
    @SerializedName("UsedCount")
    private Integer usedCountParam;

    /** VLAN标识，网络隔离标记，可选，取值范围1-4094，不传或传0表示不设置VLAN */
    @SerializedName("Vlan")
    private String vlanParam;


    public Integer getAvailableCount() {
        return availableCountParam;
    }

    public void setAvailableCount(Integer availableCountParam) {
        this.availableCountParam = availableCountParam;
    }

    public String getCIDR() {
        return cIDRParam;
    }

    public void setCIDR(String cIDRParam) {
        this.cIDRParam = cIDRParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
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

    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
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

    public String getIPRanges() {
        return iPRangesParam;
    }

    public void setIPRanges(String iPRangesParam) {
        this.iPRangesParam = iPRangesParam;
    }

    public String getIPVersion() {
        return iPVersionParam;
    }

    public void setIPVersion(String iPVersionParam) {
        this.iPVersionParam = iPVersionParam;
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

    public Boolean getPlatform() {
        return platformParam;
    }

    public void setPlatform(Boolean platformParam) {
        this.platformParam = platformParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRegionAlias() {
        return regionAliasParam;
    }

    public void setRegionAlias(String regionAliasParam) {
        this.regionAliasParam = regionAliasParam;
    }

    public String getRouting() {
        return routingParam;
    }

    public void setRouting(String routingParam) {
        this.routingParam = routingParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public Integer getUsedCount() {
        return usedCountParam;
    }

    public void setUsedCount(Integer usedCountParam) {
        this.usedCountParam = usedCountParam;
    }

    public String getVlan() {
        return vlanParam;
    }

    public void setVlan(String vlanParam) {
        this.vlanParam = vlanParam;
    }

}
