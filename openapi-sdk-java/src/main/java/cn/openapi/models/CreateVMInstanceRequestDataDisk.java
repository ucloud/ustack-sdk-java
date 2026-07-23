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

public class CreateVMInstanceRequestDataDisk {

    /** 总线类型，取值 virtio，ide，scsi */
    @SerializedName("Bus")
    private String busParam;

    /** 磁盘缓存模式，当前生效的磁盘I/O缓存策略 */
    @SerializedName("CacheMode")
    private String cacheModeParam;

    /** 磁盘ID，需挂载的已有数据盘标识 */
    @SerializedName("DiskID")
    private String diskIDParam;

    /** 磁盘集群类型，指定新建数据盘所属的存储集群 */
    @SerializedName("DiskSetType")
    private String diskSetTypeParam;

    /** 磁盘容量，指定新建数据盘的大小，单位：GiB */
    @SerializedName("DiskSpace")
    private Integer diskSpaceParam;

    /** 磁盘镜像ID */
    @SerializedName("ImageID")
    private String imageIDParam;

    /** QoS限速读带宽，单位MB/s，0表示不限制 */
    @SerializedName("ReadBandwidth")
    private Integer readBandwidthParam;

    /** QoS限速读IOPS，0表示不限制 */
    @SerializedName("ReadIOPS")
    private Integer readIOPSParam;

    /** QoS限速总带宽，单位MB/s，0表示不限制 */
    @SerializedName("TotalBandwidth")
    private Integer totalBandwidthParam;

    /** QoS限速总IOPS，0表示不限制 */
    @SerializedName("TotalIOPS")
    private Integer totalIOPSParam;

    /** QoS限速写带宽，单位MB/s，0表示不限制 */
    @SerializedName("WriteBandwidth")
    private Integer writeBandwidthParam;

    /** QoS限速写IOPS，0表示不限制 */
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

    public String getDiskSetType() {
        return diskSetTypeParam;
    }

    public void setDiskSetType(String diskSetTypeParam) {
        this.diskSetTypeParam = diskSetTypeParam;
    }

    public Integer getDiskSpace() {
        return diskSpaceParam;
    }

    public void setDiskSpace(Integer diskSpaceParam) {
        this.diskSpaceParam = diskSpaceParam;
    }

    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
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
