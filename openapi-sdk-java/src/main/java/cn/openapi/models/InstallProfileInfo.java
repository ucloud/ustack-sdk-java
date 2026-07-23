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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class InstallProfileInfo {

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间 */
    @SerializedName("CreatedAt")
    private Integer createdAtParam;

    /** 模板描述，便于识别模板用途 */
    @SerializedName("Description")
    private String descriptionParam;

    /** 模板ID，装机配置模板唯一标识 */
    @SerializedName("ID")
    private String iDParam;

    /** 镜像ID，clone模式使用 */
    @SerializedName("ImageID")
    private String imageIDParam;

    /** 镜像名称，clone模式使用 */
    @SerializedName("ImageName")
    private String imageNameParam;

    /** 镜像操作系统发行版，clone模式使用 */
    @SerializedName("ImageOSDistribution")
    private String imageOSDistributionParam;

    /** 镜像操作系统名称，clone模式使用 */
    @SerializedName("ImageOSName")
    private String imageOSNameParam;

    /** 安装模式，kickstart或clone */
    @SerializedName("InstallMode")
    private String installModeParam;

    /** Kickstart模板ID，关联Kickstart模板资源 */
    @SerializedName("KickstartTemplateID")
    private String kickstartTemplateIDParam;

    /** Kickstart模板名称 */
    @SerializedName("KickstartTemplateName")
    private String kickstartTemplateNameParam;

    /** Kickstart模板操作系统发行版 */
    @SerializedName("KickstartTemplateOSDistribution")
    private String kickstartTemplateOSDistributionParam;

    /** 模板名称，同租户内唯一 */
    @SerializedName("Name")
    private String nameParam;

    /** 系统镜像ID，关联OS媒体资源 */
    @SerializedName("OSMediaID")
    private String oSMediaIDParam;

    /** 系统镜像名称 */
    @SerializedName("OSMediaName")
    private String oSMediaNameParam;

    /** 系统镜像操作系统发行版 */
    @SerializedName("OSMediaOSDistribution")
    private String oSMediaOSDistributionParam;

    /** 系统镜像操作系统名称 */
    @SerializedName("OSMediaOSName")
    private String oSMediaOSNameParam;

    /** 分区模板ID，关联分区模板资源 */
    @SerializedName("PartitionTemplateID")
    private String partitionTemplateIDParam;

    /** 分区模板名称 */
    @SerializedName("PartitionTemplateName")
    private String partitionTemplateNameParam;

    /** 分区模板操作系统发行版 */
    @SerializedName("PartitionTemplateOSDistribution")
    private String partitionTemplateOSDistributionParam;

    /** 分区模板方案类型 */
    @SerializedName("PartitionTemplateSchemeType")
    private String partitionTemplateSchemeTypeParam;

    /** 更新时间 */
    @SerializedName("UpdatedAt")
    private Integer updatedAtParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCreatedAt() {
        return createdAtParam;
    }

    public void setCreatedAt(Integer createdAtParam) {
        this.createdAtParam = createdAtParam;
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

    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
    }

    public String getImageName() {
        return imageNameParam;
    }

    public void setImageName(String imageNameParam) {
        this.imageNameParam = imageNameParam;
    }

    public String getImageOSDistribution() {
        return imageOSDistributionParam;
    }

    public void setImageOSDistribution(String imageOSDistributionParam) {
        this.imageOSDistributionParam = imageOSDistributionParam;
    }

    public String getImageOSName() {
        return imageOSNameParam;
    }

    public void setImageOSName(String imageOSNameParam) {
        this.imageOSNameParam = imageOSNameParam;
    }

    public String getInstallMode() {
        return installModeParam;
    }

    public void setInstallMode(String installModeParam) {
        this.installModeParam = installModeParam;
    }

    public String getKickstartTemplateID() {
        return kickstartTemplateIDParam;
    }

    public void setKickstartTemplateID(String kickstartTemplateIDParam) {
        this.kickstartTemplateIDParam = kickstartTemplateIDParam;
    }

    public String getKickstartTemplateName() {
        return kickstartTemplateNameParam;
    }

    public void setKickstartTemplateName(String kickstartTemplateNameParam) {
        this.kickstartTemplateNameParam = kickstartTemplateNameParam;
    }

    public String getKickstartTemplateOSDistribution() {
        return kickstartTemplateOSDistributionParam;
    }

    public void setKickstartTemplateOSDistribution(String kickstartTemplateOSDistributionParam) {
        this.kickstartTemplateOSDistributionParam = kickstartTemplateOSDistributionParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getOSMediaID() {
        return oSMediaIDParam;
    }

    public void setOSMediaID(String oSMediaIDParam) {
        this.oSMediaIDParam = oSMediaIDParam;
    }

    public String getOSMediaName() {
        return oSMediaNameParam;
    }

    public void setOSMediaName(String oSMediaNameParam) {
        this.oSMediaNameParam = oSMediaNameParam;
    }

    public String getOSMediaOSDistribution() {
        return oSMediaOSDistributionParam;
    }

    public void setOSMediaOSDistribution(String oSMediaOSDistributionParam) {
        this.oSMediaOSDistributionParam = oSMediaOSDistributionParam;
    }

    public String getOSMediaOSName() {
        return oSMediaOSNameParam;
    }

    public void setOSMediaOSName(String oSMediaOSNameParam) {
        this.oSMediaOSNameParam = oSMediaOSNameParam;
    }

    public String getPartitionTemplateID() {
        return partitionTemplateIDParam;
    }

    public void setPartitionTemplateID(String partitionTemplateIDParam) {
        this.partitionTemplateIDParam = partitionTemplateIDParam;
    }

    public String getPartitionTemplateName() {
        return partitionTemplateNameParam;
    }

    public void setPartitionTemplateName(String partitionTemplateNameParam) {
        this.partitionTemplateNameParam = partitionTemplateNameParam;
    }

    public String getPartitionTemplateOSDistribution() {
        return partitionTemplateOSDistributionParam;
    }

    public void setPartitionTemplateOSDistribution(String partitionTemplateOSDistributionParam) {
        this.partitionTemplateOSDistributionParam = partitionTemplateOSDistributionParam;
    }

    public String getPartitionTemplateSchemeType() {
        return partitionTemplateSchemeTypeParam;
    }

    public void setPartitionTemplateSchemeType(String partitionTemplateSchemeTypeParam) {
        this.partitionTemplateSchemeTypeParam = partitionTemplateSchemeTypeParam;
    }

    public Integer getUpdatedAt() {
        return updatedAtParam;
    }

    public void setUpdatedAt(Integer updatedAtParam) {
        this.updatedAtParam = updatedAtParam;
    }

}
