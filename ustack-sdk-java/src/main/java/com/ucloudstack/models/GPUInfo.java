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

public class GPUInfo {

    /** 设备地址，GPU设备PCI地址 */
    @SerializedName("DeviceAddress")
    private String deviceAddressParam;

    /** 设备名称，GPU设备名称 */
    @SerializedName("DeviceName")
    private String deviceNameParam;

    /** GPUID，GPU唯一标识 */
    @SerializedName("GPUID")
    private String gPUIDParam;

    /** GPU状态，当前状态 */
    @SerializedName("GPUStatus")
    private String gPUStatusParam;

    /** 硬件设备名称，GPU硬件型号 */
    @SerializedName("HDName")
    private String hDNameParam;

    /** Mdev设备名称，GPU虚拟化规格名称 */
    @SerializedName("MdevName")
    private String mdevNameParam;

    /** 规格信息，GPU型号规格 */
    @SerializedName("SpecInfo")
    private String specInfoParam;

    /** vGPU分割类型信息，支持的分割规格详情 */
    @SerializedName("VGPUSplitTypeInfo")
    private VGPUSplitTypeInfo vGPUSplitTypeInfoParam;

    /** 厂商名称，GPU厂商名称 */
    @SerializedName("VendorName")
    private String vendorNameParam;


    public String getDeviceAddress() {
        return deviceAddressParam;
    }

    public void setDeviceAddress(String deviceAddressParam) {
        this.deviceAddressParam = deviceAddressParam;
    }

    public String getDeviceName() {
        return deviceNameParam;
    }

    public void setDeviceName(String deviceNameParam) {
        this.deviceNameParam = deviceNameParam;
    }

    public String getGPUID() {
        return gPUIDParam;
    }

    public void setGPUID(String gPUIDParam) {
        this.gPUIDParam = gPUIDParam;
    }

    public String getGPUStatus() {
        return gPUStatusParam;
    }

    public void setGPUStatus(String gPUStatusParam) {
        this.gPUStatusParam = gPUStatusParam;
    }

    public String getHDName() {
        return hDNameParam;
    }

    public void setHDName(String hDNameParam) {
        this.hDNameParam = hDNameParam;
    }

    public String getMdevName() {
        return mdevNameParam;
    }

    public void setMdevName(String mdevNameParam) {
        this.mdevNameParam = mdevNameParam;
    }

    public String getSpecInfo() {
        return specInfoParam;
    }

    public void setSpecInfo(String specInfoParam) {
        this.specInfoParam = specInfoParam;
    }

    public VGPUSplitTypeInfo getVGPUSplitTypeInfo() {
        return vGPUSplitTypeInfoParam;
    }

    public void setVGPUSplitTypeInfo(VGPUSplitTypeInfo vGPUSplitTypeInfoParam) {
        this.vGPUSplitTypeInfoParam = vGPUSplitTypeInfoParam;
    }

    public String getVendorName() {
        return vendorNameParam;
    }

    public void setVendorName(String vendorNameParam) {
        this.vendorNameParam = vendorNameParam;
    }

}
