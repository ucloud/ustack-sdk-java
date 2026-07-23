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

public class WANIPConfig {

    /** 外网带宽，指定当前WAN IP的带宽上限，单位：Mbps */
    @SerializedName("Bandwidth")
    private Integer bandwidthParam;

    /** IP地址，指定当前WAN IP的地址，若未指定则由系统自动分配 */
    @SerializedName("IP")
    private String iPParam;

    /** IP版本，指定当前WAN IP的协议版本，取值：IPv4、IPv6 */
    @SerializedName("IPVersion")
    private String iPVersionParam;

    /** 线路ID，指定当前WAN IP所属的外网线路资源标识 */
    @SerializedName("SegmentID")
    private String segmentIDParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
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

    public String getSegmentID() {
        return segmentIDParam;
    }

    public void setSegmentID(String segmentIDParam) {
        this.segmentIDParam = segmentIDParam;
    }

}
