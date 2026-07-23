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
package com.ucloudstack.apis;

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribeNetworkTopologyResponse extends Response {

    /** 网络拓扑信息列表，包含资源的网络连接详情 */
    @SerializedName("Infos")
    private List<InspectionNetwork> infosParam;

    /** 资源使用总计，按资源类型统计的汇总信息，ResourceType对应InspectionNetwork.ResourceTypeAttr */
    @SerializedName("SummaryInfos")
    private List<ResourceUsageInfo> summaryInfosParam;

    /** 总数，符合条件的网络拓扑记录总数量 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<InspectionNetwork> getInfos() {
        return infosParam;
    }

    public void setInfos(List<InspectionNetwork> infosParam) {
        this.infosParam = infosParam;
    }

    public List<ResourceUsageInfo> getSummaryInfos() {
        return summaryInfosParam;
    }

    public void setSummaryInfos(List<ResourceUsageInfo> summaryInfosParam) {
        this.summaryInfosParam = summaryInfosParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
