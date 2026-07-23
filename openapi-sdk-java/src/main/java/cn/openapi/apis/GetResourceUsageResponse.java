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
package cn.openapi.apis;

import cn.openapi.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class GetResourceUsageResponse extends Response {

    /** 资源用量信息列表，包含详细的资源用量数据 */
    @SerializedName("Infos")
    private List<InspectionResourceUsageInfo> infosParam;

    /** 查询条件，创建该资源用量报告时指定的查询参数 */
    @SerializedName("QueryCriteria")
    private InspectionResourceUsageQueryCriteria queryCriteriaParam;

    /** 资源用量ID */
    @SerializedName("ResourceUsageID")
    private String resourceUsageIDParam;

    /** 总数，资源用量信息的总数量 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<InspectionResourceUsageInfo> getInfos() {
        return infosParam;
    }

    public void setInfos(List<InspectionResourceUsageInfo> infosParam) {
        this.infosParam = infosParam;
    }

    public InspectionResourceUsageQueryCriteria getQueryCriteria() {
        return queryCriteriaParam;
    }

    public void setQueryCriteria(InspectionResourceUsageQueryCriteria queryCriteriaParam) {
        this.queryCriteriaParam = queryCriteriaParam;
    }

    public String getResourceUsageID() {
        return resourceUsageIDParam;
    }

    public void setResourceUsageID(String resourceUsageIDParam) {
        this.resourceUsageIDParam = resourceUsageIDParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
