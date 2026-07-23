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

public class DescribeApplicationResponse extends Response {

    /** 审批工单列表，包含审批的详细信息，当指定ApplicationID时，返回单个审批的完整信息（包含所有审批节点） */
    @SerializedName("Infos")
    private List<WorkflowApplication> infosParam;

    /** 审批工单总数，用于分页显示 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<WorkflowApplication> getInfos() {
        return infosParam;
    }

    public void setInfos(List<WorkflowApplication> infosParam) {
        this.infosParam = infosParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
