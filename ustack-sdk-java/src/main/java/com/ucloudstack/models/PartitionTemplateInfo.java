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

public class PartitionTemplateInfo {

    /** 分区配置 */
    @SerializedName("Config")
    private PartitionTemplateConfig configParam;

    /** 创建时间 */
    @SerializedName("CreatedAt")
    private Integer createdAtParam;

    /** 创建者 */
    @SerializedName("CreatedBy")
    private String createdByParam;

    /** 删除时间 */
    @SerializedName("DeletedAt")
    private Integer deletedAtParam;

    /** 模板描述 */
    @SerializedName("Description")
    private String descriptionParam;

    /** 模板ID */
    @SerializedName("ID")
    private String iDParam;

    /** 是否为默认模板 */
    @SerializedName("IsDefault")
    private Boolean isDefaultParam;

    /** 是否为系统预定义模板 */
    @SerializedName("IsSystem")
    private Boolean isSystemParam;

    /** 模板名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 操作系统发行版 */
    @SerializedName("OSDistribution")
    private String oSDistributionParam;

    /** 分区方案类型 */
    @SerializedName("SchemeType")
    private String schemeTypeParam;

    /** 更新时间 */
    @SerializedName("UpdatedAt")
    private Integer updatedAtParam;

    /** 更新者 */
    @SerializedName("UpdatedBy")
    private String updatedByParam;

    /** 版本号 */
    @SerializedName("Version")
    private Integer versionParam;


    public PartitionTemplateConfig getConfig() {
        return configParam;
    }

    public void setConfig(PartitionTemplateConfig configParam) {
        this.configParam = configParam;
    }

    public Integer getCreatedAt() {
        return createdAtParam;
    }

    public void setCreatedAt(Integer createdAtParam) {
        this.createdAtParam = createdAtParam;
    }

    public String getCreatedBy() {
        return createdByParam;
    }

    public void setCreatedBy(String createdByParam) {
        this.createdByParam = createdByParam;
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

    public Boolean getIsDefault() {
        return isDefaultParam;
    }

    public void setIsDefault(Boolean isDefaultParam) {
        this.isDefaultParam = isDefaultParam;
    }

    public Boolean getIsSystem() {
        return isSystemParam;
    }

    public void setIsSystem(Boolean isSystemParam) {
        this.isSystemParam = isSystemParam;
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

    public String getSchemeType() {
        return schemeTypeParam;
    }

    public void setSchemeType(String schemeTypeParam) {
        this.schemeTypeParam = schemeTypeParam;
    }

    public Integer getUpdatedAt() {
        return updatedAtParam;
    }

    public void setUpdatedAt(Integer updatedAtParam) {
        this.updatedAtParam = updatedAtParam;
    }

    public String getUpdatedBy() {
        return updatedByParam;
    }

    public void setUpdatedBy(String updatedByParam) {
        this.updatedByParam = updatedByParam;
    }

    public Integer getVersion() {
        return versionParam;
    }

    public void setVersion(Integer versionParam) {
        this.versionParam = versionParam;
    }

}
