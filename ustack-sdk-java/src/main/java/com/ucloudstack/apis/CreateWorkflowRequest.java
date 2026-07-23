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

public class CreateWorkflowRequest extends Request {

    /** 租户唯一标识ID，标识流程所属的租户组织，管理员租户（CompanyID=200000231）创建的流程来源为Admin，普通租户创建的流程来源为Company，管理员只能为自己的管理员租户创建全局流程，普通租户只能为自己的租户创建流程，必填 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 自定义流程名称，用于标识和区分不同的审批流程，长度为1-128个字符，名称只能包含中英文、数字、点、下划线和中划线，必填 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 审批节点信息列表，定义审批流程的各个节点，数组长度为1-10个节点，每项至少包含节点名称|审批人MemberID|自动审批(true/false)三段，后续可追加观察人MemberID，审批人和观察人必须来自同一租户，且审批人需按层级递增排序（子账号→子账号(租户)→管理员子账号→管理员），每个节点的观察人数量不超过10个，可以通过ListAdmin、DescribeUser和DescribeMember获取MemberID，必填 */
    @NotEmpty
    @OpenAPIParam("NodeInfos")
    private List<String> nodeInfosParam;

    /** 备注信息，用于说明流程的用途或特殊要求，长度为0-100个字符，不能包含<script>或javascript等非法内容 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 资源类型列表，指定该流程适用的资源类型，至少1项，每个租户的每种资源类型只能关联一个流程，重复关联会报错，可以通过ListProductResources获取支持的类型，必填 */
    @NotEmpty
    @OpenAPIParam("ResourceTypes")
    private List<String> resourceTypesParam;


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

}
