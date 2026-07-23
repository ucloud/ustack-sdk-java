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

public class UpdateFlatNetworkRouteRequest extends Request {

    /** 目的地址CIDR，指定要更新的路由目标网段；该路由必须已存在 */
    @NotEmpty
    @OpenAPIParam("Destination")
    private String destinationParam;

    /** 扁平网络ID，指定路由所属的扁平网络唯一标识 */
    @NotEmpty
    @OpenAPIParam("FlatNetworkID")
    private String flatNetworkIDParam;

    /** 下一跳地址，更新数据包转发的网关IP地址，必须在扁平网络的CIDR范围内 */
    @NotEmpty
    @OpenAPIParam("NextHop")
    private String nextHopParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注信息，用于说明和注释，长度0-100字符，禁止http://或https://等非法字符 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;


    public String getDestination() {
        return destinationParam;
    }

    public void setDestination(String destinationParam) {
        this.destinationParam = destinationParam;
    }

    public String getFlatNetworkID() {
        return flatNetworkIDParam;
    }

    public void setFlatNetworkID(String flatNetworkIDParam) {
        this.flatNetworkIDParam = flatNetworkIDParam;
    }

    public String getNextHop() {
        return nextHopParam;
    }

    public void setNextHop(String nextHopParam) {
        this.nextHopParam = nextHopParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

}
