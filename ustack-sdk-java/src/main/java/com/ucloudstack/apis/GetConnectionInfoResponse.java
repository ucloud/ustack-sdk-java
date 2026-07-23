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

public class GetConnectionInfoResponse extends Response {

    /** 连接信息列表，来源于黄河Agent实时采集的连接数据，按请求的Offset/Limit分页 */
    @SerializedName("Infos")
    private List<ConnectionInfos> infosParam;

    /** 总数，采集到的连接总数（未分页前的数量） */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<ConnectionInfos> getInfos() {
        return infosParam;
    }

    public void setInfos(List<ConnectionInfos> infosParam) {
        this.infosParam = infosParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
