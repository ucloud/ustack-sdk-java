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

public class NodeInfo {

    /** 架构，节点CPU架构 */
    @SerializedName("Arch")
    private String archParam;

    /** CPU详情，节点CPU资源信息 */
    @SerializedName("CPU")
    private CPU cPUParam;

    /** 资源用量情况（计算节点独有），计算节点资源使用统计 */
    @SerializedName("Compute")
    private Compute computeParam;

    /** 节点健康状态，节点健康度状态 */
    @SerializedName("HealthStatus")
    private String healthStatusParam;

    /** 内存详情，节点内存资源信息 */
    @SerializedName("Memory")
    private Memory memoryParam;

    /** NTP详情，节点时间同步信息 */
    @SerializedName("NTP")
    private NTPInfo nTPParam;

    /** 主机网络详情，节点网络信息 */
    @SerializedName("Network")
    private Network networkParam;

    /** 节点ID，节点唯一标识 */
    @SerializedName("NodeID")
    private String nodeIDParam;

    /** 节点IP地址，节点管理IP地址 */
    @SerializedName("NodeIP")
    private String nodeIPParam;

    /** 节点IPMI管理地址 */
    @SerializedName("NodeIPMIIP")
    private String nodeIPMIIPParam;

    /** 节点IPv6地址，节点管理IPv6地址 */
    @SerializedName("NodeIPv6")
    private String nodeIPv6Param;

    /** 节点状态，当前运行状态 */
    @SerializedName("NodeStatus")
    private String nodeStatusParam;

    /** NUMA节点数，节点NUMA拓扑数量 */
    @SerializedName("NumaNodes")
    private Integer numaNodesParam;

    /** 操作系统 */
    @SerializedName("OS")
    private String oSParam;

    /** 存储节点OSD详情，存储服务状态信息 */
    @SerializedName("OSDInfos")
    private List<OSDStat> oSDInfosParam;

    /** 物理磁盘详情，节点磁盘列表信息 */
    @SerializedName("PhysicalDisks")
    private List<PhysicalDisk> physicalDisksParam;

    /** 地域ID，节点所属地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的人性化显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 序列号，硬件设备序列号 */
    @SerializedName("SerialNumber")
    private String serialNumberParam;

    /** 集群别名，节点所属计算集群的自定义名称 */
    @SerializedName("SetAlias")
    private String setAliasParam;

    /** 节点类型，节点角色列表 */
    @SerializedName("Types")
    private List<String> typesParam;

    /** UUID，节点硬件唯一标识 */
    @SerializedName("UUID")
    private String uUIDParam;

    /** 是否支持vCPU绑定，节点是否支持绑定能力 */
    @SerializedName("VCPUBindingEnabled")
    private Boolean vCPUBindingEnabledParam;


    public String getArch() {
        return archParam;
    }

    public void setArch(String archParam) {
        this.archParam = archParam;
    }

    public CPU getCPU() {
        return cPUParam;
    }

    public void setCPU(CPU cPUParam) {
        this.cPUParam = cPUParam;
    }

    public Compute getCompute() {
        return computeParam;
    }

    public void setCompute(Compute computeParam) {
        this.computeParam = computeParam;
    }

    public String getHealthStatus() {
        return healthStatusParam;
    }

    public void setHealthStatus(String healthStatusParam) {
        this.healthStatusParam = healthStatusParam;
    }

    public Memory getMemory() {
        return memoryParam;
    }

    public void setMemory(Memory memoryParam) {
        this.memoryParam = memoryParam;
    }

    public NTPInfo getNTP() {
        return nTPParam;
    }

    public void setNTP(NTPInfo nTPParam) {
        this.nTPParam = nTPParam;
    }

    public Network getNetwork() {
        return networkParam;
    }

    public void setNetwork(Network networkParam) {
        this.networkParam = networkParam;
    }

    public String getNodeID() {
        return nodeIDParam;
    }

    public void setNodeID(String nodeIDParam) {
        this.nodeIDParam = nodeIDParam;
    }

    public String getNodeIP() {
        return nodeIPParam;
    }

    public void setNodeIP(String nodeIPParam) {
        this.nodeIPParam = nodeIPParam;
    }

    public String getNodeIPMIIP() {
        return nodeIPMIIPParam;
    }

    public void setNodeIPMIIP(String nodeIPMIIPParam) {
        this.nodeIPMIIPParam = nodeIPMIIPParam;
    }

    public String getNodeIPv6() {
        return nodeIPv6Param;
    }

    public void setNodeIPv6(String nodeIPv6Param) {
        this.nodeIPv6Param = nodeIPv6Param;
    }

    public String getNodeStatus() {
        return nodeStatusParam;
    }

    public void setNodeStatus(String nodeStatusParam) {
        this.nodeStatusParam = nodeStatusParam;
    }

    public Integer getNumaNodes() {
        return numaNodesParam;
    }

    public void setNumaNodes(Integer numaNodesParam) {
        this.numaNodesParam = numaNodesParam;
    }

    public String getOS() {
        return oSParam;
    }

    public void setOS(String oSParam) {
        this.oSParam = oSParam;
    }

    public List<OSDStat> getOSDInfos() {
        return oSDInfosParam;
    }

    public void setOSDInfos(List<OSDStat> oSDInfosParam) {
        this.oSDInfosParam = oSDInfosParam;
    }

    public List<PhysicalDisk> getPhysicalDisks() {
        return physicalDisksParam;
    }

    public void setPhysicalDisks(List<PhysicalDisk> physicalDisksParam) {
        this.physicalDisksParam = physicalDisksParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRegionAlias() {
        return regionAliasParam;
    }

    public void setRegionAlias(String regionAliasParam) {
        this.regionAliasParam = regionAliasParam;
    }

    public String getSerialNumber() {
        return serialNumberParam;
    }

    public void setSerialNumber(String serialNumberParam) {
        this.serialNumberParam = serialNumberParam;
    }

    public String getSetAlias() {
        return setAliasParam;
    }

    public void setSetAlias(String setAliasParam) {
        this.setAliasParam = setAliasParam;
    }

    public List<String> getTypes() {
        return typesParam;
    }

    public void setTypes(List<String> typesParam) {
        this.typesParam = typesParam;
    }

    public String getUUID() {
        return uUIDParam;
    }

    public void setUUID(String uUIDParam) {
        this.uUIDParam = uUIDParam;
    }

    public Boolean getVCPUBindingEnabled() {
        return vCPUBindingEnabledParam;
    }

    public void setVCPUBindingEnabled(Boolean vCPUBindingEnabledParam) {
        this.vCPUBindingEnabledParam = vCPUBindingEnabledParam;
    }

}
