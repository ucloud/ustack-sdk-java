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

public class AlertTemplateRuleInfo {

    /** 条件类型，取值：GE/LE/ET/NE/LT/GT */
    @SerializedName("ConditionType")
    private String conditionTypeParam;

    /** 创建时间，告警规则创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 持续时间，告警持续时间（秒） */
    @SerializedName("ForSeconds")
    private Integer forSecondsParam;

    /** 监控指标名称，Prometheus指标名称 */
    @SerializedName("Metric")
    private String metricParam;

    /** 关联通知组ID，通知组ID */
    @SerializedName("NotifyGroupID")
    private String notifyGroupIDParam;

    /** 关联通知组名称，通知组名称 */
    @SerializedName("NotifyGroupName")
    private String notifyGroupNameParam;

    /** PromQL查询表达式，告警表达式 */
    @SerializedName("Query")
    private String queryParam;

    /** 告警规则ID，告警规则唯一标识 */
    @SerializedName("RuleID")
    private String ruleIDParam;

    /** 告警级别，取值：warning/critical/error */
    @SerializedName("Severity")
    private String severityParam;

    /** 告警摘要描述，告警触发条件描述 */
    @SerializedName("Summary")
    private String summaryParam;

    /** 所属告警模板ID，告警模板ID */
    @SerializedName("TemplateID")
    private String templateIDParam;

    /** 告警阈值，触发告警的指标值 */
    @SerializedName("Thresholds")
    private Double thresholdsParam;

    /** 更新时间，告警规则更新时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public String getConditionType() {
        return conditionTypeParam;
    }

    public void setConditionType(String conditionTypeParam) {
        this.conditionTypeParam = conditionTypeParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public Integer getForSeconds() {
        return forSecondsParam;
    }

    public void setForSeconds(Integer forSecondsParam) {
        this.forSecondsParam = forSecondsParam;
    }

    public String getMetric() {
        return metricParam;
    }

    public void setMetric(String metricParam) {
        this.metricParam = metricParam;
    }

    public String getNotifyGroupID() {
        return notifyGroupIDParam;
    }

    public void setNotifyGroupID(String notifyGroupIDParam) {
        this.notifyGroupIDParam = notifyGroupIDParam;
    }

    public String getNotifyGroupName() {
        return notifyGroupNameParam;
    }

    public void setNotifyGroupName(String notifyGroupNameParam) {
        this.notifyGroupNameParam = notifyGroupNameParam;
    }

    public String getQuery() {
        return queryParam;
    }

    public void setQuery(String queryParam) {
        this.queryParam = queryParam;
    }

    public String getRuleID() {
        return ruleIDParam;
    }

    public void setRuleID(String ruleIDParam) {
        this.ruleIDParam = ruleIDParam;
    }

    public String getSeverity() {
        return severityParam;
    }

    public void setSeverity(String severityParam) {
        this.severityParam = severityParam;
    }

    public String getSummary() {
        return summaryParam;
    }

    public void setSummary(String summaryParam) {
        this.summaryParam = summaryParam;
    }

    public String getTemplateID() {
        return templateIDParam;
    }

    public void setTemplateID(String templateIDParam) {
        this.templateIDParam = templateIDParam;
    }

    public Double getThresholds() {
        return thresholdsParam;
    }

    public void setThresholds(Double thresholdsParam) {
        this.thresholdsParam = thresholdsParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
