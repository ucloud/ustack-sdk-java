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

public class IPInfo {

    /** IP地址，具体的网络地址值 */
    @SerializedName("IP")
    private String iPParam;

    /** IPID，IP资源唯一标识 */
    @SerializedName("IPID")
    private String iPIDParam;

    /** IP版本，网络地址协议版本，取值：IPv4、IPv6 */
    @SerializedName("IPVersion")
    private String iPVersionParam;

    /** 默认网关，标识是否为系统默认路由出口 */
    @SerializedName("ISDefaultGW")
    private Integer iSDefaultGWParam;

    /** 网卡ID，虚拟网卡接口标识 */
    @SerializedName("InterfaceID")
    private String interfaceIDParam;

    /** 接口名称，操作系统内的网卡设备名 */
    @SerializedName("InterfaceName")
    private String interfaceNameParam;

    /** 弹性IP，标识是否为弹性公网IP */
    @SerializedName("IsElastic")
    private String isElasticParam;

    /** VIP标识，标识是否为虚拟IP */
    @SerializedName("IsVIP")
    private String isVIPParam;

    /** MAC地址，虚拟网卡的物理地址 */
    @SerializedName("MAC")
    private String mACParam;

    /** 绑定模式，IP与网卡的关联模式，取值：Direct、NAT */
    @SerializedName("Mode")
    private String modeParam;

    /** 网卡型号编码，物理网卡的标准型号编号 */
    @SerializedName("NicPFCode")
    private String nicPFCodeParam;

    /** 网卡产品型号，物理网卡的具体产品型号 */
    @SerializedName("NicPFProduct")
    private String nicPFProductParam;

    /** 网卡厂商，物理网卡的制造厂商 */
    @SerializedName("NicPFVendor")
    private String nicPFVendorParam;

    /** 网卡类型，取值：LAN（内网）、WAN（外网）、Flat（扁平网络） */
    @SerializedName("NicType")
    private String nicTypeParam;

    /** 安全组ID，绑定的安全组资源标识 */
    @SerializedName("SGID")
    private String sGIDParam;

    /** 安全组名称，绑定的安全组可视化名称 */
    @SerializedName("SGName")
    private String sGNameParam;

    /** 网络类型，标识IP的网络属性，取值：public（公网）、private（私网） */
    @SerializedName("Type")
    private String typeParam;


    public String getIP() {
        return iPParam;
    }

    public void setIP(String iPParam) {
        this.iPParam = iPParam;
    }

    public String getIPID() {
        return iPIDParam;
    }

    public void setIPID(String iPIDParam) {
        this.iPIDParam = iPIDParam;
    }

    public String getIPVersion() {
        return iPVersionParam;
    }

    public void setIPVersion(String iPVersionParam) {
        this.iPVersionParam = iPVersionParam;
    }

    public Integer getISDefaultGW() {
        return iSDefaultGWParam;
    }

    public void setISDefaultGW(Integer iSDefaultGWParam) {
        this.iSDefaultGWParam = iSDefaultGWParam;
    }

    public String getInterfaceID() {
        return interfaceIDParam;
    }

    public void setInterfaceID(String interfaceIDParam) {
        this.interfaceIDParam = interfaceIDParam;
    }

    public String getInterfaceName() {
        return interfaceNameParam;
    }

    public void setInterfaceName(String interfaceNameParam) {
        this.interfaceNameParam = interfaceNameParam;
    }

    public String getIsElastic() {
        return isElasticParam;
    }

    public void setIsElastic(String isElasticParam) {
        this.isElasticParam = isElasticParam;
    }

    public String getIsVIP() {
        return isVIPParam;
    }

    public void setIsVIP(String isVIPParam) {
        this.isVIPParam = isVIPParam;
    }

    public String getMAC() {
        return mACParam;
    }

    public void setMAC(String mACParam) {
        this.mACParam = mACParam;
    }

    public String getMode() {
        return modeParam;
    }

    public void setMode(String modeParam) {
        this.modeParam = modeParam;
    }

    public String getNicPFCode() {
        return nicPFCodeParam;
    }

    public void setNicPFCode(String nicPFCodeParam) {
        this.nicPFCodeParam = nicPFCodeParam;
    }

    public String getNicPFProduct() {
        return nicPFProductParam;
    }

    public void setNicPFProduct(String nicPFProductParam) {
        this.nicPFProductParam = nicPFProductParam;
    }

    public String getNicPFVendor() {
        return nicPFVendorParam;
    }

    public void setNicPFVendor(String nicPFVendorParam) {
        this.nicPFVendorParam = nicPFVendorParam;
    }

    public String getNicType() {
        return nicTypeParam;
    }

    public void setNicType(String nicTypeParam) {
        this.nicTypeParam = nicTypeParam;
    }

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

    public String getSGName() {
        return sGNameParam;
    }

    public void setSGName(String sGNameParam) {
        this.sGNameParam = sGNameParam;
    }

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

}
