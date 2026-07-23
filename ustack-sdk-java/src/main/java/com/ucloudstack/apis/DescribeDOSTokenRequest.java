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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribeDOSTokenRequest extends Request {

    /** 租户ID，用于标识令牌所属的租户上下文；公司级账号需填写自身CompanyID，系统/地域管理员可不填或指定目标租户 */
    
    @OpenAPIParam("CompanyID")
    private String companyIDParam;

    /** 分页大小，指定每页返回的记录数，为0时默认10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** OSSID，对象存储实例标识 */
    @NotEmpty
    @OpenAPIParam("OSSID")
    private String oSSIDParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public String getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(String companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public String getOSSID() {
        return oSSIDParam;
    }

    public void setOSSID(String oSSIDParam) {
        this.oSSIDParam = oSSIDParam;
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

}
