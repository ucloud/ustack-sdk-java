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

public class PlatformStorageDiskInfo {

    /** 磁盘ID，平台通用存储云盘ID */
    @SerializedName("DiskID")
    private String diskIDParam;

    /** 磁盘大小，云盘容量，单位GiB */
    @SerializedName("DiskSpace")
    private Integer diskSpaceParam;

    /** 磁盘状态，云盘当前状态 */
    @SerializedName("DiskStatus")
    private String diskStatusParam;

    /** 集群架构，云盘所属集群架构 */
    @SerializedName("SetArch")
    private String setArchParam;

    /** 集群类型，云盘所属集群类型 */
    @SerializedName("SetType")
    private String setTypeParam;


    public String getDiskID() {
        return diskIDParam;
    }

    public void setDiskID(String diskIDParam) {
        this.diskIDParam = diskIDParam;
    }

    public Integer getDiskSpace() {
        return diskSpaceParam;
    }

    public void setDiskSpace(Integer diskSpaceParam) {
        this.diskSpaceParam = diskSpaceParam;
    }

    public String getDiskStatus() {
        return diskStatusParam;
    }

    public void setDiskStatus(String diskStatusParam) {
        this.diskStatusParam = diskStatusParam;
    }

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

}
