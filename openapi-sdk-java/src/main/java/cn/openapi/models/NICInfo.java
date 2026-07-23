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

public class NICInfo {

    /** 带宽，单位Mbps */
    @SerializedName("Bandwidth")
    private Integer bandwidthParam;

    /** 绑定资源ID，网卡当前绑定的资源ID */
    @SerializedName("BindResourceID")
    private String bindResourceIDParam;

    /** 绑定资源名称 */
    @SerializedName("BindResourceName")
    private String bindResourceNameParam;

    /** 绑定资源类型 */
    @SerializedName("BindResourceType")
    private String bindResourceTypeParam;

    /** 计费类型，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费），兼容hour/month/year；计费类型别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR，hour->HOUR、month->MONTH、year->YEAR */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 过期时间，秒级Unix时间戳，仅计费资源有效 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 扁平网络网段，扁平网络型网卡所属的网段范围 */
    @SerializedName("FlatNetwork")
    private String flatNetworkParam;

    /** 扁平网络ID，扁平网络型网卡所属的网络资源标识 */
    @SerializedName("FlatNetworkID")
    private String flatNetworkIDParam;

    /** 扁平网络名称 */
    @SerializedName("FlatNetworkName")
    private String flatNetworkNameParam;

    /** IP地址，网卡当前使用的IP地址 */
    @SerializedName("IP")
    private String iPParam;

    /** IPID，网卡绑定的IP资源标识。网卡级IP/VPC/Subnet/Segment/FlatNetwork信息取自网卡的IPInfos第一个IP，这些是为了兼容，应该优先使用IPInfos */
    @SerializedName("IPID")
    private String iPIDParam;

    /** IP信息列表，网卡绑定的IP地址详细信息 */
    @SerializedName("IPInfos")
    private List<NICIPInfo> iPInfosParam;

    /** 入向流量整形策略，包含是否启用和平均带宽限制 */
    @SerializedName("InTrafficShaping")
    private TrafficShaping inTrafficShapingParam;

    /** 是否弹性网卡，标识网卡是否为可独立创建和管理的弹性网卡 */
    @SerializedName("IsElastic")
    private Boolean isElasticParam;

    /** MAC地址，格式为6组2位十六进制数，以冒号或连字符分隔 */
    @SerializedName("MAC")
    private String mACParam;

    /** 网卡ID，网卡资源的唯一标识 */
    @SerializedName("NICID")
    private String nICIDParam;

    /** 网卡状态，表示网卡当前状态；当资源状态非Available时返回资源状态 */
    @SerializedName("NICStatus")
    private String nICStatusParam;

    /** 网卡类型，LAN表示从VPC内网分配，WAN表示从外网网段分配，Flat表示从扁平网络分配 */
    @SerializedName("NICType")
    private String nICTypeParam;

    /** 网卡名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 出向流量整形策略，包含是否启用和平均带宽限制 */
    @SerializedName("OutTrafficShaping")
    private TrafficShaping outTrafficShapingParam;

    /** 物理网卡型号标准编号，SR-IOV场景下使用的物理网卡型号代码 */
    @SerializedName("PFCode")
    private String pFCodeParam;

    /** 物理网卡型号，SR-IOV场景下使用的物理网卡具体型号 */
    @SerializedName("PFProduct")
    private String pFProductParam;

    /** 物理网卡厂商，SR-IOV场景下使用的物理网卡厂商名称 */
    @SerializedName("PFVendor")
    private String pFVendorParam;

    /** 项目ID */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，网卡状态为失败时的原因描述 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，用于标识网卡所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，用于说明和注释 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 安全组ID，网卡绑定的安全组资源标识 */
    @SerializedName("SGID")
    private String sGIDParam;

    /** 安全组名称 */
    @SerializedName("SGName")
    private String sGNameParam;

    /** 外网线路ID，外网型网卡使用的线路资源标识 */
    @SerializedName("SegmentID")
    private String segmentIDParam;

    /** 外网线路名称 */
    @SerializedName("SegmentName")
    private String segmentNameParam;

    /** 外网线路网段，外网型网卡所属的网段范围 */
    @SerializedName("SegmentNetwork")
    private String segmentNetworkParam;

    /** 子网ID，内网型网卡所属的子网资源标识 */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;

    /** 标签列表 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** VPCID，内网型网卡所属的专有网络ID */
    @SerializedName("VPCID")
    private String vPCIDParam;

    /** VPC名称 */
    @SerializedName("VPCName")
    private String vPCNameParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public String getBindResourceID() {
        return bindResourceIDParam;
    }

    public void setBindResourceID(String bindResourceIDParam) {
        this.bindResourceIDParam = bindResourceIDParam;
    }

    public String getBindResourceName() {
        return bindResourceNameParam;
    }

    public void setBindResourceName(String bindResourceNameParam) {
        this.bindResourceNameParam = bindResourceNameParam;
    }

    public String getBindResourceType() {
        return bindResourceTypeParam;
    }

    public void setBindResourceType(String bindResourceTypeParam) {
        this.bindResourceTypeParam = bindResourceTypeParam;
    }

    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getCompanyName() {
        return companyNameParam;
    }

    public void setCompanyName(String companyNameParam) {
        this.companyNameParam = companyNameParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
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

    public List<NICIPInfo> getIPInfos() {
        return iPInfosParam;
    }

    public void setIPInfos(List<NICIPInfo> iPInfosParam) {
        this.iPInfosParam = iPInfosParam;
    }

    public TrafficShaping getInTrafficShaping() {
        return inTrafficShapingParam;
    }

    public void setInTrafficShaping(TrafficShaping inTrafficShapingParam) {
        this.inTrafficShapingParam = inTrafficShapingParam;
    }

    public Boolean getIsElastic() {
        return isElasticParam;
    }

    public void setIsElastic(Boolean isElasticParam) {
        this.isElasticParam = isElasticParam;
    }

    public String getMAC() {
        return mACParam;
    }

    public void setMAC(String mACParam) {
        this.mACParam = mACParam;
    }

    public String getNICID() {
        return nICIDParam;
    }

    public void setNICID(String nICIDParam) {
        this.nICIDParam = nICIDParam;
    }

    public String getNICStatus() {
        return nICStatusParam;
    }

    public void setNICStatus(String nICStatusParam) {
        this.nICStatusParam = nICStatusParam;
    }

    public String getNICType() {
        return nICTypeParam;
    }

    public void setNICType(String nICTypeParam) {
        this.nICTypeParam = nICTypeParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public TrafficShaping getOutTrafficShaping() {
        return outTrafficShapingParam;
    }

    public void setOutTrafficShaping(TrafficShaping outTrafficShapingParam) {
        this.outTrafficShapingParam = outTrafficShapingParam;
    }

    public String getPFCode() {
        return pFCodeParam;
    }

    public void setPFCode(String pFCodeParam) {
        this.pFCodeParam = pFCodeParam;
    }

    public String getPFProduct() {
        return pFProductParam;
    }

    public void setPFProduct(String pFProductParam) {
        this.pFProductParam = pFProductParam;
    }

    public String getPFVendor() {
        return pFVendorParam;
    }

    public void setPFVendor(String pFVendorParam) {
        this.pFVendorParam = pFVendorParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getProjectName() {
        return projectNameParam;
    }

    public void setProjectName(String projectNameParam) {
        this.projectNameParam = projectNameParam;
    }

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRegionAlias() {
        return regionAliasParam;
    }

    public void setRegionAlias(String regionAliasParam) {
        this.regionAliasParam = regionAliasParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
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

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
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

}
