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

public class InspectionInspectionInfo {

    /** 租户唯一标识ID，标识创建该巡检报告的租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，Unix时间戳(秒) */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 一键巡检报告ID */
    @SerializedName("InspectionID")
    private String inspectionIDParam;

    /** 报告名称，巡检报告的显示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 耗时(秒)，巡检任务执行所花费的时间 */
    @SerializedName("Spend")
    private Integer spendParam;

    /** 报告状态，巡检任务的当前执行状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 更新时间，Unix时间戳(秒) */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getInspectionID() {
        return inspectionIDParam;
    }

    public void setInspectionID(String inspectionIDParam) {
        this.inspectionIDParam = inspectionIDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public Integer getSpend() {
        return spendParam;
    }

    public void setSpend(Integer spendParam) {
        this.spendParam = spendParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
