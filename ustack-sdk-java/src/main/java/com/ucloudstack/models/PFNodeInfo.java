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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class PFNodeInfo {

    /** 节点ID，计算节点的唯一标识 */
    @SerializedName("NodeID")
    private String nodeIDParam;

    /** 物理网卡汇总信息列表，该节点上所有物理网卡的统计信息 */
    @SerializedName("PFSummaries")
    private List<PFSummary> pFSummariesParam;


    public String getNodeID() {
        return nodeIDParam;
    }

    public void setNodeID(String nodeIDParam) {
        this.nodeIDParam = nodeIDParam;
    }

    public List<PFSummary> getPFSummaries() {
        return pFSummariesParam;
    }

    public void setPFSummaries(List<PFSummary> pFSummariesParam) {
        this.pFSummariesParam = pFSummariesParam;
    }

}
