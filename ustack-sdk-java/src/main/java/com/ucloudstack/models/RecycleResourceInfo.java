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

public class RecycleResourceInfo {

    /** 租户ID，资源所属租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，资源所属租户的显示名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 删除时间，资源进入回收站的时间，Unix时间戳 */
    @SerializedName("DeleteTime")
    private Integer deleteTimeParam;

    /** 资源描述，资源备注或说明信息 */
    @SerializedName("Description")
    private String descriptionParam;

    /** 租户邮箱，资源所属租户的联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 过期时间，资源到期时间，0表示永不过期 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 是否自动销毁，true表示回收站资源将自动销毁 */
    @SerializedName("IsAutoTerminated")
    private Boolean isAutoTerminatedParam;

    /** 是否失败，true表示资源处于失败状态 */
    @SerializedName("IsFailed")
    private Boolean isFailedParam;

    /** 资源名称，资源的自定义显示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目ID，资源所属项目ID */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，资源所属项目的显示名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 资源操作原因，记录资源状态变更或操作原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，资源所属的物理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的展示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 资源备注，用于记录资源用途或说明 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 资源ID，回收站资源的唯一标识 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源类型，资源类型字符串，如VM、DISK、EIP等 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 状态字符串，资源业务状态的字符串表示 */
    @SerializedName("State")
    private String stateParam;

    /** 状态码，资源状态的数值表示 */
    @SerializedName("Status")
    private Integer statusParam;

    /** 更新时间，Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 预计销毁时间，回收站资源自动销毁时间 */
    @SerializedName("WillTerminateTime")
    private Integer willTerminateTimeParam;


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

    public Integer getDeleteTime() {
        return deleteTimeParam;
    }

    public void setDeleteTime(Integer deleteTimeParam) {
        this.deleteTimeParam = deleteTimeParam;
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

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
    }

    public Boolean getIsAutoTerminated() {
        return isAutoTerminatedParam;
    }

    public void setIsAutoTerminated(Boolean isAutoTerminatedParam) {
        this.isAutoTerminatedParam = isAutoTerminatedParam;
    }

    public Boolean getIsFailed() {
        return isFailedParam;
    }

    public void setIsFailed(Boolean isFailedParam) {
        this.isFailedParam = isFailedParam;
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

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public Integer getStatus() {
        return statusParam;
    }

    public void setStatus(Integer statusParam) {
        this.statusParam = statusParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public Integer getWillTerminateTime() {
        return willTerminateTimeParam;
    }

    public void setWillTerminateTime(Integer willTerminateTimeParam) {
        this.willTerminateTimeParam = willTerminateTimeParam;
    }

}
