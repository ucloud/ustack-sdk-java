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

public class PFInfo {

    /** 网卡型号标准编号，网卡型号标识 */
    @SerializedName("Code")
    private String codeParam;

    /** 网卡名，操作系统设备名 */
    @SerializedName("DeviceName")
    private String deviceNameParam;

    /** 驱动，网卡驱动名称 */
    @SerializedName("Driver")
    private String driverParam;

    /** 网卡状态，当前状态信息 */
    @SerializedName("NICStatus")
    private NICStatus nICStatusParam;

    /** PCI位置，网卡PCI地址 */
    @SerializedName("PCI")
    private String pCIParam;

    /** 网卡型号，网卡型号名称 */
    @SerializedName("Product")
    private String productParam;

    /** 已使用的VF网卡列表 */
    @SerializedName("UsedVFs")
    private List<VFInfo> usedVFsParam;

    /** 逻辑限制的VF数量，VFLogicCount<=VFPhyCount，VFLogicCount为0时以VFPhyCount为准 */
    @SerializedName("VFLogicCount")
    private Integer vFLogicCountParam;

    /** 物理限制的VF数量，网卡物理上限 */
    @SerializedName("VFPhyCount")
    private Integer vFPhyCountParam;

    /** 网卡厂商，网卡厂商名称 */
    @SerializedName("Vendor")
    private String vendorParam;


    public String getCode() {
        return codeParam;
    }

    public void setCode(String codeParam) {
        this.codeParam = codeParam;
    }

    public String getDeviceName() {
        return deviceNameParam;
    }

    public void setDeviceName(String deviceNameParam) {
        this.deviceNameParam = deviceNameParam;
    }

    public String getDriver() {
        return driverParam;
    }

    public void setDriver(String driverParam) {
        this.driverParam = driverParam;
    }

    public NICStatus getNICStatus() {
        return nICStatusParam;
    }

    public void setNICStatus(NICStatus nICStatusParam) {
        this.nICStatusParam = nICStatusParam;
    }

    public String getPCI() {
        return pCIParam;
    }

    public void setPCI(String pCIParam) {
        this.pCIParam = pCIParam;
    }

    public String getProduct() {
        return productParam;
    }

    public void setProduct(String productParam) {
        this.productParam = productParam;
    }

    public List<VFInfo> getUsedVFs() {
        return usedVFsParam;
    }

    public void setUsedVFs(List<VFInfo> usedVFsParam) {
        this.usedVFsParam = usedVFsParam;
    }

    public Integer getVFLogicCount() {
        return vFLogicCountParam;
    }

    public void setVFLogicCount(Integer vFLogicCountParam) {
        this.vFLogicCountParam = vFLogicCountParam;
    }

    public Integer getVFPhyCount() {
        return vFPhyCountParam;
    }

    public void setVFPhyCount(Integer vFPhyCountParam) {
        this.vFPhyCountParam = vFPhyCountParam;
    }

    public String getVendor() {
        return vendorParam;
    }

    public void setVendor(String vendorParam) {
        this.vendorParam = vendorParam;
    }

}
