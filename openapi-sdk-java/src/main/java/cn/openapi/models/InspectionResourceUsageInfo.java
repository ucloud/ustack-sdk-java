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

public class InspectionResourceUsageInfo {

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 资源用量详情列表，包含每个资源的详细用量信息 */
    @SerializedName("Infos")
    private List<InspectionResourceUsageDetail> infosParam;

    /** 项目组ID */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 地域ID */
    @SerializedName("Region")
    private String regionParam;

    /** 资源类型，指定资源的分类 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 总数，该资源类型的用量记录数 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<InspectionResourceUsageDetail> getInfos() {
        return infosParam;
    }

    public void setInfos(List<InspectionResourceUsageDetail> infosParam) {
        this.infosParam = infosParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
