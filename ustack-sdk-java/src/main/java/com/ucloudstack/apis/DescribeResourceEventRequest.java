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

public class DescribeResourceEventRequest extends Request {

    /** 开始时间，Unix时间戳(秒)，查询该时间点之后发生的事件 */
    
    @OpenAPIParam("BeginTime")
    private Integer beginTimeParam;

    /** 租户ID，指定要查询资源事件的租户，若不指定则查询所有租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 结束时间，Unix时间戳(秒)，查询该时间点之前发生的事件，必须大于开始时间 */
    
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 事件类型列表，指定要查询的事件类型 */
    
    @OpenAPIParam("EventTypes")
    private List<String> eventTypesParam;

    /** 事件等级列表，指定要查询的事件严重程度，取值范围：Info、Warning、Error */
    
    @OpenAPIParam("Levels")
    private List<String> levelsParam;

    /** 分页大小，指定每页返回的记录数，若不指定则使用默认值 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目组ID列表，指定要查询事件的项目组范围，ProjectID 采用 project- 前缀加14位随机字符格式 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定要查询资源事件的地域 */
    
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源ID列表，指定要查询事件的资源范围，每个ResourceID格式为类型前缀-14位随机字符 */
    
    @OpenAPIParam("ResourceIDs")
    private List<String> resourceIDsParam;

    /** 资源类型列表，指定要查询事件的资源类型范围 */
    
    @OpenAPIParam("ResourceTypes")
    private List<String> resourceTypesParam;


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

    public List<String> getEventTypes() {
        return eventTypesParam;
    }

    public void setEventTypes(List<String> eventTypesParam) {
        this.eventTypesParam = eventTypesParam;
    }

    public List<String> getLevels() {
        return levelsParam;
    }

    public void setLevels(List<String> levelsParam) {
        this.levelsParam = levelsParam;
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

}
