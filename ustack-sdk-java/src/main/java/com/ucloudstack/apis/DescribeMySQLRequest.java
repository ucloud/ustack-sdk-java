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

public class DescribeMySQLRequest extends Request {

    /** 租户唯一标识ID，用于过滤指定租户的资源，实现多租户环境下的资源隔离，若不指定则查询当前用户有权限访问的所有租户的资源 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 搜索关键词，用于模糊搜索MySQL实例名称或ID */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** MySQL实例ID列表，用于查询指定的MySQL实例，若同时提供Keyword，则取两者的交集 */
    
    @OpenAPIParam("MySQLIDs")
    private List<String> mySQLIDsParam;

    /** 分页偏移量，指定跳过的记录数，用于实现分页查询 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目ID列表，用于按项目过滤资源，支持多项目查询 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** MySQL状态列表，用于按状态过滤实例，可选值包括：Running（运行中）、Stopped（已停止）、Creating（创建中）等 */
    
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

    public List<String> getMySQLIDs() {
        return mySQLIDsParam;
    }

    public void setMySQLIDs(List<String> mySQLIDsParam) {
        this.mySQLIDsParam = mySQLIDsParam;
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
