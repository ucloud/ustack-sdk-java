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

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateDirectConnectRemoteSubnetCIDRsRequest extends Request {

    /** 远端子网网段列表，用户数据中心需要通过专线互连的网段，必须为CIDR格式，此操作会替换专线接入的所有远端子网网段 */
    @NotEmpty
    @OpenAPIParam("CIDRs")
    private List<String> cIDRsParam;

    /** 专线接入ID，指定要更新远端子网网段的专线接入资源ID */
    @NotEmpty
    @OpenAPIParam("DirectConnectID")
    private String directConnectIDParam;

    /** 地域ID，指定要更新的专线接入所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public List<String> getCIDRs() {
        return cIDRsParam;
    }

    public void setCIDRs(List<String> cIDRsParam) {
        this.cIDRsParam = cIDRsParam;
    }

    public String getDirectConnectID() {
        return directConnectIDParam;
    }

    public void setDirectConnectID(String directConnectIDParam) {
        this.directConnectIDParam = directConnectIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
