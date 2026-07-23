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

public class SegmentInfo {

    /** 可用IP数量，剩余可分配的IP地址总数 */
    @SerializedName("AvailableCount")
    private Integer availableCountParam;

    /** 已绑定的EIP数量，该外网线路中已绑定到资源的EIP总数，包括绑定到虚拟机、弹性网卡等资源的EIP */
    @SerializedName("BoundedEIPCount")
    private Integer boundedEIPCountParam;

    /** 创建时间，Unix时间戳（秒级） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** DHCP服务器IP地址，若启用DHCP则显示DHCP服务器的IP地址 */
    @SerializedName("DHCPServerIP")
    private String dHCPServerIPParam;

    /** 外网线路描述信息，即备注内容 */
    @SerializedName("Description")
    private String descriptionParam;

    /** 网卡名称，外网线路绑定的物理网卡标识 */
    @SerializedName("Device")
    private String deviceParam;

    /** 失败状态的EIP数量，该外网线路中处于Failed状态的EIP总数 */
    @SerializedName("FailedEIPCount")
    private Integer failedEIPCountParam;

    /** 网关地址，外网线路的默认网关IP */
    @SerializedName("Gateway")
    private String gatewayParam;

    /** 可用IP范围，网段内可分配的IP地址范围 */
    @SerializedName("IPRanges")
    private String iPRangesParam;

    /** IP版本，外网线路使用的IP协议版本，可选值：IPv4、IPv6 */
    @SerializedName("IPVersion")
    private String iPVersionParam;

    /** 外网线路名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 访问权限，该外网线路可以被哪些租户访问，值为all表示所有租户可用，否则为租户ID列表（逗号分隔） */
    @SerializedName("Permission")
    private String permissionParam;

    /** 权限模式，控制租户访问权限的模式，可选值：all（所有租户可用）、whitelist（白名单，仅指定租户可用）、blacklist（黑名单，仅指定租户不可用） */
    @SerializedName("PermissionMode")
    private String permissionModeParam;

    /** 是否为平台保留线路，true表示该线路为平台内部使用（如vm-taishan-app），不对外提供服务 */
    @SerializedName("Platform")
    private Boolean platformParam;

    /** 回收站中的EIP数量，该外网线路中处于Deleted或Terminating状态的EIP总数 */
    @SerializedName("RecycledEIPCount")
    private Integer recycledEIPCountParam;

    /** 地域ID，外网线路所属的物理区域标识 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 路由信息，外网线路的路由配置 */
    @SerializedName("Routing")
    private String routingParam;

    /** 外网网段，外网线路的网络地址范围，CIDR格式 */
    @SerializedName("Segment")
    private String segmentParam;

    /** 外网线路ID，资源的唯一标识，系统自动生成的14位随机字符串 */
    @SerializedName("SegmentID")
    private String segmentIDParam;

    /** 当前外网线路状态，如Available（可用）、Deleting（删除中）等 */
    @SerializedName("Status")
    private String statusParam;

    /** 标签列表，用于资源标记和分类管理 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，Unix时间戳（秒级） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 已用IP数量，已分配或占用的IP地址总数 */
    @SerializedName("UsedCount")
    private Integer usedCountParam;

    /** VLAN ID，虚拟局域网标识，可选，取值范围1-4094，不传或传0表示不设置VLAN */
    @SerializedName("Vlan")
    private String vlanParam;


    public Integer getAvailableCount() {
        return availableCountParam;
    }

    public void setAvailableCount(Integer availableCountParam) {
        this.availableCountParam = availableCountParam;
    }

    public Integer getBoundedEIPCount() {
        return boundedEIPCountParam;
    }

    public void setBoundedEIPCount(Integer boundedEIPCountParam) {
        this.boundedEIPCountParam = boundedEIPCountParam;
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

    public Integer getFailedEIPCount() {
        return failedEIPCountParam;
    }

    public void setFailedEIPCount(Integer failedEIPCountParam) {
        this.failedEIPCountParam = failedEIPCountParam;
    }

    public String getGateway() {
        return gatewayParam;
    }

    public void setGateway(String gatewayParam) {
        this.gatewayParam = gatewayParam;
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

    public Integer getRecycledEIPCount() {
        return recycledEIPCountParam;
    }

    public void setRecycledEIPCount(Integer recycledEIPCountParam) {
        this.recycledEIPCountParam = recycledEIPCountParam;
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

    public String getSegment() {
        return segmentParam;
    }

    public void setSegment(String segmentParam) {
        this.segmentParam = segmentParam;
    }

    public String getSegmentID() {
        return segmentIDParam;
    }

    public void setSegmentID(String segmentIDParam) {
        this.segmentIDParam = segmentIDParam;
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
