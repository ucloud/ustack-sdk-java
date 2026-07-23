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

public class TrafficMirrorSimpleSource {

    /** 是否可用，true表示该方向尚未被其他流量镜像占用可以使用，false表示已被占用 */
    @SerializedName("Available")
    private Boolean availableParam;

    /** 流量方向，拆分为inbound入方向或outbound出方向两条记录，当在某个流量镜像中选择all时会占用双向 */
    @SerializedName("Direction")
    private String directionParam;

    /** 源设备ID，网卡资源的唯一标识符 */
    @SerializedName("SrcDevice")
    private String srcDeviceParam;

    /** 源设备名称，网卡资源的显示名称 */
    @SerializedName("SrcDeviceName")
    private String srcDeviceNameParam;


    public Boolean getAvailable() {
        return availableParam;
    }

    public void setAvailable(Boolean availableParam) {
        this.availableParam = availableParam;
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

}
