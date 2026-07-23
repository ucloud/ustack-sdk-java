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

public class EIPInfo {

    /** EIP带宽，单位为Mbps */
    @SerializedName("Bandwidth")
    private Integer bandwidthParam;

    /** 绑定的资源ID，EIP绑定的资源唯一标识符 */
    @SerializedName("BindResourceID")
    private String bindResourceIDParam;

    /** 绑定的资源名称，EIP绑定资源的名称 */
    @SerializedName("BindResourceName")
    private String bindResourceNameParam;

    /** 绑定资源所属的项目ID */
    @SerializedName("BindResourceProjectID")
    private String bindResourceProjectIDParam;

    /** 绑定的资源类型，取值VM/NATGW/VPNGW/LB/K8S/DTS/OSS/FS/MYSQL/REDIS */
    @SerializedName("BindResourceType")
    private String bindResourceTypeParam;

    /** 绑定时间，秒级Unix时间戳 */
    @SerializedName("BindTime")
    private Integer bindTimeParam;

    /** 是否可以作为默认网关，0表示否，1表示是 */
    @SerializedName("CanDefaultGW")
    private Integer canDefaultGWParam;

    /** 计费类型，EIP的计费模式，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费），兼容hour/month/year，计费类型别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR，hour->HOUR、month->MONTH、year->YEAR */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户唯一标识ID，资源所属租户标识 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，资源所属租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** EIP资源ID，弹性IP的唯一标识符 */
    @SerializedName("EIPID")
    private String eIPIDParam;

    /** 租户邮箱，资源所属租户联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 过期时间，秒级Unix时间戳 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** IP地址，弹性IP对应的公网地址 */
    @SerializedName("IP")
    private String iPParam;

    /** IP版本，取值IPv4/IPv6 */
    @SerializedName("IPVersion")
    private String iPVersionParam;

    /** 是否是默认网关，0表示否，1表示是 */
    @SerializedName("ISDefaultGW")
    private Integer iSDefaultGWParam;

    /** 是否为VIP，0表示否，1表示是，用于标识该IP是否为虚拟IP */
    @SerializedName("ISVIP")
    private Integer iSVIPParam;

    /** 是否弹性，N表示普通EIP，Y表示弹性网卡EIP或VIP */
    @SerializedName("IsElastic")
    private String isElasticParam;

    /** EIP模式，取值NAT/Direct */
    @SerializedName("Mode")
    private String modeParam;

    /** 网卡ID，当IsElastic为Y时表示关联的弹性网卡ID或VIP所在网卡ID */
    @SerializedName("NICID")
    private String nICIDParam;

    /** EIP名称，用于标识弹性IP资源 */
    @SerializedName("Name")
    private String nameParam;

    /** 运营商网段别名 */
    @SerializedName("OperatorAlias")
    private String operatorAliasParam;

    /** 运营商网段名称 */
    @SerializedName("OperatorName")
    private String operatorNameParam;

    /** 项目ID，资源所属项目分组标识 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，资源所属项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，当EIP创建失败时记录具体错误信息 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的人性化显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** EIP备注，用于补充说明 */
    @SerializedName("Remark")
    private String remarkParam;

    /** EIP状态，取值范围：Bound（已绑定）、Bounding（绑定中）、Unbounding（解绑中）、Free（未绑定）、SCHEDULING（调度中）、AVAILABLE（可用）、FAILED（创建失败）、DELETING（删除中）等资源状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 标签列表，资源关联的标签信息 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


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

    public String getBindResourceProjectID() {
        return bindResourceProjectIDParam;
    }

    public void setBindResourceProjectID(String bindResourceProjectIDParam) {
        this.bindResourceProjectIDParam = bindResourceProjectIDParam;
    }

    public String getBindResourceType() {
        return bindResourceTypeParam;
    }

    public void setBindResourceType(String bindResourceTypeParam) {
        this.bindResourceTypeParam = bindResourceTypeParam;
    }

    public Integer getBindTime() {
        return bindTimeParam;
    }

    public void setBindTime(Integer bindTimeParam) {
        this.bindTimeParam = bindTimeParam;
    }

    public Integer getCanDefaultGW() {
        return canDefaultGWParam;
    }

    public void setCanDefaultGW(Integer canDefaultGWParam) {
        this.canDefaultGWParam = canDefaultGWParam;
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

    public String getEIPID() {
        return eIPIDParam;
    }

    public void setEIPID(String eIPIDParam) {
        this.eIPIDParam = eIPIDParam;
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

    public Integer getISDefaultGW() {
        return iSDefaultGWParam;
    }

    public void setISDefaultGW(Integer iSDefaultGWParam) {
        this.iSDefaultGWParam = iSDefaultGWParam;
    }

    public Integer getISVIP() {
        return iSVIPParam;
    }

    public void setISVIP(Integer iSVIPParam) {
        this.iSVIPParam = iSVIPParam;
    }

    public String getIsElastic() {
        return isElasticParam;
    }

    public void setIsElastic(String isElasticParam) {
        this.isElasticParam = isElasticParam;
    }

    public String getMode() {
        return modeParam;
    }

    public void setMode(String modeParam) {
        this.modeParam = modeParam;
    }

    public String getNICID() {
        return nICIDParam;
    }

    public void setNICID(String nICIDParam) {
        this.nICIDParam = nICIDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getOperatorAlias() {
        return operatorAliasParam;
    }

    public void setOperatorAlias(String operatorAliasParam) {
        this.operatorAliasParam = operatorAliasParam;
    }

    public String getOperatorName() {
        return operatorNameParam;
    }

    public void setOperatorName(String operatorNameParam) {
        this.operatorNameParam = operatorNameParam;
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

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
