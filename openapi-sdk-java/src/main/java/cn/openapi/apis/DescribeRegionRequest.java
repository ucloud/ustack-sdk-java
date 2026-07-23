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

public class DescribeRegionRequest extends Request {

    /** 租户ID，用于查询指定租户授权的地域列表；条件互斥：CompanyID不为0时使用当前登录用户Company和Member作为目标；CompanyID为0且MemberID为0时返回当前用户可访问的全部地域 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 管理员ID，用于查询指定管理员授权的地域列表；条件互斥：MemberID不为0时仅返回该管理员授权地域；CompanyID不为0时该字段被忽略 */
    
    @OpenAPIParam("MemberID")
    private Integer memberIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getMemberID() {
        return memberIDParam;
    }

    public void setMemberID(Integer memberIDParam) {
        this.memberIDParam = memberIDParam;
    }

}
