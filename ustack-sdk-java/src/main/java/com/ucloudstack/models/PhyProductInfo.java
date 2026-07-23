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

public class PhyProductInfo {

    /** 网卡型号标准编号，网卡型号标识 */
    @SerializedName("Code")
    private String codeParam;

    /** 节点下的同型号网卡列表 */
    @SerializedName("PFInfos")
    private List<PFInfo> pFInfosParam;

    /** 网卡型号，网卡型号名称 */
    @SerializedName("Product")
    private String productParam;

    /** 预占VF列表，已占用VF名额但未确定归属PF，例如绑定中的VF卡或未绑定IP的Eth0 */
    @SerializedName("ReservedVFs")
    private List<VFInfo> reservedVFsParam;

    /** 网卡厂商，网卡厂商名称 */
    @SerializedName("Vendor")
    private String vendorParam;


    public String getCode() {
        return codeParam;
    }

    public void setCode(String codeParam) {
        this.codeParam = codeParam;
    }

    public List<PFInfo> getPFInfos() {
        return pFInfosParam;
    }

    public void setPFInfos(List<PFInfo> pFInfosParam) {
        this.pFInfosParam = pFInfosParam;
    }

    public String getProduct() {
        return productParam;
    }

    public void setProduct(String productParam) {
        this.productParam = productParam;
    }

    public List<VFInfo> getReservedVFs() {
        return reservedVFsParam;
    }

    public void setReservedVFs(List<VFInfo> reservedVFsParam) {
        this.reservedVFsParam = reservedVFsParam;
    }

    public String getVendor() {
        return vendorParam;
    }

    public void setVendor(String vendorParam) {
        this.vendorParam = vendorParam;
    }

}
