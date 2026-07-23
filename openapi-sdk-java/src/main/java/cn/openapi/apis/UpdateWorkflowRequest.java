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

public class UpdateWorkflowRequest extends Request {

    /** 租户唯一标识ID，必须与流程的CompanyID匹配，用于权限验证，普通租户不能修改管理员创建的流程（管理员租户CompanyID=200000231），如流程来源为Admin仅管理员可修改，必填 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 自定义流程名称，更新后的流程名称 */
    
    @OpenAPIParam("Name")
    private String nameParam;

    /** 审批节点信息列表，更新后的审批流程节点配置，数组长度为1-10个节点，每项至少包含节点名称|审批人MemberID|自动审批(true/false)三段，后续可追加观察人MemberID，审批人和观察人必须来自同一租户，且审批人需按层级递增排序（子账号→子账号(租户)→管理员子账号→管理员），每个节点的观察人数量不超过10个，可以通过ListAdmin、DescribeUser和DescribeMember获取MemberID，必填 */
    @NotEmpty
    @OpenAPIParam("NodeInfos")
    private List<String> nodeInfosParam;

    /** 备注信息，更新后的备注说明 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 资源类型列表，更新后该流程适用的资源类型，至少1项，每个租户的每种资源类型只能关联一个流程，与其他流程重复关联会报错，可以通过ListProductResources获取支持的类型，必填 */
    @NotEmpty
    @OpenAPIParam("ResourceTypes")
    private List<String> resourceTypesParam;

    /** 流程ID，指定需要更新的流程唯一标识，必须是已存在的流程ID，必填 */
    @NotEmpty
    @OpenAPIParam("WorkflowID")
    private String workflowIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public List<String> getNodeInfos() {
        return nodeInfosParam;
    }

    public void setNodeInfos(List<String> nodeInfosParam) {
        this.nodeInfosParam = nodeInfosParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public List<String> getResourceTypes() {
        return resourceTypesParam;
    }

    public void setResourceTypes(List<String> resourceTypesParam) {
        this.resourceTypesParam = resourceTypesParam;
    }

    public String getWorkflowID() {
        return workflowIDParam;
    }

    public void setWorkflowID(String workflowIDParam) {
        this.workflowIDParam = workflowIDParam;
    }

}
