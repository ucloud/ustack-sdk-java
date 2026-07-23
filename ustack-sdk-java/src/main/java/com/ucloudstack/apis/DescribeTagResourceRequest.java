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

public class DescribeTagResourceRequest extends Request {

    /** 资源ID，用于精确查询指定资源的标签绑定情况 */
    
    @OpenAPIParam("BindResource")
    private String bindResourceParam;

    /** 资源类型，用于过滤指定类型的资源，支持包括DISK、VM等多种资源类型，如果传入无效类型会返回StatusResourceTypeInvalid错误 */
    
    @OpenAPIParam("BindResourceType")
    private String bindResourceTypeParam;

    /** 租户ID，用于标识资源所属的租户，实现多租户环境下的资源隔离，若不指定则根据用户权限返回可见标签资源，权限控制与DescribeTag相同：System/Region/Company级管理员分别可查所有/授权地域/租户授权地域资源，普通用户仅查项目资源（通过getSubuserResourceIDs获取） */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 标签键名，用于过滤绑定了指定标签键的资源 */
    
    @OpenAPIParam("Key")
    private String keyParam;

    /** 分页大小，指定每页返回的记录数，用于控制返回数据量 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，用于实现分页查询 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 标签值列表，用于过滤绑定了指定标签值的资源，支持多值过滤 */
    @NotEmpty
    @OpenAPIParam("Values")
    private List<String> valuesParam;


    public String getBindResource() {
        return bindResourceParam;
    }

    public void setBindResource(String bindResourceParam) {
        this.bindResourceParam = bindResourceParam;
    }

    public String getBindResourceType() {
        return bindResourceTypeParam;
    }

    public void setBindResourceType(String bindResourceTypeParam) {
        this.bindResourceTypeParam = bindResourceTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getKey() {
        return keyParam;
    }

    public void setKey(String keyParam) {
        this.keyParam = keyParam;
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

    public List<String> getValues() {
        return valuesParam;
    }

    public void setValues(List<String> valuesParam) {
        this.valuesParam = valuesParam;
    }

}
