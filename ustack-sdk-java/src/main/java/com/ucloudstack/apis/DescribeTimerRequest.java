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

public class DescribeTimerRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 关键词，用于按定时器名称模糊搜索 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，用于限制单次返回条数 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，用于指定返回结果起始位置 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目ID列表，用于筛选指定项目下的定时器 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，用于筛选定时器所属地域，为空时查询授权地域 */
    
    @OpenAPIParam("Region")
    private String regionParam;

    /** 集群ID，用于筛选PolicySetID匹配的定时器 */
    
    @OpenAPIParam("SetID")
    private String setIDParam;

    /** 任务类型，用于筛选特定业务任务 */
    
    @OpenAPIParam("Task")
    private String taskParam;

    /** 定时器ID列表，用于精确查询指定定时器 */
    
    @OpenAPIParam("TimerIDs")
    private List<String> timerIDsParam;

    /** 定时器状态列表，取值Normal、Paused；为空时默认Normal */
    
    @OpenAPIParam("TimerStatus")
    private List<String> timerStatusParam;

    /** 调度类型列表，用于筛选特定调度规则 */
    
    @OpenAPIParam("Types")
    private List<String> typesParam;


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

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public String getTask() {
        return taskParam;
    }

    public void setTask(String taskParam) {
        this.taskParam = taskParam;
    }

    public List<String> getTimerIDs() {
        return timerIDsParam;
    }

    public void setTimerIDs(List<String> timerIDsParam) {
        this.timerIDsParam = timerIDsParam;
    }

    public List<String> getTimerStatus() {
        return timerStatusParam;
    }

    public void setTimerStatus(List<String> timerStatusParam) {
        this.timerStatusParam = timerStatusParam;
    }

    public List<String> getTypes() {
        return typesParam;
    }

    public void setTypes(List<String> typesParam) {
        this.typesParam = typesParam;
    }

}
