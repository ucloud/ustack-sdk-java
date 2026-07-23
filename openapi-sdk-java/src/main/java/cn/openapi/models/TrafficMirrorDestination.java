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

public class TrafficMirrorDestination {

    /** 目标设备标识，PhysicalPort时为物理网卡名称（可能带.vlan后缀，如bond0.100），VM时为虚拟机ID */
    @SerializedName("DstDevice")
    private String dstDeviceParam;

    /** 目标设备名称，PhysicalPort时为物理网卡名称，VM时为虚拟机在资源系统中的显示名称 */
    @SerializedName("DstDeviceName")
    private String dstDeviceNameParam;

    /** 目标链路名称，虚拟机内部网卡名称，仅VM类型有效，需虚拟机安装qga才能获取 */
    @SerializedName("DstLinkName")
    private String dstLinkNameParam;

    /** 目标类型，可能值：PhysicalPort物理端口、VM虚拟机 */
    @SerializedName("DstType")
    private String dstTypeParam;

    /** MAC地址，目标设备的物理地址，仅VM类型有效 */
    @SerializedName("MAC")
    private String mACParam;


    public String getDstDevice() {
        return dstDeviceParam;
    }

    public void setDstDevice(String dstDeviceParam) {
        this.dstDeviceParam = dstDeviceParam;
    }

    public String getDstDeviceName() {
        return dstDeviceNameParam;
    }

    public void setDstDeviceName(String dstDeviceNameParam) {
        this.dstDeviceNameParam = dstDeviceNameParam;
    }

    public String getDstLinkName() {
        return dstLinkNameParam;
    }

    public void setDstLinkName(String dstLinkNameParam) {
        this.dstLinkNameParam = dstLinkNameParam;
    }

    public String getDstType() {
        return dstTypeParam;
    }

    public void setDstType(String dstTypeParam) {
        this.dstTypeParam = dstTypeParam;
    }

    public String getMAC() {
        return mACParam;
    }

    public void setMAC(String mACParam) {
        this.mACParam = mACParam;
    }

}
