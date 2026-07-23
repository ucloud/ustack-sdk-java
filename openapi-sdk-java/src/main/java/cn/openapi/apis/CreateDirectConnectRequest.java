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
package cn.openapi.apis;

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class CreateDirectConnectRequest extends Request {

    /** 带宽限制，单位为Mbps，取值范围：1-20000，实际不超过物理带宽上限 */
    
    @OpenAPIParam("Bandwidth")
    private Integer bandwidthParam;

    /** 网卡名称，指定专线接入绑定的物理网卡，格式为bond0、bond1等，若不确定请联系部署人员或网络管理员 */
    @NotEmpty
    @OpenAPIParam("Device")
    private String deviceParam;

    /** 本端网关IP，UCloudStack侧网络接口互联的带掩码IP地址，必须为CIDR格式 */
    @NotEmpty
    @OpenAPIParam("LocalGatewayIP")
    private String localGatewayIPParam;

    /** 专线接入名称，长度为1-50个字符，名称只能包含中英文、数字、点（.）、下划线（_）和中划线（-） */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 权限范围，指定该专线接入的租户访问权限，当PermissionMode为whitelist或blacklist时，传入租户ID列表（逗号分隔，如200000230,200000232） */
    
    @OpenAPIParam("Permission")
    private String permissionParam;

    /** 权限模式，控制租户访问权限的模式，可选值：all（所有租户可用，默认值）、whitelist（白名单，仅指定租户可用）、blacklist（黑名单，仅指定租户不可用） */
    
    @OpenAPIParam("PermissionMode")
    private String permissionModeParam;

    /** 地域ID，指定专线接入所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 远端网关IP，用户本地数据中心侧网络的互联的带掩码IP地址，必须为CIDR格式，且必须与本端网关在同一网段 */
    @NotEmpty
    @OpenAPIParam("RemoteGatewayIP")
    private String remoteGatewayIPParam;

    /** 远端子网网段列表，用户数据中心需要通过专线互连的网段，必须为CIDR格式 */
    @NotEmpty
    @OpenAPIParam("RemoteSubnetCIDRs")
    private List<String> remoteSubnetCIDRsParam;

    /** 标签键值对，用于资源标记和分类管理，格式为key:value的字符串，传入Base64编码的字符串 */
    @NotEmpty
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** VLAN ID，虚拟局域网标识，可选，取值范围1-4094，不传或传0表示不设置VLAN */
    
    @OpenAPIParam("VLAN")
    private String vLANParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public String getDevice() {
        return deviceParam;
    }

    public void setDevice(String deviceParam) {
        this.deviceParam = deviceParam;
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

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

    public String getVLAN() {
        return vLANParam;
    }

    public void setVLAN(String vLANParam) {
        this.vLANParam = vLANParam;
    }

}
