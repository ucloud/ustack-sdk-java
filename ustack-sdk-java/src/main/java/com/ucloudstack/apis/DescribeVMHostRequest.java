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

public class DescribeVMHostRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 虚拟机ID，用于筛选可运行该虚拟机的宿主机 */
    
    @OpenAPIParam("FilterRunnableHostsByVMID")
    private String filterRunnableHostsByVMIDParam;

    /** 物理机ID列表，用于精确筛选指定物理机 */
    
    @OpenAPIParam("HostIDs")
    private List<String> hostIDsParam;

    /** 关键词，用于模糊匹配主机名或IP地址 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，用于限制单次返回条数 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，用于指定返回结果起始位置 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 计算集群ID，用于筛选指定集群的物理机 */
    
    @OpenAPIParam("SetID")
    private String setIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getFilterRunnableHostsByVMID() {
        return filterRunnableHostsByVMIDParam;
    }

    public void setFilterRunnableHostsByVMID(String filterRunnableHostsByVMIDParam) {
        this.filterRunnableHostsByVMIDParam = filterRunnableHostsByVMIDParam;
    }

    public List<String> getHostIDs() {
        return hostIDsParam;
    }

    public void setHostIDs(List<String> hostIDsParam) {
        this.hostIDsParam = hostIDsParam;
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

}
