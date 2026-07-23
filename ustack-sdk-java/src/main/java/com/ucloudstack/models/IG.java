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

public class IG {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，用于展示资源所属租户 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，用于展示资源所属租户的联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 隔离组ID，系统生成的唯一标识 */
    @SerializedName("IGID")
    private String iGIDParam;

    /** 是否启用，标识隔离组策略是否生效 */
    @SerializedName("IsEnable")
    private Boolean isEnableParam;

    /** 是否强制执行，强制模式下即使不满足策略也会执行 */
    @SerializedName("IsForce")
    private Boolean isForceParam;

    /** 隔离组名称，用于标识隔离组并便于检索管理，长度1-128个字符，仅支持中文、英文字母、数字、点（.）、下划线（_）和中划线（-） */
    @SerializedName("Name")
    private String nameParam;

    /** 策略对象列表，PolicyToVG时为隔离组ID列表，PolicyToNode时为节点标识列表 */
    @SerializedName("PolicyObj")
    private List<String> policyObjParam;

    /** 策略对象类型，取值PolicyToNode/PolicyToVG */
    @SerializedName("PolicyObjType")
    private String policyObjTypeParam;

    /** 策略类型，取值VMAffinity/VMAntiAffinity */
    @SerializedName("PolicyType")
    private String policyTypeParam;

    /** 项目ID，资源所属项目分组标识 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，用于展示资源所属项目 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，资源处于失败状态时的错误说明 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的人性化显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，用于补充说明隔离组用途，长度0-100个字符，禁止包含<script>标签或javascript链接 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 计算集群名称，用于展示计算集群的显示名称 */
    @SerializedName("SetAlias")
    private String setAliasParam;

    /** 计算集群ID，隔离组所属的计算集群 */
    @SerializedName("SetID")
    private String setIDParam;

    /** 计算集群类型，表示隔离组所属集群类型 */
    @SerializedName("SetType")
    private String setTypeParam;

    /** 状态，取值Available/Error，当资源状态非Available时返回资源状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 资源标签，用于展示资源关联的标签信息 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 虚拟机列表，展示隔离组关联的虚拟机信息 */
    @SerializedName("VMs")
    private List<IGVM> vMsParam;


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

    public String getIGID() {
        return iGIDParam;
    }

    public void setIGID(String iGIDParam) {
        this.iGIDParam = iGIDParam;
    }

    public Boolean getIsEnable() {
        return isEnableParam;
    }

    public void setIsEnable(Boolean isEnableParam) {
        this.isEnableParam = isEnableParam;
    }

    public Boolean getIsForce() {
        return isForceParam;
    }

    public void setIsForce(Boolean isForceParam) {
        this.isForceParam = isForceParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public List<String> getPolicyObj() {
        return policyObjParam;
    }

    public void setPolicyObj(List<String> policyObjParam) {
        this.policyObjParam = policyObjParam;
    }

    public String getPolicyObjType() {
        return policyObjTypeParam;
    }

    public void setPolicyObjType(String policyObjTypeParam) {
        this.policyObjTypeParam = policyObjTypeParam;
    }

    public String getPolicyType() {
        return policyTypeParam;
    }

    public void setPolicyType(String policyTypeParam) {
        this.policyTypeParam = policyTypeParam;
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

    public String getSetAlias() {
        return setAliasParam;
    }

    public void setSetAlias(String setAliasParam) {
        this.setAliasParam = setAliasParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
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

    public List<IGVM> getVMs() {
        return vMsParam;
    }

    public void setVMs(List<IGVM> vMsParam) {
        this.vMsParam = vMsParam;
    }

}
