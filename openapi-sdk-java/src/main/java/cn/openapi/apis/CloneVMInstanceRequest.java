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

public class CloneVMInstanceRequest extends Request {

    /** 审批名称，启用审批流程时的标题 */
    
    @OpenAPIParam("ApplicationName")
    private String applicationNameParam;

    /** 审批理由，启用审批流程时的说明 */
    
    @OpenAPIParam("ApplicationReason")
    private String applicationReasonParam;

    /** 外网带宽，新虚拟机的带宽上限，单位：Mbps */
    
    @OpenAPIParam("Bandwidth")
    private Integer bandwidthParam;

    /** 核心数，新虚拟机的vCPU核心数量 */
    @NotEmpty
    @OpenAPIParam("CPU")
    private Integer cPUParam;

    /** 计费类型，新虚拟机的计费模式，取值：Dynamic、Month、Year */
    @NotEmpty
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 租户邮箱，归属租户的联系电子邮箱 */
    
    @OpenAPIParam("Email")
    private String emailParam;

    /** 扁平网络ID，指定扁平网络，与OperatorName互斥 */
    
    @OpenAPIParam("FlatNetworkID")
    private String flatNetworkIDParam;

    /** IP版本，新虚拟机使用的IP协议版本，取值：IPv4、IPv6 */
    
    @OpenAPIParam("IPVersion")
    private String iPVersionParam;

    /** 内网IP，指定新虚拟机的内网IP地址，留空则自动分配 */
    
    @OpenAPIParam("InternalIP")
    private String internalIPParam;

    /** 外网IP，指定新虚拟机的外网IP地址，留空则自动分配 */
    
    @OpenAPIParam("InternetIP")
    private String internetIPParam;

    /** 入向带宽限制，第一张网卡的入向平均带宽限制，单位：Mbps，0表示不限制 */
    
    @OpenAPIParam("LANInAverageBandwidth")
    private Integer lANInAverageBandwidthParam;

    /** 内网MAC，指定新虚拟机的内网MAC地址，留空则自动生成 */
    
    @OpenAPIParam("LANMAC")
    private String lANMACParam;

    /** 出向带宽限制，第一张网卡的出向平均带宽限制，单位：Mbps，0表示不限制 */
    
    @OpenAPIParam("LANOutAverageBandwidth")
    private Integer lANOutAverageBandwidthParam;

    /** 内网安全组ID，新虚拟机绑定的内网安全组 */
    
    @OpenAPIParam("LANSGID")
    private String lANSGIDParam;

    /** 内存容量，新虚拟机的内存大小，单位：MiB */
    @NotEmpty
    @OpenAPIParam("Memory")
    private Integer memoryParam;

    /** 虚拟机名称，新虚拟机的显示名称，长度1-128个字符，仅支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 外网线路ID，指定外网宽带运营商线路 */
    
    @OpenAPIParam("OperatorName")
    private String operatorNameParam;

    /** 项目ID，资源所属的项目分组标识，未传时尝试分配默认项目 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 计费周期，购买的时长，按月/年计费时表示月数/年数 */
    @NotEmpty
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注信息，对新虚拟机的补充说明，长度0-100个字符，禁止包含<script>标签或javascript链接 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 子网ID，新虚拟机所属的子网标识 */
    
    @OpenAPIParam("SubnetID")
    private String subnetIDParam;

    /** 源虚拟机ID，被克隆的源虚拟机标识 */
    @NotEmpty
    @OpenAPIParam("VMID")
    private String vMIDParam;

    /** 整机快照ID，基于该整机快照进行克隆 */
    @NotEmpty
    @OpenAPIParam("VMSPID")
    private String vMSPIDParam;

    /** VPCID，新虚拟机所属的VPC标识 */
    
    @OpenAPIParam("VPCID")
    private String vPCIDParam;

    /** 外网MAC，指定新虚拟机的外网MAC地址，留空则自动生成 */
    
    @OpenAPIParam("WANMAC")
    private String wANMACParam;

