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

public class WorkflowApplication {

    /** 审批资源对应的API名称，标识审批通过后将执行的API操作，例如创建磁盘操作对应CreateDisk */
    @SerializedName("APIName")
    private String aPINameParam;

    /** 审批工单ID，唯一标识一个审批流程实例，系统自动生成的14位随机字符串 */
    @SerializedName("ApplicationID")
    private String applicationIDParam;

    /** 审批工单所有节点列表，包含该审批流程中所有审批节点的详细信息，仅在查询单个审批详情时返回 */
    @SerializedName("ApplicationNodes")
    private List<WorkflowApplicationNode> applicationNodesParam;

    /** 申请人租户ID，标识申请人所属的租户组织 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** API请求参数配置，JSON格式存储审批通过后执行API所需的全部参数信息 */
    @SerializedName("Config")
    private String configParam;

    /** 创建时间，Unix时间戳（秒），标识审批工单的创建时刻 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 申请人所属租户的邮箱地址 */
    @SerializedName("Email")
    private String emailParam;

    /** 申请人子账号ID，标识提交审批的用户 */
    @SerializedName("MemberID")
    private Integer memberIDParam;

    /** 审批工单名称，用于标识审批的主题或目的 */
    @SerializedName("Name")
    private String nameParam;

    /** 审批当前所在节点ID，标识审批流程当前处于哪个审批节点 */
    @SerializedName("NodeID")
    private String nodeIDParam;

    /** 审批当前所在节点名称，审批流程当前节点的显示名称 */
    @SerializedName("NodeName")
    private String nodeNameParam;

    /** 审批当前节点审批人邮箱，当前节点负责审批的用户邮箱 */
    @SerializedName("NodeOperator")
    private String nodeOperatorParam;

    /** 审批当前节点审批人ID，当前节点负责审批的用户账号ID */
    @SerializedName("NodeOperatorID")
    private Integer nodeOperatorIDParam;

    /** 审批申请原因，申请人提交的审批理由说明 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，标识审批操作涉及的物理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 审批操作涉及的资源ID列表，审批通过后创建或修改的资源标识 */
    @SerializedName("ResourceIDs")
    private List<String> resourceIDsParam;

    /** 资源类型，标识审批涉及的资源类型，可以通过ListProductResources获取支持的类型 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 审批工单当前状态，标识审批流程的处理进度，Rejected：已拒绝，Handling：处理中，Succeed：已成功，Failed：已失败 */
    @SerializedName("State")
    private String stateParam;

    /** 审批工单状态标识，用于标记审批是否被逻辑删除，1表示正常，其他值表示已删除 */
    @SerializedName("Status")
    private Integer statusParam;

    /** 更新时间，Unix时间戳（秒），标识审批工单的最后修改时刻 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 自定义流程ID，标识该审批工单所使用的流程模板 */
    @SerializedName("WorkflowID")
    private String workflowIDParam;


    public String getAPIName() {
        return aPINameParam;
    }

    public void setAPIName(String aPINameParam) {
        this.aPINameParam = aPINameParam;
    }

    public String getApplicationID() {
        return applicationIDParam;
    }

    public void setApplicationID(String applicationIDParam) {
        this.applicationIDParam = applicationIDParam;
    }

    public List<WorkflowApplicationNode> getApplicationNodes() {
        return applicationNodesParam;
    }

    public void setApplicationNodes(List<WorkflowApplicationNode> applicationNodesParam) {
        this.applicationNodesParam = applicationNodesParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getConfig() {
        return configParam;
    }

    public void setConfig(String configParam) {
        this.configParam = configParam;
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

    public Integer getMemberID() {
        return memberIDParam;
    }

    public void setMemberID(Integer memberIDParam) {
        this.memberIDParam = memberIDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getNodeID() {
        return nodeIDParam;
    }

    public void setNodeID(String nodeIDParam) {
        this.nodeIDParam = nodeIDParam;
    }

    public String getNodeName() {
        return nodeNameParam;
    }

    public void setNodeName(String nodeNameParam) {
        this.nodeNameParam = nodeNameParam;
    }

    public String getNodeOperator() {
        return nodeOperatorParam;
    }

    public void setNodeOperator(String nodeOperatorParam) {
        this.nodeOperatorParam = nodeOperatorParam;
    }

    public Integer getNodeOperatorID() {
        return nodeOperatorIDParam;
    }

    public void setNodeOperatorID(Integer nodeOperatorIDParam) {
        this.nodeOperatorIDParam = nodeOperatorIDParam;
    }

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
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

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public Integer getStatus() {
        return statusParam;
    }

    public void setStatus(Integer statusParam) {
        this.statusParam = statusParam;
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
