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

public class InspectionNetwork {

    /** 带宽，网络带宽大小(Mbps) */
    @SerializedName("Bandwidth")
    private Integer bandwidthParam;

    /** 租户ID，标识该网络拓扑所属的租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 邮箱，租户的邮箱地址，从DescribeUser接口返回 */
    @SerializedName("Email")
    private String emailParam;

    /** 扁平网络ID，扁平网络的ID，包含flatnet前缀和14位随机字符 */
    @SerializedName("FlatNetworkID")
    private String flatNetworkIDParam;

    /** 扁平网络名称，扁平网络的显示名称 */
    @SerializedName("FlatNetworkName")
    private String flatNetworkNameParam;

    /** IP地址，资源绑定的IP地址 */
    @SerializedName("IpAddress")
    private String ipAddressParam;

    /** IP ID，IP地址资源的ID，包含ip前缀和14位随机字符 */
    @SerializedName("IpID")
    private String ipIDParam;

    /** IP版本，IP地址的协议版本 */
    @SerializedName("IpVersion")
    private String ipVersionParam;

    /** 是否主网卡，标识该网卡是否为资源的主要网络接口 */
    @SerializedName("IsPrimary")
    private Boolean isPrimaryParam;

    /** 是否VIP，标识IP是否为虚拟IP */
    @SerializedName("IsVip")
    private Boolean isVipParam;

    /** MAC地址列表，资源绑定的网卡MAC地址 */
    @SerializedName("MacAddresses")
    private List<String> macAddressesParam;

    /** 网络类型，网络连接的类型 */
    @SerializedName("NetworkType")
    private String networkTypeParam;

    /** 地域ID，标识该网络拓扑所属的地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 资源ID，资源的唯一标识，包含资源类型前缀和14位随机字符 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源名称，资源的显示名称 */
    @SerializedName("ResourceName")
    private String resourceNameParam;

    /** 资源类型 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 资源层类型属性，用于分类统计的资源类型标识，与ResourceType对应但可能有差异 */
    @SerializedName("ResourceTypeAttr")
    private String resourceTypeAttrParam;

    /** 线路ID，外网线路的ID，包含segment前缀和14位随机字符 */
    @SerializedName("SegmentID")
    private String segmentIDParam;

    /** 线路名称，外网线路的显示名称 */
    @SerializedName("SegmentName")
    private String segmentNameParam;

    /** 线路网络，外网线路的网络段 */
    @SerializedName("SegmentNetwork")
    private String segmentNetworkParam;

    /** 状态，资源或IP的当前状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 子网ID，资源所属子网的ID，包含subnet前缀和14位随机字符 */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称，资源所属子网的显示名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;

    /** VPC ID，资源所属VPC的ID，包含vpc前缀和14位随机字符 */
    @SerializedName("VpcID")
    private String vpcIDParam;

    /** VPC名称，资源所属VPC的显示名称 */
    @SerializedName("VpcName")
    private String vpcNameParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
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

    public String getIpAddress() {
        return ipAddressParam;
    }

    public void setIpAddress(String ipAddressParam) {
        this.ipAddressParam = ipAddressParam;
    }

    public String getIpID() {
        return ipIDParam;
    }

    public void setIpID(String ipIDParam) {
        this.ipIDParam = ipIDParam;
    }

    public String getIpVersion() {
        return ipVersionParam;
    }

    public void setIpVersion(String ipVersionParam) {
        this.ipVersionParam = ipVersionParam;
    }

    public Boolean getIsPrimary() {
        return isPrimaryParam;
    }

    public void setIsPrimary(Boolean isPrimaryParam) {
        this.isPrimaryParam = isPrimaryParam;
    }

    public Boolean getIsVip() {
        return isVipParam;
    }

    public void setIsVip(Boolean isVipParam) {
        this.isVipParam = isVipParam;
    }

    public List<String> getMacAddresses() {
        return macAddressesParam;
    }

    public void setMacAddresses(List<String> macAddressesParam) {
        this.macAddressesParam = macAddressesParam;
    }

    public String getNetworkType() {
        return networkTypeParam;
    }

    public void setNetworkType(String networkTypeParam) {
        this.networkTypeParam = networkTypeParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public String getResourceName() {
        return resourceNameParam;
    }

    public void setResourceName(String resourceNameParam) {
        this.resourceNameParam = resourceNameParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public String getResourceTypeAttr() {
        return resourceTypeAttrParam;
    }

    public void setResourceTypeAttr(String resourceTypeAttrParam) {
        this.resourceTypeAttrParam = resourceTypeAttrParam;
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

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
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

    public String getVpcID() {
        return vpcIDParam;
    }

    public void setVpcID(String vpcIDParam) {
        this.vpcIDParam = vpcIDParam;
    }

    public String getVpcName() {
        return vpcNameParam;
    }

    public void setVpcName(String vpcNameParam) {
        this.vpcNameParam = vpcNameParam;
    }

}
