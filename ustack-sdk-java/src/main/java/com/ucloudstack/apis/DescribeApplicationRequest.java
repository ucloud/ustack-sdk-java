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

public class DescribeApplicationRequest extends Request {

    /** 审批工单ID，指定时返回单个审批详情（包含所有审批节点信息），不指定时返回审批列表，指定此参数时会忽略其他查询条件，直接返回该审批的完整信息 */
    
    @OpenAPIParam("ApplicationID")
    private String applicationIDParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，管理员租户CompanyID固定为200000231，普通租户必须填写自身的CompanyID，系统会结合登录态判定可见的审批范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 搜索关键字，用于通过搜索引擎查找匹配的审批工单，支持模糊搜索审批名称、ID等信息 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，用于控制返回数据量 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 子账号ID，兼容历史接口的保留字段，接口会根据当前登录用户自动识别MemberID并按权限过滤审批记录，建议填写当前子账号ID以便审计 */
    
    @OpenAPIParam("MemberID")
    private Integer memberIDParam;

    /** 分页偏移量，指定跳过的记录数，用于实现分页查询 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 资源类型，用于过滤指定资源类型的审批工单，如DISK、VM、FS等，不指定时返回所有类型 */
    
    @OpenAPIParam("ResourceType")
    private String resourceTypeParam;


    public String getApplicationID() {
        return applicationIDParam;
    }

    public void setApplicationID(String applicationIDParam) {
        this.applicationIDParam = applicationIDParam;
    }

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

    public Integer getMemberID() {
        return memberIDParam;
    }

    public void setMemberID(Integer memberIDParam) {
        this.memberIDParam = memberIDParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

}
