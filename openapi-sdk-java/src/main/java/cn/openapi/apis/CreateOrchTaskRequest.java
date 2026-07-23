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

public class CreateOrchTaskRequest extends Request {

    /** 租户ID，任务所属租户 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 资源筛选条件，用于动态选择资源，当前未使用 */
    
    @OpenAPIParam("Condition")
    private String conditionParam;

    /** 任务名称，编排任务名称，支持中文、英文字母、数字、点、下划线和中划线，长度1-128字符 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 项目组ID，任务所属项目组，当前未使用 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 地域，编排任务所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 任务备注，编排任务描述信息，长度0-100字符，禁止http://或https://等非法字符 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 资源类型，编排任务作用的资源类型，必须与TaskType匹配，取值：VM */
    @NotEmpty
    @OpenAPIParam("ResourceType")
    private String resourceTypeParam;

    /** 步骤列表，定义编排任务的执行步骤，每个步骤为JSON字符串，格式：{"order":1,"delay":0,"resourceIDs":"vm-xx,vm-yy"}；delay取值范围0-3600；order在所有步骤中必须唯一；resourceIDs为逗号分隔的资源ID列表，同一资源ID在所有步骤中只能出现一次；所有资源必须存在且为AVAILABLE，且资源类型必须与ResourceType一致 */
    @NotEmpty
    @OpenAPIParam("Steps")
    private List<String> stepsParam;

    /** 任务类型，必须与ResourceType匹配，取值：StartInOrder/StopInOrder */
    @NotEmpty
    @OpenAPIParam("TaskType")
    private String taskTypeParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getCondition() {
        return conditionParam;
    }

    public void setCondition(String conditionParam) {
        this.conditionParam = conditionParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public List<String> getSteps() {
        return stepsParam;
    }

    public void setSteps(List<String> stepsParam) {
        this.stepsParam = stepsParam;
    }

    public String getTaskType() {
        return taskTypeParam;
    }

    public void setTaskType(String taskTypeParam) {
        this.taskTypeParam = taskTypeParam;
    }

}
