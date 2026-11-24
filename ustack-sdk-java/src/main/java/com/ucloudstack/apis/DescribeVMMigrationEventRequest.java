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

public class DescribeVMMigrationEventRequest extends Request {

    /** 开始时间，Unix时间戳(秒)，查询该时间点之后发生迁移的事件 */
    
    @UCloudStackParam("BeginTime")
    private Integer beginTimeParam;

    /** 租户ID，指定要查询迁移事件的租户，若不指定则查询所有租户 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 结束时间，Unix时间戳(秒)，查询该时间点之前发生迁移的事件，必须大于开始时间 */
    
    @UCloudStackParam("EndTime")
    private Integer endTimeParam;

    /** 主机IP列表，指定要查询迁移事件的主机范围，源主机或目标主机命中即返回 */
    
    @UCloudStackParam("HostIPs")
    private List<String> hostIPsParam;

    /** 关键字，按虚拟机ID或名称模糊匹配 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，若不指定则使用默认值 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 迁移类型列表，取值范围：NodeDown(宕机迁移)、DRS(自动迁移)、Manual(手动迁移) */
    
    @UCloudStackParam("MigrationTypes")
    private List<String> migrationTypesParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 项目组ID列表，指定要查询迁移事件的项目组范围，ProjectID 采用 project- 前缀加14位随机字符格式 */
    
    @UCloudStackParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定要查询迁移事件的地域 */
    
    @UCloudStackParam("Region")
    private String regionParam;

    /** 虚拟机ID列表，指定要查询迁移事件的虚拟机范围 */
    
    @UCloudStackParam("ResourceIDs")
    private List<String> resourceIDsParam;


    public Integer getBeginTime() {
        return beginTimeParam;
    }

    public void setBeginTime(Integer beginTimeParam) {
        this.beginTimeParam = beginTimeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
    }

    public List<String> getHostIPs() {
        return hostIPsParam;
    }

    public void setHostIPs(List<String> hostIPsParam) {
        this.hostIPsParam = hostIPsParam;
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

    public List<String> getMigrationTypes() {
        return migrationTypesParam;
    }

    public void setMigrationTypes(List<String> migrationTypesParam) {
        this.migrationTypesParam = migrationTypesParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public List<String> getProjectIDs() {
        return projectIDsParam;
    }

    public void setProjectIDs(List<String> projectIDsParam) {
        this.projectIDsParam = projectIDsParam;
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

}
