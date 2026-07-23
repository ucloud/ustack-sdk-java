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

public class WANNetworkConfig {

    /** WAN网卡配置列表；当前仅支持1张WAN网卡，单网卡可配置多个WAN IP */
    @SerializedName("NICConfigs")
    private List<WANNICConfig> nICConfigsParam;


    public List<WANNICConfig> getNICConfigs() {
        return nICConfigsParam;
    }

    public void setNICConfigs(List<WANNICConfig> nICConfigsParam) {
        this.nICConfigsParam = nICConfigsParam;
    }

}
