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

public class PartitionTemplatePartition {

    /** 文件系统挂载选项，对应Kickstart --fsoptions参数 */
    @SerializedName("FSOpts")
    private String fSOptsParam;

    /** 文件系统类型 */
    @SerializedName("FSType")
    private String fSTypeParam;

    /** 是否加密 */
    @SerializedName("IsEncrypted")
    private Boolean isEncryptedParam;

    /** 是否为主分区 */
    @SerializedName("IsPrimary")
    private Boolean isPrimaryParam;

    /** LVM逻辑卷名称（仅LVM方案） */
    @SerializedName("LogicalVolumeName")
    private String logicalVolumeNameParam;

    /** 挂载点 */
    @SerializedName("MountPoint")
    private String mountPointParam;

    /** 大小(MB)，0表示使用剩余空间 */
    @SerializedName("SizeMB")
    private Integer sizeMBParam;


    public String getFSOpts() {
        return fSOptsParam;
    }

    public void setFSOpts(String fSOptsParam) {
        this.fSOptsParam = fSOptsParam;
    }

    public String getFSType() {
        return fSTypeParam;
    }

    public void setFSType(String fSTypeParam) {
        this.fSTypeParam = fSTypeParam;
    }

    public Boolean getIsEncrypted() {
        return isEncryptedParam;
    }

    public void setIsEncrypted(Boolean isEncryptedParam) {
        this.isEncryptedParam = isEncryptedParam;
    }

    public Boolean getIsPrimary() {
        return isPrimaryParam;
    }

    public void setIsPrimary(Boolean isPrimaryParam) {
        this.isPrimaryParam = isPrimaryParam;
    }

    public String getLogicalVolumeName() {
        return logicalVolumeNameParam;
    }

    public void setLogicalVolumeName(String logicalVolumeNameParam) {
        this.logicalVolumeNameParam = logicalVolumeNameParam;
    }

    public String getMountPoint() {
        return mountPointParam;
    }

    public void setMountPoint(String mountPointParam) {
        this.mountPointParam = mountPointParam;
    }

    public Integer getSizeMB() {
        return sizeMBParam;
    }

    public void setSizeMB(Integer sizeMBParam) {
        this.sizeMBParam = sizeMBParam;
    }

}
