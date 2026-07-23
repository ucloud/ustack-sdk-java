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

public class DescribeRedisSlowlogRequest extends Request {

    /** 结束时间，Unix时间戳（秒） */
    @NotEmpty
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 关键词，用于搜索慢日志记录 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，默认10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，默认0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** Redis实例ID，指定要查询慢日志的实例；注意：资源必须为AVAILABLE且状态为Running，且至少存在Ready状态的VM */
    @NotEmpty
    @OpenAPIParam("RedisID")
    private String redisIDParam;

    /** 地域ID，实例所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 开始时间，Unix时间戳（秒） */
    @NotEmpty
    @OpenAPIParam("StartTime")
    private Integer startTimeParam;


    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
    }

    public String getKeyword() {
        return keywordParam;
    }

    public void setKeyword(String keywordParam) {
        this.keywordParam = keywordParam;
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

    public String getRedisID() {
        return redisIDParam;
    }

    public void setRedisID(String redisIDParam) {
        this.redisIDParam = redisIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public Integer getStartTime() {
        return startTimeParam;
    }

    public void setStartTime(Integer startTimeParam) {
        this.startTimeParam = startTimeParam;
    }

}
