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

public class TrafficMirrorSource {

    /** 关联的资源ID，源设备所绑定的虚拟机ID */
    @SerializedName("AssociatedResourceID")
    private String associatedResourceIDParam;

    /** 关联的资源名称，源设备所绑定的虚拟机名称 */
    @SerializedName("AssociatedResourceName")
    private String associatedResourceNameParam;

    /** 关联的资源状态，虚拟机的当前状态 */
    @SerializedName("AssociatedResourceStatus")
    private String associatedResourceStatusParam;

    /** 流量方向，可能值：inbound入方向、outbound出方向、all双向 */
    @SerializedName("Direction")
    private String directionParam;

    /** 源设备ID，网卡资源的唯一标识符 */
    @SerializedName("SrcDevice")
    private String srcDeviceParam;

    /** 源设备名称，网卡资源的显示名称 */
    @SerializedName("SrcDeviceName")
    private String srcDeviceNameParam;

    /** 源设备状态，网卡的当前状态，可能值：Available可用、Terminated已终止，若关联虚拟机被删除或销毁，该字段会置为Terminated以提示后续需要更新源设备 */
    @SerializedName("SrcDeviceStatus")
    private String srcDeviceStatusParam;


    public String getAssociatedResourceID() {
        return associatedResourceIDParam;
    }

    public void setAssociatedResourceID(String associatedResourceIDParam) {
        this.associatedResourceIDParam = associatedResourceIDParam;
    }

    public String getAssociatedResourceName() {
        return associatedResourceNameParam;
    }

    public void setAssociatedResourceName(String associatedResourceNameParam) {
        this.associatedResourceNameParam = associatedResourceNameParam;
    }

    public String getAssociatedResourceStatus() {
        return associatedResourceStatusParam;
    }

    public void setAssociatedResourceStatus(String associatedResourceStatusParam) {
        this.associatedResourceStatusParam = associatedResourceStatusParam;
    }

    public String getDirection() {
        return directionParam;
    }

    public void setDirection(String directionParam) {
        this.directionParam = directionParam;
    }

    public String getSrcDevice() {
        return srcDeviceParam;
    }

    public void setSrcDevice(String srcDeviceParam) {
        this.srcDeviceParam = srcDeviceParam;
    }

    public String getSrcDeviceName() {
        return srcDeviceNameParam;
    }

    public void setSrcDeviceName(String srcDeviceNameParam) {
        this.srcDeviceNameParam = srcDeviceNameParam;
    }

    public String getSrcDeviceStatus() {
        return srcDeviceStatusParam;
    }

    public void setSrcDeviceStatus(String srcDeviceStatusParam) {
        this.srcDeviceStatusParam = srcDeviceStatusParam;
    }

}
