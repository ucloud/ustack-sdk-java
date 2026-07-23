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

public class RechargeRequest extends Request {

    /** 充值金额，单位：元；现金充值取值范围：100.00-500000.00，内部赠金充值取值范围：100.00-10000000.00 */
    @NotEmpty
    @OpenAPIParam("Amount")
    private Double amountParam;

    /** 租户ID，指定要充值的租户唯一标识 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 来源类型，现金充值时必须明确渠道：ALIPAY/WECHAT_PAY/OFFLINE/SINPAY；内部赠金充值时该字段忽略并自动视为INNER */
    @NotEmpty
    @OpenAPIParam("FromType")
    private String fromTypeParam;

    /** 充值类型，1表示现金充值（REAL），2表示内部赠金（FREE），仅当选择现金充值时才会校验凭证唯一性 */
    @NotEmpty
    @OpenAPIParam("RechargeType")
    private Integer rechargeTypeParam;

    /** 序列号，充值的序列号或凭证号，现金充值必须唯一；若重复会返回序列号重复的错误 */
    
    @OpenAPIParam("SerialNo")
    private String serialNoParam;


    public Double getAmount() {
        return amountParam;
    }

    public void setAmount(Double amountParam) {
        this.amountParam = amountParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getFromType() {
        return fromTypeParam;
    }

    public void setFromType(String fromTypeParam) {
        this.fromTypeParam = fromTypeParam;
    }

    public Integer getRechargeType() {
        return rechargeTypeParam;
    }

    public void setRechargeType(Integer rechargeTypeParam) {
        this.rechargeTypeParam = rechargeTypeParam;
    }

    public String getSerialNo() {
        return serialNoParam;
    }

    public void setSerialNo(String serialNoParam) {
        this.serialNoParam = serialNoParam;
    }

}
