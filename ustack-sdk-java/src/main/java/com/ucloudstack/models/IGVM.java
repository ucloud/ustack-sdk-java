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

public class IGVM {

    /** 宿主机IP地址，虚拟机所在宿主机地址 */
    @SerializedName("HostIP")
    private String hostIPParam;

    /** 隔离组ID列表，虚拟机所属的隔离组 */
    @SerializedName("IGIDs")
    private List<String> iGIDsParam;

    /** 隔离组信息，描述虚拟机与隔离组的关系 */
    @SerializedName("Message")
    private String messageParam;

    /** 虚拟机名称，用于展示虚拟机标识 */
    @SerializedName("Name")
    private String nameParam;

    /** 调度状态 */
    @SerializedName("ScheduleStatus")
    private String scheduleStatusParam;

    /** 虚拟机状态，用于展示运行状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 虚拟机ID，指定虚拟机唯一标识 */
    @SerializedName("VMID")
    private String vMIDParam;


    public String getHostIP() {
        return hostIPParam;
    }

    public void setHostIP(String hostIPParam) {
        this.hostIPParam = hostIPParam;
    }

    public List<String> getIGIDs() {
        return iGIDsParam;
    }

    public void setIGIDs(List<String> iGIDsParam) {
        this.iGIDsParam = iGIDsParam;
    }

    public String getMessage() {
        return messageParam;
    }

    public void setMessage(String messageParam) {
        this.messageParam = messageParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getScheduleStatus() {
        return scheduleStatusParam;
    }

    public void setScheduleStatus(String scheduleStatusParam) {
        this.scheduleStatusParam = scheduleStatusParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
