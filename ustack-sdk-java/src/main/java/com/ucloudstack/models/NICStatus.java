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

public class NICStatus {

    /** 是否开启自动协商，标识是否开启自动协商 */
    @SerializedName("AutoNegotiation")
    private Boolean autoNegotiationParam;

    /** 双工模式，当前双工模式 */
    @SerializedName("Duplex")
    private String duplexParam;

    /** 是否开启网卡绑定，标识是否开启网卡绑定 */
    @SerializedName("EnableBonding")
    private Boolean enableBondingParam;

    /** 连接状态，标识链路是否可用 */
    @SerializedName("Linked")
    private Boolean linkedParam;

    /** 网卡MAC，网卡MAC地址 */
    @SerializedName("Mac")
    private String macParam;

    /** 实际速率，当前链路速率 */
    @SerializedName("Speed")
    private String speedParam;


    public Boolean getAutoNegotiation() {
        return autoNegotiationParam;
    }

    public void setAutoNegotiation(Boolean autoNegotiationParam) {
        this.autoNegotiationParam = autoNegotiationParam;
    }

    public String getDuplex() {
        return duplexParam;
    }

    public void setDuplex(String duplexParam) {
        this.duplexParam = duplexParam;
    }

    public Boolean getEnableBonding() {
        return enableBondingParam;
    }

    public void setEnableBonding(Boolean enableBondingParam) {
        this.enableBondingParam = enableBondingParam;
    }

    public Boolean getLinked() {
        return linkedParam;
    }

    public void setLinked(Boolean linkedParam) {
        this.linkedParam = linkedParam;
    }

    public String getMac() {
        return macParam;
    }

    public void setMac(String macParam) {
        this.macParam = macParam;
    }

    public String getSpeed() {
        return speedParam;
    }

    public void setSpeed(String speedParam) {
        this.speedParam = speedParam;
    }

}
