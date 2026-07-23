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

public class DescribeTenantResourcesResponse extends Response {

    /** 租户关联资源列表，返回该租户下未终止资源信息用于展示 */
    @SerializedName("Infos")
    private List<TenantResourceInfo> infosParam;

    /** 查询到的资源总记录数，用于分页展示；仅统计未终止资源 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<TenantResourceInfo> getInfos() {
        return infosParam;
    }

    public void setInfos(List<TenantResourceInfo> infosParam) {
        this.infosParam = infosParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
