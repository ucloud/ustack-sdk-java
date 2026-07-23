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

public class DescribeApplicationNodeRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，管理员租户（CompanyID=200000231）可查看所有租户的审批节点，普通租户仅能查看自己租户内的审批节点 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 搜索关键字，用于模糊搜索审批节点相关信息，如审批名称、申请人等 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，用于控制返回数据量，未指定时默认返回100条记录 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 子账号ID，兼容历史接口的保留字段，接口会根据当前登录账号自动识别MemberID并按权限过滤审批节点，此入参建议填写当前子账号ID以便审计 */
    
    @OpenAPIParam("MemberID")
    private Integer memberIDParam;

    /** 分页偏移量，指定跳过的记录数，用于实现分页查询 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 排序方式，指定返回结果的排序顺序，Descending：降序排列，Ascending：升序排列，默认Descending */
    
    @OpenAPIParam("Sort")
    private String sortParam;

    /** 排序字段，指定按哪个字段进行排序，目前仅支持审批节点的创建时间CreateTime */
    
    @OpenAPIParam("SortBy")
    private String sortByParam;

    /** 审批节点状态列表，用于筛选指定状态的审批节点，可选值：Undo、Committed、Rejected、Aborted、Approved、Handling、Succeed、Failed，已办常用传Approved、Rejected，待办常用传Handling */
    
    @OpenAPIParam("States")
    private List<String> statesParam;


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

    public String getSort() {
        return sortParam;
    }

    public void setSort(String sortParam) {
        this.sortParam = sortParam;
    }

    public String getSortBy() {
        return sortByParam;
    }

    public void setSortBy(String sortByParam) {
        this.sortByParam = sortByParam;
    }

    public List<String> getStates() {
        return statesParam;
    }

    public void setStates(List<String> statesParam) {
        this.statesParam = statesParam;
    }

}
