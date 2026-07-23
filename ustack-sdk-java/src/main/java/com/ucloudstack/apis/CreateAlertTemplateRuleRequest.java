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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateAlertTemplateRuleRequest extends Request {

    /** 条件类型，告警触发比较方式，取值：GE/LE/ET/NE/LT/GT */
    @NotEmpty
    @OpenAPIParam("ConditionType")
    private String conditionTypeParam;

    /** 持续时间，监控指标超过阈值需持续的秒数才触发告警，用于避免瞬间抖动引发误报 */
    @NotEmpty
    @OpenAPIParam("ForSeconds")
    private Integer forSecondsParam;

    /** 监控指标名称，必须是合法的Prometheus指标名，且不能包含大括号 */
    @NotEmpty
    @OpenAPIParam("Metric")
    private String metricParam;

    /** 通知组ID，告警触发通知目标组ID */
    @NotEmpty
    @OpenAPIParam("NotifyGroupID")
    private String notifyGroupIDParam;

    /** PromQL查询表达式，用于计算告警条件，必须是合法的Prometheus查询语法 */
    @NotEmpty
    @OpenAPIParam("Query")
    private String queryParam;

    /** 告警级别，定义告警严重程度，取值：warning/critical/error */
    @NotEmpty
    @OpenAPIParam("Severity")
    private String severityParam;

    /** 告警摘要，描述告警的触发条件和意义，将在告警通知中展示 */
    @NotEmpty
    @OpenAPIParam("Summary")
    private String summaryParam;

    /** 告警模板ID，指定规则所属的告警模板，非管理员租户需验证模板归属权限 */
    @NotEmpty
    @OpenAPIParam("TemplateID")
    private String templateIDParam;

    /** 告警阈值，当监控指标达到此值时触发告警 */
    @NotEmpty
    @OpenAPIParam("Thresholds")
    private Double thresholdsParam;


    public String getConditionType() {
        return conditionTypeParam;
    }

    public void setConditionType(String conditionTypeParam) {
        this.conditionTypeParam = conditionTypeParam;
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

    public String getQuery() {
        return queryParam;
    }

    public void setQuery(String queryParam) {
        this.queryParam = queryParam;
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

}
