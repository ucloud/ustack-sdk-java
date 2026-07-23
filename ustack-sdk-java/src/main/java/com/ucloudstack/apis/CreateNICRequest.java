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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateNICRequest extends Request {

    /** 带宽，单位Mbps，仅WAN类型网卡必填 */
    
    @OpenAPIParam("Bandwidth")
    private Integer bandwidthParam;

    /** 计费类型，用于指定计费模式；仅WAN类型网卡计费生效；取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费），兼容hour/month/year；计费类型别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR，hour->HOUR、month->MONTH、year->YEAR */
    @NotEmpty
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 扩展IP地址，用于网卡绑定额外的IP地址 */
    
    @OpenAPIParam("ExpandIP")
    private String expandIPParam;

    /** 扁平网络ID，指定网卡所属的扁平网络；仅Flat类型网卡必填 */
    
    @OpenAPIParam("FlatNetworkID")
    private String flatNetworkIDParam;

    /** IP地址，指定网卡使用的IP地址；为空时从所属网络自动分配 */
    
    @OpenAPIParam("IP")
    private String iPParam;

    /** IP协议版本，空值表示使用所选VPC或外网网络的默认协议；取值IPv4/IPv6/ALL */
    
    @OpenAPIParam("IPVersion")
    private String iPVersionParam;

    /** 入向平均带宽，仅Flat类型网卡可指定，用于QoS流量整形；0表示不限制，单位Mbps，取值范围由网卡规格配置确定， */
    
    @OpenAPIParam("InAverageBandwidth")
    private Integer inAverageBandwidthParam;

    /** MAC地址，格式为6组2位十六进制数，以冒号或连字符分隔；为空时系统自动分配 */
    
    @OpenAPIParam("MAC")
    private String mACParam;

    /** 网卡类型，指定IP分配来源；取值LAN（VPC内网）、WAN（外网网段）、Flat（扁平网络） */
    @NotEmpty
    @OpenAPIParam("NICType")
    private String nICTypeParam;

    /** 网卡名称，用于标识网卡，长度1-128个字符，仅支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 出向平均带宽，仅Flat类型网卡可指定，用于QoS流量整形；0表示不限制，单位Mbps，取值范围由网卡规格配置确定， */
    
    @OpenAPIParam("OutAverageBandwidth")
    private Integer outAverageBandwidthParam;

    /** 项目ID，资源所属项目分组标识，未传时尝试分配默认项目 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 计费数量，按月/年计费时表示购买Quantity个月/年；仅WAN类型网卡计费生效 */
    @NotEmpty
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，用于说明和注释，长度0-100个字符，禁止包含<script>标签或javascript链接 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 安全组ID，用于管控进出网卡的网络流量；可选，允许不绑定 */
    
    @OpenAPIParam("SGID")
    private String sGIDParam;

    /** 外网线路ID，指定外网IP所属线路；仅WAN类型网卡必填 */
    
    @OpenAPIParam("SegmentID")
    private String segmentIDParam;

    /** 子网ID，网卡所属子网标识；仅LAN类型网卡必填 */
    
    @OpenAPIParam("SubnetID")
    private String subnetIDParam;

    /** 标签键值对，格式为Base64编码的key:value字符串，用于资源标记和分类管理 */
    
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** VPCID，网卡所属的专有网络ID，仅LAN类型网卡使用 */
    
    @OpenAPIParam("VPCID")
    private String vPCIDParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
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

    public String getExpandIP() {
        return expandIPParam;
    }

    public void setExpandIP(String expandIPParam) {
        this.expandIPParam = expandIPParam;
    }

    public String getFlatNetworkID() {
        return flatNetworkIDParam;
    }

    public void setFlatNetworkID(String flatNetworkIDParam) {
        this.flatNetworkIDParam = flatNetworkIDParam;
    }

    public String getIP() {
        return iPParam;
    }

    public void setIP(String iPParam) {
        this.iPParam = iPParam;
    }

    public String getIPVersion() {
        return iPVersionParam;
    }

    public void setIPVersion(String iPVersionParam) {
        this.iPVersionParam = iPVersionParam;
    }

    public Integer getInAverageBandwidth() {
        return inAverageBandwidthParam;
    }

    public void setInAverageBandwidth(Integer inAverageBandwidthParam) {
        this.inAverageBandwidthParam = inAverageBandwidthParam;
    }

    public String getMAC() {
        return mACParam;
    }

    public void setMAC(String mACParam) {
        this.mACParam = mACParam;
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

    public Integer getOutAverageBandwidth() {
        return outAverageBandwidthParam;
    }

    public void setOutAverageBandwidth(Integer outAverageBandwidthParam) {
        this.outAverageBandwidthParam = outAverageBandwidthParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public Integer getQuantity() {
        return quantityParam;
    }

    public void setQuantity(Integer quantityParam) {
        this.quantityParam = quantityParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
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

    public String getSegmentID() {
        return segmentIDParam;
    }

    public void setSegmentID(String segmentIDParam) {
        this.segmentIDParam = segmentIDParam;
    }

    public String getSubnetID() {
        return subnetIDParam;
    }

    public void setSubnetID(String subnetIDParam) {
        this.subnetIDParam = subnetIDParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

    public String getVPCID() {
        return vPCIDParam;
    }

    public void setVPCID(String vPCIDParam) {
        this.vPCIDParam = vPCIDParam;
    }

}
