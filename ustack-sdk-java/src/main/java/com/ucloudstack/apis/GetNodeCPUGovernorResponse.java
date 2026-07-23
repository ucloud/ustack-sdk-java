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
package com.ucloudstack.apis;

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class GetNodeCPUGovernorResponse extends Response {

    /** 支持的模式列表，返回节点支持的电源模式 */
    @SerializedName("AvailableGovernors")
    private List<String> availableGovernorsParam;

    /** 当前生效的电源模式，返回节点当前CPU电源模式 */
    @SerializedName("Governor")
    private String governorParam;

    /** CPU核心频率信息，返回每个CPU核心的当前频率 */
    @SerializedName("Infos")
    private List<CPUPowerInfo> infosParam;


    public List<String> getAvailableGovernors() {
        return availableGovernorsParam;
    }

    public void setAvailableGovernors(List<String> availableGovernorsParam) {
        this.availableGovernorsParam = availableGovernorsParam;
    }

    public String getGovernor() {
        return governorParam;
    }

    public void setGovernor(String governorParam) {
        this.governorParam = governorParam;
    }

    public List<CPUPowerInfo> getInfos() {
        return infosParam;
    }

    public void setInfos(List<CPUPowerInfo> infosParam) {
        this.infosParam = infosParam;
    }

}
