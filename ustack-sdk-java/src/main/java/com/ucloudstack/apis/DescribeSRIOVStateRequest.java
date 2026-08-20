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
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribeSRIOVStateRequest extends Request {

    /** 节点ID，用于查询SR-IOV状态的节点 */
    @NotEmpty
    @UCloudStackParam("NodeID")
    private String nodeIDParam;

    /** 网卡PCI地址，用于查询物理网卡SR-IOV状态 */
    @NotEmpty
    @UCloudStackParam("PCIAddress")
    private String pCIAddressParam;

    /** 地域ID，用于查询资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;


    public String getNodeID() {
        return nodeIDParam;
    }

    public void setNodeID(String nodeIDParam) {
        this.nodeIDParam = nodeIDParam;
    }

    public String getPCIAddress() {
        return pCIAddressParam;
    }

    public void setPCIAddress(String pCIAddressParam) {
        this.pCIAddressParam = pCIAddressParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
