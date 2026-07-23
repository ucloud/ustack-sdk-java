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

public class InstallIPConfig {

    /** IP地址 */
    @SerializedName("Address")
    private String addressParam;

    /** DNS 服务器列表 */
    @SerializedName("DNS")
    private List<String> dNSParam;

    /** EIP ID */
    @SerializedName("EIPID")
    private String eIPIDParam;

    /** 网关 */
    @SerializedName("Gateway")
    private String gatewayParam;

    /** IP版本 */
    @SerializedName("IPVersion")
    private String iPVersionParam;

    /** 子网掩码 */
    @SerializedName("Netmask")
    private String netmaskParam;

    /** 网络段ID */
    @SerializedName("SegmentID")
    private String segmentIDParam;


    public String getAddress() {
        return addressParam;
    }

    public void setAddress(String addressParam) {
        this.addressParam = addressParam;
    }

    public List<String> getDNS() {
        return dNSParam;
    }

    public void setDNS(List<String> dNSParam) {
        this.dNSParam = dNSParam;
    }

    public String getEIPID() {
        return eIPIDParam;
    }

    public void setEIPID(String eIPIDParam) {
        this.eIPIDParam = eIPIDParam;
    }

    public String getGateway() {
        return gatewayParam;
    }

    public void setGateway(String gatewayParam) {
        this.gatewayParam = gatewayParam;
    }

    public String getIPVersion() {
        return iPVersionParam;
    }

    public void setIPVersion(String iPVersionParam) {
        this.iPVersionParam = iPVersionParam;
    }

    public String getNetmask() {
        return netmaskParam;
    }

    public void setNetmask(String netmaskParam) {
        this.netmaskParam = netmaskParam;
    }

    public String getSegmentID() {
        return segmentIDParam;
    }

    public void setSegmentID(String segmentIDParam) {
        this.segmentIDParam = segmentIDParam;
    }

}
