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

public class DescribeSMCRequest extends Request {

    /** 租户唯一标识ID，用于筛选指定租户的SMC任务，确保多租户隔离 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 关键字，用于模糊搜索匹配SMC任务的名称或备注信息，不区分大小写 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，取值范围1-100，超出范围会被限制 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，用于分页查询，从0开始计数 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目ID列表，用于筛选指定项目下的SMC任务，支持跨项目查询 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定查询的物理区域，只返回该地域下的SMC任务 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** SMC任务ID列表，用于精确查询指定的一个或多个SMC任务，当指定此参数时忽略其他筛选条件 */
    
    @OpenAPIParam("SMCIDs")
    private List<String> sMCIDsParam;

    /** 任务状态列表，用于筛选指定状态的SMC任务，如CREATING、ONLINE、SYNCING等，空表示不筛选 */
    
    @OpenAPIParam("States")
    private List<String> statesParam;


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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getSMCIDs() {
        return sMCIDsParam;
    }

    public void setSMCIDs(List<String> sMCIDsParam) {
        this.sMCIDsParam = sMCIDsParam;
    }

    public List<String> getStates() {
        return statesParam;
    }

    public void setStates(List<String> statesParam) {
        this.statesParam = statesParam;
    }

}
