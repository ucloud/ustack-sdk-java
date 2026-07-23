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

public class DescribeRechargeRequest extends Request {

    /** 查询起始时间，充值记录创建时间的起始时间戳，单位为秒，必须小于结束时间 */
    @NotEmpty
    @OpenAPIParam("BeginTime")
    private Integer beginTimeParam;

    /** 租户ID，过滤指定租户的充值记录，普通租户传自身CompanyID；系统管理员可传0或留空以查询所有租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 查询结束时间，充值记录创建时间的结束时间戳，单位为秒，必须大于起始时间 */
    @NotEmpty
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 来源类型，保留字段，当前不会根据该字段过滤，典型值：ALIPAY/WECHAT_PAY/INNER/OFFLINE */
    
    @OpenAPIParam("FromType")
    private String fromTypeParam;

    /** 分页大小，指定每页返回的充值记录数量 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定从第几条记录开始返回 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 充值类型，保留字段，当前接口不会根据该字段过滤，填写1（现金）或2（赠金）不会影响查询结果 */
    
    @OpenAPIParam("RechargeType")
    private String rechargeTypeParam;

    /** 用户账号ID，保留字段，与CompanyID等价，当前不会影响查询结果 */
    
    @OpenAPIParam("UserAccountID")
    private Integer userAccountIDParam;


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

    public String getFromType() {
        return fromTypeParam;
    }

    public void setFromType(String fromTypeParam) {
        this.fromTypeParam = fromTypeParam;
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

    public String getRechargeType() {
        return rechargeTypeParam;
    }

    public void setRechargeType(String rechargeTypeParam) {
        this.rechargeTypeParam = rechargeTypeParam;
    }

    public Integer getUserAccountID() {
        return userAccountIDParam;
    }

    public void setUserAccountID(Integer userAccountIDParam) {
        this.userAccountIDParam = userAccountIDParam;
    }

}
