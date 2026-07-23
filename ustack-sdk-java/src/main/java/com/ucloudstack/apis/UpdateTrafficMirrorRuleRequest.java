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

public class UpdateTrafficMirrorRuleRequest extends Request {

    /** 流量方向，指定本次规则覆盖的方向，取值范围：Ingress（替换入方向规则）、Egress（替换出方向规则） */
    @NotEmpty
    @UCloudStackParam("Direction")
    private String directionParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 规则信息列表，JSON格式字符串数组，每个元素需包含action（取值Accept或Drop）、protocol（取值TCP、UDP、ICMP、ARP、ALL）、srcNetwork/dstNetwork（支持IPv4地址或CIDR，源与目的必须是相同的IP类型，当前IPv6暂未开放，违反时分别返回StatusRuleCIDRTypeMismatch或StatusRuleProtocolNotSupportIPv6错误）、srcPortRange/dstPortRange（端口号或1-65535范围，ARP/ICMP/ALL可留空，其他协议必填）以及Priority（优先级10-10000，数值越小优先级越高，重复会返回StatusRulePriorityDuplicate），该列表会完全覆盖指定方向的旧规则，传空数组可清空规则 */
    
    @UCloudStackParam("Rules")
    private List<String> rulesParam;

    /** 流量镜像ID，待更新的流量镜像唯一标识符，资源状态必须为Available，执行更新前会自动剔除已解绑或已删除虚拟机对应的源设备，若剔除后没有可用源设备会返回StatusNoAvailableSrcDevice错误 */
    @NotEmpty
    @UCloudStackParam("TrafficMirrorID")
    private String trafficMirrorIDParam;


    public String getDirection() {
        return directionParam;
    }

    public void setDirection(String directionParam) {
        this.directionParam = directionParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getRules() {
        return rulesParam;
    }

    public void setRules(List<String> rulesParam) {
        this.rulesParam = rulesParam;
    }

    public String getTrafficMirrorID() {
        return trafficMirrorIDParam;
    }

    public void setTrafficMirrorID(String trafficMirrorIDParam) {
        this.trafficMirrorIDParam = trafficMirrorIDParam;
    }

}
