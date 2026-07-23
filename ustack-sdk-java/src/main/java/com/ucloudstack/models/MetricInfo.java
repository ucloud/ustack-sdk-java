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

public class MetricInfo {

    /** 指标分组类别，用于在界面上对监控指标进行分类显示和管理 */
    @SerializedName("Categories")
    private String categoriesParam;

    /** 告警阈值对比类型，定义告警触发时的比较方式，如大于、小于、等于等 */
    @SerializedName("CompareType")
    private String compareTypeParam;

    /** 枚举值列表，当指标为枚举类型时提供可选的枚举项 */
    @SerializedName("Enums")
    private List<Enums> enumsParam;

    /** 指标过滤器列表，用于对监控数据进行筛选和过滤的条件配置 */
    @SerializedName("Filters")
    private List<MetricFilter> filtersParam;

    /** 是否支持告警功能，标识该具体指标是否可以用于配置告警规则 */
    @SerializedName("IsAlerting")
    private Boolean isAlertingParam;

    /** 指标标签列表，用于对监控指标进行分类和标记的标签信息 */
    @SerializedName("Labels")
    private List<String> labelsParam;

    /** Prometheus查询语句，用于从监控系统中获取该指标的实际数据 */
    @SerializedName("Metric")
    private String metricParam;

    /** 监控指标的唯一标识符，用于在系统中唯一标识一个监控指标 */
    @SerializedName("MetricID")
    private String metricIDParam;

    /** 指标的中文名称和含义描述，用于在界面上显示给用户理解 */
    @SerializedName("Name")
    private String nameParam;

    /** 指标数据的最大有效值，用于数据验证和界面显示范围限制 */
    @SerializedName("RangeMax")
    private String rangeMaxParam;

    /** 指标数据的最小有效值，用于数据验证和界面显示范围限制 */
    @SerializedName("RangeMin")
    private String rangeMinParam;

    /** 指标数据的计量单位，如百分比、字节、次数等 */
    @SerializedName("Unit")
    private String unitParam;

    /** 是否需要单位转换回调处理，标识在显示该指标数据时是否需要进行单位转换 */
    @SerializedName("UseYCallback")
    private Boolean useYCallbackParam;


    public String getCategories() {
        return categoriesParam;
    }

    public void setCategories(String categoriesParam) {
        this.categoriesParam = categoriesParam;
    }

    public String getCompareType() {
        return compareTypeParam;
    }

    public void setCompareType(String compareTypeParam) {
        this.compareTypeParam = compareTypeParam;
    }

    public List<Enums> getEnums() {
        return enumsParam;
    }

    public void setEnums(List<Enums> enumsParam) {
        this.enumsParam = enumsParam;
    }

    public List<MetricFilter> getFilters() {
        return filtersParam;
    }

    public void setFilters(List<MetricFilter> filtersParam) {
        this.filtersParam = filtersParam;
    }

    public Boolean getIsAlerting() {
        return isAlertingParam;
    }

    public void setIsAlerting(Boolean isAlertingParam) {
        this.isAlertingParam = isAlertingParam;
    }

    public List<String> getLabels() {
        return labelsParam;
    }

    public void setLabels(List<String> labelsParam) {
        this.labelsParam = labelsParam;
    }

    public String getMetric() {
        return metricParam;
    }

    public void setMetric(String metricParam) {
        this.metricParam = metricParam;
    }

    public String getMetricID() {
        return metricIDParam;
    }

    public void setMetricID(String metricIDParam) {
        this.metricIDParam = metricIDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getRangeMax() {
        return rangeMaxParam;
    }

    public void setRangeMax(String rangeMaxParam) {
        this.rangeMaxParam = rangeMaxParam;
    }

    public String getRangeMin() {
        return rangeMinParam;
    }

    public void setRangeMin(String rangeMinParam) {
        this.rangeMinParam = rangeMinParam;
    }

    public String getUnit() {
        return unitParam;
    }

    public void setUnit(String unitParam) {
        this.unitParam = unitParam;
    }

    public Boolean getUseYCallback() {
        return useYCallbackParam;
    }

    public void setUseYCallback(Boolean useYCallbackParam) {
        this.useYCallbackParam = useYCallbackParam;
    }

}
