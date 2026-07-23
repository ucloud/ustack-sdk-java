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

public class DescribeEIPRequest extends Request {

    /** 绑定的资源ID，用于过滤已绑定到指定资源的EIP，支持查询VM绑定的普通EIP、弹性网卡EIP和VIP */
    
    @OpenAPIParam("BindResourceID")
    private String bindResourceIDParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** EIP资源ID列表，用于过滤指定的EIP，若不指定则返回所有EIP */
    
    @OpenAPIParam("EIPIDs")
    private List<String> eIPIDsParam;

    /** EIP绑定状态，用于过滤指定状态的EIP，取值Bound/Bounding/Unbounding/Free等资源状态 */
    
    @OpenAPIParam("IPStatus")
    private String iPStatusParam;

    /** IP版本，用于过滤指定IP协议版本的EIP，取值IPv4/IPv6 */
    
    @OpenAPIParam("IPVersion")
    private String iPVersionParam;

    /** 关键词，用于模糊搜索EIP名称、备注等字段 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，用于限制单次返回条数 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，用于指定返回结果起始位置 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 运营商网段名称，用于过滤指定网段的EIP */
    
    @OpenAPIParam("OperatorName")
    private String operatorNameParam;

    /** 项目ID列表，用于过滤指定项目下的EIP资源 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** EIP状态列表，用于按多个状态过滤EIP，支持前端按Status.0、Status.1等形式传参 */
    
    @OpenAPIParam("Status")
    private List<String> statusParam;


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

    public List<String> getEIPIDs() {
        return eIPIDsParam;
    }

    public void setEIPIDs(List<String> eIPIDsParam) {
        this.eIPIDsParam = eIPIDsParam;
    }

    public String getIPStatus() {
        return iPStatusParam;
    }

    public void setIPStatus(String iPStatusParam) {
        this.iPStatusParam = iPStatusParam;
    }

    public String getIPVersion() {
        return iPVersionParam;
    }

    public void setIPVersion(String iPVersionParam) {
        this.iPVersionParam = iPVersionParam;
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

    public String getOperatorName() {
        return operatorNameParam;
    }

    public void setOperatorName(String operatorNameParam) {
        this.operatorNameParam = operatorNameParam;
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
