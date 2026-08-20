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
package com.ucloudstack.apis;

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class GetSubnetAvailableIPQuotaResponse extends Response {

    /** 主网段可用IP数量 */
    @SerializedName("AvailableCount")
    private Integer availableCountParam;

    /** 扩展网段可用IP数量 */
    @SerializedName("ExpandAvailableCount")
    private Integer expandAvailableCountParam;

    /** 扩展网段已用IP数量 */
    @SerializedName("ExpandUsedCount")
    private Integer expandUsedCountParam;

    /** 主网段已用IP数量 */
    @SerializedName("UsedCount")
    private Integer usedCountParam;


    public Integer getAvailableCount() {
        return availableCountParam;
    }

    public void setAvailableCount(Integer availableCountParam) {
        this.availableCountParam = availableCountParam;
    }

    public Integer getExpandAvailableCount() {
        return expandAvailableCountParam;
    }

    public void setExpandAvailableCount(Integer expandAvailableCountParam) {
        this.expandAvailableCountParam = expandAvailableCountParam;
    }

    public Integer getExpandUsedCount() {
        return expandUsedCountParam;
    }

    public void setExpandUsedCount(Integer expandUsedCountParam) {
        this.expandUsedCountParam = expandUsedCountParam;
    }

    public Integer getUsedCount() {
        return usedCountParam;
    }

    public void setUsedCount(Integer usedCountParam) {
        this.usedCountParam = usedCountParam;
    }

}
