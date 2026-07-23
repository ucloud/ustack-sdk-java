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

public class DescribeIsolationGroupsRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 隔离组ID列表，用于按ID筛选隔离组 */
    
    @UCloudStackParam("IGIDs")
    private List<String> iGIDsParam;

    /** 关键词，用于匹配隔离组名称或备注 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，用于限制单次返回条数 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，用于指定返回结果起始位置 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 策略对象，用于筛选隔离组，PolicyToVG时为隔离组ID，PolicyToNode时为节点标识 */
    
    @UCloudStackParam("PolicyObj")
    private String policyObjParam;

    /** 策略对象类型，用于筛选隔离组，取值PolicyToNode/PolicyToVG */
    
    @UCloudStackParam("PolicyObjType")
    private String policyObjTypeParam;

    /** 策略类型，用于筛选隔离组，取值VMAffinity/VMAntiAffinity */
    
    @UCloudStackParam("PolicyType")
    private String policyTypeParam;

    /** 项目ID列表，用于按项目筛选隔离组 */
    
    @UCloudStackParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 计算集群ID，用于按计算集群筛选隔离组 */
    
    @UCloudStackParam("SetID")
    private String setIDParam;

    /** 计算集群类型，用于按类型筛选隔离组 */
    
    @UCloudStackParam("SetType")
    private String setTypeParam;

    /** 状态列表，过滤隔离组状态 */
    
    @UCloudStackParam("Status")
    private List<String> statusParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getIGIDs() {
        return iGIDsParam;
    }

    public void setIGIDs(List<String> iGIDsParam) {
        this.iGIDsParam = iGIDsParam;
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

    public String getPolicyObj() {
        return policyObjParam;
    }

    public void setPolicyObj(String policyObjParam) {
        this.policyObjParam = policyObjParam;
    }

    public String getPolicyObjType() {
        return policyObjTypeParam;
    }

    public void setPolicyObjType(String policyObjTypeParam) {
        this.policyObjTypeParam = policyObjTypeParam;
    }

    public String getPolicyType() {
        return policyTypeParam;
    }

    public void setPolicyType(String policyTypeParam) {
        this.policyTypeParam = policyTypeParam;
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

    public List<String> getStatus() {
        return statusParam;
    }

    public void setStatus(List<String> statusParam) {
        this.statusParam = statusParam;
    }

}
