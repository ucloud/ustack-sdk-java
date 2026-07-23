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

public class ClusterInfo {

    /** 集群EIP ID */
    @SerializedName("APIServerEIPID")
    private String aPIServerEIPIDParam;

    /** apiserver接入地址列表 */
    @SerializedName("Addresses")
    private List<IPAddress> addressesParam;

    /** 集群已分配CPU数量 */
    @SerializedName("AllocatedCPU")
    private Integer allocatedCPUParam;

    /** 集群已分配内存容量 */
    @SerializedName("AllocatedMemory")
    private Integer allocatedMemoryParam;

    /** 集群已分配pod数量 */
    @SerializedName("AllocatedPods")
    private Integer allocatedPodsParam;

    /** 计费周期 */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 集群Id */
    @SerializedName("ClusterID")
    private String clusterIDParam;

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 计算集群别名 */
    @SerializedName("ComputeclassAlias")
    private String computeclassAliasParam;

    /** 计算集群类型 */
    @SerializedName("ComputeclassType")
    private String computeclassTypeParam;

    /** 集群控制面状态 */
    @SerializedName("ControllerPlaneStatus")
    private ControllerPlaneStatus controllerPlaneStatusParam;

    /** 创建时间 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 过期时间 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** k8s版本号。可为1.20.6。 */
    @SerializedName("K8SVersion")
    private String k8SVersionParam;

    /** 连接用户集群k8s 的Config */
    @SerializedName("Kubeconfig")
    private String kubeconfigParam;

    /** 连接用户集群k8s 的外网Config */
    @SerializedName("KubeconfigWan")
    private String kubeconfigWanParam;

    /** 集群最大CPU数量 */
    @SerializedName("MaxCPU")
    private Integer maxCPUParam;

    /** 集群最大内存容量 */
    @SerializedName("MaxMemory")
    private Integer maxMemoryParam;

    /** 集群最大pod数量 */
    @SerializedName("MaxPods")
    private Integer maxPodsParam;

    /** 集群最大存储容量分配策略 */
    @SerializedName("MaxStoragAllocation")
    private String maxStoragAllocationParam;

    /** 集群最大存储容量 */
    @SerializedName("MaxStorage")
    private Integer maxStorageParam;

    /** 名称 */
    @SerializedName("Name")
    private String nameParam;

    /** Pod子网 */
    @SerializedName("PodSubnets")
    private List<ClusterSubnetInfo> podSubnetsParam;

    /** 项目组ID */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目组名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** Registry地址 */
    @SerializedName("Registry")
    private String registryParam;

    /** 备注 */
    @SerializedName("Remark")
    private String remarkParam;

    /** Service CIDR 或 Serivce 所在子网Id */
    @SerializedName("ServiceCIDR")
    private String serviceCIDRParam;

    /** 阶段 */
    @SerializedName("State")
    private String stateParam;

    /** 状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 存储集群别名 */
    @SerializedName("StorageclassAlias")
    private String storageclassAliasParam;

    /** 存储集群类型 */
    @SerializedName("StorageclassType")
    private String storageclassTypeParam;

    /** 子网Id 列表 */
    @SerializedName("Subnets")
    private List<ClusterSubnetInfo> subnetsParam;

    /** 标签 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** VpcID */
    @SerializedName("VpcID")
    private String vpcIDParam;

    /** VPC名称 */
    @SerializedName("VpcName")
    private String vpcNameParam;


    public String getAPIServerEIPID() {
        return aPIServerEIPIDParam;
    }

    public void setAPIServerEIPID(String aPIServerEIPIDParam) {
        this.aPIServerEIPIDParam = aPIServerEIPIDParam;
    }

    public List<IPAddress> getAddresses() {
        return addressesParam;
    }

    public void setAddresses(List<IPAddress> addressesParam) {
        this.addressesParam = addressesParam;
    }

    public Integer getAllocatedCPU() {
        return allocatedCPUParam;
    }

