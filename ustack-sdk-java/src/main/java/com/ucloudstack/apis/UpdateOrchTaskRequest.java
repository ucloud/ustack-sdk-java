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

public class UpdateOrchTaskRequest extends Request {

    /** 租户ID，任务所属租户 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 资源筛选条件，用于动态选择资源 */
    
    @OpenAPIParam("Condition")
    private String conditionParam;

    /** 地域，编排任务所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 步骤列表，定义更新后的执行步骤，每个步骤为JSON字符串，格式：{"order":1,"delay":0,"resourceIDs":"vm-xx,vm-yy"}；delay取值范围0-3600；order在所有步骤中必须唯一；resourceIDs为逗号分隔的资源ID列表；仅保留AVAILABLE资源，且资源类型必须与任务ResourceType一致 */
    @NotEmpty
    @OpenAPIParam("Steps")
    private List<String> stepsParam;

    /** 任务ID，待更新的编排任务ID */
    @NotEmpty
    @OpenAPIParam("TaskID")
    private String taskIDParam;


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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getSteps() {
        return stepsParam;
    }

    public void setSteps(List<String> stepsParam) {
        this.stepsParam = stepsParam;
    }

    public String getTaskID() {
        return taskIDParam;
    }

    public void setTaskID(String taskIDParam) {
        this.taskIDParam = taskIDParam;
    }

}
