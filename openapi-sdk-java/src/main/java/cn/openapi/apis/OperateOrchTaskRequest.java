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

public class OperateOrchTaskRequest extends Request {

    /** 租户ID，任务所属租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 任务操作，任务操作类型，取值：Update（重置任务并允许重新配置步骤）/Execute（重新执行任务并清空资源执行记录）/Abort（中断正在执行的任务并置结果为Interrupted）/Pause（暂停正在执行的任务并置结果为Interrupted） */
    @NotEmpty
    @OpenAPIParam("Operation")
    private String operationParam;

    /** 地域，编排任务所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 任务ID，待操作的编排任务ID */
    @NotEmpty
    @OpenAPIParam("TaskID")
    private String taskIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getOperation() {
        return operationParam;
    }

    public void setOperation(String operationParam) {
        this.operationParam = operationParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getTaskID() {
        return taskIDParam;
    }

    public void setTaskID(String taskIDParam) {
        this.taskIDParam = taskIDParam;
    }

}