    public void setAllocatedCPU(Integer allocatedCPUParam) {
        this.allocatedCPUParam = allocatedCPUParam;
    }

    public Integer getAllocatedMemory() {
        return allocatedMemoryParam;
    }

    public void setAllocatedMemory(Integer allocatedMemoryParam) {
        this.allocatedMemoryParam = allocatedMemoryParam;
    }

    public Integer getAllocatedPods() {
        return allocatedPodsParam;
    }

    public void setAllocatedPods(Integer allocatedPodsParam) {
        this.allocatedPodsParam = allocatedPodsParam;
    }

    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public String getClusterID() {
        return clusterIDParam;
    }

    public void setClusterID(String clusterIDParam) {
        this.clusterIDParam = clusterIDParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getCompanyName() {
        return companyNameParam;
    }

    public void setCompanyName(String companyNameParam) {
        this.companyNameParam = companyNameParam;
    }

    public String getComputeclassAlias() {
        return computeclassAliasParam;
    }

    public void setComputeclassAlias(String computeclassAliasParam) {
        this.computeclassAliasParam = computeclassAliasParam;
    }

    public String getComputeclassType() {
        return computeclassTypeParam;
    }

    public void setComputeclassType(String computeclassTypeParam) {
        this.computeclassTypeParam = computeclassTypeParam;
    }

    public ControllerPlaneStatus getControllerPlaneStatus() {
        return controllerPlaneStatusParam;
    }

    public void setControllerPlaneStatus(ControllerPlaneStatus controllerPlaneStatusParam) {
        this.controllerPlaneStatusParam = controllerPlaneStatusParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
    }

    public String getK8SVersion() {
        return k8SVersionParam;
    }

    public void setK8SVersion(String k8SVersionParam) {
        this.k8SVersionParam = k8SVersionParam;
    }

    public String getKubeconfig() {
        return kubeconfigParam;
    }

    public void setKubeconfig(String kubeconfigParam) {
        this.kubeconfigParam = kubeconfigParam;
    }

    public String getKubeconfigWan() {
        return kubeconfigWanParam;
    }

    public void setKubeconfigWan(String kubeconfigWanParam) {
        this.kubeconfigWanParam = kubeconfigWanParam;
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

    public String getMaxStoragAllocation() {
        return maxStoragAllocationParam;
    }

    public void setMaxStoragAllocation(String maxStoragAllocationParam) {
        this.maxStoragAllocationParam = maxStoragAllocationParam;
    }

    public Integer getMaxStorage() {
        return maxStorageParam;
    }

    public void setMaxStorage(Integer maxStorageParam) {
        this.maxStorageParam = maxStorageParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public List<ClusterSubnetInfo> getPodSubnets() {
        return podSubnetsParam;
    }

    public void setPodSubnets(List<ClusterSubnetInfo> podSubnetsParam) {
        this.podSubnetsParam = podSubnetsParam;
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

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
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

    public String getRegistry() {
        return registryParam;
    }

    public void setRegistry(String registryParam) {
        this.registryParam = registryParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getServiceCIDR() {
        return serviceCIDRParam;
    }

    public void setServiceCIDR(String serviceCIDRParam) {
        this.serviceCIDRParam = serviceCIDRParam;
    }

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getStorageclassAlias() {
        return storageclassAliasParam;
    }

    public void setStorageclassAlias(String storageclassAliasParam) {
        this.storageclassAliasParam = storageclassAliasParam;
    }

    public String getStorageclassType() {
        return storageclassTypeParam;
    }

    public void setStorageclassType(String storageclassTypeParam) {
        this.storageclassTypeParam = storageclassTypeParam;
    }

    public List<ClusterSubnetInfo> getSubnets() {
        return subnetsParam;
    }

    public void setSubnets(List<ClusterSubnetInfo> subnetsParam) {
        this.subnetsParam = subnetsParam;
    }

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
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

}
