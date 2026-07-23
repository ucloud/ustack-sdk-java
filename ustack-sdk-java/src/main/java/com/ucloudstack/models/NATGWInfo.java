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

public class NATGWInfo {

    /** 计费类型，取值范围：Dynamic、Month、Year；兼容历史值：hour、month、year，别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，用于标识NAT网关所属租户组织 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，用于展示所属租户组织名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 删除时间，秒级Unix时间戳 */
    @SerializedName("DeleteTime")
    private Integer deleteTimeParam;

    /** EIP信息列表，用于展示NAT网关绑定的EIP信息 */
    @SerializedName("EIPInfos")
    private List<NATGWEIPInfo> eIPInfosParam;

    /** 租户邮箱，用于展示租户联系人邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 过期时间，秒级Unix时间戳 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 高可用模式，NAT网关的高可用配置，ActiveStandy为主备高可用，Standalone为单机模式 */
    @SerializedName("HighAvailability")
    private String highAvailabilityParam;

    /** NAT网关ID，用于标识NAT网关实例 */
    @SerializedName("NATGWID")
    private String nATGWIDParam;

    /** NAT网关状态，当前生命周期状态，取值范围：Running、Stopped、Stopping、Powering、Unknown、Upgrading2ha、Creating及平台迁移/失败等状态 */
    @SerializedName("NATGWStatus")
    private String nATGWStatusParam;

    /** NAT网关名称，用于标识NAT网关实例 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目ID，用于标识NAT网关所属项目分组 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，用于展示所属项目分组名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，NAT网关创建或操作失败的原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，用于标识NAT网关所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域名称，用于展示地域名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，用于展示NAT网关的描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 安全组ID，用于标识NAT网关绑定的安全组 */
    @SerializedName("SGID")
    private String sGIDParam;

    /** 安全组名称，用于展示绑定安全组名称 */
    @SerializedName("SGName")
    private String sGNameParam;

    /** 存储集群类型，用于标识NAT网关系统盘所在存储集群 */
    @SerializedName("StorageSetType")
    private String storageSetTypeParam;

    /** 子网ID，用于标识NAT网关所属子网 */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称，用于展示所属子网名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;

    /** 标签列表，用于展示NAT网关关联标签 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 删除保护开关，用于防止误删除；0表示开启删除保护，1表示关闭删除保护 */
    @SerializedName("TerminationPolicy")
    private Integer terminationPolicyParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 计算集群类型，用于标识NAT网关虚拟机运行的计算集群 */
    @SerializedName("VMType")
    private String vMTypeParam;

    /** VPCID，用于标识NAT网关所属VPC */
    @SerializedName("VPCID")
    private String vPCIDParam;

    /** VPC名称，用于展示所属VPC名称 */
    @SerializedName("VPCName")
    private String vPCNameParam;


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

    public Integer getDeleteTime() {
        return deleteTimeParam;
    }

    public void setDeleteTime(Integer deleteTimeParam) {
        this.deleteTimeParam = deleteTimeParam;
    }

    public List<NATGWEIPInfo> getEIPInfos() {
        return eIPInfosParam;
    }

    public void setEIPInfos(List<NATGWEIPInfo> eIPInfosParam) {
        this.eIPInfosParam = eIPInfosParam;
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

    public String getHighAvailability() {
        return highAvailabilityParam;
    }

    public void setHighAvailability(String highAvailabilityParam) {
        this.highAvailabilityParam = highAvailabilityParam;
    }

    public String getNATGWID() {
        return nATGWIDParam;
    }

    public void setNATGWID(String nATGWIDParam) {
        this.nATGWIDParam = nATGWIDParam;
    }

    public String getNATGWStatus() {
        return nATGWStatusParam;
    }

    public void setNATGWStatus(String nATGWStatusParam) {
        this.nATGWStatusParam = nATGWStatusParam;
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

    public String getStorageSetType() {
        return storageSetTypeParam;
    }

    public void setStorageSetType(String storageSetTypeParam) {
        this.storageSetTypeParam = storageSetTypeParam;
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

    public Integer getTerminationPolicy() {
        return terminationPolicyParam;
    }

    public void setTerminationPolicy(Integer terminationPolicyParam) {
        this.terminationPolicyParam = terminationPolicyParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getVMType() {
        return vMTypeParam;
    }

    public void setVMType(String vMTypeParam) {
        this.vMTypeParam = vMTypeParam;
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
