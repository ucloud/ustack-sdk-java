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

public class SuperNodeInfo {

    /** 节点可调最大CPU数量 */
    @SerializedName("AdjustableMaxCPU")
    private Integer adjustableMaxCPUParam;

    /** 节点可调最大内存容量 */
    @SerializedName("AdjustableMaxMemory")
    private Integer adjustableMaxMemoryParam;

    /** 节点可调最大pod数量 */
    @SerializedName("AdjustableMaxPods")
    private Integer adjustableMaxPodsParam;

    /** 架构类型 */
    @SerializedName("ArchType")
    private String archTypeParam;

    /** 集群Id */
    @SerializedName("ClusterID")
    private String clusterIDParam;

    /** 计算集群类型 */
    @SerializedName("ComputeclassType")
    private String computeclassTypeParam;

    /** 节点GPU信息 */
    @SerializedName("GPUInfos")
    private List<SuperNodeGPUInfo> gPUInfosParam;

    /**  */
    @SerializedName("InternalIP")
    private String internalIPParam;

    /** 默认节点 */
    @SerializedName("IsDefault")
    private Boolean isDefaultParam;

    /** 节点最大CPU数量 */
    @SerializedName("MaxCPU")
    private Integer maxCPUParam;

    /** 节点最大内存容量 */
    @SerializedName("MaxMemory")
    private Integer maxMemoryParam;

    /** 节点最大pod数量 */
    @SerializedName("MaxPods")
    private Integer maxPodsParam;

    /** 节点名称 */
    @SerializedName("NodeName")
    private String nodeNameParam;

    /** 节点状态 */
    @SerializedName("NodeStatus")
    private String nodeStatusParam;

    /** 系统类型 */
    @SerializedName("OSType")
    private String oSTypeParam;

    /** 状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 存储集群类型 */
    @SerializedName("StorageclassType")
    private String storageclassTypeParam;

    /** 子网Id 列表 */
    @SerializedName("SubnetIDs")
    private List<String> subnetIDsParam;

    /** 子网名称列表 */
    @SerializedName("SubnetNames")
    private List<String> subnetNamesParam;

    /** 不可调度 */
    @SerializedName("Unschedulable")
    private Boolean unschedulableParam;

    /** 节点已使用CPU数量 */
    @SerializedName("UsedCPU")
    private Double usedCPUParam;

    /** 节点已使用内存容量 */
    @SerializedName("UsedMemory")
    private Double usedMemoryParam;

    /** 节点已使用pod数量 */
    @SerializedName("UsedPods")
    private Double usedPodsParam;

    /** VpcID */
    @SerializedName("VpcID")
    private String vpcIDParam;

    /** VpcName */
    @SerializedName("VpcName")
    private String vpcNameParam;

    /** yaml数据 */
    @SerializedName("YamlData")
    private String yamlDataParam;


    public Integer getAdjustableMaxCPU() {
        return adjustableMaxCPUParam;
    }

    public void setAdjustableMaxCPU(Integer adjustableMaxCPUParam) {
        this.adjustableMaxCPUParam = adjustableMaxCPUParam;
    }

    public Integer getAdjustableMaxMemory() {
        return adjustableMaxMemoryParam;
    }

    public void setAdjustableMaxMemory(Integer adjustableMaxMemoryParam) {
        this.adjustableMaxMemoryParam = adjustableMaxMemoryParam;
    }

    public Integer getAdjustableMaxPods() {
        return adjustableMaxPodsParam;
    }

    public void setAdjustableMaxPods(Integer adjustableMaxPodsParam) {
        this.adjustableMaxPodsParam = adjustableMaxPodsParam;
    }

    public String getArchType() {
        return archTypeParam;
    }

    public void setArchType(String archTypeParam) {
        this.archTypeParam = archTypeParam;
    }

    public String getClusterID() {
        return clusterIDParam;
    }

    public void setClusterID(String clusterIDParam) {
        this.clusterIDParam = clusterIDParam;
    }

    public String getComputeclassType() {
        return computeclassTypeParam;
    }

    public void setComputeclassType(String computeclassTypeParam) {
        this.computeclassTypeParam = computeclassTypeParam;
    }

    public List<SuperNodeGPUInfo> getGPUInfos() {
        return gPUInfosParam;
    }

    public void setGPUInfos(List<SuperNodeGPUInfo> gPUInfosParam) {
        this.gPUInfosParam = gPUInfosParam;
    }

    public String getInternalIP() {
        return internalIPParam;
    }

    public void setInternalIP(String internalIPParam) {
        this.internalIPParam = internalIPParam;
    }

    public Boolean getIsDefault() {
        return isDefaultParam;
    }

    public void setIsDefault(Boolean isDefaultParam) {
        this.isDefaultParam = isDefaultParam;
    }

    public Integer getMaxCPU() {
        return maxCPUParam;
    }

    public void setMaxCPU(Integer maxCPUParam) {
        this.maxCPUParam = maxCPUParam;
    }

    public Integer getMaxMemory() {
        return maxMemoryParam;
    }

    public void setMaxMemory(Integer maxMemoryParam) {
        this.maxMemoryParam = maxMemoryParam;
    }

    public Integer getMaxPods() {
        return maxPodsParam;
    }

    public void setMaxPods(Integer maxPodsParam) {
        this.maxPodsParam = maxPodsParam;
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

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getStorageclassType() {
        return storageclassTypeParam;
    }

    public void setStorageclassType(String storageclassTypeParam) {
        this.storageclassTypeParam = storageclassTypeParam;
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

    public Double getUsedCPU() {
        return usedCPUParam;
    }

    public void setUsedCPU(Double usedCPUParam) {
        this.usedCPUParam = usedCPUParam;
    }

    public Double getUsedMemory() {
        return usedMemoryParam;
    }

    public void setUsedMemory(Double usedMemoryParam) {
        this.usedMemoryParam = usedMemoryParam;
    }

    public Double getUsedPods() {
        return usedPodsParam;
    }

    public void setUsedPods(Double usedPodsParam) {
        this.usedPodsParam = usedPodsParam;
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
