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

public class GetDHCPNetworkResponse extends Response {

    /** DHCP 地址池列表，每个机房一条 */
    @SerializedName("Pools")
    private List<DHCPPoolInfo> poolsParam;

    /** DHCPServer 配置 */
    @SerializedName("Server")
    private DHCPServerInfo serverParam;


    public List<DHCPPoolInfo> getPools() {
        return poolsParam;
    }

    public void setPools(List<DHCPPoolInfo> poolsParam) {
        this.poolsParam = poolsParam;
    }

    public DHCPServerInfo getServer() {
        return serverParam;
    }

    public void setServer(DHCPServerInfo serverParam) {
        this.serverParam = serverParam;
    }

}
