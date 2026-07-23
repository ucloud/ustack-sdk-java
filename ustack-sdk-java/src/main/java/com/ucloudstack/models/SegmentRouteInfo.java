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

public class SegmentRouteInfo {

    /** 目的地址，路由的目标网段，CIDR格式 */
    @SerializedName("Destination")
    private String destinationParam;

    /** 下一跳IP地址，路由的下一跳IP */
    @SerializedName("NextHop")
    private String nextHopParam;

    /** 下一跳地址，路由的下一跳IP地址 */
    @SerializedName("NextHopAddr")
    private String nextHopAddrParam;

    /** 下一跳名称，路由的下一跳资源名称 */
    @SerializedName("NextHopName")
    private String nextHopNameParam;

    /** 下一跳类型，路由的下一跳类型，如Local（本地路由）等 */
    @SerializedName("NextHopType")
    private String nextHopTypeParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 外网线路ID，路由所属的外网线路资源ID */
    @SerializedName("SegmentID")
    private String segmentIDParam;

    /** 外网线路名称，路由所属的外网线路名称 */
    @SerializedName("SegmentName")
    private String segmentNameParam;


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

    public String getSegmentID() {
        return segmentIDParam;
    }

    public void setSegmentID(String segmentIDParam) {
        this.segmentIDParam = segmentIDParam;
    }

    public String getSegmentName() {
        return segmentNameParam;
    }

    public void setSegmentName(String segmentNameParam) {
        this.segmentNameParam = segmentNameParam;
    }

}
