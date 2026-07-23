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

public class DescribeUserResponse extends Response {

    /** 租户详细信息列表，查询结果返回并用于展示租户基础信息、状态与额度等信息 */
    @SerializedName("Infos")
    private List<TenantTenantInfoRes> infosParam;

    /** 查询到的租户总记录数，用于分页展示；当使用产品类型筛选时已排除禁用租户 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<TenantTenantInfoRes> getInfos() {
        return infosParam;
    }

    public void setInfos(List<TenantTenantInfoRes> infosParam) {
        this.infosParam = infosParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
