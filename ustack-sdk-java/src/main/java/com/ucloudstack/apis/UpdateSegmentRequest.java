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

public class UpdateSegmentRequest extends Request {

    /** DHCP服务器IP地址，必须在网段内，传值表示启用DHCP，传空表示禁用DHCP，仅在UpdateMode为DHCPServerIP或All时生效 */
    
    @OpenAPIParam("DHCPServerIP")
    private String dHCPServerIPParam;

    /** 网卡名称，指定外网线路绑定的物理网卡，格式为bond0、bond1等，仅在UpdateMode为Device或All时生效 */
    
    @OpenAPIParam("Device")
    private String deviceParam;

    /** 可用IP范围，指定网段内可分配的IP地址范围，格式为起始IP-结束IP，仅在UpdateMode为IPRange或All时生效 */
    
    @OpenAPIParam("IPRange")
    private String iPRangeParam;

    /** 地域ID，指定要更新的外网线路所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 外网线路ID，指定要更新的外网线路资源ID */
    @NotEmpty
    @OpenAPIParam("SegmentID")
    private String segmentIDParam;

    /** 更新模式，指定要更新的字段范围，可选值：IPRange（仅更新IP范围）、Device（仅更新网卡和VLAN）、DHCPServerIP（仅更新DHCP服务器IP）、All（更新所有字段），若不指定则默认为IPRange，这是为了向前兼容 */
    
    @OpenAPIParam("UpdateMode")
    private String updateModeParam;

    /** VLAN ID，虚拟局域网标识，可选，取值范围1-4094，不传或传0表示不设置VLAN，仅在UpdateMode为Device或All时生效 */
    
    @OpenAPIParam("Vlan")
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

    public String getSegmentID() {
        return segmentIDParam;
    }

    public void setSegmentID(String segmentIDParam) {
        this.segmentIDParam = segmentIDParam;
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
