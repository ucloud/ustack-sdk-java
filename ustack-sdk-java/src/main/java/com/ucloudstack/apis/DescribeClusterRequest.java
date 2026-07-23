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

public class DescribeClusterRequest extends Request {

    /** 集群Id */
    
    @OpenAPIParam("ClusterIDs")
    private List<String> clusterIDsParam;

    /** 租户ID */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 关键词 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /**  */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /**  */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目组ID */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 状态列表，按状态过滤容器集群 */
    
    @OpenAPIParam("Status")
    private List<String> statusParam;


    public List<String> getClusterIDs() {
        return clusterIDsParam;
    }

    public void setClusterIDs(List<String> clusterIDsParam) {
        this.clusterIDsParam = clusterIDsParam;
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
