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

public class ListMemberTagsRequest extends Request {

    /** 关键词，用于按角色名称或备注检索 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，控制单次返回数量 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 成员ID，用于筛选指定账号的授权信息 */
    
    @UCloudStackParam("MemberID")
    private Integer memberIDParam;

    /** 分页偏移量，用于分页起点，默认为0 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 角色ID，用于筛选指定角色的授权信息 */
    
    @UCloudStackParam("RoleID")
    private String roleIDParam;


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

    public Integer getMemberID() {
        return memberIDParam;
    }

    public void setMemberID(Integer memberIDParam) {
        this.memberIDParam = memberIDParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public String getRoleID() {
        return roleIDParam;
    }

    public void setRoleID(String roleIDParam) {
        this.roleIDParam = roleIDParam;
    }

}
