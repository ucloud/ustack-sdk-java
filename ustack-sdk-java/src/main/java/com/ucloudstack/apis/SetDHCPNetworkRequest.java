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

public class SetDHCPNetworkRequest extends Request {

    /** 探测 IP，绑定到 lo */
    @NotEmpty
    @OpenAPIParam("EndIP")
    private String endIPParam;

    /** 配置模式：single=单网段，multi=多网段（DHCP Relay） */
    @NotEmpty
    @OpenAPIParam("Mode")
    private String modeParam;

    /** DHCP Server 所在网段 CIDR，如 192.170.60.64/28 */
    @NotEmpty
    @OpenAPIParam("Network")
    private String networkParam;

    /** 新增网段地址池列表 */
    
    @OpenAPIParam("PoolCreates")
    private List<DHCPPoolCreate> poolCreatesParam;

    /** 删除网段地址池 ID 列表 */
    
    @OpenAPIParam("PoolDeleteIDs")
    private List<Integer> poolDeleteIDsParam;

    /** 地址池开关批量更新 */
    
    @OpenAPIParam("PoolEnabledUpdates")
    private List<DHCPPoolEnabledUpdate> poolEnabledUpdatesParam;

    /** 单网段模式地址池结束 IP */
    
    @OpenAPIParam("PoolEndIP")
    private String poolEndIPParam;

    /** 单网段模式地址池起始 IP */
    
    @OpenAPIParam("PoolStartIP")
    private String poolStartIPParam;

    /** 修改网段地址池列表 */
    
    @OpenAPIParam("PoolUpdates")
    private List<DHCPPoolUpdate> poolUpdatesParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** DHCP Server IP，绑定到 bond0 */
    @NotEmpty
    @OpenAPIParam("StartIP")
    private String startIPParam;

    /** VLAN ID */
    
    @OpenAPIParam("VLANID")
    private Integer vLANIDParam;


    public String getEndIP() {
        return endIPParam;
    }

    public void setEndIP(String endIPParam) {
        this.endIPParam = endIPParam;
    }

    public String getMode() {
        return modeParam;
    }

    public void setMode(String modeParam) {
        this.modeParam = modeParam;
    }

    public String getNetwork() {
        return networkParam;
    }

    public void setNetwork(String networkParam) {
        this.networkParam = networkParam;
    }

    public List<DHCPPoolCreate> getPoolCreates() {
        return poolCreatesParam;
    }

    public void setPoolCreates(List<DHCPPoolCreate> poolCreatesParam) {
        this.poolCreatesParam = poolCreatesParam;
    }

    public List<Integer> getPoolDeleteIDs() {
        return poolDeleteIDsParam;
    }

    public void setPoolDeleteIDs(List<Integer> poolDeleteIDsParam) {
        this.poolDeleteIDsParam = poolDeleteIDsParam;
    }

    public List<DHCPPoolEnabledUpdate> getPoolEnabledUpdates() {
        return poolEnabledUpdatesParam;
    }

    public void setPoolEnabledUpdates(List<DHCPPoolEnabledUpdate> poolEnabledUpdatesParam) {
        this.poolEnabledUpdatesParam = poolEnabledUpdatesParam;
    }

    public String getPoolEndIP() {
        return poolEndIPParam;
    }

    public void setPoolEndIP(String poolEndIPParam) {
        this.poolEndIPParam = poolEndIPParam;
    }

    public String getPoolStartIP() {
        return poolStartIPParam;
    }

    public void setPoolStartIP(String poolStartIPParam) {
        this.poolStartIPParam = poolStartIPParam;
    }

    public List<DHCPPoolUpdate> getPoolUpdates() {
        return poolUpdatesParam;
    }

    public void setPoolUpdates(List<DHCPPoolUpdate> poolUpdatesParam) {
        this.poolUpdatesParam = poolUpdatesParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getStartIP() {
        return startIPParam;
    }

    public void setStartIP(String startIPParam) {
        this.startIPParam = startIPParam;
    }

    public Integer getVLANID() {
        return vLANIDParam;
    }

    public void setVLANID(Integer vLANIDParam) {
        this.vLANIDParam = vLANIDParam;
    }

}
