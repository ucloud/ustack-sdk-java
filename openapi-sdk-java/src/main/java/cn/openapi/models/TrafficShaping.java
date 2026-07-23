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

public class TrafficShaping {

    /** 平均带宽，单位Mbps，限制平均网络吸吐量 */
    @SerializedName("AverageBandwidth")
    private Integer averageBandwidthParam;

    /** 是否启用，流量整形功能的开关 */
    @SerializedName("Enable")
    private Boolean enableParam;


    public Integer getAverageBandwidth() {
        return averageBandwidthParam;
    }

    public void setAverageBandwidth(Integer averageBandwidthParam) {
        this.averageBandwidthParam = averageBandwidthParam;
    }

    public Boolean getEnable() {
        return enableParam;
    }

    public void setEnable(Boolean enableParam) {
        this.enableParam = enableParam;
    }

}
