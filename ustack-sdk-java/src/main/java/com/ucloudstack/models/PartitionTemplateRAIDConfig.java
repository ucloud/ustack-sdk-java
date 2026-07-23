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

public class PartitionTemplateRAIDConfig {

    /** RAID设备名 */
    @SerializedName("Device")
    private String deviceParam;

    /** 文件系统类型 */
    @SerializedName("FSType")
    private String fSTypeParam;

    /** RAID级别: 0,1,5,6,10 */
    @SerializedName("Level")
    private String levelParam;

    /** 成员磁盘 */
    @SerializedName("Members")
    private List<String> membersParam;

    /** 挂载点 */
    @SerializedName("MountPoint")
    private String mountPointParam;


    public String getDevice() {
        return deviceParam;
    }

    public void setDevice(String deviceParam) {
        this.deviceParam = deviceParam;
    }

    public String getFSType() {
        return fSTypeParam;
    }

    public void setFSType(String fSTypeParam) {
        this.fSTypeParam = fSTypeParam;
    }

    public String getLevel() {
        return levelParam;
    }

    public void setLevel(String levelParam) {
        this.levelParam = levelParam;
    }

    public List<String> getMembers() {
        return membersParam;
    }

    public void setMembers(List<String> membersParam) {
        this.membersParam = membersParam;
    }

    public String getMountPoint() {
        return mountPointParam;
    }

    public void setMountPoint(String mountPointParam) {
        this.mountPointParam = mountPointParam;
    }

}
