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
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateSegmentRequest extends Request {

    /** DHCP服务器IP地址，必须在指定的网段内，传值表示启用DHCP，传空表示禁用DHCP */
    
    @UCloudStackParam("DHCPServerIP")
    private String dHCPServerIPParam;

    /** 网卡名称，指定外网线路绑定的物理网卡，格式为bond0、bond1等，若不确定请联系部署人员或网络管理员 */
    @NotEmpty
    @UCloudStackParam("Device")
    private String deviceParam;

    /** 是否启用DHCP服务，用于为虚拟机自动分配IP地址 */
    
    @UCloudStackParam("EnableDHCP")
    private Boolean enableDHCPParam;

    /** 可用IP范围，指定网段内可分配的IP地址范围，格式为起始IP-结束IP，若不指定则使用整个网段 */
    
    @UCloudStackParam("IPRange")
    private String iPRangeParam;

    /** 外网线路名称，长度为1-50个字符，名称只能包含中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** 权限范围，指定该外网线路的租户访问权限，当PermissionMode为whitelist或blacklist时，传入租户ID列表（逗号分隔，如200000230,200000232） */
    
    @UCloudStackParam("Permission")
    private String permissionParam;

    /** 权限模式，控制租户访问权限的模式，可选值：all（所有租户可用，默认值）、whitelist（白名单，仅指定租户可用）、blacklist（黑名单，仅指定租户不可用） */
    
    @UCloudStackParam("PermissionMode")
    private String permissionModeParam;

    /** 地域ID，指定外网线路所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 外网网段，指定外网线路的网络地址范围，必须为CIDR格式，支持IPv4和IPv6 */
    @NotEmpty
    @UCloudStackParam("Segment")
    private String segmentParam;

    /** 标签键值对，用于资源标记和分类管理，格式为key:value的字符串，传入Base64编码的字符串 */
    @NotEmpty
    @UCloudStackParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** VLAN ID，虚拟局域网标识，可选，取值范围1-4094，不传或传0表示不设置VLAN */
    
    @UCloudStackParam("Vlan")
    private String vlanParam;


    public String getDHCPServerIP() {
        return dHCPServerIPParam;
    }

    public void setDHCPServerIP(String dHCPServerIPParam) {
        this.dHCPServerIPParam = dHCPServerIPParam;
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

    public String getSegment() {
        return segmentParam;
    }

    public void setSegment(String segmentParam) {
        this.segmentParam = segmentParam;
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
