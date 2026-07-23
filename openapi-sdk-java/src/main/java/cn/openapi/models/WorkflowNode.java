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

public class WorkflowNode {

    /** 审批人信息，负责该节点审批的用户详细信息 */
    @SerializedName("AuditMemberInfo")
    private WorkflowNodeMemberInfo auditMemberInfoParam;

    /** 是否自动审批，true表示该节点自动通过无需人工审批，false表示需要人工审批 */
    @SerializedName("AutoAudit")
    private Boolean autoAuditParam;

    /** 审批节点名称，用于标识审批环节的显示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 观察人信息列表，可以查看该节点审批进度但不参与审批决策的用户列表 */
    @SerializedName("ObserverMemberInfos")
    private List<WorkflowNodeMemberInfo> observerMemberInfosParam;


    public WorkflowNodeMemberInfo getAuditMemberInfo() {
        return auditMemberInfoParam;
    }

    public void setAuditMemberInfo(WorkflowNodeMemberInfo auditMemberInfoParam) {
        this.auditMemberInfoParam = auditMemberInfoParam;
    }

    public Boolean getAutoAudit() {
        return autoAuditParam;
    }

    public void setAutoAudit(Boolean autoAuditParam) {
        this.autoAuditParam = autoAuditParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public List<WorkflowNodeMemberInfo> getObserverMemberInfos() {
        return observerMemberInfosParam;
    }

    public void setObserverMemberInfos(List<WorkflowNodeMemberInfo> observerMemberInfosParam) {
        this.observerMemberInfosParam = observerMemberInfosParam;
    }

}
