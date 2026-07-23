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

public class ResourceTemplateInfo {

    /** 绑定的弹性伸缩组ID列表，模板绑定弹性伸缩组后不允许修改VPCID */
    @SerializedName("BindAsGroupIDs")
    private List<String> bindAsGroupIDsParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 模板内容，JSON字符串格式，包含创建资源所需的完整配置参数 */
    @SerializedName("Content")
    private String contentParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 删除时间，秒级Unix时间戳，未删除时为0 */
    @SerializedName("DeleteTime")
    private Integer deleteTimeParam;

    /** 租户邮箱地址 */
    @SerializedName("Email")
    private String emailParam;

    /** 模板名称，用于展示模板的标识名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目ID，模板所属项目分组标识 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，当模板状态异常时记录失败原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的人性化显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，用于补充说明模板用途 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 模板状态，取值Available/Deleted/Deleting/Failed等资源状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 资源标签列表，用于资源分类和管理 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 模板ID */
    @SerializedName("TemplateID")
    private String templateIDParam;

    /** 模板类型，取值：VM（虚拟机） */
    @SerializedName("TemplateType")
    private String templateTypeParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public List<String> getBindAsGroupIDs() {
        return bindAsGroupIDsParam;
    }

    public void setBindAsGroupIDs(List<String> bindAsGroupIDsParam) {
        this.bindAsGroupIDsParam = bindAsGroupIDsParam;
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

    public String getContent() {
        return contentParam;
    }

    public void setContent(String contentParam) {
        this.contentParam = contentParam;
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

    public String getTemplateID() {
        return templateIDParam;
    }

    public void setTemplateID(String templateIDParam) {
        this.templateIDParam = templateIDParam;
    }

    public String getTemplateType() {
        return templateTypeParam;
    }

    public void setTemplateType(String templateTypeParam) {
        this.templateTypeParam = templateTypeParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
