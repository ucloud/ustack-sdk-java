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

public class ContainerImageRepositoryInfo {

    /** 租户ID，镜像仓库所属租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，镜像仓库所属租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 镜像数量，仓库内镜像数量 */
    @SerializedName("ContainerImageNumbers")
    private Integer containerImageNumbersParam;

    /** 镜像仓库ID，镜像仓库唯一标识 */
    @SerializedName("ContainerImageRepositoryID")
    private String containerImageRepositoryIDParam;

    /** 创建时间，镜像仓库创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，镜像仓库所属租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 镜像拉取次数，仓库镜像被拉取的总次数 */
    @SerializedName("ImagePullNumbers")
    private Integer imagePullNumbersParam;

    /** 名称，镜像仓库名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目组ID，镜像仓库所属项目组 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目组名称，镜像仓库所属项目组名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 是否为公有仓库，是否对所有用户开放拉取 */
    @SerializedName("Public")
    private Boolean publicParam;

    /** 地域，镜像仓库所属地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，镜像仓库所属地域别名 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 镜像仓库地址，仓库外网地址 */
    @SerializedName("RegistryAddress")
    private String registryAddressParam;

    /** 备注，镜像仓库描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 镜像仓库状态，镜像仓库当前状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 标签，镜像仓库标签 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，镜像仓库更新时间戳 */
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

    public Integer getContainerImageNumbers() {
        return containerImageNumbersParam;
    }

    public void setContainerImageNumbers(Integer containerImageNumbersParam) {
        this.containerImageNumbersParam = containerImageNumbersParam;
    }

    public String getContainerImageRepositoryID() {
        return containerImageRepositoryIDParam;
    }

    public void setContainerImageRepositoryID(String containerImageRepositoryIDParam) {
        this.containerImageRepositoryIDParam = containerImageRepositoryIDParam;
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

    public Integer getImagePullNumbers() {
        return imagePullNumbersParam;
    }

    public void setImagePullNumbers(Integer imagePullNumbersParam) {
        this.imagePullNumbersParam = imagePullNumbersParam;
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

    public Boolean getPublic() {
        return publicParam;
    }

    public void setPublic(Boolean publicParam) {
        this.publicParam = publicParam;
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

    public String getRegistryAddress() {
        return registryAddressParam;
    }

    public void setRegistryAddress(String registryAddressParam) {
        this.registryAddressParam = registryAddressParam;
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
