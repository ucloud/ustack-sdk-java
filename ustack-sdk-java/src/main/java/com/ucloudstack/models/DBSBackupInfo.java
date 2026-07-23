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

public class DBSBackupInfo {

    /** 备份ID，备份唯一标识 */
    @SerializedName("BackupID")
    private String backupIDParam;

    /** 备份库表，备份库表列表 */
    @SerializedName("BackupTables")
    private List<String> backupTablesParam;

    /** 备份类型，备份类型字符串 */
    @SerializedName("BackupType")
    private String backupTypeParam;

    /** 集群类型，备份源实例集群类型 */
    @SerializedName("ClusterType")
    private String clusterTypeParam;

    /** 租户邮箱，租户联系邮箱 */
    @SerializedName("CompanyEmail")
    private String companyEmailParam;

    /** 租户ID，备份所属租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，租户显示名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，备份创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 存储池状态，备份存储池状态 */
    @SerializedName("DBSStorageStatus")
    private String dBSStorageStatusParam;

    /** 过期时间，备份过期时间戳 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 备份实例版本，备份源实例版本 */
    @SerializedName("InstanceVersion")
    private String instanceVersionParam;

    /** 备份存放路径，备份文件路径 */
    @SerializedName("Path")
    private String pathParam;

    /** 计划ID，备份计划ID */
    @SerializedName("PlanID")
    private String planIDParam;

    /** 计划名称，备份计划名称 */
    @SerializedName("PlanName")
    private String planNameParam;

    /** 失败原因，备份失败原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 保留时间，备份保留时长 */
    @SerializedName("RetentionTime")
    private Integer retentionTimeParam;

    /** 分片数，备份源实例分片数 */
    @SerializedName("ShardCount")
    private Integer shardCountParam;

    /** 备份大小，备份文件大小 */
    @SerializedName("Size")
    private Integer sizeParam;

    /** 源存储集群，备份源存储集群类型 */
    @SerializedName("SrcDiskSetType")
    private String srcDiskSetTypeParam;

    /** 源磁盘空间，备份源磁盘空间 */
    @SerializedName("SrcDiskSpace")
    private Integer srcDiskSpaceParam;

    /** 备份源ID，备份源资源ID */
    @SerializedName("SrcID")
    private String srcIDParam;

    /** 备份源名称，备份源资源名称 */
    @SerializedName("SrcName")
    private String srcNameParam;

    /** 备份源地域，备份源资源所属地域 */
    @SerializedName("SrcRegion")
    private String srcRegionParam;

    /** 备份源类型，备份源资源类型 */
    @SerializedName("SrcType")
    private String srcTypeParam;

    /** 备份状态，备份状态字符串 */
    @SerializedName("Status")
    private String statusParam;

    /** 存储池ID，备份存储池ID */
    @SerializedName("StorageID")
    private String storageIDParam;

    /** 存储池名称，备份存储池名称 */
    @SerializedName("StorageName")
    private String storageNameParam;

    /** 更新时间，备份更新时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public String getBackupID() {
        return backupIDParam;
    }

    public void setBackupID(String backupIDParam) {
        this.backupIDParam = backupIDParam;
    }

    public List<String> getBackupTables() {
        return backupTablesParam;
    }

    public void setBackupTables(List<String> backupTablesParam) {
        this.backupTablesParam = backupTablesParam;
    }

    public String getBackupType() {
        return backupTypeParam;
    }

    public void setBackupType(String backupTypeParam) {
        this.backupTypeParam = backupTypeParam;
    }

    public String getClusterType() {
        return clusterTypeParam;
    }

    public void setClusterType(String clusterTypeParam) {
        this.clusterTypeParam = clusterTypeParam;
    }

    public String getCompanyEmail() {
        return companyEmailParam;
    }

    public void setCompanyEmail(String companyEmailParam) {
        this.companyEmailParam = companyEmailParam;
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

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getDBSStorageStatus() {
        return dBSStorageStatusParam;
    }

    public void setDBSStorageStatus(String dBSStorageStatusParam) {
        this.dBSStorageStatusParam = dBSStorageStatusParam;
    }

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
    }

    public String getInstanceVersion() {
        return instanceVersionParam;
    }

    public void setInstanceVersion(String instanceVersionParam) {
        this.instanceVersionParam = instanceVersionParam;
    }

    public String getPath() {
        return pathParam;
    }

    public void setPath(String pathParam) {
        this.pathParam = pathParam;
    }

    public String getPlanID() {
        return planIDParam;
    }

    public void setPlanID(String planIDParam) {
        this.planIDParam = planIDParam;
    }

    public String getPlanName() {
        return planNameParam;
    }

    public void setPlanName(String planNameParam) {
        this.planNameParam = planNameParam;
    }

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
    }

    public Integer getRetentionTime() {
        return retentionTimeParam;
    }

    public void setRetentionTime(Integer retentionTimeParam) {
        this.retentionTimeParam = retentionTimeParam;
    }

    public Integer getShardCount() {
        return shardCountParam;
    }

    public void setShardCount(Integer shardCountParam) {
        this.shardCountParam = shardCountParam;
    }

    public Integer getSize() {
        return sizeParam;
    }

    public void setSize(Integer sizeParam) {
        this.sizeParam = sizeParam;
    }

    public String getSrcDiskSetType() {
        return srcDiskSetTypeParam;
    }

    public void setSrcDiskSetType(String srcDiskSetTypeParam) {
        this.srcDiskSetTypeParam = srcDiskSetTypeParam;
    }

    public Integer getSrcDiskSpace() {
        return srcDiskSpaceParam;
    }

    public void setSrcDiskSpace(Integer srcDiskSpaceParam) {
        this.srcDiskSpaceParam = srcDiskSpaceParam;
    }

    public String getSrcID() {
        return srcIDParam;
    }

    public void setSrcID(String srcIDParam) {
        this.srcIDParam = srcIDParam;
    }

    public String getSrcName() {
        return srcNameParam;
    }

    public void setSrcName(String srcNameParam) {
        this.srcNameParam = srcNameParam;
    }

    public String getSrcRegion() {
        return srcRegionParam;
    }

    public void setSrcRegion(String srcRegionParam) {
        this.srcRegionParam = srcRegionParam;
    }

    public String getSrcType() {
        return srcTypeParam;
    }

    public void setSrcType(String srcTypeParam) {
        this.srcTypeParam = srcTypeParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getStorageID() {
        return storageIDParam;
    }

    public void setStorageID(String storageIDParam) {
        this.storageIDParam = storageIDParam;
    }

    public String getStorageName() {
        return storageNameParam;
    }

    public void setStorageName(String storageNameParam) {
        this.storageNameParam = storageNameParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
