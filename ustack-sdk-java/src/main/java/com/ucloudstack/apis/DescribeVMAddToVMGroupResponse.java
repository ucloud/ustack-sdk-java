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

public class DescribeVMAddToVMGroupResponse extends Response {

    /** 总记录数，可加入隔离组的虚拟机总数，用于分页计算 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;

    /** 虚拟机列表，展示可加入隔离组的虚拟机信息 */
    @SerializedName("VMs")
    private List<IGVM> vMsParam;


    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

    public List<IGVM> getVMs() {
        return vMsParam;
    }

    public void setVMs(List<IGVM> vMsParam) {
        this.vMsParam = vMsParam;
    }

}
