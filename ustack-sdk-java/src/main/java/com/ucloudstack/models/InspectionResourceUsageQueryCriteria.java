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

public class InspectionResourceUsageQueryCriteria {

    /** 用量统计开始时间，Unix时间戳(秒) */
    @SerializedName("BeginTime")
    private Integer beginTimeParam;

    /** 租户信息列表，包含租户的详细信息 */
    @SerializedName("CompanyInfos")
    private List<InspectionResourceUsageCompanyInfo> companyInfosParam;

    /** 用量统计结束时间，Unix时间戳(秒) */
    @SerializedName("EndTime")
    private Integer endTimeParam;

    /** 项目组信息列表，包含项目组的详细信息 */
    @SerializedName("ProjectInfos")
    private List<InspectionResourceUsageProjectInfo> projectInfosParam;

    /** 地域ID */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的显示名称，从AddRegion接口返回 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 资源类型列表 */
    @SerializedName("ResourceTypes")
    private List<String> resourceTypesParam;


    public Integer getBeginTime() {
        return beginTimeParam;
    }

    public void setBeginTime(Integer beginTimeParam) {
        this.beginTimeParam = beginTimeParam;
    }

    public List<InspectionResourceUsageCompanyInfo> getCompanyInfos() {
        return companyInfosParam;
    }

    public void setCompanyInfos(List<InspectionResourceUsageCompanyInfo> companyInfosParam) {
        this.companyInfosParam = companyInfosParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
    }

    public List<InspectionResourceUsageProjectInfo> getProjectInfos() {
        return projectInfosParam;
    }

    public void setProjectInfos(List<InspectionResourceUsageProjectInfo> projectInfosParam) {
        this.projectInfosParam = projectInfosParam;
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

    public List<String> getResourceTypes() {
        return resourceTypesParam;
    }

    public void setResourceTypes(List<String> resourceTypesParam) {
        this.resourceTypesParam = resourceTypesParam;
    }

}
