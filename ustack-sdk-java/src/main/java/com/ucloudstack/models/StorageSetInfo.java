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

public class StorageSetInfo {

    /** 授权标识，表示该存储集群的授权状态 */
    @SerializedName("Authorized")
    private String authorizedParam;

    /** 卷备份对端集群ID，用于卷备份的对端存储集群标识 */
    @SerializedName("BlockBackupPeerSetID")
    private String blockBackupPeerSetIDParam;

    /** 集群卷备份状态，包含备份健康状态、备份卷总数、异常卷列表等信息 */
    @SerializedName("BlockBackupStatus")
    private StorageSetBlockBackupStatus blockBackupStatusParam;

    /** 逻辑绑定计算集群列表，当前存储集群绑定的计算集群列表，软限制，可通过UpdateVMSetBoundStorageSet修改 */
    @SerializedName("BoundVMSetList")
    private List<VmSetItem> boundVMSetListParam;

    /** 缓存状态，表示是否开启了OpenCAS缓存加速，值为true或false */
    @SerializedName("Cache")
    private String cacheParam;

    /** 创建时间，Unix时间戳，单位为秒 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** DOS多站点角色，分布式对象存储多站点角色，值为master、slave或空字符串 */
    @SerializedName("DOSMultisiteRole")
    private String dOSMultisiteRoleParam;

    /** 存储集群冗余策略，数据冗余保护策略，如三副本、纠删码等 */
    @SerializedName("Redundancy")
    private String redundancyParam;

    /** 地域ID，存储集群所属的物理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 集群别名，存储集群的自定义名称 */
    @SerializedName("SetAlias")
    private String setAliasParam;

    /** 集群架构，存储集群的硬件架构类型 */
    @SerializedName("SetArch")
    private String setArchParam;

    /** 卷备份角色，当前存储集群在卷备份中的角色，值为master、slave或空字符串 */
    @SerializedName("SetBlockBackupRole")
    private String setBlockBackupRoleParam;

    /** 集群ID，存储集群的唯一标识，由底层Huanghe系统生成和管理 */
    @SerializedName("SetID")
    private String setIDParam;

    /** 集群制备器，存储集群的底层存储提供商类型 */
    @SerializedName("SetProvider")
    private String setProviderParam;

    /** 集群类型，存储集群的类型标识 */
    @SerializedName("SetType")
    private String setTypeParam;

    /** 存储集群总容量，集群的总存储容量，单位为GB */
    @SerializedName("StorageCap")
    private Integer storageCapParam;

    /** 存储集群最大超分比例 */
    @SerializedName("StorageMaxOverCommitRatio")
    private Double storageMaxOverCommitRatioParam;

    /** 存储集群物理可用量，物理层面可用的存储空间，单位为GB */
    @SerializedName("StoragePhysicAvailable")
    private Integer storagePhysicAvailableParam;

    /** 存储集群其他用量，非PVC占用的其他存储空间，如元数据等，单位为GB */
    @SerializedName("StoragePhysicOther")
    private Integer storagePhysicOtherParam;

    /** 存储集群物理使用量，实际占用的物理存储空间，单位为GB */
    @SerializedName("StoragePhysicUsed")
    private Integer storagePhysicUsedParam;

    /** 存储集群PVC总容量，已分配给持久化卷声明的总容量，单位为GB */
    @SerializedName("StorageUsed")
    private Integer storageUsedParam;

    /** 更新时间，Unix时间戳，单位为秒 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 物理绑定计算集群列表，可以使用该存储集群的计算集群列表，硬限制，由底层物理网络拓扑决定 */
    @SerializedName("VmSetList")
    private List<VmSetItem> vmSetListParam;


    public String getAuthorized() {
        return authorizedParam;
    }

    public void setAuthorized(String authorizedParam) {
        this.authorizedParam = authorizedParam;
    }

    public String getBlockBackupPeerSetID() {
        return blockBackupPeerSetIDParam;
    }

    public void setBlockBackupPeerSetID(String blockBackupPeerSetIDParam) {
        this.blockBackupPeerSetIDParam = blockBackupPeerSetIDParam;
    }

    public StorageSetBlockBackupStatus getBlockBackupStatus() {
        return blockBackupStatusParam;
    }

    public void setBlockBackupStatus(StorageSetBlockBackupStatus blockBackupStatusParam) {
        this.blockBackupStatusParam = blockBackupStatusParam;
    }

    public List<VmSetItem> getBoundVMSetList() {
        return boundVMSetListParam;
    }

    public void setBoundVMSetList(List<VmSetItem> boundVMSetListParam) {
        this.boundVMSetListParam = boundVMSetListParam;
    }

    public String getCache() {
        return cacheParam;
    }

    public void setCache(String cacheParam) {
        this.cacheParam = cacheParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getDOSMultisiteRole() {
        return dOSMultisiteRoleParam;
    }

    public void setDOSMultisiteRole(String dOSMultisiteRoleParam) {
        this.dOSMultisiteRoleParam = dOSMultisiteRoleParam;
    }

    public String getRedundancy() {
        return redundancyParam;
    }

    public void setRedundancy(String redundancyParam) {
        this.redundancyParam = redundancyParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSetAlias() {
        return setAliasParam;
    }

    public void setSetAlias(String setAliasParam) {
        this.setAliasParam = setAliasParam;
    }

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
    }

    public String getSetBlockBackupRole() {
        return setBlockBackupRoleParam;
    }

    public void setSetBlockBackupRole(String setBlockBackupRoleParam) {
        this.setBlockBackupRoleParam = setBlockBackupRoleParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public String getSetProvider() {
        return setProviderParam;
    }

    public void setSetProvider(String setProviderParam) {
        this.setProviderParam = setProviderParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

    public Integer getStorageCap() {
        return storageCapParam;
    }

    public void setStorageCap(Integer storageCapParam) {
        this.storageCapParam = storageCapParam;
    }

    public Double getStorageMaxOverCommitRatio() {
        return storageMaxOverCommitRatioParam;
    }

    public void setStorageMaxOverCommitRatio(Double storageMaxOverCommitRatioParam) {
        this.storageMaxOverCommitRatioParam = storageMaxOverCommitRatioParam;
    }

    public Integer getStoragePhysicAvailable() {
        return storagePhysicAvailableParam;
    }

    public void setStoragePhysicAvailable(Integer storagePhysicAvailableParam) {
        this.storagePhysicAvailableParam = storagePhysicAvailableParam;
    }

    public Integer getStoragePhysicOther() {
        return storagePhysicOtherParam;
    }

    public void setStoragePhysicOther(Integer storagePhysicOtherParam) {
        this.storagePhysicOtherParam = storagePhysicOtherParam;
    }

    public Integer getStoragePhysicUsed() {
        return storagePhysicUsedParam;
    }

    public void setStoragePhysicUsed(Integer storagePhysicUsedParam) {
        this.storagePhysicUsedParam = storagePhysicUsedParam;
    }

    public Integer getStorageUsed() {
        return storageUsedParam;
    }

    public void setStorageUsed(Integer storageUsedParam) {
        this.storageUsedParam = storageUsedParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public List<VmSetItem> getVmSetList() {
        return vmSetListParam;
    }

    public void setVmSetList(List<VmSetItem> vmSetListParam) {
        this.vmSetListParam = vmSetListParam;
    }

}
