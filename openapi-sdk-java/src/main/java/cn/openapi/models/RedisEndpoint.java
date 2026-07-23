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

public class RedisEndpoint {

    /** 端点，IP:Port形式的访问地址 */
    @SerializedName("Endpoint")
    private String endpointParam;

    /** IP地址，实例网卡IP地址 */
    @SerializedName("IP")
    private String iPParam;

    /** IP版本，IPv4或IPv6 */
    @SerializedName("IPVersion")
    private String iPVersionParam;

    /** 网卡类型，LAN表示内网，WAN表示外网 */
    @SerializedName("NicType")
    private String nicTypeParam;

    /** 安全组ID，网卡绑定的安全组ID */
    @SerializedName("SGID")
    private String sGIDParam;

    /** 安全组名称，网卡绑定的安全组名称 */
    @SerializedName("SGName")
    private String sGNameParam;


    public String getEndpoint() {
        return endpointParam;
    }

    public void setEndpoint(String endpointParam) {
        this.endpointParam = endpointParam;
    }

    public String getIP() {
        return iPParam;
    }

    public void setIP(String iPParam) {
        this.iPParam = iPParam;
    }

    public String getIPVersion() {
        return iPVersionParam;
    }

    public void setIPVersion(String iPVersionParam) {
        this.iPVersionParam = iPVersionParam;
    }

    public String getNicType() {
        return nicTypeParam;
    }

    public void setNicType(String nicTypeParam) {
        this.nicTypeParam = nicTypeParam;
    }

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

    public String getSGName() {
        return sGNameParam;
    }

    public void setSGName(String sGNameParam) {
        this.sGNameParam = sGNameParam;
    }

}
