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

public class DescribeVMSetResponse extends Response {

    /** 计算集群信息列表，包含计算集群的详细信息，如CPU、内存、GPU资源使用情况、绑定的存储集群、CPU型号等 */
    @SerializedName("Infos")
    private List<SetInfo> infosParam;

    /** 计算集群总数，返回符合查询条件的计算集群总数量 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<SetInfo> getInfos() {
        return infosParam;
    }

    public void setInfos(List<SetInfo> infosParam) {
        this.infosParam = infosParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
