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

public class WANNICConfig {

    /** WAN IP配置列表，每项表示当前WAN网卡上的一个外网IP配置 */
    @SerializedName("IPConfigs")
    private List<WANIPConfig> iPConfigsParam;

    /** 外网MAC，指定当前WAN网卡的MAC地址，需为unicast地址，可选字段 */
    @SerializedName("MAC")
    private String mACParam;

    /** 外网安全组ID，绑定到当前WAN网卡的安全策略组标识，可选字段 */
    @SerializedName("SGID")
    private String sGIDParam;


    public List<WANIPConfig> getIPConfigs() {
        return iPConfigsParam;
    }

    public void setIPConfigs(List<WANIPConfig> iPConfigsParam) {
        this.iPConfigsParam = iPConfigsParam;
    }

    public String getMAC() {
        return mACParam;
    }

    public void setMAC(String mACParam) {
        this.mACParam = mACParam;
    }

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

}
