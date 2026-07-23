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

public class DescribeTransactionRequest extends Request {

    /** 查询起始时间，Unix秒时间戳，必须早于EndTime */
    @NotEmpty
    @OpenAPIParam("BeginTime")
    private Integer beginTimeParam;

    /** 查询结束时间，Unix秒时间戳，必须大于BeginTime */
    @NotEmpty
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 分页大小，指定每页返回的交易记录数量 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定从第几条记录开始返回 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目组ID列表，保留字段，当前接口不会根据项目过滤 */
    @NotEmpty
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定交易所属地域；传入all或空字符串会查询所有地域（充值/提现类交易本身无地域概念） */
    
    @OpenAPIParam("Region")
    private String regionParam;

    /** 交易类型，取值：CHARGE/RECHARGE/REFUND/WITHDRAW/FREE_RECHARGE/FREE_WITHDRAW，不填写则返回所有交易类型 */
    
    @OpenAPIParam("TransactionType")
    private String transactionTypeParam;

    /** 用户账号ID（即CompanyID），交易查询依据的唯一租户标识 */
    
    @OpenAPIParam("UserAccountID")
    private Integer userAccountIDParam;


    public Integer getBeginTime() {
        return beginTimeParam;
    }

    public void setBeginTime(Integer beginTimeParam) {
        this.beginTimeParam = beginTimeParam;
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

    public String getTransactionType() {
        return transactionTypeParam;
    }

    public void setTransactionType(String transactionTypeParam) {
        this.transactionTypeParam = transactionTypeParam;
    }

    public Integer getUserAccountID() {
        return userAccountIDParam;
    }

    public void setUserAccountID(Integer userAccountIDParam) {
        this.userAccountIDParam = userAccountIDParam;
    }

}
