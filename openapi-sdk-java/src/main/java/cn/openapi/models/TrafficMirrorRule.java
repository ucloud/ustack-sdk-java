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

public class TrafficMirrorRule {

    /** 规则动作，可能值：Accept开启镜像、Drop丢弃不镜像 */
    @SerializedName("Action")
    private String actionParam;

    /** 目标网络地址，支持IPv4地址或IPv4 CIDR，必须与源网络保持一致的IP类型，否则返回StatusRuleCIDRTypeMismatch */
    @SerializedName("DstNetwork")
    private String dstNetworkParam;

    /** 目标端口范围，支持单个端口或范围，需满足1-65535且起始<=结束；当协议为ARP、ICMP、ALL时可留空 */
    @SerializedName("DstPortRange")
    private String dstPortRangeParam;

    /** 优先级，取值范围10-10000，数值越小优先级越高，同一方向内的优先级不能重复 */
    @SerializedName("Priority")
    private Integer priorityParam;

    /** 协议类型，取值：TCP、UDP、ICMP、ARP、ALL（所有协议） */
    @SerializedName("ProtocolType")
    private String protocolTypeParam;

    /** 源网络地址，支持IPv4地址或IPv4 CIDR，必须与目标网络保持相同的IP类型，不符合时会返回StatusRuleCIDRTypeMismatch（IPv6暂未开放，传入会返回StatusRuleProtocolNotSupportIPv6） */
    @SerializedName("SrcNetwork")
    private String srcNetworkParam;

    /** 源端口范围，支持单个端口（如80）或范围（如1-65535），需满足1-65535且起始<=结束；当协议为ARP、ICMP、ALL时可留空 */
    @SerializedName("SrcPortRange")
    private String srcPortRangeParam;


    public String getAction() {
        return actionParam;
    }

    public void setAction(String actionParam) {
        this.actionParam = actionParam;
    }

    public String getDstNetwork() {
        return dstNetworkParam;
    }

    public void setDstNetwork(String dstNetworkParam) {
        this.dstNetworkParam = dstNetworkParam;
    }

    public String getDstPortRange() {
        return dstPortRangeParam;
    }

    public void setDstPortRange(String dstPortRangeParam) {
        this.dstPortRangeParam = dstPortRangeParam;
    }

    public Integer getPriority() {
        return priorityParam;
    }

    public void setPriority(Integer priorityParam) {
        this.priorityParam = priorityParam;
    }

    public String getProtocolType() {
        return protocolTypeParam;
    }

    public void setProtocolType(String protocolTypeParam) {
        this.protocolTypeParam = protocolTypeParam;
    }

    public String getSrcNetwork() {
        return srcNetworkParam;
    }

    public void setSrcNetwork(String srcNetworkParam) {
        this.srcNetworkParam = srcNetworkParam;
    }

    public String getSrcPortRange() {
        return srcPortRangeParam;
    }

    public void setSrcPortRange(String srcPortRangeParam) {
        this.srcPortRangeParam = srcPortRangeParam;
    }

}
