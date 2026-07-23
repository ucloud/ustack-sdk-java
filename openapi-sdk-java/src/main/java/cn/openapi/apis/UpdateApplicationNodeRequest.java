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

public class UpdateApplicationNodeRequest extends Request {

    /** 审批工单ID，指定需要更新的审批工单，必须是已存在的审批工单ID，必填 */
    @NotEmpty
    @OpenAPIParam("ApplicationID")
    private String applicationIDParam;

    /** 审批节点ID，指定需要更新的审批节点编号，必须是该工单下的有效节点ID，必填 */
    @NotEmpty
    @OpenAPIParam("NodeID")
    private String nodeIDParam;

    /** 审批节点状态，更新后的节点状态，Approved：批准通过，Rejected：拒绝，可进行的状态变更为：Handling->Approved、Handling->Rejected，必填 */
    @NotEmpty
    @OpenAPIParam("NodeState")
    private String nodeStateParam;

    /** 备注信息，审批人填写的审批意见或理由，如果是代他人审批，系统会自动在备注后追加代审批说明（通过trans.WRF0009格式化，如：【代xxx@example.com审批】） */
    
    @OpenAPIParam("Remark")
    private String remarkParam;


    public String getApplicationID() {
        return applicationIDParam;
    }

    public void setApplicationID(String applicationIDParam) {
        this.applicationIDParam = applicationIDParam;
    }

    public String getNodeID() {
        return nodeIDParam;
    }

    public void setNodeID(String nodeIDParam) {
        this.nodeIDParam = nodeIDParam;
    }

    public String getNodeState() {
        return nodeStateParam;
    }

    public void setNodeState(String nodeStateParam) {
        this.nodeStateParam = nodeStateParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

}
