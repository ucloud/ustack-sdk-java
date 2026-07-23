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

public class NATGWRuleInfo {

    /** SNAT源地址，SNAT规则的源地址，VM类型时为IP地址，VPC/Subnet类型时为CIDR */
    @SerializedName("Address")
    private String addressParam;

    /** 绑定资源ID，SNAT规则绑定的资源唯一标识（VMID、VPCID或SubnetID） */
    @SerializedName("BindResourceID")
    private String bindResourceIDParam;

    /** 绑定资源名称，用于展示绑定资源名称 */
    @SerializedName("BindResourceName")
    private String bindResourceNameParam;

    /** 绑定资源类型，SNAT规则绑定的资源类型，取值范围：VM（虚拟机）、VPC（虚拟私有云）、Subnet（子网） */
    @SerializedName("BindResourceType")
    private String bindResourceTypeParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 外网IP地址，SNAT规则使用的EIP地址 */
    @SerializedName("EIP")
    private String eIPParam;

    /** EIP详情列表，SNAT规则使用的EIP详细信息 */
    @SerializedName("EIPInfos")
    private List<NATGWEIPInfo> eIPInfosParam;

    /** NAT网关ID，用于标识SNAT规则所属的NAT网关实例 */
    @SerializedName("NATGWID")
    private String nATGWIDParam;

    /** SNAT规则ID，用于标识SNAT规则 */
    @SerializedName("RuleID")
    private String ruleIDParam;

    /** SNAT规则状态，规则当前状态，Running会兼容为Available */
    @SerializedName("RuleStatus")
    private String ruleStatusParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public String getAddress() {
        return addressParam;
    }

    public void setAddress(String addressParam) {
        this.addressParam = addressParam;
    }

    public String getBindResourceID() {
        return bindResourceIDParam;
    }

    public void setBindResourceID(String bindResourceIDParam) {
        this.bindResourceIDParam = bindResourceIDParam;
    }

    public String getBindResourceName() {
        return bindResourceNameParam;
    }

    public void setBindResourceName(String bindResourceNameParam) {
        this.bindResourceNameParam = bindResourceNameParam;
    }

    public String getBindResourceType() {
        return bindResourceTypeParam;
    }

    public void setBindResourceType(String bindResourceTypeParam) {
        this.bindResourceTypeParam = bindResourceTypeParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getEIP() {
        return eIPParam;
    }

    public void setEIP(String eIPParam) {
        this.eIPParam = eIPParam;
    }

    public List<NATGWEIPInfo> getEIPInfos() {
        return eIPInfosParam;
    }

    public void setEIPInfos(List<NATGWEIPInfo> eIPInfosParam) {
        this.eIPInfosParam = eIPInfosParam;
    }

    public String getNATGWID() {
        return nATGWIDParam;
    }

    public void setNATGWID(String nATGWIDParam) {
        this.nATGWIDParam = nATGWIDParam;
    }

    public String getRuleID() {
        return ruleIDParam;
    }

    public void setRuleID(String ruleIDParam) {
        this.ruleIDParam = ruleIDParam;
    }

    public String getRuleStatus() {
        return ruleStatusParam;
    }

    public void setRuleStatus(String ruleStatusParam) {
        this.ruleStatusParam = ruleStatusParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
