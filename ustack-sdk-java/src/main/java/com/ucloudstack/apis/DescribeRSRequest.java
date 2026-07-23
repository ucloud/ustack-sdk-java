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

public class DescribeRSRequest extends Request {

    /** 绑定资源ID，真实服务器绑定的资源ID，仅支持虚拟机资源 */
    
    @OpenAPIParam("BindResourceID")
    private String bindResourceIDParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 负载均衡ID，用于定位需要查询服务节点的负载均衡实例 */
    @NotEmpty
    @OpenAPIParam("LBID")
    private String lBIDParam;

    /** 分页大小，指定每页返回的记录数，用于控制返回数据量，取值范围：1-100，默认值：10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，用于实现分页查询，取值范围：≥0， 默认值：0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 真实服务器ID列表，用于筛选指定服务节点 */
    
    @OpenAPIParam("RSIDs")
    private List<String> rSIDsParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 虚拟服务器ID，用于定位需要查询服务节点的监听器实例 */
    @NotEmpty
    @OpenAPIParam("VSID")
    private String vSIDParam;


    public String getBindResourceID() {
        return bindResourceIDParam;
    }

    public void setBindResourceID(String bindResourceIDParam) {
        this.bindResourceIDParam = bindResourceIDParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getLBID() {
        return lBIDParam;
    }

    public void setLBID(String lBIDParam) {
        this.lBIDParam = lBIDParam;
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

    public List<String> getRSIDs() {
        return rSIDsParam;
    }

    public void setRSIDs(List<String> rSIDsParam) {
        this.rSIDsParam = rSIDsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getVSID() {
        return vSIDParam;
    }

    public void setVSID(String vSIDParam) {
        this.vSIDParam = vSIDParam;
    }

}
