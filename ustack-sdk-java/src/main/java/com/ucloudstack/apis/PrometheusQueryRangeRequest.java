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

public class PrometheusQueryRangeRequest extends Request {

    /** 查询结束时间，定义时间范围的结束点，支持Unix时间戳（秒）或RFC3339格式，解析失败会直接返回错误 */
    @NotEmpty
    @UCloudStackParam("End")
    private String endParam;

    /** 返回结果数量限制，用于限制返回的时间序列数据点数量，避免结果集过大，预留字段，当前实现未对Prometheus返回结果做截断 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** PromQL查询表达式，用于查询时间范围内的监控指标数据，必须是合法的PromQL语法 */
    @NotEmpty
    @UCloudStackParam("Query")
    private String queryParam;

    /** 地域ID，指定查询哪个地域的Prometheus监控数据；若地域不存在将返回StatusRegionNotExist错误 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 查询开始时间，定义时间范围的起始点，支持Unix时间戳（秒）或RFC3339格式，解析失败会直接返回错误 */
    @NotEmpty
    @UCloudStackParam("Start")
    private String startParam;

    /** 查询步长，定义返回数据点之间的时间间隔，支持数字（秒）或Go duration格式（如60、60s），无法解析时会直接返回错误 */
    @NotEmpty
    @UCloudStackParam("Step")
    private String stepParam;

    /** 查询超时时间，用于控制单次查询的最大执行时间，支持Go duration格式（如30s、1m），若解析失败、<=0或超过2m将返回参数错误 */
    
    @UCloudStackParam("Timeout")
    private String timeoutParam;


    public String getEnd() {
        return endParam;
    }

    public void setEnd(String endParam) {
        this.endParam = endParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public String getQuery() {
        return queryParam;
    }

    public void setQuery(String queryParam) {
        this.queryParam = queryParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getStart() {
        return startParam;
    }

    public void setStart(String startParam) {
        this.startParam = startParam;
    }

    public String getStep() {
        return stepParam;
    }

    public void setStep(String stepParam) {
        this.stepParam = stepParam;
    }

    public String getTimeout() {
        return timeoutParam;
    }

    public void setTimeout(String timeoutParam) {
        this.timeoutParam = timeoutParam;
    }

}
