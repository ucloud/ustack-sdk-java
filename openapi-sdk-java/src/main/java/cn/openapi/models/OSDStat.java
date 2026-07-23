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

public class OSDStat {

    /** 磁盘类型，OSD磁盘类型 */
    @SerializedName("DiskType")
    private String diskTypeParam;

    /** 宿主机IP，OSD所在主机IP地址 */
    @SerializedName("HostIP")
    private String hostIPParam;

    /** 主机名，OSD所在主机名称 */
    @SerializedName("HostName")
    private String hostNameParam;

    /** OSDID，OSD唯一标识 */
    @SerializedName("OSDID")
    private String oSDIDParam;

    /** OSD名称，OSD显示名称 */
    @SerializedName("OSDName")
    private String oSDNameParam;

    /** 大小，OSD容量大小 */
    @SerializedName("Size")
    private Integer sizeParam;

    /** 状态，OSD当前状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 存储类型，用于标识存储类型 */
    @SerializedName("StorageType")
    private String storageTypeParam;

    /** 使用量，已使用容量 */
    @SerializedName("Used")
    private Integer usedParam;


    public String getDiskType() {
        return diskTypeParam;
    }

    public void setDiskType(String diskTypeParam) {
        this.diskTypeParam = diskTypeParam;
    }

    public String getHostIP() {
        return hostIPParam;
    }

    public void setHostIP(String hostIPParam) {
        this.hostIPParam = hostIPParam;
    }

    public String getHostName() {
        return hostNameParam;
    }

    public void setHostName(String hostNameParam) {
        this.hostNameParam = hostNameParam;
    }

    public String getOSDID() {
        return oSDIDParam;
    }

    public void setOSDID(String oSDIDParam) {
        this.oSDIDParam = oSDIDParam;
    }

    public String getOSDName() {
        return oSDNameParam;
    }

    public void setOSDName(String oSDNameParam) {
        this.oSDNameParam = oSDNameParam;
    }

    public Integer getSize() {
        return sizeParam;
    }

    public void setSize(Integer sizeParam) {
        this.sizeParam = sizeParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getStorageType() {
        return storageTypeParam;
    }

    public void setStorageType(String storageTypeParam) {
        this.storageTypeParam = storageTypeParam;
    }

    public Integer getUsed() {
        return usedParam;
    }

    public void setUsed(Integer usedParam) {
        this.usedParam = usedParam;
    }

}
