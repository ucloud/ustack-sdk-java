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

public class AlertInfo {

    /** 活跃时间，告警活跃时间戳，表示告警首次触发或最后一次活跃的时间 */
    @SerializedName("ActiveAt")
    private Integer activeAtParam;

    /** 告警指纹，基于稳定标签生成的唯一标识，用于关联当前告警与历史记录 */
    @SerializedName("AlertFingerprint")
    private String alertFingerprintParam;

    /** 告警实例标识，格式为 AlertFingerprint:ActiveAtUnixNano，用于区分同一指纹在不同触发轮次中的具体实例 */
    @SerializedName("AlertOccurrenceKey")
    private String alertOccurrenceKeyParam;

    /** 租户ID，告警所属租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户邮箱，告警所属租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 忽略截止时间，Unix时间戳(秒)，为0表示未忽略 */
    @SerializedName("IgnoreUntil")
    private Integer ignoreUntilParam;

    /** 是否处于忽略期，true 表示当前时间早于 IgnoreUntil */
    @SerializedName("Ignored")
    private Boolean ignoredParam;

    /** 告警标签，告警标签信息 */
    @SerializedName("LabelSet")
    private List<AlertLabelSet> labelSetParam;

    /** 告警指标，触发告警的监控指标名称 */
    @SerializedName("Metric")
    private String metricParam;

    /** 人工处理状态，取值：Open、Handled；未有状态记录的当前告警默认返回Open */
    @SerializedName("ProcessStatus")
    private String processStatusParam;

    /** 地域，告警所属地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域名称，告警所属地域名称 */
    @SerializedName("RegionName")
    private String regionNameParam;

    /** 告警级别，取值：warning/critical/error */
    @SerializedName("Severity")
    private String severityParam;

    /** 告警状态，取值：inactive/pending/firing */
    @SerializedName("State")
    private String stateParam;

    /** 描述，告警摘要描述 */
    @SerializedName("Summary")
    private String summaryParam;

    /** 资源ID，触发告警的目标资源ID */
    @SerializedName("TargetID")
    private String targetIDParam;

    /** 资源名称，触发告警的目标资源名称 */
    @SerializedName("TargetName")
    private String targetNameParam;

    /** 模板类型，告警规则使用的模板类型 */
    @SerializedName("TemplateType")
    private String templateTypeParam;

    /** 阈值，告警规则设置的触发阈值 */
    @SerializedName("Thresholds")
    private Double thresholdsParam;

    /** 当前值，监控指标实时值 */
    @SerializedName("Value")
    private Double valueParam;


    public Integer getActiveAt() {
        return activeAtParam;
    }

    public void setActiveAt(Integer activeAtParam) {
        this.activeAtParam = activeAtParam;
    }

    public String getAlertFingerprint() {
        return alertFingerprintParam;
    }

    public void setAlertFingerprint(String alertFingerprintParam) {
        this.alertFingerprintParam = alertFingerprintParam;
    }

    public String getAlertOccurrenceKey() {
        return alertOccurrenceKeyParam;
    }

    public void setAlertOccurrenceKey(String alertOccurrenceKeyParam) {
        this.alertOccurrenceKeyParam = alertOccurrenceKeyParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public Integer getIgnoreUntil() {
        return ignoreUntilParam;
    }

    public void setIgnoreUntil(Integer ignoreUntilParam) {
        this.ignoreUntilParam = ignoreUntilParam;
    }

    public Boolean getIgnored() {
        return ignoredParam;
    }

    public void setIgnored(Boolean ignoredParam) {
        this.ignoredParam = ignoredParam;
    }

    public List<AlertLabelSet> getLabelSet() {
        return labelSetParam;
    }

    public void setLabelSet(List<AlertLabelSet> labelSetParam) {
        this.labelSetParam = labelSetParam;
    }

    public String getMetric() {
        return metricParam;
    }

    public void setMetric(String metricParam) {
        this.metricParam = metricParam;
    }

    public String getProcessStatus() {
        return processStatusParam;
    }

    public void setProcessStatus(String processStatusParam) {
        this.processStatusParam = processStatusParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRegionName() {
        return regionNameParam;
    }

    public void setRegionName(String regionNameParam) {
        this.regionNameParam = regionNameParam;
    }

    public String getSeverity() {
        return severityParam;
    }

    public void setSeverity(String severityParam) {
        this.severityParam = severityParam;
    }

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public String getSummary() {
        return summaryParam;
    }

    public void setSummary(String summaryParam) {
        this.summaryParam = summaryParam;
    }

    public String getTargetID() {
        return targetIDParam;
    }

    public void setTargetID(String targetIDParam) {
        this.targetIDParam = targetIDParam;
    }

    public String getTargetName() {
        return targetNameParam;
    }

    public void setTargetName(String targetNameParam) {
        this.targetNameParam = targetNameParam;
    }

    public String getTemplateType() {
        return templateTypeParam;
    }

    public void setTemplateType(String templateTypeParam) {
        this.templateTypeParam = templateTypeParam;
    }

    public Double getThresholds() {
        return thresholdsParam;
    }

    public void setThresholds(Double thresholdsParam) {
        this.thresholdsParam = thresholdsParam;
    }

    public Double getValue() {
        return valueParam;
    }

    public void setValue(Double valueParam) {
        this.valueParam = valueParam;
    }

}
