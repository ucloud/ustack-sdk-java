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

public class DescribeExternalDiskRequest extends Request {

    /** 挂载的资源ID，筛选指定资源挂载的外置存储盘 */
    
    @OpenAPIParam("AttachResourceID")
    private String attachResourceIDParam;

    /** 租户ID，筛选指定租户的外置存储资源 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 租户过滤标识，非0仅返回已分配给租户的记录 */
    
    @OpenAPIParam("CompanyOnly")
    private Integer companyOnlyParam;

    /** 计算集群ID，用于筛选指定计算集群下的外置存储盘 */
    
    @OpenAPIParam("ComputeSetID")
    private String computeSetIDParam;

    /** 搜索关键词，支持资源名称模糊匹配 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，默认10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，默认0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目ID列表，筛选项目内的外置存储资源 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 存储集群ID，筛选指定存储集群下的外置存储盘 */
    
    @OpenAPIParam("SetID")
    private String setIDParam;

    /** 存储集群类型，用于过滤指定类型的存储集群 */
    
    @OpenAPIParam("SetType")
    private String setTypeParam;

    /** 共享盘筛选标识，true仅返回共享盘，false仅返回普通盘，空值返回全部 */
    
    @OpenAPIParam("ShareAbleFilter")
    private String shareAbleFilterParam;


    public String getAttachResourceID() {
        return attachResourceIDParam;
    }

    public void setAttachResourceID(String attachResourceIDParam) {
        this.attachResourceIDParam = attachResourceIDParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCompanyOnly() {
        return companyOnlyParam;
    }

    public void setCompanyOnly(Integer companyOnlyParam) {
        this.companyOnlyParam = companyOnlyParam;
    }

    public String getComputeSetID() {
        return computeSetIDParam;
    }

    public void setComputeSetID(String computeSetIDParam) {
        this.computeSetIDParam = computeSetIDParam;
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

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

    public String getShareAbleFilter() {
        return shareAbleFilterParam;
    }

    public void setShareAbleFilter(String shareAbleFilterParam) {
        this.shareAbleFilterParam = shareAbleFilterParam;
    }

}
