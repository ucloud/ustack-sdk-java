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
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribeWorkflowRequest extends Request {

    /** 租户唯一标识ID，用于筛选指定租户创建的流程，不指定时返回所有可见流程，管理员租户（CompanyID=200000231）可看见所有流程，普通租户只能看见自己和管理员创建的流程 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 搜索关键字，用于通过搜索引擎模糊查找流程名称、备注等信息，与WorkflowIDs组合使用时取交集 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，用于控制返回数据量 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，用于实现分页查询 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 流程来源，用于筛选流程的创建来源，Admin：管理员创建的全局流程，Company：租户创建的流程，不指定时返回所有来源的流程 */
    
    @UCloudStackParam("Origin")
    private String originParam;

    /** 资源类型，用于筛选适用于指定资源类型的流程，可以通过ListProductResources获取支持的类型，不指定时返回所有资源类型的流程 */
    
    @UCloudStackParam("ResourceType")
    private String resourceTypeParam;

    /** 流程ID列表，指定查询的流程ID，指定时返回匹配的流程，不指定时返回符合其他条件的所有流程，与Keyword并用时取交集 */
    
    @UCloudStackParam("WorkflowIDs")
    private List<String> workflowIDsParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getKeyword() {
        return keywordParam;
    }

    public void setKeyword(String keywordParam) {
        this.keywordParam = keywordParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public String getOrigin() {
        return originParam;
    }

    public void setOrigin(String originParam) {
        this.originParam = originParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public List<String> getWorkflowIDs() {
        return workflowIDsParam;
    }

    public void setWorkflowIDs(List<String> workflowIDsParam) {
        this.workflowIDsParam = workflowIDsParam;
    }

}
