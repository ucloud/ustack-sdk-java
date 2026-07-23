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

public class DirectConnectDetailInfo {

    /** 带宽限制，单位为Mbps */
    @SerializedName("Bandwidth")
    private Integer bandwidthParam;

    /** 创建时间，Unix时间戳（秒级） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 网卡名称，专线接入绑定的物理网卡标识 */
    @SerializedName("Device")
    private String deviceParam;

    /** 专线接入ID，资源的唯一标识，系统自动生成的14位随机字符串 */
    @SerializedName("DirectConnectID")
    private String directConnectIDParam;

    /** 本端网关IP，UCloudStack侧网络接口互联的带掩码IP地址 */
    @SerializedName("LocalGatewayIP")
    private String localGatewayIPParam;

    /** 专线接入名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 访问权限，该专线接入可以被哪些租户访问，值为all表示所有租户可用，否则为租户ID列表（逗号分隔） */
    @SerializedName("Permission")
    private String permissionParam;

    /** 权限模式，控制租户访问权限的模式，可选值：all（所有租户可用）、whitelist（白名单，仅指定租户可用）、blacklist（黑名单，仅指定租户不可用） */
    @SerializedName("PermissionMode")
    private String permissionModeParam;

    /** 地域ID，专线接入所属的物理区域标识 */
    @SerializedName("Region")
    private String regionParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 远端网关IP，用户本地数据中心侧网络的互联的带掩码IP地址 */
    @SerializedName("RemoteGatewayIP")
    private String remoteGatewayIPParam;

    /** 远端子网网段列表，用户数据中心通过专线互连的网段列表 */
    @SerializedName("RemoteSubnetCIDRs")
    private List<String> remoteSubnetCIDRsParam;

    /** 当前专线接入状态，如Available（可用）、Deleting（删除中）等 */
    @SerializedName("Status")
    private String statusParam;

    /** 标签列表，用于资源标记和分类管理 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，Unix时间戳（秒级） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** VLAN ID，虚拟局域网标识，可选，取值范围1-4094，不传或传0表示不设置VLAN */
    @SerializedName("VLAN")
    private String vLANParam;

    /** 关联的VPC信息列表，与该专线接入建立对等连接的VPC资源信息 */
    @SerializedName("VPCInfos")
    private List<VPCInfo> vPCInfosParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getDevice() {
        return deviceParam;
    }

    public void setDevice(String deviceParam) {
        this.deviceParam = deviceParam;
    }

    public String getDirectConnectID() {
        return directConnectIDParam;
    }

    public void setDirectConnectID(String directConnectIDParam) {
        this.directConnectIDParam = directConnectIDParam;
    }

    public String getLocalGatewayIP() {
        return localGatewayIPParam;
    }

    public void setLocalGatewayIP(String localGatewayIPParam) {
        this.localGatewayIPParam = localGatewayIPParam;
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

    public String getRemoteGatewayIP() {
        return remoteGatewayIPParam;
    }

    public void setRemoteGatewayIP(String remoteGatewayIPParam) {
        this.remoteGatewayIPParam = remoteGatewayIPParam;
    }

    public List<String> getRemoteSubnetCIDRs() {
        return remoteSubnetCIDRsParam;
    }

    public void setRemoteSubnetCIDRs(List<String> remoteSubnetCIDRsParam) {
        this.remoteSubnetCIDRsParam = remoteSubnetCIDRsParam;
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

    public String getVLAN() {
        return vLANParam;
    }

    public void setVLAN(String vLANParam) {
        this.vLANParam = vLANParam;
    }

    public List<VPCInfo> getVPCInfos() {
        return vPCInfosParam;
    }

    public void setVPCInfos(List<VPCInfo> vPCInfosParam) {
        this.vPCInfosParam = vPCInfosParam;
    }

}
