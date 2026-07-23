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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class DHCPServerStateResult {

    /** DHCP 服务器主机IP地址 */
    @SerializedName("HostIP")
    private String hostIPParam;

    /** DHCP 服务器主机名 */
    @SerializedName("Hostname")
    private String hostnameParam;

    /** DHCP 服务器状态. dead: 未运行, running: 运行中 */
    @SerializedName("Stage")
    private String stageParam;

    /** 操作是否成功 */
    @SerializedName("Success")
    private Boolean successParam;


    public String getHostIP() {
        return hostIPParam;
    }

    public void setHostIP(String hostIPParam) {
        this.hostIPParam = hostIPParam;
    }

    public String getHostname() {
        return hostnameParam;
    }

    public void setHostname(String hostnameParam) {
        this.hostnameParam = hostnameParam;
    }

    public String getStage() {
        return stageParam;
    }

    public void setStage(String stageParam) {
        this.stageParam = stageParam;
    }

    public Boolean getSuccess() {
        return successParam;
    }

    public void setSuccess(Boolean successParam) {
        this.successParam = successParam;
    }

}
