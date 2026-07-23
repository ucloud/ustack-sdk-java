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
package cn.openapi.apis;

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class PrometheusQueryRequest extends Request {

    /** 返回结果数量限制，预留字段，当前实现未对Prometheus返回结果做截断限制 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** PromQL查询表达式，用于查询即时监控指标数据 */
    @NotEmpty
    @OpenAPIParam("Query")
    private String queryParam;

    /** 地域，指定查询哪个地域的Prometheus监控数据；若地域不存在将返回StatusRegionNotExist错误 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 查询时间点，支持Unix时间戳（秒）或RFC3339格式；解析失败或不填写时会自动使用当前时间 */
    
    @OpenAPIParam("Time")
    private String timeParam;

    /** 查询超时时间，支持Go duration格式（如30s、1m），若解析失败、<=0或超过2m将返回参数错误 */
    
    @OpenAPIParam("Timeout")
    private String timeoutParam;


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

    public String getTime() {
        return timeParam;
    }

    public void setTime(String timeParam) {
        this.timeParam = timeParam;
    }

    public String getTimeout() {
        return timeoutParam;
    }

    public void setTimeout(String timeoutParam) {
        this.timeoutParam = timeoutParam;
    }

}
