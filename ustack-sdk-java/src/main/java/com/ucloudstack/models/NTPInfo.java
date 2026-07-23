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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class NTPInfo {

    /** NTP上游服务器列表 */
    @SerializedName("Servers")
    private List<String> serversParam;

    /** NTP同步状态，标识NTP时间是否已同步 */
    @SerializedName("Status")
    private String statusParam;


    public List<String> getServers() {
        return serversParam;
    }

    public void setServers(List<String> serversParam) {
        this.serversParam = serversParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

}
