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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribeAuditLogRequest extends Request {

    /** 开始时间，Unix秒时间戳，作为QueryLog的startTime参数传入Agent */
    @NotEmpty
    @OpenAPIParam("BeginTime")
    private Integer beginTimeParam;

    /** 租户唯一标识ID，保留字段，当前接口不会根据该字段过滤日志 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 结束时间，Unix秒时间戳，作为QueryLog的endTime，建议晚于BeginTime以避免空结果 */
    @NotEmpty
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 忽略审计语句关键字，多个关键字用逗号分隔，后端会去除空格并转成大写后按前缀匹配SQL语句，命中则直接丢弃该日志 */
    
    @OpenAPIParam("IgnoreQuery")
    private String ignoreQueryParam;

    /** 分页大小，用于对已采集到的审计日志做本地分页 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，只在本地分页时使用 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域ID，指定MySQL实例所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源ID，指定要查询审计日志的MySQL资源，要求实例处于AVAILABLE且hhpaas状态Running */
    @NotEmpty
    @OpenAPIParam("ResourceID")
    private String resourceIDParam;


    public Integer getBeginTime() {
        return beginTimeParam;
    }

    public void setBeginTime(Integer beginTimeParam) {
        this.beginTimeParam = beginTimeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
    }

    public String getIgnoreQuery() {
        return ignoreQueryParam;
    }

    public void setIgnoreQuery(String ignoreQueryParam) {
        this.ignoreQueryParam = ignoreQueryParam;
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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

}
