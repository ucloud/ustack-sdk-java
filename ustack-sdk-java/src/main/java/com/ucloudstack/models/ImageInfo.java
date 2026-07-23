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

public class ImageInfo {

    /** 引导类型，取值bios、uefi */
    @SerializedName("BootloaderType")
    private String bootloaderTypeParam;

    /** 关联虚拟机ID列表，表示挂载了该ISO镜像的虚拟机 */
    @SerializedName("BoundVMIDs")
    private List<String> boundVMIDsParam;

    /** 绑定计算集群ID列表，用于限定镜像可用范围 */
    @SerializedName("BoundVMSetIDs")
    private List<String> boundVMSetIDsParam;

    /** GPU虚拟化支持，标识是否支持vGPU */
    @SerializedName("CanVGPU")
    private Boolean canVGPUParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，资源归属租户的可读名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，资源首次创建的秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，归属租户的联系电子邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 加密状态，标识镜像是否加密 */
    @SerializedName("Encrypted")
    private Boolean encryptedParam;

    /** 镜像描述，等同于Remark */
    @SerializedName("ImageDescription")
    private String imageDescriptionParam;

    /** 镜像格式，返回值为qcow2、iso、vmdk、raw */
    @SerializedName("ImageFormat")
    private String imageFormatParam;

    /** 镜像来源，可能为vm-... image-...、远程URL、Local、System等 */
    @SerializedName("ImageFrom")
    private String imageFromParam;

    /** 镜像ID，镜像唯一标识 */
    @SerializedName("ImageID")
    private String imageIDParam;

    /** 镜像名称，等同于Name */
    @SerializedName("ImageName")
    private String imageNameParam;

    /** 镜像大小，单位GiB */
    @SerializedName("ImageSize")
    private Integer imageSizeParam;

    /** 镜像状态，标识当前生命周期阶段，取值Used、Making、Uploading、Failed、Deleting、Deleted、Initializing、Terminating、Terminated、WaitMaking、WaitUploading、Unknown */
    @SerializedName("ImageStatus")
    private String imageStatusParam;

    /** 镜像类型，返回值为Base或Custom */
    @SerializedName("ImageType")
    private String imageTypeParam;

    /** 上传类型，Remote表示远程URL，Local表示本地上传 */
    @SerializedName("ImportType")
    private String importTypeParam;

    /** 镜像名称，自定义的镜像标识 */
    @SerializedName("Name")
    private String nameParam;

    /** 操作系统发行版，如Ubuntu、CentOS */
    @SerializedName("OSDistribution")
    private String oSDistributionParam;

    /** 操作系统名称，完整发行版名称 */
    @SerializedName("OSName")
    private String oSNameParam;

    /** 操作系统类型，如Linux、Windows */
    @SerializedName("OSType")
    private String oSTypeParam;

    /** 操作进度，反映自制或上传操作的完成百分比 */
    @SerializedName("PreparePrecent")
    private Integer preparePrecentParam;

    /** 项目ID，资源所属的项目分组标识 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，资源归属项目的显示名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，镜像制作或上传失败时的错误原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，资源所属的地理标识 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的人性化显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注信息，对镜像资源的补充说明，需符合uremark规则（0-100字符，禁止包含<script>/javascript） */
    @SerializedName("Remark")
    private String remarkParam;

    /** 可备注性，标识是否允许修改备注 */
    @SerializedName("Remarkable")
    private Boolean remarkableParam;

    /** 架构类型，基于计算集群支持的指令集，如x86_64、aarch64 */
    @SerializedName("SetArch")
    private String setArchParam;

    /** Cloud-Init支持，标识是否支持自动化初始化配置 */
    @SerializedName("SupportCloudInit")
    private Boolean supportCloudInitParam;

    /** 热插拔支持，标识是否支持动态挂载/卸载设备 */
    @SerializedName("SupportHotplug")
    private Boolean supportHotplugParam;

    /** QEMU Guest Agent支持，标识是否支持QGA通讯 */
    @SerializedName("SupportQGA")
    private Boolean supportQGAParam;

    /** 标签列表，资源的分类标记信息 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，资源末次变更的秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public String getBootloaderType() {
        return bootloaderTypeParam;
    }

    public void setBootloaderType(String bootloaderTypeParam) {
        this.bootloaderTypeParam = bootloaderTypeParam;
    }

    public List<String> getBoundVMIDs() {
        return boundVMIDsParam;
    }

    public void setBoundVMIDs(List<String> boundVMIDsParam) {
        this.boundVMIDsParam = boundVMIDsParam;
    }

    public List<String> getBoundVMSetIDs() {
        return boundVMSetIDsParam;
    }

    public void setBoundVMSetIDs(List<String> boundVMSetIDsParam) {
        this.boundVMSetIDsParam = boundVMSetIDsParam;
    }

    public Boolean getCanVGPU() {
        return canVGPUParam;
    }

    public void setCanVGPU(Boolean canVGPUParam) {
        this.canVGPUParam = canVGPUParam;
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

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public Boolean getEncrypted() {
        return encryptedParam;
    }

    public void setEncrypted(Boolean encryptedParam) {
        this.encryptedParam = encryptedParam;
    }

    public String getImageDescription() {
        return imageDescriptionParam;
    }

    public void setImageDescription(String imageDescriptionParam) {
        this.imageDescriptionParam = imageDescriptionParam;
    }

    public String getImageFormat() {
        return imageFormatParam;
    }

    public void setImageFormat(String imageFormatParam) {
        this.imageFormatParam = imageFormatParam;
    }

    public String getImageFrom() {
        return imageFromParam;
    }

    public void setImageFrom(String imageFromParam) {
        this.imageFromParam = imageFromParam;
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

    public Integer getImageSize() {
        return imageSizeParam;
    }

    public void setImageSize(Integer imageSizeParam) {
        this.imageSizeParam = imageSizeParam;
    }

    public String getImageStatus() {
        return imageStatusParam;
    }

    public void setImageStatus(String imageStatusParam) {
        this.imageStatusParam = imageStatusParam;
    }

    public String getImageType() {
        return imageTypeParam;
    }

    public void setImageType(String imageTypeParam) {
        this.imageTypeParam = imageTypeParam;
    }

    public String getImportType() {
        return importTypeParam;
    }

    public void setImportType(String importTypeParam) {
        this.importTypeParam = importTypeParam;
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

    public String getOSType() {
        return oSTypeParam;
    }

    public void setOSType(String oSTypeParam) {
        this.oSTypeParam = oSTypeParam;
    }

    public Integer getPreparePrecent() {
        return preparePrecentParam;
    }

    public void setPreparePrecent(Integer preparePrecentParam) {
        this.preparePrecentParam = preparePrecentParam;
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

    public Boolean getRemarkable() {
        return remarkableParam;
    }

    public void setRemarkable(Boolean remarkableParam) {
        this.remarkableParam = remarkableParam;
    }

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
    }

    public Boolean getSupportCloudInit() {
        return supportCloudInitParam;
    }

    public void setSupportCloudInit(Boolean supportCloudInitParam) {
        this.supportCloudInitParam = supportCloudInitParam;
    }

    public Boolean getSupportHotplug() {
        return supportHotplugParam;
    }

    public void setSupportHotplug(Boolean supportHotplugParam) {
        this.supportHotplugParam = supportHotplugParam;
    }

    public Boolean getSupportQGA() {
        return supportQGAParam;
    }

    public void setSupportQGA(Boolean supportQGAParam) {
        this.supportQGAParam = supportQGAParam;
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
