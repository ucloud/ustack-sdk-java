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

public class NativeNodeInfo {

    /** 架构类型 */
    @SerializedName("ArchType")
    private String archTypeParam;

    /** 存储集群别名 */
    @SerializedName("BootDiskSetAlias")
    private String bootDiskSetAliasParam;

    /** 系统盘集群架构 */
    @SerializedName("BootDiskSetArch")
    private String bootDiskSetArchParam;

    /** 系统盘集群ID */
    @SerializedName("BootDiskSetID")
    private String bootDiskSetIDParam;

    /** 存储集群类型 */
    @SerializedName("BootDiskSetType")
    private String bootDiskSetTypeParam;

    /** 系统盘大小 */
    @SerializedName("BootDiskSpace")
    private Integer bootDiskSpaceParam;

    /** 节点CPU */
    @SerializedName("CPU")
    private Integer cPUParam;

    /** 集群Id */
    @SerializedName("ClusterID")
    private String clusterIDParam;

    /** 计算集群别名 */
    @SerializedName("ComputeclassAlias")
    private String computeclassAliasParam;

    /** 计算集群ID */
    @SerializedName("ComputeclassID")
    private String computeclassIDParam;

    /** 计算集群类型 */
    @SerializedName("ComputeclassType")
    private String computeclassTypeParam;

    /** 弹性IP */
    @SerializedName("EIP")
    private String eIPParam;

    /**  */
    @SerializedName("EIPID")
    private String eIPIDParam;

    /** 弹性IP名称 */
    @SerializedName("EIPName")
    private String eIPNameParam;

    /** GPU数量，挂载的物理GPU数量 */
    @SerializedName("GPU")
    private Integer gPUParam;

    /** GPU规格，挂载的物理GPU型号 */
    @SerializedName("GPUMdevName")
    private String gPUMdevNameParam;

    /**  */
    @SerializedName("InstanceStatus")
    private String instanceStatusParam;

    /**  */
    @SerializedName("InternalIP")
    private String internalIPParam;

    /** 节点最大pod数量 */
    @SerializedName("MaxPods")
    private Integer maxPodsParam;

    /** 节点内存 */
    @SerializedName("Memory")
    private Integer memoryParam;

    /** 节点名称 */
    @SerializedName("NodeName")
    private String nodeNameParam;

    /** 节点状态 */
    @SerializedName("NodeStatus")
    private String nodeStatusParam;

    /** 系统类型 */
    @SerializedName("OSType")
    private String oSTypeParam;

    /**  */
    @SerializedName("SGID")
    private String sGIDParam;

    /** 安全组名称 */
    @SerializedName("SGName")
    private String sGNameParam;

    /** 状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 子网Id 列表 */
    @SerializedName("SubnetIDs")
    private List<String> subnetIDsParam;

    /** 子网名称列表 */
    @SerializedName("SubnetNames")
    private List<String> subnetNamesParam;

    /** 不可调度 */
    @SerializedName("Unschedulable")
    private Boolean unschedulableParam;

    /** 节点的虚拟机ID */
    @SerializedName("VMID")
    private String vMIDParam;

    /** VpcID */
    @SerializedName("VpcID")
    private String vpcIDParam;

    /** VpcName */
    @SerializedName("VpcName")
    private String vpcNameParam;

    /** yaml数据 */
    @SerializedName("YamlData")
    private String yamlDataParam;


    public String getArchType() {
        return archTypeParam;
    }

    public void setArchType(String archTypeParam) {
        this.archTypeParam = archTypeParam;
    }

    public String getBootDiskSetAlias() {
        return bootDiskSetAliasParam;
    }

    public void setBootDiskSetAlias(String bootDiskSetAliasParam) {
        this.bootDiskSetAliasParam = bootDiskSetAliasParam;
    }

    public String getBootDiskSetArch() {
        return bootDiskSetArchParam;
    }

    public void setBootDiskSetArch(String bootDiskSetArchParam) {
        this.bootDiskSetArchParam = bootDiskSetArchParam;
    }

    public String getBootDiskSetID() {
        return bootDiskSetIDParam;
    }

    public void setBootDiskSetID(String bootDiskSetIDParam) {
        this.bootDiskSetIDParam = bootDiskSetIDParam;
    }

    public String getBootDiskSetType() {
        return bootDiskSetTypeParam;
    }

