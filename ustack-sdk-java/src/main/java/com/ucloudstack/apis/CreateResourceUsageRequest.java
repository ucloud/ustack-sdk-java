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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateResourceUsageRequest extends Request {

    /** 用量统计开始时间，Unix时间戳(秒)，指定统计的起始时间点 */
    @NotEmpty
    @OpenAPIParam("BeginTime")
    private Integer beginTimeParam;

    /** 租户ID列表，指定要统计的租户范围，若不指定则统计所有租户 */
    
    @OpenAPIParam("CompanyIDs")
    private List<Integer> companyIDsParam;

    /** 用量统计结束时间，Unix时间戳(秒)，指定统计的结束时间点，必须大于开始时间 */
    @NotEmpty
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 资源用量报告名称，用于标识和管理资源用量统计任务 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 项目组ID列表，指定要统计的项目组范围，若不指定则统计所有项目组，ProjectID 采用 project- 前缀加14位随机字符格式 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定要统计资源用量的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源类型列表，指定要统计的资源类型，取值范围：Set（计算集群）、StorageSet（存储集群）、Node(节点)、VM（云主机） */
    @NotEmpty
    @OpenAPIParam("ResourceTypes")
    private List<String> resourceTypesParam;


    public Integer getBeginTime() {
        return beginTimeParam;
    }

    public void setBeginTime(Integer beginTimeParam) {
        this.beginTimeParam = beginTimeParam;
    }

    public List<Integer> getCompanyIDs() {
        return companyIDsParam;
    }

    public void setCompanyIDs(List<Integer> companyIDsParam) {
        this.companyIDsParam = companyIDsParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
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

    public List<String> getResourceTypes() {
        return resourceTypesParam;
    }

    public void setResourceTypes(List<String> resourceTypesParam) {
        this.resourceTypesParam = resourceTypesParam;
    }

}
