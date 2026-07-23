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

public class Disk {

    /** 磁盘可用空间大小，单位GB，表示源端磁盘的剩余容量 */
    @SerializedName("Avail")
    private Double availParam;

    /** 设备名称或分区标识，如/dev/sda1、/dev/vda1等，用于唯一标识磁盘分区 */
    @SerializedName("Device")
    private String deviceParam;

    /** 文件系统类型，用于标识磁盘的格式类型 */
    @SerializedName("FsType")
    private String fsTypeParam;

    /** 是否为根分区，用于标识该分区是否为操作系统根分区（挂载点为/） */
    @SerializedName("IsRoot")
    private Boolean isRootParam;

    /** 挂载点路径，表示磁盘分区在源端操作系统中的挂载位置 */
    @SerializedName("MountPoint")
    private String mountPointParam;

    /** 磁盘总大小，单位GB，表示源端磁盘的总容量 */
    @SerializedName("Size")
    private Double sizeParam;


    public Double getAvail() {
        return availParam;
    }

    public void setAvail(Double availParam) {
        this.availParam = availParam;
    }

    public String getDevice() {
        return deviceParam;
    }

    public void setDevice(String deviceParam) {
        this.deviceParam = deviceParam;
    }

    public String getFsType() {
        return fsTypeParam;
    }

    public void setFsType(String fsTypeParam) {
        this.fsTypeParam = fsTypeParam;
    }

    public Boolean getIsRoot() {
        return isRootParam;
    }

    public void setIsRoot(Boolean isRootParam) {
        this.isRootParam = isRootParam;
    }

    public String getMountPoint() {
        return mountPointParam;
    }

    public void setMountPoint(String mountPointParam) {
        this.mountPointParam = mountPointParam;
    }

    public Double getSize() {
        return sizeParam;
    }

    public void setSize(Double sizeParam) {
        this.sizeParam = sizeParam;
    }

}
