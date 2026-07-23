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

public class PFSummary {

    /** 物理网卡型号编号，物理网卡型号的标准编号，格式为厂商ID-设备ID */
    @SerializedName("PFCode")
    private String pFCodeParam;

    /** 网卡型号，物理网卡的具体型号 */
    @SerializedName("Product")
    private String productParam;

    /** VF总量，该物理网卡可提供的虚拟功能（Virtual Function）总数 */
    @SerializedName("VFCount")
    private Integer vFCountParam;

    /** VF已使用数量，该物理网卡已分配给虚拟机的VF数量 */
    @SerializedName("VFUsed")
    private Integer vFUsedParam;

    /** 网卡厂商，物理网卡的制造商名称 */
    @SerializedName("Vendor")
    private String vendorParam;


    public String getPFCode() {
        return pFCodeParam;
    }

    public void setPFCode(String pFCodeParam) {
        this.pFCodeParam = pFCodeParam;
    }

    public String getProduct() {
        return productParam;
    }

    public void setProduct(String productParam) {
        this.productParam = productParam;
    }

    public Integer getVFCount() {
        return vFCountParam;
    }

    public void setVFCount(Integer vFCountParam) {
        this.vFCountParam = vFCountParam;
    }

    public Integer getVFUsed() {
        return vFUsedParam;
    }

    public void setVFUsed(Integer vFUsedParam) {
        this.vFUsedParam = vFUsedParam;
    }

    public String getVendor() {
        return vendorParam;
    }

    public void setVendor(String vendorParam) {
        this.vendorParam = vendorParam;
    }

}
