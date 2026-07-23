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

public class BindableTagResourceInfo {

    /** 租户邮箱地址，用于联系和通知的邮箱 */
    @SerializedName("CompanyEmail")
    private String companyEmailParam;

    /** 租户ID，标识资源所属的租户账户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，资源所属租户的显示名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，Unix时间戳格式，表示资源首次创建的时间 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 地域ID，表示资源所在的物理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 资源ID，全局唯一的资源标识符 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源名称，用户自定义的资源显示名称 */
    @SerializedName("ResourceName")
    private String resourceNameParam;

    /** 资源类型，标识资源的种类，支持包括DISK、VM等多种资源类型 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 标签值，若资源已绑定该标签键则显示当前绑定的值，用于展示资源的现有标签状态 */
    @SerializedName("TagValue")
    private String tagValueParam;


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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
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

    public String getTagValue() {
        return tagValueParam;
    }

    public void setTagValue(String tagValueParam) {
        this.tagValueParam = tagValueParam;
    }

}
