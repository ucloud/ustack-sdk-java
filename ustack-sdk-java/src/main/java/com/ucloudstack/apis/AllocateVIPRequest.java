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
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class AllocateVIPRequest extends Request {

    /** 关联资源ID列表，指定需要绑定的虚拟机或弹性网卡资源ID；为空表示仅创建不绑定资源；绑定数量上限由配置GlobalConfigKeyVIPBoundLimit控制；关联资源为VM时，LAN要求与VIP同子网，WAN要求所有VM同VPC且不能已绑定NAT模式EIP */
    
    @UCloudStackParam("AssociatedResourceIDs")
    private List<String> associatedResourceIDsParam;

    /** 关联资源类型，指定绑定资源类型；VM表示虚拟机，ELASTIC_NIC表示弹性网卡；为空时默认VM */
    
    @UCloudStackParam("AssociatedResourceType")
    private String associatedResourceTypeParam;

    /** 带宽，单位Mbps，WAN类型VIP必填；LAN类型VIP带宽由系统配置内网带宽上限确定， */
    
    @UCloudStackParam("Bandwidth")
    private Integer bandwidthParam;

    /** 计费类型，WAN类型VIP必填；取值范围：Dynamic（动态）、Month（按月计费）、Year（按年计费），兼容hour/month/year；计费类型别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR，hour->HOUR、month->MONTH、year->YEAR */
    
    @UCloudStackParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** IP地址，指定VIP使用的IP地址；为空时系统自动从子网或外网网段分配可用地址 */
    
    @UCloudStackParam("IP")
    private String iPParam;

    /** IP协议版本，支持IPv4/IPv6/ALL或空值；为空时使用所选子网或外网网段的默认协议；LAN类型VIP会据此匹配对应协议版本子网 */
    
    @UCloudStackParam("IPVersion")
    private String iPVersionParam;

    /** VIP名称，用于标识VIP，长度1-128个字符，仅支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** 项目ID，资源所属项目分组标识，未传时尝试分配默认项目 */
    
    @UCloudStackParam("ProjectID")
    private String projectIDParam;

    /** 计费数量，WAN类型VIP时使用；按月/年计费表示购买Quantity个月/年 */
    @NotEmpty
    @UCloudStackParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注，用于说明和注释，长度0-100个字符，禁止包含<script>标签或javascript链接 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 运营商网段ID，WAN类型VIP必填，用于指定外网VIP所使用的运营商网段 */
    
    @UCloudStackParam("SegmentID")
    private String segmentIDParam;

    /** 子网ID，LAN类型VIP必填，用于从该子网分配VIP地址且与绑定资源处于同一子网；WAN类型VIP不填 */
    
    @UCloudStackParam("SubnetID")
    private String subnetIDParam;

    /** 标签键值对，格式为Base64编码的key:value字符串，用于资源标记和分类管理 */
    
    @UCloudStackParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** VIP类型，LAN为内网VIP，WAN为外网VIP；不同类型VIP的网络配置要求不同 */
    @NotEmpty
    @UCloudStackParam("VIPType")
    private String vIPTypeParam;

    /** VPCID，指定VIP所属的VPC网络 */
    @NotEmpty
    @UCloudStackParam("VPCID")
    private String vPCIDParam;


    public List<String> getAssociatedResourceIDs() {
        return associatedResourceIDsParam;
    }

    public void setAssociatedResourceIDs(List<String> associatedResourceIDsParam) {
        this.associatedResourceIDsParam = associatedResourceIDsParam;
    }

    public String getAssociatedResourceType() {
        return associatedResourceTypeParam;
    }

    public void setAssociatedResourceType(String associatedResourceTypeParam) {
        this.associatedResourceTypeParam = associatedResourceTypeParam;
    }

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

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
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

    public String getVIPType() {
        return vIPTypeParam;
    }

    public void setVIPType(String vIPTypeParam) {
        this.vIPTypeParam = vIPTypeParam;
    }

    public String getVPCID() {
        return vPCIDParam;
    }

    public void setVPCID(String vPCIDParam) {
        this.vPCIDParam = vPCIDParam;
    }

}
