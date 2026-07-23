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

public class SGRuleInfo {

    /** 目标端口，规则匹配的目标端口号或端口范围 */
    @SerializedName("DstPort")
    private String dstPortParam;

    /** IP组ID，当规则引用IP组时的IP组唯一标识符 */
    @SerializedName("IPGroupID")
    private String iPGroupIDParam;

    /** IP组名称 */
    @SerializedName("IPGroupName")
    private String iPGroupNameParam;

    /** IP组规则内容，IP组包含的IP地址列表 */
    @SerializedName("IPGroupRules")
    private String iPGroupRulesParam;

    /** 流量方向，取值1为入站、0为出站 */
    @SerializedName("IsIn")
    private String isInParam;

    /** 端口组ID，当规则引用端口组时的端口组唯一标识符 */
    @SerializedName("PortGroupID")
    private String portGroupIDParam;

    /** 端口组名称 */
    @SerializedName("PortGroupName")
    private String portGroupNameParam;

    /** 端口组规则内容，端口组包含的协议与端口组合 */
    @SerializedName("PortGroupRules")
    private String portGroupRulesParam;

    /** 优先级，取值HIGH/MEDIUM/LOW */
    @SerializedName("Priority")
    private String priorityParam;

    /** 项目ID */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 协议类型，支持TCP/UDP/ICMP/ICMPv4/ICMPv6/ALL */
    @SerializedName("ProtocolType")
    private String protocolTypeParam;

    /** 备注，规则的补充说明信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 规则动作，取值ACCEPT（允许通过）或DROP（拒绝并丢弃） */
    @SerializedName("RuleAction")
    private String ruleActionParam;

    /** 规则ID，安全组规则的唯一标识符 */
    @SerializedName("RuleID")
    private String ruleIDParam;

    /** 安全组ID，规则所属的安全组唯一标识符 */
    @SerializedName("SGID")
    private String sGIDParam;

    /** 源IP地址，规则匹配的源IP地址或CIDR地址段 */
    @SerializedName("SrcIP")
    private String srcIPParam;

    /** 规则状态，安全组规则的当前状态 */
    @SerializedName("State")
    private String stateParam;


    public String getDstPort() {
        return dstPortParam;
    }

    public void setDstPort(String dstPortParam) {
        this.dstPortParam = dstPortParam;
    }

    public String getIPGroupID() {
        return iPGroupIDParam;
    }

    public void setIPGroupID(String iPGroupIDParam) {
        this.iPGroupIDParam = iPGroupIDParam;
    }

    public String getIPGroupName() {
        return iPGroupNameParam;
    }

    public void setIPGroupName(String iPGroupNameParam) {
        this.iPGroupNameParam = iPGroupNameParam;
    }

    public String getIPGroupRules() {
        return iPGroupRulesParam;
    }

    public void setIPGroupRules(String iPGroupRulesParam) {
        this.iPGroupRulesParam = iPGroupRulesParam;
    }

    public String getIsIn() {
        return isInParam;
    }

    public void setIsIn(String isInParam) {
        this.isInParam = isInParam;
    }

    public String getPortGroupID() {
        return portGroupIDParam;
    }

    public void setPortGroupID(String portGroupIDParam) {
        this.portGroupIDParam = portGroupIDParam;
    }

    public String getPortGroupName() {
        return portGroupNameParam;
    }

    public void setPortGroupName(String portGroupNameParam) {
        this.portGroupNameParam = portGroupNameParam;
    }

    public String getPortGroupRules() {
        return portGroupRulesParam;
    }

    public void setPortGroupRules(String portGroupRulesParam) {
        this.portGroupRulesParam = portGroupRulesParam;
    }

    public String getPriority() {
        return priorityParam;
    }

    public void setPriority(String priorityParam) {
        this.priorityParam = priorityParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getProjectName() {
        return projectNameParam;
    }

    public void setProjectName(String projectNameParam) {
        this.projectNameParam = projectNameParam;
    }

    public String getProtocolType() {
        return protocolTypeParam;
    }

    public void setProtocolType(String protocolTypeParam) {
        this.protocolTypeParam = protocolTypeParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getRuleAction() {
        return ruleActionParam;
    }

    public void setRuleAction(String ruleActionParam) {
        this.ruleActionParam = ruleActionParam;
    }

    public String getRuleID() {
        return ruleIDParam;
    }

    public void setRuleID(String ruleIDParam) {
        this.ruleIDParam = ruleIDParam;
    }

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

    public String getSrcIP() {
        return srcIPParam;
    }

    public void setSrcIP(String srcIPParam) {
        this.srcIPParam = srcIPParam;
    }

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

}
