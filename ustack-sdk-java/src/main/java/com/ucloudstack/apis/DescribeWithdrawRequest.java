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

public class DescribeWithdrawRequest extends Request {

    /** 查询起始时间，提现记录创建时间的起始时间戳，单位为秒，必须小于结束时间 */
    @NotEmpty
    @OpenAPIParam("BeginTime")
    private Integer beginTimeParam;

    /** 租户ID，过滤指定租户的提现记录，不指定则查询所有租户（需系统管理员权限） */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 查询结束时间，提现记录创建时间的结束时间戳，单位为秒，必须大于起始时间 */
    @NotEmpty
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 分页大小，指定每页返回的提现记录数量 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定从第几条记录开始返回 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;


    public Integer getBeginTime() {
        return beginTimeParam;
    }

    public void setBeginTime(Integer beginTimeParam) {
        this.beginTimeParam = beginTimeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
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

}
