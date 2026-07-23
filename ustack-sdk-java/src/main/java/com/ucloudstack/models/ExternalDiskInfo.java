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

public class ExternalDiskInfo {

    /**  */
    @SerializedName("AttachResourceID")
    private String attachResourceIDParam;

    /**  */
    @SerializedName("AttachResourceName")
    private String attachResourceNameParam;

    /**  */
    @SerializedName("AttachResourceType")
    private String attachResourceTypeParam;

    /**  */
    @SerializedName("AttachShareBlockInfos")
    private List<AttachExternalShareBlock> attachShareBlockInfosParam;

    /**  */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /**  */
    @SerializedName("CompnayName")
    private String compnayNameParam;

    /**  */
    @SerializedName("ComputeSetIDs")
    private String computeSetIDsParam;

    /**  */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /**  */
    @SerializedName("DiskID")
    private String diskIDParam;

    /**  */
    @SerializedName("DiskStatus")
    private String diskStatusParam;

    /**  */
    @SerializedName("DiskType")
    private String diskTypeParam;

    /**  */
    @SerializedName("Email")
    private String emailParam;

    /**  */
    @SerializedName("IQN")
    private String iQNParam;

    /**  */
    @SerializedName("LUNID")
    private String lUNIDParam;

    /**  */
    @SerializedName("MigrateBandWidth")
    private Integer migrateBandWidthParam;

    /**  */
    @SerializedName("Name")
    private String nameParam;

    /** 迁移进度，外置存储盘迁移任务的完成百分比 */
    @SerializedName("Percent")
    private Double percentParam;

    /**  */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /**  */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /**  */
    @SerializedName("Reason")
    private String reasonParam;

    /**  */
    @SerializedName("Region")
    private String regionParam;

    /**  */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /**  */
    @SerializedName("Remark")
    private String remarkParam;

    /**  */
    @SerializedName("SetAlias")
    private String setAliasParam;

    /**  */
    @SerializedName("SetArch")
    private String setArchParam;

    /**  */
    @SerializedName("SetID")
    private String setIDParam;

    /**  */
    @SerializedName("SetProvider")
    private String setProviderParam;

    /**  */
    @SerializedName("SetType")
    private String setTypeParam;

    /**  */
    @SerializedName("ShareAble")
    private Boolean shareAbleParam;

    /**  */
    @SerializedName("Size")
    private Integer sizeParam;

    /**  */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /**  */
    @SerializedName("UsedForVirtSC")
    private Boolean usedForVirtSCParam;


    public String getAttachResourceID() {
        return attachResourceIDParam;
    }

    public void setAttachResourceID(String attachResourceIDParam) {
        this.attachResourceIDParam = attachResourceIDParam;
    }

    public String getAttachResourceName() {
        return attachResourceNameParam;
    }

    public void setAttachResourceName(String attachResourceNameParam) {
        this.attachResourceNameParam = attachResourceNameParam;
    }

    public String getAttachResourceType() {
        return attachResourceTypeParam;
    }

    public void setAttachResourceType(String attachResourceTypeParam) {
        this.attachResourceTypeParam = attachResourceTypeParam;
    }

    public List<AttachExternalShareBlock> getAttachShareBlockInfos() {
        return attachShareBlockInfosParam;
    }

    public void setAttachShareBlockInfos(List<AttachExternalShareBlock> attachShareBlockInfosParam) {
        this.attachShareBlockInfosParam = attachShareBlockInfosParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getCompnayName() {
        return compnayNameParam;
    }

    public void setCompnayName(String compnayNameParam) {
        this.compnayNameParam = compnayNameParam;
    }

    public String getComputeSetIDs() {
        return computeSetIDsParam;
    }

    public void setComputeSetIDs(String computeSetIDsParam) {
        this.computeSetIDsParam = computeSetIDsParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getDiskID() {
        return diskIDParam;
    }

    public void setDiskID(String diskIDParam) {
        this.diskIDParam = diskIDParam;
    }

    public String getDiskStatus() {
        return diskStatusParam;
    }

    public void setDiskStatus(String diskStatusParam) {
        this.diskStatusParam = diskStatusParam;
    }

    public String getDiskType() {
        return diskTypeParam;
    }

    public void setDiskType(String diskTypeParam) {
        this.diskTypeParam = diskTypeParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getIQN() {
        return iQNParam;
    }

    public void setIQN(String iQNParam) {
        this.iQNParam = iQNParam;
    }

    public String getLUNID() {
        return lUNIDParam;
    }

    public void setLUNID(String lUNIDParam) {
        this.lUNIDParam = lUNIDParam;
    }

    public Integer getMigrateBandWidth() {
        return migrateBandWidthParam;
    }

    public void setMigrateBandWidth(Integer migrateBandWidthParam) {
        this.migrateBandWidthParam = migrateBandWidthParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public Double getPercent() {
        return percentParam;
    }

    public void setPercent(Double percentParam) {
        this.percentParam = percentParam;
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

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public String getSetProvider() {
        return setProviderParam;
    }

    public void setSetProvider(String setProviderParam) {
        this.setProviderParam = setProviderParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

    public Boolean getShareAble() {
        return shareAbleParam;
    }

    public void setShareAble(Boolean shareAbleParam) {
        this.shareAbleParam = shareAbleParam;
    }

    public Integer getSize() {
        return sizeParam;
    }

    public void setSize(Integer sizeParam) {
        this.sizeParam = sizeParam;
    }

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public Boolean getUsedForVirtSC() {
        return usedForVirtSCParam;
    }

    public void setUsedForVirtSC(Boolean usedForVirtSCParam) {
        this.usedForVirtSCParam = usedForVirtSCParam;
    }

}
