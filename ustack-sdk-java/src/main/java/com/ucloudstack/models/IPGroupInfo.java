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

public class IPGroupInfo {

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** IP组ID，IP组的唯一标识符 */
    @SerializedName("IPGroupID")
    private String iPGroupIDParam;

    /** IP组名称，用于标识IP组 */
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

    /** 地域ID，用于标识IP组所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，IP组的补充说明信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** IP地址规则，IP组包含的IP地址列表，逗号分隔，支持单个IP或CIDR地址段 */
    @SerializedName("Rules")
    private String rulesParam;

    /** 资源生命周期状态，当资源状态非Available时返回资源状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 标签列表 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 已用安全组数量，引用该IP组的安全组规则总数 */
    @SerializedName("UsedSGCount")
    private Integer usedSGCountParam;

    /** 已用安全组列表，包含引用该IP组的安全组信息 */
    @SerializedName("UsedSGIDInfos")
    private List<UsedSGIDInfo> usedSGIDInfosParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
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

    public String getIPGroupID() {
        return iPGroupIDParam;
    }

    public void setIPGroupID(String iPGroupIDParam) {
        this.iPGroupIDParam = iPGroupIDParam;
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

    public String getRules() {
        return rulesParam;
    }

    public void setRules(String rulesParam) {
        this.rulesParam = rulesParam;
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

    public Integer getUsedSGCount() {
        return usedSGCountParam;
    }

    public void setUsedSGCount(Integer usedSGCountParam) {
        this.usedSGCountParam = usedSGCountParam;
    }

    public List<UsedSGIDInfo> getUsedSGIDInfos() {
        return usedSGIDInfosParam;
    }

    public void setUsedSGIDInfos(List<UsedSGIDInfo> usedSGIDInfosParam) {
        this.usedSGIDInfosParam = usedSGIDInfosParam;
    }

}
