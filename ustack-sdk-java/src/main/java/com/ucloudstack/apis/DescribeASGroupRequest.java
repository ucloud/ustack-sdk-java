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

public class DescribeASGroupRequest extends Request {

    /** 伸缩模式筛选，Horizontal表示水平伸缩，Vertical表示垂直伸缩，若不指定则查询所有模式 */
    
    @UCloudStackParam("AsMode")
    private String asModeParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 伸缩组ID列表，用于查询指定的伸缩组，若不指定则查询所有伸缩组 */
    
    @UCloudStackParam("GroupIDs")
    private List<String> groupIDsParam;

    /** 查询关键字，用于按伸缩组名称模糊搜索 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，若不指定则默认为500 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 项目ID列表，用于筛选指定项目下的伸缩组，若不指定则查询所有项目 */
    
    @UCloudStackParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定查询的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;


    public String getAsMode() {
        return asModeParam;
    }

    public void setAsMode(String asModeParam) {
        this.asModeParam = asModeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getGroupIDs() {
        return groupIDsParam;
    }

    public void setGroupIDs(List<String> groupIDsParam) {
        this.groupIDsParam = groupIDsParam;
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

}
