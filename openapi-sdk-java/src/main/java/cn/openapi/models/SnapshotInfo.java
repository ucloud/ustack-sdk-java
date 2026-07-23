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

public class SnapshotInfo {

    /** 租户ID，快照所属租户标识 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，快照所属租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，Unix 时间戳（秒级） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 磁盘关联资源ID，快照源磁盘当前挂载的资源标识 */
    @SerializedName("DiskAttachResourceID")
    private String diskAttachResourceIDParam;

    /** 磁盘关联资源类型，快照源磁盘挂载资源类型 */
    @SerializedName("DiskAttachResourceType")
    private String diskAttachResourceTypeParam;

    /** 磁盘ID，快照所属的源磁盘标识 */
    @SerializedName("DiskID")
    private String diskIDParam;

    /** 磁盘名称，快照源磁盘名称 */
    @SerializedName("DiskName")
    private String diskNameParam;

    /** 磁盘类型，取值范围：Boot、Data、cdrom、SaveMem、BootImage */
    @SerializedName("DiskType")
    private String diskTypeParam;

    /** 租户邮箱，快照所属租户联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 是否加密，标识快照是否继承源磁盘加密属性 */
    @SerializedName("Encrypted")
    private Boolean encryptedParam;

    /** 快照名称，快照展示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目组ID，快照所属项目组 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目组名称，快照所属项目组名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，创建或回收失败的原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域，快照所属的地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，用于展示 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，用于说明快照用途 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 快照ID，快照标识 */
    @SerializedName("SnapshotID")
    private String snapshotIDParam;

    /** 快照大小，单位GiB */
    @SerializedName("SnapshotSize")
    private Integer snapshotSizeParam;

    /** 快照状态，取值范围：Unknown、Creating、Normal、Rollbacking、Deleting、Deleted */
    @SerializedName("SnapshotStatus")
    private String snapshotStatusParam;

    /** 标签，用于资源分类和检索 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 快照类型，取值范围：Manual（手动快照） */
    @SerializedName("Type")
    private String typeParam;


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

    public String getDiskAttachResourceID() {
        return diskAttachResourceIDParam;
    }

    public void setDiskAttachResourceID(String diskAttachResourceIDParam) {
        this.diskAttachResourceIDParam = diskAttachResourceIDParam;
    }

    public String getDiskAttachResourceType() {
        return diskAttachResourceTypeParam;
    }

    public void setDiskAttachResourceType(String diskAttachResourceTypeParam) {
        this.diskAttachResourceTypeParam = diskAttachResourceTypeParam;
    }

    public String getDiskID() {
        return diskIDParam;
    }

    public void setDiskID(String diskIDParam) {
        this.diskIDParam = diskIDParam;
    }

    public String getDiskName() {
        return diskNameParam;
    }

    public void setDiskName(String diskNameParam) {
        this.diskNameParam = diskNameParam;
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

    public Boolean getEncrypted() {
        return encryptedParam;
    }

    public void setEncrypted(Boolean encryptedParam) {
        this.encryptedParam = encryptedParam;
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

    public String getSnapshotID() {
        return snapshotIDParam;
    }

    public void setSnapshotID(String snapshotIDParam) {
        this.snapshotIDParam = snapshotIDParam;
    }

    public Integer getSnapshotSize() {
        return snapshotSizeParam;
    }

    public void setSnapshotSize(Integer snapshotSizeParam) {
        this.snapshotSizeParam = snapshotSizeParam;
    }

    public String getSnapshotStatus() {
        return snapshotStatusParam;
    }

    public void setSnapshotStatus(String snapshotStatusParam) {
        this.snapshotStatusParam = snapshotStatusParam;
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

}
