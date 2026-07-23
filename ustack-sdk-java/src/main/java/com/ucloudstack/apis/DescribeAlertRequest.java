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
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribeAlertRequest extends Request {

    /** 告警实例标识列表，按 AlertFingerprint:ActiveAtUnixNano 精确过滤具体当前告警实例；通常用于从其它页面携带行级上下文跳转当前告警 */
    
    @UCloudStackParam("AlertOccurrenceKeys")
    private List<String> alertOccurrenceKeysParam;

    /** 租户ID，按告警中的company_id标签过滤，仅当告警携带company_id标签时才会命中 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 是否忽略，按当前是否处于忽略期过滤；不传表示不过滤，true 表示仅返回忽略中的告警，false 表示仅返回未忽略告警 */
    
    @UCloudStackParam("Ignored")
    private Boolean ignoredParam;

    /** 分页大小，逻辑上会在合并所有地域的告警并按活跃时间倒序排列后再进行分页，Limit为0时默认10 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，与Limit配合在合并后的告警列表中定位返回窗口 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 人工处理状态列表，按告警处理状态过滤，取值：Open、Handled、Ignored；未有状态记录的当前告警视为Open；Ignored 匹配当前处于忽略期的告警 */
    
    @UCloudStackParam("ProcessStatuses")
    private List<String> processStatusesParam;

    /** 项目ID列表，按project_id注解过滤自定义告警，告警未携带项目注解时不会返回 */
    
    @UCloudStackParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域，按告警的region标签进行过滤；为空时会遍历所有地域的Prometheus并合并自定义告警后再统一筛选 */
    
    @UCloudStackParam("Region")
    private String regionParam;

    /** 告警级别列表，按severity标签过滤，取值：warning/critical/error；告警缺少severity标签时在设置该条件时会被过滤掉 */
    
    @UCloudStackParam("Severities")
    private List<String> severitiesParam;

    /** 告警状态列表，按Prometheus Alert的状态过滤，取值：inactive/pending/firing */
    
    @UCloudStackParam("States")
    private List<String> statesParam;

    /** 目标资源ID，按target_id标签精确过滤某个具体资源的告警记录；告警缺少target_id标签时在设置该条件时不会命中 */
    
    @UCloudStackParam("TargetID")
    private String targetIDParam;

    /** 告警模板类型列表，按resource_type标签过滤，可通过DescribeMetric获取常见取值；若告警缺少resource_type标签则不会命中 */
    
    @UCloudStackParam("TemplateTypes")
    private List<String> templateTypesParam;


    public List<String> getAlertOccurrenceKeys() {
        return alertOccurrenceKeysParam;
    }

    public void setAlertOccurrenceKeys(List<String> alertOccurrenceKeysParam) {
        this.alertOccurrenceKeysParam = alertOccurrenceKeysParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Boolean getIgnored() {
        return ignoredParam;
    }

    public void setIgnored(Boolean ignoredParam) {
        this.ignoredParam = ignoredParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public List<String> getProcessStatuses() {
        return processStatusesParam;
    }

    public void setProcessStatuses(List<String> processStatusesParam) {
        this.processStatusesParam = processStatusesParam;
    }

    public List<String> getProjectIDs() {
        return projectIDsParam;
    }

    public void setProjectIDs(List<String> projectIDsParam) {
        this.projectIDsParam = projectIDsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getSeverities() {
        return severitiesParam;
    }

    public void setSeverities(List<String> severitiesParam) {
        this.severitiesParam = severitiesParam;
    }

    public List<String> getStates() {
        return statesParam;
    }

    public void setStates(List<String> statesParam) {
        this.statesParam = statesParam;
    }

    public String getTargetID() {
        return targetIDParam;
    }

    public void setTargetID(String targetIDParam) {
        this.targetIDParam = targetIDParam;
    }

    public List<String> getTemplateTypes() {
        return templateTypesParam;
    }

    public void setTemplateTypes(List<String> templateTypesParam) {
        this.templateTypesParam = templateTypesParam;
    }

}
