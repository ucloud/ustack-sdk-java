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

public class VmNICInfo {

    /** 扁平网络ID */
    @SerializedName("FlatNetworkID")
    private String flatNetworkIDParam;

    /** 扁平网络名称 */
    @SerializedName("FlatNetworkName")
    private String flatNetworkNameParam;

    /** ip地址 */
    @SerializedName("IP")
    private String iPParam;

    /** 入向平均带宽，单位Mbps */
    @SerializedName("InAverageBandwidth")
    private Integer inAverageBandwidthParam;

    /** 启用状态 */
    @SerializedName("LinkState")
    private String linkStateParam;

    /** mac地址 */
    @SerializedName("MAC")
    private String mACParam;

    /** 网卡型号 */
    @SerializedName("Model")
    private String modelParam;

    /** 网卡ID，网卡资源的唯一标识 */
    @SerializedName("NICID")
    private String nICIDParam;

    /** 出向平均带宽，单位Mbps */
    @SerializedName("OutAverageBandwidth")
    private Integer outAverageBandwidthParam;

    /** 网卡队列数 */
    @SerializedName("Queues")
    private Integer queuesParam;

    /** 安全组ID */
    @SerializedName("SGID")
    private String sGIDParam;

    /** 安全组名称 */
    @SerializedName("SGName")
    private String sGNameParam;


    public String getFlatNetworkID() {
        return flatNetworkIDParam;
    }

    public void setFlatNetworkID(String flatNetworkIDParam) {
        this.flatNetworkIDParam = flatNetworkIDParam;
    }

    public String getFlatNetworkName() {
        return flatNetworkNameParam;
    }

    public void setFlatNetworkName(String flatNetworkNameParam) {
        this.flatNetworkNameParam = flatNetworkNameParam;
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

    public String getNICID() {
        return nICIDParam;
    }

    public void setNICID(String nICIDParam) {
        this.nICIDParam = nICIDParam;
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

    public String getSGName() {
        return sGNameParam;
    }

    public void setSGName(String sGNameParam) {
        this.sGNameParam = sGNameParam;
    }

}
