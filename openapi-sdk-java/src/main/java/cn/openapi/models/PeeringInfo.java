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

public class PeeringInfo {

    /** 对端网段列表，目标网络所涵盖的所有地址范围 */
    @SerializedName("PeerCIDRs")
    private List<String> peerCIDRsParam;

    /** 对端ID，建立网络互通连接的目标网络标识符 */
    @SerializedName("PeerID")
    private String peerIDParam;

    /** 对端名称，目标网络的显示名称，查询时根据PeerType填充 */
    @SerializedName("PeerName")
    private String peerNameParam;

    /** 对端类型，标识互通目标的资源类型，取值VPC/DC */
    @SerializedName("PeerType")
    private String peerTypeParam;

    /** 连接状态，标识对等连接当前的可用性 */
    @SerializedName("Status")
    private String statusParam;


    public List<String> getPeerCIDRs() {
        return peerCIDRsParam;
    }

    public void setPeerCIDRs(List<String> peerCIDRsParam) {
        this.peerCIDRsParam = peerCIDRsParam;
    }

    public String getPeerID() {
        return peerIDParam;
    }

    public void setPeerID(String peerIDParam) {
        this.peerIDParam = peerIDParam;
    }

    public String getPeerName() {
        return peerNameParam;
    }

    public void setPeerName(String peerNameParam) {
        this.peerNameParam = peerNameParam;
    }

    public String getPeerType() {
        return peerTypeParam;
    }

    public void setPeerType(String peerTypeParam) {
        this.peerTypeParam = peerTypeParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

}