    /** WAN网络配置，克隆阶段用于声明WAN网卡及其IP配置；当前仅支持1张WAN网卡，单网卡可配置多个WAN IP */
    
    @OpenAPIParam("WANNetworkConfig")
    private WANNetworkConfig wANNetworkConfigParam;

    /** 外网安全组ID，新虚拟机绑定的外网安全组 */
    
    @OpenAPIParam("WANSGID")
    private String wANSGIDParam;


    public String getApplicationName() {
        return applicationNameParam;
    }

    public void setApplicationName(String applicationNameParam) {
        this.applicationNameParam = applicationNameParam;
    }

    public String getApplicationReason() {
        return applicationReasonParam;
    }

    public void setApplicationReason(String applicationReasonParam) {
        this.applicationReasonParam = applicationReasonParam;
    }

    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
    }

    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getFlatNetworkID() {
        return flatNetworkIDParam;
    }

    public void setFlatNetworkID(String flatNetworkIDParam) {
        this.flatNetworkIDParam = flatNetworkIDParam;
    }

    public String getIPVersion() {
        return iPVersionParam;
    }

    public void setIPVersion(String iPVersionParam) {
        this.iPVersionParam = iPVersionParam;
    }

    public String getInternalIP() {
        return internalIPParam;
    }

    public void setInternalIP(String internalIPParam) {
        this.internalIPParam = internalIPParam;
    }

    public String getInternetIP() {
        return internetIPParam;
    }

    public void setInternetIP(String internetIPParam) {
        this.internetIPParam = internetIPParam;
    }

    public Integer getLANInAverageBandwidth() {
        return lANInAverageBandwidthParam;
    }

    public void setLANInAverageBandwidth(Integer lANInAverageBandwidthParam) {
        this.lANInAverageBandwidthParam = lANInAverageBandwidthParam;
    }

    public String getLANMAC() {
        return lANMACParam;
    }

    public void setLANMAC(String lANMACParam) {
        this.lANMACParam = lANMACParam;
    }

    public Integer getLANOutAverageBandwidth() {
        return lANOutAverageBandwidthParam;
    }

    public void setLANOutAverageBandwidth(Integer lANOutAverageBandwidthParam) {
        this.lANOutAverageBandwidthParam = lANOutAverageBandwidthParam;
    }

    public String getLANSGID() {
        return lANSGIDParam;
    }

    public void setLANSGID(String lANSGIDParam) {
        this.lANSGIDParam = lANSGIDParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getOperatorName() {
        return operatorNameParam;
    }

    public void setOperatorName(String operatorNameParam) {
        this.operatorNameParam = operatorNameParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public Integer getQuantity() {
        return quantityParam;
    }

    public void setQuantity(Integer quantityParam) {
        this.quantityParam = quantityParam;
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

    public String getSubnetID() {
        return subnetIDParam;
    }

    public void setSubnetID(String subnetIDParam) {
        this.subnetIDParam = subnetIDParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

    public String getVMSPID() {
        return vMSPIDParam;
    }

    public void setVMSPID(String vMSPIDParam) {
        this.vMSPIDParam = vMSPIDParam;
    }

    public String getVPCID() {
        return vPCIDParam;
    }

    public void setVPCID(String vPCIDParam) {
        this.vPCIDParam = vPCIDParam;
    }

    public String getWANMAC() {
        return wANMACParam;
    }

    public void setWANMAC(String wANMACParam) {
        this.wANMACParam = wANMACParam;
    }

    public WANNetworkConfig getWANNetworkConfig() {
        return wANNetworkConfigParam;
    }

    public void setWANNetworkConfig(WANNetworkConfig wANNetworkConfigParam) {
        this.wANNetworkConfigParam = wANNetworkConfigParam;
    }

    public String getWANSGID() {
        return wANSGIDParam;
    }

    public void setWANSGID(String wANSGIDParam) {
        this.wANSGIDParam = wANSGIDParam;
    }

}
