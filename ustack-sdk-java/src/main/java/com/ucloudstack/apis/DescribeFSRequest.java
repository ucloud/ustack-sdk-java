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

public class DescribeFSRequest extends Request {

    /** 租户ID，资源所属租户标识 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 文件存储实例ID列表，用于查询指定文件存储信息 */
    
    @UCloudStackParam("FSIDs")
    private List<String> fSIDsParam;

    /** 搜索关键词，用于模糊匹配文件存储名称或备注 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，为0时默认10 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 项目组ID列表，用于筛选指定项目组下的文件存储资源 */
    
    @UCloudStackParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 文件存储状态列表，用于筛选指定状态的文件存储资源 */
    
    @UCloudStackParam("Status")
    private List<String> statusParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getFSIDs() {
        return fSIDsParam;
    }

    public void setFSIDs(List<String> fSIDsParam) {
        this.fSIDsParam = fSIDsParam;
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

    public List<String> getStatus() {
        return statusParam;
    }

    public void setStatus(List<String> statusParam) {
        this.statusParam = statusParam;
    }

}
