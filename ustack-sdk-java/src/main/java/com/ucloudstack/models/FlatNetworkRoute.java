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

public class FlatNetworkRoute {

    /** 目的地址CIDR，路由的目标网段 */
    @SerializedName("Destination")
    private String destinationParam;

    /** 扁平网络ID，路由所属的扁平网络唯一标识 */
    @SerializedName("FlatNetworkID")
    private String flatNetworkIDParam;

    /** 扁平网络名称，路由所属网络的名称 */
    @SerializedName("FlatNetworkName")
    private String flatNetworkNameParam;

    /** 下一跳地址，数据包转发的网关IP */
    @SerializedName("NextHop")
    private String nextHopParam;

    /** 下一跳IP地址，下一跳的具体IP地址 */
    @SerializedName("NextHopAddr")
    private String nextHopAddrParam;

    /** 下一跳名称，下一跳网络或设备的名称 */
    @SerializedName("NextHopName")
    private String nextHopNameParam;

    /** 下一跳类型，路由的下一跳类型，如local表示本地路由 */
    @SerializedName("NextHopType")
    private String nextHopTypeParam;

    /** 备注信息，路由的说明或用途描述 */
    @SerializedName("Remark")
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

    public String getFlatNetworkName() {
        return flatNetworkNameParam;
    }

    public void setFlatNetworkName(String flatNetworkNameParam) {
        this.flatNetworkNameParam = flatNetworkNameParam;
    }

    public String getNextHop() {
        return nextHopParam;
    }

    public void setNextHop(String nextHopParam) {
        this.nextHopParam = nextHopParam;
    }

    public String getNextHopAddr() {
        return nextHopAddrParam;
    }

    public void setNextHopAddr(String nextHopAddrParam) {
        this.nextHopAddrParam = nextHopAddrParam;
    }

    public String getNextHopName() {
        return nextHopNameParam;
    }

    public void setNextHopName(String nextHopNameParam) {
        this.nextHopNameParam = nextHopNameParam;
    }

    public String getNextHopType() {
        return nextHopTypeParam;
    }

    public void setNextHopType(String nextHopTypeParam) {
        this.nextHopTypeParam = nextHopTypeParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

}
