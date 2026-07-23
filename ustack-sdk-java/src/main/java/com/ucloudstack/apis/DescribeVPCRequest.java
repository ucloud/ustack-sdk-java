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

public class DescribeVPCRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 搜索关键词，用于按名称或备注模糊查询 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，用于限制单次返回条数 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，用于指定返回结果起始位置 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 对端ID，用于筛选包含指定对等连接的VPC */
    
    @UCloudStackParam("PeerID")
    private String peerIDParam;

    /** 项目ID列表，用于按项目维度筛选资源 */
    
    @UCloudStackParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** VPC状态列表，用于按多个状态过滤VPC，支持前端按Status.0、Status.1等形式传参 */
    
    @UCloudStackParam("Status")
    private List<String> statusParam;

    /** VPCID列表，用于查询指定的虚拟私有网络 */
    
    @UCloudStackParam("VPCIDs")
    private List<String> vPCIDsParam;


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

    public String getPeerID() {
        return peerIDParam;
    }

    public void setPeerID(String peerIDParam) {
        this.peerIDParam = peerIDParam;
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

    public List<String> getVPCIDs() {
        return vPCIDsParam;
    }

    public void setVPCIDs(List<String> vPCIDsParam) {
        this.vPCIDsParam = vPCIDsParam;
    }

}
