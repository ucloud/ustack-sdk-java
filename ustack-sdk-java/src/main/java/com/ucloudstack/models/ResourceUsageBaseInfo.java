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

public class ResourceUsageBaseInfo {

    /** 创建时间，Unix时间戳(秒) */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 资源用量报告名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 查询条件，创建该资源用量报告时指定的查询参数 */
    @SerializedName("QueryCriteria")
    private InspectionResourceUsageQueryCriteria queryCriteriaParam;

    /** 资源用量ID */
    @SerializedName("ResourceUsageID")
    private String resourceUsageIDParam;

    /** 状态，资源用量统计任务的当前执行状态 */
    @SerializedName("Status")
    private String statusParam;


    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
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

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

}
