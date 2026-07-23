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

public class InspectionReport {

    /** 异常项数，检查结果为异常的项数 */
    @SerializedName("AbnormalCount")
    private Integer abnormalCountParam;

    /** 结束时间，巡检任务完成的Unix时间戳(秒) */
    @SerializedName("EndTime")
    private Integer endTimeParam;

    /** 一键巡检报告ID */
    @SerializedName("InspectionID")
    private String inspectionIDParam;

    /** 报告名称，巡检报告的显示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 正常项数，检查结果为正常的项数 */
    @SerializedName("NormalCount")
    private Integer normalCountParam;

    /** 地域报告列表，按地域组织的巡检结果树形结构 */
    @SerializedName("RegionReports")
    private List<MenuOne> regionReportsParam;

    /** 总分，巡检报告的综合评分 */
    @SerializedName("Score")
    private Integer scoreParam;

    /** 耗时(秒)，巡检任务执行所花费的时间 */
    @SerializedName("Spend")
    private Integer spendParam;

    /** 开始时间，巡检任务开始执行的Unix时间戳(秒) */
    @SerializedName("StartTime")
    private Integer startTimeParam;

    /** 报告状态，巡检任务的当前执行状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 总检查项数，本次巡检包含的检查项总数 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public Integer getAbnormalCount() {
        return abnormalCountParam;
    }

    public void setAbnormalCount(Integer abnormalCountParam) {
        this.abnormalCountParam = abnormalCountParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
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

    public Integer getNormalCount() {
        return normalCountParam;
    }

    public void setNormalCount(Integer normalCountParam) {
        this.normalCountParam = normalCountParam;
    }

    public List<MenuOne> getRegionReports() {
        return regionReportsParam;
    }

    public void setRegionReports(List<MenuOne> regionReportsParam) {
        this.regionReportsParam = regionReportsParam;
    }

    public Integer getScore() {
        return scoreParam;
    }

    public void setScore(Integer scoreParam) {
        this.scoreParam = scoreParam;
    }

    public Integer getSpend() {
        return spendParam;
    }

    public void setSpend(Integer spendParam) {
        this.spendParam = spendParam;
    }

    public Integer getStartTime() {
        return startTimeParam;
    }

    public void setStartTime(Integer startTimeParam) {
        this.startTimeParam = startTimeParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
