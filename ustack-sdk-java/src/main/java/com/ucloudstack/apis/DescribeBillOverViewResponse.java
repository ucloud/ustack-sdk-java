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

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribeBillOverViewResponse extends Response {

    /** 详情，账单概览信息列表 */
    @SerializedName("Infos")
    private List<BillOverView> infosParam;

    /** 总金额，所有记录的总金额，单位为元 */
    @SerializedName("TotalAmount")
    private Double totalAmountParam;

    /** 内部账号总金额，所有记录的内部账号总金额，单位为元 */
    @SerializedName("TotalAmountFree")
    private Double totalAmountFreeParam;

    /** 外部账号总金额，所有记录的外部账号总金额，单位为元 */
    @SerializedName("TotalAmountReal")
    private Double totalAmountRealParam;

    /** 总数量，符合条件的记录总数 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<BillOverView> getInfos() {
        return infosParam;
    }

    public void setInfos(List<BillOverView> infosParam) {
        this.infosParam = infosParam;
    }

    public Double getTotalAmount() {
        return totalAmountParam;
    }

    public void setTotalAmount(Double totalAmountParam) {
        this.totalAmountParam = totalAmountParam;
    }

    public Double getTotalAmountFree() {
        return totalAmountFreeParam;
    }

    public void setTotalAmountFree(Double totalAmountFreeParam) {
        this.totalAmountFreeParam = totalAmountFreeParam;
    }

    public Double getTotalAmountReal() {
        return totalAmountRealParam;
    }

    public void setTotalAmountReal(Double totalAmountRealParam) {
        this.totalAmountRealParam = totalAmountRealParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
