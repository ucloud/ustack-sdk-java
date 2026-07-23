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

public class ListRolesRequest extends Request {

    /** 租户ID，用于限定角色所属租户范围 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 分页大小，控制单次返回数量 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，用于分页起点 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 角色ID列表，用于筛选指定的权限角色集合 */
    
    @UCloudStackParam("RoleIDs")
    private List<String> roleIDsParam;

    /** 角色类型，标识角色来源，取值：System或Custom */
    
    @UCloudStackParam("Type")
    private String typeParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
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

    public List<String> getRoleIDs() {
        return roleIDsParam;
    }

    public void setRoleIDs(List<String> roleIDsParam) {
        this.roleIDsParam = roleIDsParam;
    }

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

}
