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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class Workflow {

    /** 租户唯一标识ID，标识该流程所属的租户组织 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，Unix时间戳（秒），标识流程的创建时刻 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱地址，流程所属租户的邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 自定义流程名称，用于标识和区分不同的审批流程 */
    @SerializedName("Name")
    private String nameParam;

    /** 审批节点列表，定义该流程包含的所有审批环节和审批人信息 */
    @SerializedName("Nodes")
    private List<WorkflowNode> nodesParam;

    /** 流程来源，标识流程的创建者类型，Admin：管理员创建的全局流程，Company：租户创建的流程 */
    @SerializedName("Origin")
    private String originParam;

    /** 备注信息，用于说明流程的用途或特殊要求 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 资源类型列表，标识该流程适用的资源类型，可以通过ListProductResources获取支持的类型 */
    @SerializedName("ResourceTypes")
    private List<String> resourceTypesParam;

    /** 更新时间，Unix时间戳（秒），标识流程的最后修改时刻 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 流程ID，唯一标识该审批流程 */
    @SerializedName("WorkflowID")
    private String workflowIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public List<WorkflowNode> getNodes() {
        return nodesParam;
    }

    public void setNodes(List<WorkflowNode> nodesParam) {
        this.nodesParam = nodesParam;
    }

    public String getOrigin() {
        return originParam;
    }

    public void setOrigin(String originParam) {
        this.originParam = originParam;
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

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getWorkflowID() {
        return workflowIDParam;
    }

    public void setWorkflowID(String workflowIDParam) {
        this.workflowIDParam = workflowIDParam;
    }

}
