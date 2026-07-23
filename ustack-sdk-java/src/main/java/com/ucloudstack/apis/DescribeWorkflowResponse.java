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

public class DescribeWorkflowResponse extends Response {

    /** 流程信息列表，包含流程的完整配置信息，包括审批节点、资源类型等详细信息 */
    @SerializedName("Infos")
    private List<Workflow> infosParam;

    /** 流程总数，符合查询条件的流程数量，用于分页显示 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public List<Workflow> getInfos() {
        return infosParam;
    }

    public void setInfos(List<Workflow> infosParam) {
        this.infosParam = infosParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
