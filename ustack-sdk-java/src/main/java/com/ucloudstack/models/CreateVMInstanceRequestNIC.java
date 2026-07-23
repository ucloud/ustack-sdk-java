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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class CreateVMInstanceRequestNIC {

    /** 扁平网络ID */
    @SerializedName("FlatNetworkID")
    private String flatNetworkIDParam;

    /** ip地址，可选参数，为空则由平台分配 */
    @SerializedName("IP")
    private String iPParam;

    /** 入向平均带宽，用于QoS流量整形；0表示不限制，单位Mbps */
    @SerializedName("InAverageBandwidth")
    private Integer inAverageBandwidthParam;

    /** 启用状态，可选值：up（默认），down，可选参数 */
    @SerializedName("LinkState")
    private String linkStateParam;

    /** mac地址，可选参数，为空则由平台分配 */
    @SerializedName("MAC")
    private String mACParam;

    /** 网卡型号，支持e1000，virtio（默认），可选参数 */
    @SerializedName("Model")
    private String modelParam;

    /** 出向平均带宽，用于QoS流量整形；0表示不限制，单位Mbps */
    @SerializedName("OutAverageBandwidth")
    private Integer outAverageBandwidthParam;

    /** 网卡队列数，可选参数，为0则根据cpu计算 */
    @SerializedName("Queues")
    private Integer queuesParam;

    /** 安全组ID，可选参数 */
    @SerializedName("SGID")
    private String sGIDParam;


    public String getFlatNetworkID() {
        return flatNetworkIDParam;
    }

    public void setFlatNetworkID(String flatNetworkIDParam) {
        this.flatNetworkIDParam = flatNetworkIDParam;
    }

    public String getIP() {
        return iPParam;
    }

    public void setIP(String iPParam) {
        this.iPParam = iPParam;
    }

    public Integer getInAverageBandwidth() {
        return inAverageBandwidthParam;
    }

    public void setInAverageBandwidth(Integer inAverageBandwidthParam) {
        this.inAverageBandwidthParam = inAverageBandwidthParam;
    }

    public String getLinkState() {
        return linkStateParam;
    }

    public void setLinkState(String linkStateParam) {
        this.linkStateParam = linkStateParam;
    }

    public String getMAC() {
        return mACParam;
    }

    public void setMAC(String mACParam) {
        this.mACParam = mACParam;
    }

    public String getModel() {
        return modelParam;
    }

    public void setModel(String modelParam) {
        this.modelParam = modelParam;
    }

    public Integer getOutAverageBandwidth() {
        return outAverageBandwidthParam;
    }

    public void setOutAverageBandwidth(Integer outAverageBandwidthParam) {
        this.outAverageBandwidthParam = outAverageBandwidthParam;
    }

    public Integer getQueues() {
        return queuesParam;
    }

    public void setQueues(Integer queuesParam) {
        this.queuesParam = queuesParam;
    }

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

}
