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

public class DescribeRedisRequest extends Request {

    /** 租户ID，用于标识资源所属的租户，实现多租户环境下的资源隔离 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 搜索关键字，用于模糊搜索实例名称或ID */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页数量，分页查询的每页数量 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，分页查询的偏移量 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目组ID，用于资源分组管理 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** Redis实例ID，筛选指定实例的ID列表 */
    
    @OpenAPIParam("RedisIDs")
    private List<String> redisIDsParam;

    /** 地域ID，地域，一批可共享的物理资源使用集合 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** Redis状态，用于按状态过滤实例 */
    
    @OpenAPIParam("Status")
    private List<String> statusParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
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

    public List<String> getProjectIDs() {
        return projectIDsParam;
    }

    public void setProjectIDs(List<String> projectIDsParam) {
        this.projectIDsParam = projectIDsParam;
    }

    public List<String> getRedisIDs() {
        return redisIDsParam;
    }

    public void setRedisIDs(List<String> redisIDsParam) {
        this.redisIDsParam = redisIDsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getStatus() {
        return statusParam;
    }

    public void setStatus(List<String> statusParam) {
        this.statusParam = statusParam;
    }

}
