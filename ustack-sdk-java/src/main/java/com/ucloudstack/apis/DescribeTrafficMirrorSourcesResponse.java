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

public class DescribeTrafficMirrorSourcesResponse extends Response {

    /** 源设备信息列表，按虚拟机维度返回可用作流量镜像源的网卡及方向信息，并结合Available标识判断该方向是否已被其他流量镜像占用 */
    @SerializedName("Infos")
    private List<TrafficMirrorSourceInfo> infosParam;

    /** 虚拟机总数，符合查询条件的虚拟机记录总数 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<TrafficMirrorSourceInfo> getInfos() {
        return infosParam;
    }

    public void setInfos(List<TrafficMirrorSourceInfo> infosParam) {
        this.infosParam = infosParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
