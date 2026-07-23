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

public class VmDiskInfo {

    /** 总线类型 */
    @SerializedName("Bus")
    private String busParam;

    /** 缓存类型，取值 directsync、none、writeback */
    @SerializedName("CacheMode")
    private String cacheModeParam;

    /** 磁盘ID，虚拟机绑定的磁盘唯一标识 */
    @SerializedName("DiskID")
    private String diskIDParam;

    /** 设备名，磁盘在操作系统内的设备路径 */
    @SerializedName("Drive")
    private String driveParam;

    /** 加密标识，标识磁盘数据是否经过加密 */
    @SerializedName("Encrypted")
    private Boolean encryptedParam;

    /** 弹性标识，标识是否为弹性可挂载设备 */
    @SerializedName("IsElastic")
    private String isElasticParam;

    /** 共享块存储，标识是否为外置存储设备 */
    @SerializedName("IsSharedblock")
    private Boolean isSharedblockParam;

    /** 磁盘名称，磁盘的可视化显示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** QoS限速读带宽，单位MB/s */
    @SerializedName("ReadBandwidth")
    private Integer readBandwidthParam;

    /** QoS限速读IOPS */
    @SerializedName("ReadIOPS")
    private Integer readIOPSParam;

    /** 存储集群ID，磁盘所属存储集群的唯一标识 */
    @SerializedName("SetID")
    private String setIDParam;

    /** 共享标识，标识磁盘是否支持多点挂载 */
    @SerializedName("ShareAble")
    private Boolean shareAbleParam;

    /** 磁盘容量，单位：GiB */
    @SerializedName("Size")
    private Integer sizeParam;

    /** 快照数量，基于该磁盘创建的快照个数 */
    @SerializedName("SnapshotCount")
    private Integer snapshotCountParam;

    /** 存储架构，存储集群的介质架构，取值：HDD、SSD */
    @SerializedName("StorageSetArch")
    private String storageSetArchParam;

    /** 存储制备器，存储后端驱动类型 */
    @SerializedName("StorageSetProvider")
    private String storageSetProviderParam;

    /** 存储集群类型，磁盘所属的存储集群标识 */
    @SerializedName("StorageSetType")
    private String storageSetTypeParam;

    /** QoS限速总带宽，单位MB/s */
    @SerializedName("TotalBandwidth")
    private Integer totalBandwidthParam;

    /** QoS限速总IOPS */
    @SerializedName("TotalIOPS")
    private Integer totalIOPSParam;

    /** 磁盘类型，标识引导盘或数据盘，取值：boot（启动盘）、data（数据盘） */
    @SerializedName("Type")
    private String typeParam;

    /** QoS限速写带宽，单位MB/s */
    @SerializedName("WriteBandwidth")
    private Integer writeBandwidthParam;

    /** QoS限速写IOPS */
    @SerializedName("WriteIOPS")
    private Integer writeIOPSParam;


    public String getBus() {
        return busParam;
    }

    public void setBus(String busParam) {
        this.busParam = busParam;
    }

    public String getCacheMode() {
        return cacheModeParam;
    }

    public void setCacheMode(String cacheModeParam) {
        this.cacheModeParam = cacheModeParam;
    }

    public String getDiskID() {
        return diskIDParam;
    }

    public void setDiskID(String diskIDParam) {
        this.diskIDParam = diskIDParam;
    }

    public String getDrive() {
        return driveParam;
    }

    public void setDrive(String driveParam) {
        this.driveParam = driveParam;
    }

    public Boolean getEncrypted() {
        return encryptedParam;
    }

    public void setEncrypted(Boolean encryptedParam) {
        this.encryptedParam = encryptedParam;
    }

    public String getIsElastic() {
        return isElasticParam;
    }

    public void setIsElastic(String isElasticParam) {
        this.isElasticParam = isElasticParam;
    }

    public Boolean getIsSharedblock() {
        return isSharedblockParam;
    }

    public void setIsSharedblock(Boolean isSharedblockParam) {
        this.isSharedblockParam = isSharedblockParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public Integer getReadBandwidth() {
        return readBandwidthParam;
    }

    public void setReadBandwidth(Integer readBandwidthParam) {
        this.readBandwidthParam = readBandwidthParam;
    }

    public Integer getReadIOPS() {
        return readIOPSParam;
    }

    public void setReadIOPS(Integer readIOPSParam) {
        this.readIOPSParam = readIOPSParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public Boolean getShareAble() {
        return shareAbleParam;
    }

    public void setShareAble(Boolean shareAbleParam) {
        this.shareAbleParam = shareAbleParam;
    }

    public Integer getSize() {
        return sizeParam;
    }

    public void setSize(Integer sizeParam) {
        this.sizeParam = sizeParam;
    }

    public Integer getSnapshotCount() {
        return snapshotCountParam;
    }

    public void setSnapshotCount(Integer snapshotCountParam) {
        this.snapshotCountParam = snapshotCountParam;
    }

    public String getStorageSetArch() {
        return storageSetArchParam;
    }

    public void setStorageSetArch(String storageSetArchParam) {
        this.storageSetArchParam = storageSetArchParam;
    }

    public String getStorageSetProvider() {
        return storageSetProviderParam;
    }

    public void setStorageSetProvider(String storageSetProviderParam) {
        this.storageSetProviderParam = storageSetProviderParam;
    }

    public String getStorageSetType() {
        return storageSetTypeParam;
    }

    public void setStorageSetType(String storageSetTypeParam) {
        this.storageSetTypeParam = storageSetTypeParam;
    }

    public Integer getTotalBandwidth() {
        return totalBandwidthParam;
    }

    public void setTotalBandwidth(Integer totalBandwidthParam) {
        this.totalBandwidthParam = totalBandwidthParam;
    }

    public Integer getTotalIOPS() {
        return totalIOPSParam;
    }

    public void setTotalIOPS(Integer totalIOPSParam) {
        this.totalIOPSParam = totalIOPSParam;
    }

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

    public Integer getWriteBandwidth() {
        return writeBandwidthParam;
    }

    public void setWriteBandwidth(Integer writeBandwidthParam) {
        this.writeBandwidthParam = writeBandwidthParam;
    }

    public Integer getWriteIOPS() {
        return writeIOPSParam;
    }

    public void setWriteIOPS(Integer writeIOPSParam) {
        this.writeIOPSParam = writeIOPSParam;
    }

}
