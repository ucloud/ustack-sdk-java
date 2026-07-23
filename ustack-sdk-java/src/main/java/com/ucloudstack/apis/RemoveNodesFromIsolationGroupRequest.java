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

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class RemoveNodesFromIsolationGroupRequest extends Request {

    /** 隔离组ID，指定目标隔离组 */
    @NotEmpty
    @OpenAPIParam("IGID")
    private String iGIDParam;

    /** 节点ID列表，指定要从隔离组移除的节点 */
    @NotEmpty
    @OpenAPIParam("NodeIDs")
    private List<String> nodeIDsParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public String getIGID() {
        return iGIDParam;
    }

    public void setIGID(String iGIDParam) {
        this.iGIDParam = iGIDParam;
    }

    public List<String> getNodeIDs() {
        return nodeIDsParam;
    }

    public void setNodeIDs(List<String> nodeIDsParam) {
        this.nodeIDsParam = nodeIDsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
