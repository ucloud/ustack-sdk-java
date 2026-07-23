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

public class SGDetailInfo {

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

    /** 安全组名称，用于标识和区分不同的安全组 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目ID */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，创建或操作失败时记录具体原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，用于标识安全组所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，安全组的补充说明信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 绑定资源数量，当前安全组已绑定的资源总数 */
    @SerializedName("ResourceCount")
    private Integer resourceCountParam;

    /** 安全组规则列表，包含该安全组定义的所有流量控制规则信息 */
    @SerializedName("Rule")
    private List<SGRuleInfo> ruleParam;

    /** 规则数量，安全组当前配置的规则总数 */
    @SerializedName("RuleCount")
    private Integer ruleCountParam;

    /** 安全组ID，安全组的唯一标识符 */
    @SerializedName("SGID")
    private String sGIDParam;

    /** 资源生命周期状态，当资源状态非Available时返回资源状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 标签列表 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


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

    public Integer getResourceCount() {
        return resourceCountParam;
    }

    public void setResourceCount(Integer resourceCountParam) {
        this.resourceCountParam = resourceCountParam;
    }

    public List<SGRuleInfo> getRule() {
        return ruleParam;
    }

    public void setRule(List<SGRuleInfo> ruleParam) {
        this.ruleParam = ruleParam;
    }

    public Integer getRuleCount() {
        return ruleCountParam;
    }

    public void setRuleCount(Integer ruleCountParam) {
        this.ruleCountParam = ruleCountParam;
    }

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
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
