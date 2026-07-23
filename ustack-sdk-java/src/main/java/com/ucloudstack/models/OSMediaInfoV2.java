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

public class OSMediaInfoV2 {

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间 */
    @SerializedName("CreatedAt")
    private Integer createdAtParam;

    /** 描述 */
    @SerializedName("Description")
    private String descriptionParam;

    /** 租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 错误信息 */
    @SerializedName("ErrorMessage")
    private String errorMessageParam;

    /** 文件大小(字节) */
    @SerializedName("FileSize")
    private Integer fileSizeParam;

    /** 镜像ID */
    @SerializedName("ImageID")
    private String imageIDParam;

    /** 是否默认系统镜像 */
    @SerializedName("IsDefault")
    private Boolean isDefaultParam;

    /** 系统镜像ID（Taishan生成） */
    @SerializedName("MediaID")
    private String mediaIDParam;

    /** 系统镜像名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 操作系统发行版（如：CentOS、OpenEuler） */
    @SerializedName("OSDistribution")
    private String oSDistributionParam;

    /** 操作系统完整名称（如：CentOS 7.4 x86_64） */
    @SerializedName("OSName")
    private String oSNameParam;

    /** 项目ID */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 地域 */
    @SerializedName("Region")
    private String regionParam;

    /** SHA256校验和 */
    @SerializedName("SHA256")
    private String sHA256Param;

    /** 状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 标签 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 系统镜像类型: ISO */
    @SerializedName("Type")
    private String typeParam;

    /** 系统镜像URL地址 */
    @SerializedName("URL")
    private String uRLParam;

    /** 更新时间 */
    @SerializedName("UpdatedAt")
    private Integer updatedAtParam;


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

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getErrorMessage() {
        return errorMessageParam;
    }

    public void setErrorMessage(String errorMessageParam) {
        this.errorMessageParam = errorMessageParam;
    }

    public Integer getFileSize() {
        return fileSizeParam;
    }

    public void setFileSize(Integer fileSizeParam) {
        this.fileSizeParam = fileSizeParam;
    }

    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
    }

    public Boolean getIsDefault() {
        return isDefaultParam;
    }

    public void setIsDefault(Boolean isDefaultParam) {
        this.isDefaultParam = isDefaultParam;
    }

    public String getMediaID() {
        return mediaIDParam;
    }

    public void setMediaID(String mediaIDParam) {
        this.mediaIDParam = mediaIDParam;
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

    public String getOSName() {
        return oSNameParam;
    }

    public void setOSName(String oSNameParam) {
        this.oSNameParam = oSNameParam;
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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSHA256() {
        return sHA256Param;
    }

    public void setSHA256(String sHA256Param) {
        this.sHA256Param = sHA256Param;
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

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

    public String getURL() {
        return uRLParam;
    }

    public void setURL(String uRLParam) {
        this.uRLParam = uRLParam;
    }

    public Integer getUpdatedAt() {
        return updatedAtParam;
    }

    public void setUpdatedAt(Integer updatedAtParam) {
        this.updatedAtParam = updatedAtParam;
    }

}
