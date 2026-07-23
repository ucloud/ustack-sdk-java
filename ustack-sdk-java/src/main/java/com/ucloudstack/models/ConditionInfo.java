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

public class ConditionInfo {

    /** 租户邮箱，租户的邮箱地址，从DescribeUser接口返回 */
    @SerializedName("CompanyEmail")
    private String companyEmailParam;

    /** 租户ID，标识该资源状态所属的租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 状态详细内容，状态的详细描述信息 */
    @SerializedName("Content")
    private String contentParam;

    /** 最近一次状态变更时间，Unix时间戳(秒) */
    @SerializedName("LastTransitionTime")
    private Integer lastTransitionTimeParam;

    /** 地域ID，标识该资源状态所属的地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 资源ID，资源的唯一标识，包含资源类型前缀和14位随机字符 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源名称，资源的显示名称 */
    @SerializedName("ResourceName")
    private String resourceNameParam;

    /** 资源类型 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 状态，条件的当前状态值 */
    @SerializedName("Status")
    private String statusParam;

    /** 类型，状态条件的类型标识 */
    @SerializedName("Type")
    private String typeParam;

    /** 类型翻译，状态条件类型的可读描述 */
    @SerializedName("TypeDesc")
    private String typeDescParam;


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

    public Integer getLastTransitionTime() {
        return lastTransitionTimeParam;
    }

    public void setLastTransitionTime(Integer lastTransitionTimeParam) {
        this.lastTransitionTimeParam = lastTransitionTimeParam;
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

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

    public String getTypeDesc() {
        return typeDescParam;
    }

    public void setTypeDesc(String typeDescParam) {
        this.typeDescParam = typeDescParam;
    }

}
