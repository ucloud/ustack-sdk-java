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

public class ResourceEventInfo {

    /** 租户邮箱，租户的邮箱地址，从DescribeUser接口返回 */
    @SerializedName("CompanyEmail")
    private String companyEmailParam;

    /** 租户ID，标识该资源事件所属的租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 事件内容，事件的详细描述信息 */
    @SerializedName("Content")
    private String contentParam;

    /** 次数，相同事件发生的累计次数 */
    @SerializedName("Count")
    private Integer countParam;

    /** 事件等级，事件的严重程度 */
    @SerializedName("Level")
    private String levelParam;

    /** 人工处理状态，仅当Type=MonitorAlert时返回，取值：Open、Handled；未有状态记录时默认Open */
    @SerializedName("ProcessStatus")
    private String processStatusParam;

    /** 地域ID，标识该资源事件所属的地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 资源事件ID，事件的唯一标识，包含event前缀和14位随机字符 */
    @SerializedName("ResourceEventID")
    private String resourceEventIDParam;

    /** 资源ID，发生事件的资源标识，包含资源类型前缀和14位随机字符 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源名称，发生事件的资源显示名称 */
    @SerializedName("ResourceName")
    private String resourceNameParam;

    /** 资源类型 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 事件开始时间，Unix时间戳(秒) */
    @SerializedName("StartTime")
    private Integer startTimeParam;

    /** 事件类型，事件的分类 */
    @SerializedName("Type")
    private String typeParam;

    /** 更新时间，Unix时间戳(秒) */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public String getCompanyEmail() {
        return companyEmailParam;
    }

    public void setCompanyEmail(String companyEmailParam) {
        this.companyEmailParam = companyEmailParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getContent() {
        return contentParam;
    }

    public void setContent(String contentParam) {
        this.contentParam = contentParam;
    }

    public Integer getCount() {
        return countParam;
    }

    public void setCount(Integer countParam) {
        this.countParam = countParam;
    }

    public String getLevel() {
        return levelParam;
    }

    public void setLevel(String levelParam) {
        this.levelParam = levelParam;
    }

    public String getProcessStatus() {
        return processStatusParam;
    }

    public void setProcessStatus(String processStatusParam) {
        this.processStatusParam = processStatusParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getResourceEventID() {
        return resourceEventIDParam;
    }

    public void setResourceEventID(String resourceEventIDParam) {
        this.resourceEventIDParam = resourceEventIDParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public String getResourceName() {
        return resourceNameParam;
    }

    public void setResourceName(String resourceNameParam) {
        this.resourceNameParam = resourceNameParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public Integer getStartTime() {
        return startTimeParam;
    }

    public void setStartTime(Integer startTimeParam) {
        this.startTimeParam = startTimeParam;
    }

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
