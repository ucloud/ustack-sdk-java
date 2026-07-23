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

public class PhysicalDisk {

    /** 存储介质类型，取值范围：1-HDD、2-SSD */
    @SerializedName("Arch")
    private String archParam;

    /** 磁盘用途，取值范围：1-boot、2-cache、3-data */
    @SerializedName("DiskUsage")
    private String diskUsageParam;

    /** 设备名，操作系统识别的设备名 */
    @SerializedName("Drive")
    private String driveParam;

    /** 磁盘健康状态，取值范围：1-healthy、2-unhealthy */
    @SerializedName("HealthStatus")
    private String healthStatusParam;

    /** 逻辑卷，磁盘逻辑卷信息 */
    @SerializedName("LVs")
    private List<LogicalVolume> lVsParam;

    /** 磁盘厂商与位置信息，物理磁盘厂商及位置信息 */
    @SerializedName("Location")
    private List<Location> locationParam;

    /** 磁盘挂载状态，取值范围：1-mounted、2-mounting、3-mount_failed、4-unmounted、5-unmounting、6-unmount_failed */
    @SerializedName("MountStatus")
    private String mountStatusParam;

    /** 磁盘分区，磁盘分区信息 */
    @SerializedName("Partitions")
    private List<PhysicalDiskPartition> partitionsParam;

    /** 设备序列号，磁盘设备序列号 */
    @SerializedName("SerialNumber")
    private String serialNumberParam;

    /** 磁盘大小，单位GiB */
    @SerializedName("Size")
    private Integer sizeParam;

    /** WWID（全球唯一磁盘标识符），磁盘全局唯一标识 */
    @SerializedName("WWID")
    private String wWIDParam;


    public String getArch() {
        return archParam;
    }

    public void setArch(String archParam) {
        this.archParam = archParam;
    }

    public String getDiskUsage() {
        return diskUsageParam;
    }

    public void setDiskUsage(String diskUsageParam) {
        this.diskUsageParam = diskUsageParam;
    }

    public String getDrive() {
        return driveParam;
    }

    public void setDrive(String driveParam) {
        this.driveParam = driveParam;
    }

    public String getHealthStatus() {
        return healthStatusParam;
    }

    public void setHealthStatus(String healthStatusParam) {
        this.healthStatusParam = healthStatusParam;
    }

    public List<LogicalVolume> getLVs() {
        return lVsParam;
    }

    public void setLVs(List<LogicalVolume> lVsParam) {
        this.lVsParam = lVsParam;
    }

    public List<Location> getLocation() {
        return locationParam;
    }

    public void setLocation(List<Location> locationParam) {
        this.locationParam = locationParam;
    }

    public String getMountStatus() {
        return mountStatusParam;
    }

    public void setMountStatus(String mountStatusParam) {
        this.mountStatusParam = mountStatusParam;
    }

    public List<PhysicalDiskPartition> getPartitions() {
        return partitionsParam;
    }

    public void setPartitions(List<PhysicalDiskPartition> partitionsParam) {
        this.partitionsParam = partitionsParam;
    }

    public String getSerialNumber() {
        return serialNumberParam;
    }

    public void setSerialNumber(String serialNumberParam) {
        this.serialNumberParam = serialNumberParam;
    }

    public Integer getSize() {
        return sizeParam;
    }

    public void setSize(Integer sizeParam) {
        this.sizeParam = sizeParam;
    }

    public String getWWID() {
        return wWIDParam;
    }

    public void setWWID(String wWIDParam) {
        this.wWIDParam = wWIDParam;
    }

}
