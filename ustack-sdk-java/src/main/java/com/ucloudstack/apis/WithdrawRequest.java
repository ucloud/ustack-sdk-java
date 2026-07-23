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

public class WithdrawRequest extends Request {

    /** 租户ID，指定要提现的租户唯一标识，从该租户账户扣除提现金额 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 源账户类型，指定提现的账户类型，FREE表示从内部账户（赠金）提现，REAL表示从外部账户（现金）提现 */
    @NotEmpty
    @UCloudStackParam("SrcAccountType")
    private String srcAccountTypeParam;

    /** 提现金额，要提现的金额，单位为元，必须大于0且不能超过账户可提现余额 */
    @NotEmpty
    @UCloudStackParam("WithdrawAmount")
    private Double withdrawAmountParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getSrcAccountType() {
        return srcAccountTypeParam;
    }

    public void setSrcAccountType(String srcAccountTypeParam) {
        this.srcAccountTypeParam = srcAccountTypeParam;
    }

    public Double getWithdrawAmount() {
        return withdrawAmountParam;
    }

    public void setWithdrawAmount(Double withdrawAmountParam) {
        this.withdrawAmountParam = withdrawAmountParam;
    }

}
