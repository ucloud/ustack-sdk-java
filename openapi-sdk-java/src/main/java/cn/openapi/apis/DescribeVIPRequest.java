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
package cn.openapi.apis;

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class DescribeVIPRequest extends Request {

    /** 租户ID，指定查询范围内的租户组织，通常用于跨租户查询 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 关键词，用于模糊搜索VIP名称等字段 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目ID列表，一次可查询多个项目 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 状态列表，按状态过滤VIP */
    
    @OpenAPIParam("Status")
    private List<String> statusParam;

    /** VIPID列表，VIP的唯一标识符 */
    
    @OpenAPIParam("VIPIDs")
    private List<String> vIPIDsParam;

    /** VIP类型，LAN为内网VIP，WAN为外网VIP */
    
    @OpenAPIParam("VIPType")
    private String vIPTypeParam;


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

    public List<String> getVIPIDs() {
        return vIPIDsParam;
    }

    public void setVIPIDs(List<String> vIPIDsParam) {
        this.vIPIDsParam = vIPIDsParam;
    }

    public String getVIPType() {
        return vIPTypeParam;
    }

    public void setVIPType(String vIPTypeParam) {
        this.vIPTypeParam = vIPTypeParam;
    }

}
