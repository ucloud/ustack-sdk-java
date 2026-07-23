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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class WorkflowApplicationNode {

    /** 审批资源对应的API名称，标识审批通过后将执行的API操作，例如创建磁盘操作对应CreateDisk */
    @SerializedName("APIName")
    private String aPINameParam;

    /** 申请人账号邮箱，提交审批的用户邮箱地址 */
    @SerializedName("ApplicationEmail")
    private String applicationEmailParam;

    /** 审批工单ID，该节点所属的审批工单标识 */
    @SerializedName("ApplicationID")
    private String applicationIDParam;

    /** 申请人账号ID，标识提交审批的用户，通常为子账号ID */
    @SerializedName("ApplicationMemberID")
    private Integer applicationMemberIDParam;

    /** 审批工单名称，该节点所属审批工单的名称 */
    @SerializedName("ApplicationName")
    private String applicationNameParam;

    /** 节点是否自动审批，true表示该节点自动通过无需人工审批，false表示需要人工审批 */
    @SerializedName("AutoAudit")
    private Boolean autoAuditParam;

    /** 创建时间，Unix时间戳（秒），标识该节点的创建时刻 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 审批节点ID，在审批流程中唯一标识该节点的顺序编号 */
    @SerializedName("NodeID")
    private String nodeIDParam;

    /** 审批节点名称，该节点的显示名称，用于标识审批环节 */
    @SerializedName("NodeName")
    private String nodeNameParam;

    /** 节点审批人邮箱，负责该节点审批的用户邮箱地址 */
    @SerializedName("NodeOperator")
    private String nodeOperatorParam;

    /** 节点审批人租户ID，审批人所属的租户组织标识 */
    @SerializedName("NodeOperatorCompanyID")
    private Integer nodeOperatorCompanyIDParam;

    /** 节点审批人账号ID，负责该节点审批的用户账号标识 */
    @SerializedName("NodeOperatorID")
    private Integer nodeOperatorIDParam;

    /** 节点观察人信息列表，可以查看该节点审批进度但不参与审批决策的用户列表 */
    @SerializedName("ObserverInfos")
    private List<ObserverInfo> observerInfosParam;

    /** 审批节点备注，审批人在审批时填写的备注信息，用于说明审批意见或理由 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 审批资源类型，标识审批涉及的资源类型，可以通过ListProductResources获取支持的类型 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 审批节点状态，标识该节点的处理状态，Undo：未处理，Committed：已提交，Rejected：已拒绝，Aborted：已终止，Approved：已批准，Handling：处理中，Succeed：成功，Failed：失败 */
    @SerializedName("State")
    private String stateParam;

    /** 更新时间，Unix时间戳（秒），标识该节点的最后修改时刻 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public String getAPIName() {
        return aPINameParam;
    }

    public void setAPIName(String aPINameParam) {
        this.aPINameParam = aPINameParam;
    }

    public String getApplicationEmail() {
        return applicationEmailParam;
    }

    public void setApplicationEmail(String applicationEmailParam) {
        this.applicationEmailParam = applicationEmailParam;
    }

    public String getApplicationID() {
        return applicationIDParam;
    }

    public void setApplicationID(String applicationIDParam) {
        this.applicationIDParam = applicationIDParam;
    }

    public Integer getApplicationMemberID() {
        return applicationMemberIDParam;
    }

    public void setApplicationMemberID(Integer applicationMemberIDParam) {
        this.applicationMemberIDParam = applicationMemberIDParam;
    }

    public String getApplicationName() {
        return applicationNameParam;
    }

    public void setApplicationName(String applicationNameParam) {
        this.applicationNameParam = applicationNameParam;
    }

    public Boolean getAutoAudit() {
        return autoAuditParam;
    }

    public void setAutoAudit(Boolean autoAuditParam) {
        this.autoAuditParam = autoAuditParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
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

    public Integer getNodeOperatorCompanyID() {
        return nodeOperatorCompanyIDParam;
    }

    public void setNodeOperatorCompanyID(Integer nodeOperatorCompanyIDParam) {
        this.nodeOperatorCompanyIDParam = nodeOperatorCompanyIDParam;
    }

    public Integer getNodeOperatorID() {
        return nodeOperatorIDParam;
    }

    public void setNodeOperatorID(Integer nodeOperatorIDParam) {
        this.nodeOperatorIDParam = nodeOperatorIDParam;
    }

    public List<ObserverInfo> getObserverInfos() {
        return observerInfosParam;
    }

    public void setObserverInfos(List<ObserverInfo> observerInfosParam) {
        this.observerInfosParam = observerInfosParam;
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

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
