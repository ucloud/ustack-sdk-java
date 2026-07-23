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

public class DeleteWorkflowRequest extends Request {

    /** 租户唯一标识ID，必须与流程的CompanyID匹配，用于权限验证，普通租户不能删除管理员创建的流程（管理员租户CompanyID=200000231），如流程来源为Admin只有管理员可删除，必填 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 流程ID，指定需要删除的流程唯一标识，删除后该流程会被立即标记为删除，无法再被创建工单引用，必填 */
    @NotEmpty
    @OpenAPIParam("WorkflowID")
    private String workflowIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getWorkflowID() {
        return workflowIDParam;
    }

    public void setWorkflowID(String workflowIDParam) {
        this.workflowIDParam = workflowIDParam;
    }

}
