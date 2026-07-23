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

public class NICIPInfo {

    /** 带宽，单位Mbps */
    @SerializedName("Bandwidth")
    private Integer bandwidthParam;

    /** 扁平网络网段，扁平网络型IP所属的网段范围 */
    @SerializedName("FlatNetwork")
    private String flatNetworkParam;

    /** 扁平网络ID，扁平网络型IP所属的网络资源标识 */
    @SerializedName("FlatNetworkID")
    private String flatNetworkIDParam;

    /** 扁平网络名称 */
    @SerializedName("FlatNetworkName")
    private String flatNetworkNameParam;

    /** IP地址，具体的IP地址值 */
    @SerializedName("IP")
    private String iPParam;

    /** IPID，IP资源的唯一标识 */
    @SerializedName("IPID")
    private String iPIDParam;

    /** IP协议版本，IPv4或IPv6 */
    @SerializedName("IPVersion")
    private String iPVersionParam;

    /** 是否是VIP，标识该IP是否为虚拟IP */
    @SerializedName("IsVIP")
    private Boolean isVIPParam;

    /** 外网线路ID，外网型IP使用的线路资源标识 */
    @SerializedName("SegmentID")
    private String segmentIDParam;

    /** 外网线路名称 */
    @SerializedName("SegmentName")
    private String segmentNameParam;

    /** 外网线路网段，外网型IP所属的网段范围 */
    @SerializedName("SegmentNetwork")
    private String segmentNetworkParam;

    /** 子网ID，内网型IP所属的子网资源标识 */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;

    /** 子网网段，子网的CIDR地址范围 */
    @SerializedName("SubnetNetwork")
    private String subnetNetworkParam;

    /** VPCID，内网型IP所属的专有网络ID */
    @SerializedName("VPCID")
    private String vPCIDParam;

    /** VPC名称 */
    @SerializedName("VPCName")
    private String vPCNameParam;

    /** VPC网段，专有网络的CIDR地址范围 */
    @SerializedName("VPCNetwork")
    private String vPCNetworkParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public String getFlatNetwork() {
        return flatNetworkParam;
    }

    public void setFlatNetwork(String flatNetworkParam) {
        this.flatNetworkParam = flatNetworkParam;
    }

    public String getFlatNetworkID() {
        return flatNetworkIDParam;
    }

    public void setFlatNetworkID(String flatNetworkIDParam) {
        this.flatNetworkIDParam = flatNetworkIDParam;
    }

    public String getFlatNetworkName() {
        return flatNetworkNameParam;
    }

    public void setFlatNetworkName(String flatNetworkNameParam) {
        this.flatNetworkNameParam = flatNetworkNameParam;
    }

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

    public Boolean getIsVIP() {
        return isVIPParam;
    }

    public void setIsVIP(Boolean isVIPParam) {
        this.isVIPParam = isVIPParam;
    }

    public String getSegmentID() {
        return segmentIDParam;
    }

    public void setSegmentID(String segmentIDParam) {
        this.segmentIDParam = segmentIDParam;
    }

    public String getSegmentName() {
        return segmentNameParam;
    }

    public void setSegmentName(String segmentNameParam) {
        this.segmentNameParam = segmentNameParam;
    }

    public String getSegmentNetwork() {
        return segmentNetworkParam;
    }

    public void setSegmentNetwork(String segmentNetworkParam) {
        this.segmentNetworkParam = segmentNetworkParam;
    }

    public String getSubnetID() {
        return subnetIDParam;
    }

    public void setSubnetID(String subnetIDParam) {
        this.subnetIDParam = subnetIDParam;
    }

    public String getSubnetName() {
        return subnetNameParam;
    }

    public void setSubnetName(String subnetNameParam) {
        this.subnetNameParam = subnetNameParam;
    }

    public String getSubnetNetwork() {
        return subnetNetworkParam;
    }

    public void setSubnetNetwork(String subnetNetworkParam) {
        this.subnetNetworkParam = subnetNetworkParam;
    }

    public String getVPCID() {
        return vPCIDParam;
    }

    public void setVPCID(String vPCIDParam) {
        this.vPCIDParam = vPCIDParam;
    }

    public String getVPCName() {
        return vPCNameParam;
    }

    public void setVPCName(String vPCNameParam) {
        this.vPCNameParam = vPCNameParam;
    }

    public String getVPCNetwork() {
        return vPCNetworkParam;
    }

    public void setVPCNetwork(String vPCNetworkParam) {
        this.vPCNetworkParam = vPCNetworkParam;
    }

}
