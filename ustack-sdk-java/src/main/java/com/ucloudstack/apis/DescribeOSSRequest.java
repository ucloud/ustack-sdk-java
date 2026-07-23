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

public class DescribeOSSRequest extends Request {

    /** 租户ID，资源所属租户标识 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 过滤标志，如Filter=DBS时排除已被DBS备份绑定的对象存储 */
    
    @OpenAPIParam("Filter")
    private String filterParam;

    /** 搜索关键词，用于模糊匹配对象存储名称或备注 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，为0时默认10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 对象存储ID列表，用于查询指定对象存储信息 */
    
    @OpenAPIParam("OSSIDs")
    private List<String> oSSIDsParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目组ID列表，用于筛选指定项目组下的对象存储资源 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定资源所属的地域 */
    
    @OpenAPIParam("Region")
    private String regionParam;

    /** 对象存储状态列表，用于筛选指定状态的对象存储资源，取值与DescribeOSSResponse.Infos.Status一致（如Running、Stopped、Starting、Stopping、Upgrading、Changingpwd、Downgrading、Deleting、Failed、VersionUpgrading等） */
    
    @OpenAPIParam("Status")
    private List<String> statusParam;

    /** VPC ID列表，用于筛选指定VPC下的对象存储资源 */
    
    @OpenAPIParam("VpcIDs")
    private List<String> vpcIDsParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getFilter() {
        return filterParam;
    }

    public void setFilter(String filterParam) {
        this.filterParam = filterParam;
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

    public List<String> getOSSIDs() {
        return oSSIDsParam;
    }

    public void setOSSIDs(List<String> oSSIDsParam) {
        this.oSSIDsParam = oSSIDsParam;
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

    public List<String> getVpcIDs() {
        return vpcIDsParam;
    }

    public void setVpcIDs(List<String> vpcIDsParam) {
        this.vpcIDsParam = vpcIDsParam;
    }

}
