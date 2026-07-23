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

public class ListInstallTasksV2Request extends Request {

    /** 租户ID，过滤指定租户下的装机任务，若不指定则返回所有租户的任务 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 关键词搜索，支持按任务ID、裸金属ID、序列号、安装模式、状态进行关键词搜索 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 每页数量，指定每页返回的记录数，默认值为20，最大值为100 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 机器序列号过滤，支持精确匹配 */
    
    @UCloudStackParam("MachineSN")
    private String machineSNParam;

    /** 偏移量，指定跳过的记录数，最小值为0 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 项目ID列表，过滤指定项目下的装机任务 */
    
    @UCloudStackParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 状态过滤，可选值：waiting（待安装）、installing（安装中）、completed（已完成）、failed（失败）、canceled（已取消） */
    
    @UCloudStackParam("Status")
    private String statusParam;


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

    public String getMachineSN() {
        return machineSNParam;
    }

    public void setMachineSN(String machineSNParam) {
        this.machineSNParam = machineSNParam;
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

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

}
