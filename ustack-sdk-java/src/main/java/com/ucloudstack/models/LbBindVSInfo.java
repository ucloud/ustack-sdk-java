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

public class LbBindVSInfo {

    /** 负载均衡ID，用于标识关联的负载均衡实例 */
    @SerializedName("LBID")
    private String lBIDParam;

    /** 负载均衡名称，用于展示关联的负载均衡名称 */
    @SerializedName("LBName")
    private String lBNameParam;

    /** 虚拟服务器端口，用于展示监听器端口，取值范围：1~65535 */
    @SerializedName("Port")
    private Integer portParam;

    /** 虚拟服务器协议，用于展示监听器协议，取值范围：TCP、UDP、HTTP、HTTPS */
    @SerializedName("Protocol")
    private String protocolParam;

    /** 虚拟服务器ID，用于标识关联的监听器实例 */
    @SerializedName("VSID")
    private String vSIDParam;


    public String getLBID() {
        return lBIDParam;
    }

    public void setLBID(String lBIDParam) {
        this.lBIDParam = lBIDParam;
    }

    public String getLBName() {
        return lBNameParam;
    }

    public void setLBName(String lBNameParam) {
        this.lBNameParam = lBNameParam;
    }

    public Integer getPort() {
        return portParam;
    }

    public void setPort(Integer portParam) {
        this.portParam = portParam;
    }

    public String getProtocol() {
        return protocolParam;
    }

    public void setProtocol(String protocolParam) {
        this.protocolParam = protocolParam;
    }

    public String getVSID() {
        return vSIDParam;
    }

    public void setVSID(String vSIDParam) {
        this.vSIDParam = vSIDParam;
    }

}
