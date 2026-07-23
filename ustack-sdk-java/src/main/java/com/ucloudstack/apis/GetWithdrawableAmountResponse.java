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

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class GetWithdrawableAmountResponse extends Response {

    /** 现金余额，租户账户中的外部账户（现金）余额，单位为元，精确到分 */
    @SerializedName("Amount")
    private Double amountParam;

    /** 赠金余额，租户账户中的内部账户（赠金）余额，单位为元，精确到分 */
    @SerializedName("AmountFree")
    private Double amountFreeParam;

    /** 可提现现金余额，外部账户中可提现的金额，单位为元，精确到分，当前等于现金余额 */
    @SerializedName("WithdrawableAmount")
    private Double withdrawableAmountParam;

    /** 可提现赠金余额，内部账户中可提现的金额，单位为元，精确到分，当前等于赠金余额 */
    @SerializedName("WithdrawableAmountFree")
    private Double withdrawableAmountFreeParam;


    public Double getAmount() {
        return amountParam;
    }

    public void setAmount(Double amountParam) {
        this.amountParam = amountParam;
    }

    public Double getAmountFree() {
        return amountFreeParam;
    }

    public void setAmountFree(Double amountFreeParam) {
        this.amountFreeParam = amountFreeParam;
    }

    public Double getWithdrawableAmount() {
        return withdrawableAmountParam;
    }

    public void setWithdrawableAmount(Double withdrawableAmountParam) {
        this.withdrawableAmountParam = withdrawableAmountParam;
    }

    public Double getWithdrawableAmountFree() {
        return withdrawableAmountFreeParam;
    }

    public void setWithdrawableAmountFree(Double withdrawableAmountFreeParam) {
        this.withdrawableAmountFreeParam = withdrawableAmountFreeParam;
    }

}