    public void setBootDiskSetType(String bootDiskSetTypeParam) {
        this.bootDiskSetTypeParam = bootDiskSetTypeParam;
    }

    public Integer getBootDiskSpace() {
        return bootDiskSpaceParam;
    }

    public void setBootDiskSpace(Integer bootDiskSpaceParam) {
        this.bootDiskSpaceParam = bootDiskSpaceParam;
    }

    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
    }

    public String getClusterID() {
        return clusterIDParam;
    }

    public void setClusterID(String clusterIDParam) {
        this.clusterIDParam = clusterIDParam;
    }

    public String getComputeclassAlias() {
        return computeclassAliasParam;
    }

    public void setComputeclassAlias(String computeclassAliasParam) {
        this.computeclassAliasParam = computeclassAliasParam;
    }

    public String getComputeclassID() {
        return computeclassIDParam;
    }

    public void setComputeclassID(String computeclassIDParam) {
        this.computeclassIDParam = computeclassIDParam;
    }

    public String getComputeclassType() {
        return computeclassTypeParam;
    }

    public void setComputeclassType(String computeclassTypeParam) {
        this.computeclassTypeParam = computeclassTypeParam;
    }

    public String getEIP() {
        return eIPParam;
    }

    public void setEIP(String eIPParam) {
        this.eIPParam = eIPParam;
    }

    public String getEIPID() {
        return eIPIDParam;
    }

    public void setEIPID(String eIPIDParam) {
        this.eIPIDParam = eIPIDParam;
    }

    public String getEIPName() {
        return eIPNameParam;
    }

    public void setEIPName(String eIPNameParam) {
        this.eIPNameParam = eIPNameParam;
    }

    public Integer getGPU() {
        return gPUParam;
    }

    public void setGPU(Integer gPUParam) {
        this.gPUParam = gPUParam;
    }

    public String getGPUMdevName() {
        return gPUMdevNameParam;
    }

    public void setGPUMdevName(String gPUMdevNameParam) {
        this.gPUMdevNameParam = gPUMdevNameParam;
    }

    public String getInstanceStatus() {
        return instanceStatusParam;
    }

    public void setInstanceStatus(String instanceStatusParam) {
        this.instanceStatusParam = instanceStatusParam;
    }

    public String getInternalIP() {
        return internalIPParam;
    }

    public void setInternalIP(String internalIPParam) {
        this.internalIPParam = internalIPParam;
    }

    public Integer getMaxPods() {
        return maxPodsParam;
    }

    public void setMaxPods(Integer maxPodsParam) {
        this.maxPodsParam = maxPodsParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public String getNodeName() {
        return nodeNameParam;
    }

    public void setNodeName(String nodeNameParam) {
        this.nodeNameParam = nodeNameParam;
    }

    public String getNodeStatus() {
        return nodeStatusParam;
    }

    public void setNodeStatus(String nodeStatusParam) {
        this.nodeStatusParam = nodeStatusParam;
    }

    public String getOSType() {
        return oSTypeParam;
    }

    public void setOSType(String oSTypeParam) {
        this.oSTypeParam = oSTypeParam;
    }

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

    public String getSGName() {
        return sGNameParam;
    }

    public void setSGName(String sGNameParam) {
        this.sGNameParam = sGNameParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public List<String> getSubnetIDs() {
        return subnetIDsParam;
    }

    public void setSubnetIDs(List<String> subnetIDsParam) {
        this.subnetIDsParam = subnetIDsParam;
    }

    public List<String> getSubnetNames() {
        return subnetNamesParam;
    }

    public void setSubnetNames(List<String> subnetNamesParam) {
        this.subnetNamesParam = subnetNamesParam;
    }

    public Boolean getUnschedulable() {
        return unschedulableParam;
    }

    public void setUnschedulable(Boolean unschedulableParam) {
        this.unschedulableParam = unschedulableParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

    public String getVpcID() {
        return vpcIDParam;
    }

    public void setVpcID(String vpcIDParam) {
        this.vpcIDParam = vpcIDParam;
    }

    public String getVpcName() {
        return vpcNameParam;
    }

    public void setVpcName(String vpcNameParam) {
        this.vpcNameParam = vpcNameParam;
    }

    public String getYamlData() {
        return yamlDataParam;
    }

    public void setYamlData(String yamlDataParam) {
        this.yamlDataParam = yamlDataParam;
    }

}
