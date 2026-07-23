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

public class KickstartTemplateInfo {

    /** 作者 */
    @SerializedName("Author")
    private String authorParam;

    /** 模板内容 */
    @SerializedName("Content")
    private String contentParam;

    /** 创建时间 */
    @SerializedName("CreatedAt")
    private Integer createdAtParam;

    /** 删除时间 */
    @SerializedName("DeletedAt")
    private Integer deletedAtParam;

    /** 描述 */
    @SerializedName("Description")
    private String descriptionParam;

    /** 模板ID */
    @SerializedName("ID")
    private String iDParam;

    /** 是否激活 */
    @SerializedName("IsActive")
    private Boolean isActiveParam;

    /** 是否为默认模板 */
    @SerializedName("IsDefault")
    private Boolean isDefaultParam;

    /** 模板名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 操作系统发行版 */
    @SerializedName("OSDistribution")
    private String oSDistributionParam;

    /** 父模板ID */
    @SerializedName("ParentID")
    private String parentIDParam;

    /** 分区配置 */
    @SerializedName("PartitionConfig")
    private String partitionConfigParam;

    /** 后安装脚本 */
    @SerializedName("PostScript")
    private String postScriptParam;

    /** 预安装脚本 */
    @SerializedName("PreScript")
    private String preScriptParam;

    /** 标签列表 */
    @SerializedName("Tags")
    private List<String> tagsParam;

    /** 模板类型 */
    @SerializedName("TemplateType")
    private String templateTypeParam;

    /** 更新时间 */
    @SerializedName("UpdatedAt")
    private Integer updatedAtParam;

    /** 支持的变量列表 */
    @SerializedName("Variables")
    private List<String> variablesParam;

    /** 变量JSON Schema */
    @SerializedName("VariablesSchema")
    private String variablesSchemaParam;

    /** 版本号 */
    @SerializedName("Version")
    private Integer versionParam;


    public String getAuthor() {
        return authorParam;
    }

    public void setAuthor(String authorParam) {
        this.authorParam = authorParam;
    }

    public String getContent() {
        return contentParam;
    }

    public void setContent(String contentParam) {
        this.contentParam = contentParam;
    }

    public Integer getCreatedAt() {
        return createdAtParam;
    }

    public void setCreatedAt(Integer createdAtParam) {
        this.createdAtParam = createdAtParam;
    }

    public Integer getDeletedAt() {
        return deletedAtParam;
    }

    public void setDeletedAt(Integer deletedAtParam) {
        this.deletedAtParam = deletedAtParam;
    }

    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
    }

    public String getID() {
        return iDParam;
    }

    public void setID(String iDParam) {
        this.iDParam = iDParam;
    }

    public Boolean getIsActive() {
        return isActiveParam;
    }

    public void setIsActive(Boolean isActiveParam) {
        this.isActiveParam = isActiveParam;
    }

    public Boolean getIsDefault() {
        return isDefaultParam;
    }

    public void setIsDefault(Boolean isDefaultParam) {
        this.isDefaultParam = isDefaultParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getOSDistribution() {
        return oSDistributionParam;
    }

    public void setOSDistribution(String oSDistributionParam) {
        this.oSDistributionParam = oSDistributionParam;
    }

    public String getParentID() {
        return parentIDParam;
    }

    public void setParentID(String parentIDParam) {
        this.parentIDParam = parentIDParam;
    }

    public String getPartitionConfig() {
        return partitionConfigParam;
    }

    public void setPartitionConfig(String partitionConfigParam) {
        this.partitionConfigParam = partitionConfigParam;
    }

    public String getPostScript() {
        return postScriptParam;
    }

    public void setPostScript(String postScriptParam) {
        this.postScriptParam = postScriptParam;
    }

    public String getPreScript() {
        return preScriptParam;
    }

    public void setPreScript(String preScriptParam) {
        this.preScriptParam = preScriptParam;
    }

    public List<String> getTags() {
        return tagsParam;
    }

    public void setTags(List<String> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public String getTemplateType() {
        return templateTypeParam;
    }

    public void setTemplateType(String templateTypeParam) {
        this.templateTypeParam = templateTypeParam;
    }

    public Integer getUpdatedAt() {
        return updatedAtParam;
    }

    public void setUpdatedAt(Integer updatedAtParam) {
        this.updatedAtParam = updatedAtParam;
    }

    public List<String> getVariables() {
        return variablesParam;
    }

    public void setVariables(List<String> variablesParam) {
        this.variablesParam = variablesParam;
    }

    public String getVariablesSchema() {
        return variablesSchemaParam;
    }

    public void setVariablesSchema(String variablesSchemaParam) {
        this.variablesSchemaParam = variablesSchemaParam;
    }

    public Integer getVersion() {
        return versionParam;
    }

    public void setVersion(Integer versionParam) {
        this.versionParam = versionParam;
    }

}
