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

public class SubnetRouteInfo {

    /** 目的地址 */
    @SerializedName("Destination")
    private String destinationParam;

    /** 下一跳标识，VIP/VM类型为资源ID，Custom类型为IP地址 */
    @SerializedName("NextHop")
    private String nextHopParam;

    /** 下一跳的IP地址，实际的网络地址 */
    @SerializedName("NextHopAddr")
    private String nextHopAddrParam;

    /** 下一跳名称，仅下一跳为VM/VIP时填充资源名称 */
    @SerializedName("NextHopName")
    private String nextHopNameParam;

    /** 下一跳类型，取值VIP/VM/Custom */
    @SerializedName("NextHopType")
    private String nextHopTypeParam;

    /** 备注，用于补充说明 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 子网ID */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;


    public String getDestination() {
        return destinationParam;
    }

    public void setDestination(String destinationParam) {
        this.destinationParam = destinationParam;
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

    public String getSubnetID() {
        return subnetIDParam;
    }

    public void setSubnetID(String subnetIDParam) {
        this.subnetIDParam = subnetIDParam;
    }

    public String getSubnetName() {
        return subnetNameParam;
    }

    public void setSubnetName(String subnetNameParam) {
        this.subnetNameParam = subnetNameParam;
    }

}
