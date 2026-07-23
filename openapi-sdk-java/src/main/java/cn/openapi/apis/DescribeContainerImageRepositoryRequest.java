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

public class DescribeContainerImageRepositoryRequest extends Request {

    /** 租户ID，用于筛选指定租户的私有仓库且必须与仓库所属租户一致；当 Public 设为 true 查询公有仓库时可不填 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 关键词，按镜像仓库名称模糊搜索 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目组ID列表，用于过滤指定项目组的镜像仓库 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 是否只查询公有仓库，true 时忽略租户过滤并仅返回带有公有标记、所有租户都可拉取的仓库 */
    
    @OpenAPIParam("Public")
    private Boolean publicParam;

    /** 地域，镜像仓库所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 状态列表，按状态过滤镜像仓库 */
    
    @OpenAPIParam("Status")
    private List<String> statusParam;


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

    public Boolean getPublic() {
        return publicParam;
    }

    public void setPublic(Boolean publicParam) {
        this.publicParam = publicParam;
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
