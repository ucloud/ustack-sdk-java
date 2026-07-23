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

public class DescribeVMSetRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，普通租户需填写自身CompanyID；管理员租户（CompanyID=200000231）或留空时系统按管理员权限返回全部可见计算集群 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 虚拟机ID，用于过滤支持该虚拟机迁移的可运行计算集群，根据虚拟机的资源需求筛选符合条件的集群 */
    
    @OpenAPIParam("FilterRunnableSetsByVMID")
    private String filterRunnableSetsByVMIDParam;

    /** 分页大小，指定每页返回的记录数，默认为10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，默认为0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域ID，指定计算集群所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 集群ID列表，指定要查询的计算集群ID，支持批量查询 */
    
    @OpenAPIParam("SetIDs")
    private List<String> setIDsParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getFilterRunnableSetsByVMID() {
        return filterRunnableSetsByVMIDParam;
    }

    public void setFilterRunnableSetsByVMID(String filterRunnableSetsByVMIDParam) {
        this.filterRunnableSetsByVMIDParam = filterRunnableSetsByVMIDParam;
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

    public List<String> getSetIDs() {
        return setIDsParam;
    }

    public void setSetIDs(List<String> setIDsParam) {
        this.setIDsParam = setIDsParam;
    }

}
