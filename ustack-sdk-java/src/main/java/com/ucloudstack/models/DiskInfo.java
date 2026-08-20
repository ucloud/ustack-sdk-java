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

public class DiskInfo {

    /** 已挂载资源ID，挂载目标资源标识 */
    @SerializedName("AttachResourceID")
    private String attachResourceIDParam;

    /** 已挂载资源名称，挂载目标资源名称 */
    @SerializedName("AttachResourceName")
    private String attachResourceNameParam;

    /** 已挂载资源整机快照数量，挂载目标资源的整机快照数量 */
    @SerializedName("AttachResourceSnapCount")
    private Integer attachResourceSnapCountParam;

    /** 已挂载资源状态，挂载目标资源状态 */
    @SerializedName("AttachResourceStatus")
    private String attachResourceStatusParam;

    /** 已挂载资源类型，挂载目标资源类型 */
    @SerializedName("AttachResourceType")
    private String attachResourceTypeParam;

    /** 共享盘挂载信息，当磁盘为共享盘且已挂载时返回挂载详情 */
    @SerializedName("AttachShareBlockInfos")
    private List<AttachShareBlock> attachShareBlockInfosParam;

    /** 带宽，单位MB/s */
    @SerializedName("Bandwidth")
    private Integer bandwidthParam;

    /** 计费类型，计费模式，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费）；兼容历史值：hour、month、year，别名映射：Dynamic→HOUR、Month→MONTH、Year→YEAR */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，资源所属的租户标识 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，资源所属租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，Unix 时间戳（秒级） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 创建时是否为系统盘，true表示创建时为系统盘 */
    @SerializedName("CreatedAsBoot")
    private Boolean createdAsBootParam;

    /** 是否禁用QoS，true表示不限制磁盘QoS */
    @SerializedName("DisableQoS")
    private Boolean disableQoSParam;

    /** 磁盘ID，磁盘唯一标识 */
    @SerializedName("DiskID")
    private String diskIDParam;

    /** 磁盘状态，取值范围：Creating、Detached、Attaching、Attached、Detaching、Deleting、Deleted、Rollbacking、Cloning、Shareabling、Shareabled、Blockcopying、Blockcopyed；空值表示未知 */
    @SerializedName("DiskStatus")
    private String diskStatusParam;

    /** 磁盘类型，取值范围：Boot（系统盘）、Data（数据盘）、cdrom（光驱盘）、SaveMem（暂存盘）、BootImage（系统镜像盘） */
    @SerializedName("DiskType")
    private String diskTypeParam;

    /** 设备名，磁盘在虚拟机内的设备名 */
    @SerializedName("Drive")
    private String driveParam;

    /** 租户邮箱，资源所属租户的联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 是否加密，true表示加密磁盘 */
    @SerializedName("Encrypted")
    private Boolean encryptedParam;

    /** 过期时间，Unix 时间戳（秒级） */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** IOPS，磁盘每秒输入输出操作次数 */
    @SerializedName("IOPS")
    private Integer iOPSParam;

    /** 存储热迁移带宽，磁盘热迁移带宽限制 */
    @SerializedName("MigrateBandWidth")
    private Integer migrateBandWidthParam;

    /** 存储迁移原盘，迁移来源磁盘标识 */
    @SerializedName("MigrateFrom")
    private String migrateFromParam;

    /** 磁盘名称，支持中文、英文字母、数字、点（.）、下划线（_）和中划线（-），长度1-128个字符 */
    @SerializedName("Name")
    private String nameParam;

    /** 迁移进度百分比，范围0-100 */
    @SerializedName("Percent")
    private Double percentParam;

    /** 项目组ID，资源所属项目组 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目组名称，资源所属项目组名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 创建失败原因，失败时的错误信息 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域，磁盘所属的地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，用于展示 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，用于说明，长度0-100个中英文字符，禁止包含http://或https://等非法字符 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 存储集群别名，存储集群展示名称 */
    @SerializedName("SetAlias")
    private String setAliasParam;

    /** 存储集群架构，取值范围：HDD、SSD、RSSD */
    @SerializedName("SetArch")
    private String setArchParam;

    /** 存储集群ID，磁盘所属存储集群标识 */
    @SerializedName("SetID")
    private String setIDParam;

    /** 存储集群制备器，底层存储驱动 */
    @SerializedName("SetProvider")
    private String setProviderParam;

    /** 存储集群类型，磁盘所属存储集群类型 */
    @SerializedName("SetType")
    private String setTypeParam;

    /** 是否共享盘，true表示共享盘 */
    @SerializedName("ShareAble")
    private Boolean shareAbleParam;

    /** 磁盘大小，单位GiB */
    @SerializedName("Size")
    private Integer sizeParam;

    /** 快照数量，磁盘快照数量 */
    @SerializedName("SnapshotCount")
    private Integer snapshotCountParam;

    /** 标签，资源标签列表 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;


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

    public Integer getAttachResourceSnapCount() {
        return attachResourceSnapCountParam;
    }

    public void setAttachResourceSnapCount(Integer attachResourceSnapCountParam) {
        this.attachResourceSnapCountParam = attachResourceSnapCountParam;
    }

    public String getAttachResourceStatus() {
        return attachResourceStatusParam;
    }

    public void setAttachResourceStatus(String attachResourceStatusParam) {
        this.attachResourceStatusParam = attachResourceStatusParam;
    }

    public String getAttachResourceType() {
        return attachResourceTypeParam;
    }

    public void setAttachResourceType(String attachResourceTypeParam) {
        this.attachResourceTypeParam = attachResourceTypeParam;
    }

    public List<AttachShareBlock> getAttachShareBlockInfos() {
        return attachShareBlockInfosParam;
    }

    public void setAttachShareBlockInfos(List<AttachShareBlock> attachShareBlockInfosParam) {
        this.attachShareBlockInfosParam = attachShareBlockInfosParam;
    }

    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
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

    public Boolean getCreatedAsBoot() {
        return createdAsBootParam;
    }

    public void setCreatedAsBoot(Boolean createdAsBootParam) {
        this.createdAsBootParam = createdAsBootParam;
    }

    public Boolean getDisableQoS() {
        return disableQoSParam;
    }

    public void setDisableQoS(Boolean disableQoSParam) {
        this.disableQoSParam = disableQoSParam;
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

    public String getDrive() {
        return driveParam;
    }

    public void setDrive(String driveParam) {
        this.driveParam = driveParam;
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

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
    }

    public Integer getIOPS() {
        return iOPSParam;
    }

    public void setIOPS(Integer iOPSParam) {
        this.iOPSParam = iOPSParam;
    }

    public Integer getMigrateBandWidth() {
        return migrateBandWidthParam;
    }

    public void setMigrateBandWidth(Integer migrateBandWidthParam) {
        this.migrateBandWidthParam = migrateBandWidthParam;
    }

    public String getMigrateFrom() {
        return migrateFromParam;
    }

    public void setMigrateFrom(String migrateFromParam) {
        this.migrateFromParam = migrateFromParam;
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

    public Integer getSnapshotCount() {
        return snapshotCountParam;
    }

    public void setSnapshotCount(Integer snapshotCountParam) {
        this.snapshotCountParam = snapshotCountParam;
    }

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

}
