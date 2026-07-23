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

public class DescribeResourceConditionRequest extends Request {

    /** 租户ID，指定要查询资源状态的租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 分页大小，指定每页返回的记录数 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目组ID列表，指定要查询状态的项目组范围，ProjectID 采用 project- 前缀加14位随机字符格式 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定要查询资源状态的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源ID列表，指定要查询状态的资源范围，每个ResourceID格式为类型前缀-14位随机字符 */
    
    @OpenAPIParam("ResourceIDs")
    private List<String> resourceIDsParam;

    /** 资源类型列表，指定要查询状态的资源类型，当前仅支持VM */
    
    @OpenAPIParam("ResourceTypes")
    private List<String> resourceTypesParam;

    /** 排序方向，指定升序或降序 */
    
    @OpenAPIParam("Sort")
    private String sortParam;

    /** 排序指标，指定排序的字段名 */
    
    @OpenAPIParam("SortBy")
    private String sortByParam;

    /** 状态，按资源状态进行过滤，支持True、False或Unknown */
    
    @OpenAPIParam("Status")
    private String statusParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getResourceIDs() {
        return resourceIDsParam;
    }

    public void setResourceIDs(List<String> resourceIDsParam) {
        this.resourceIDsParam = resourceIDsParam;
    }

    public List<String> getResourceTypes() {
        return resourceTypesParam;
    }

    public void setResourceTypes(List<String> resourceTypesParam) {
        this.resourceTypesParam = resourceTypesParam;
    }

    public String getSort() {
        return sortParam;
    }

    public void setSort(String sortParam) {
        this.sortParam = sortParam;
    }

    public String getSortBy() {
        return sortByParam;
    }

    public void setSortBy(String sortByParam) {
        this.sortByParam = sortByParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

}
