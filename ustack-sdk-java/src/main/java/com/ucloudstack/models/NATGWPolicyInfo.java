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

public class NATGWPolicyInfo {

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 目标IP，DNAT规则转发到的内网IP地址 */
    @SerializedName("DstIP")
    private String dstIPParam;

    /** 目标端口，DNAT规则转发到的内网端口 */
    @SerializedName("DstPort")
    private String dstPortParam;

    /** 目标虚拟机ID，DNAT规则转发到的虚拟机唯一标识 */
    @SerializedName("DstResourceID")
    private String dstResourceIDParam;

    /** NAT网关ID，用于标识DNAT规则所属的NAT网关实例 */
    @SerializedName("NATGWID")
    private String nATGWIDParam;

    /** DNAT规则ID，用于标识DNAT规则 */
    @SerializedName("PolicyID")
    private String policyIDParam;

    /** 规则状态，DNAT规则当前状态，Running会兼容为Available */
    @SerializedName("PolicyStatus")
    private String policyStatusParam;

    /** DNAT协议，DNAT规则使用的协议类型 */
    @SerializedName("Protocol")
    private String protocolParam;

    /** 源IP，DNAT规则使用的外网IP地址 */
    @SerializedName("SrcIP")
    private String srcIPParam;

    /** 源端口，DNAT规则的外网端口 */
    @SerializedName("SrcPort")
    private String srcPortParam;

    /** 规则状态，DNAT规则的当前状态（兼容字段） */
    @SerializedName("State")
    private String stateParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getDstIP() {
        return dstIPParam;
    }

    public void setDstIP(String dstIPParam) {
        this.dstIPParam = dstIPParam;
    }

    public String getDstPort() {
        return dstPortParam;
    }

    public void setDstPort(String dstPortParam) {
        this.dstPortParam = dstPortParam;
    }

    public String getDstResourceID() {
        return dstResourceIDParam;
    }

    public void setDstResourceID(String dstResourceIDParam) {
        this.dstResourceIDParam = dstResourceIDParam;
    }

    public String getNATGWID() {
        return nATGWIDParam;
    }

    public void setNATGWID(String nATGWIDParam) {
        this.nATGWIDParam = nATGWIDParam;
    }

    public String getPolicyID() {
        return policyIDParam;
    }

    public void setPolicyID(String policyIDParam) {
        this.policyIDParam = policyIDParam;
    }

    public String getPolicyStatus() {
        return policyStatusParam;
    }

    public void setPolicyStatus(String policyStatusParam) {
        this.policyStatusParam = policyStatusParam;
    }

    public String getProtocol() {
        return protocolParam;
    }

    public void setProtocol(String protocolParam) {
        this.protocolParam = protocolParam;
    }

    public String getSrcIP() {
        return srcIPParam;
    }

    public void setSrcIP(String srcIPParam) {
        this.srcIPParam = srcIPParam;
    }

    public String getSrcPort() {
        return srcPortParam;
    }

    public void setSrcPort(String srcPortParam) {
        this.srcPortParam = srcPortParam;
    }

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
