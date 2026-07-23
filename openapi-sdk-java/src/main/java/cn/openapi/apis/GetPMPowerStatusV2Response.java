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
package cn.openapi.apis;

import cn.openapi.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class GetPMPowerStatusV2Response extends Response {

    /** 最后检查时间，上次查询电源状态的时间戳 */
    @SerializedName("LastChecked")
    private String lastCheckedParam;

    /** 电源状态，表示当前电源状态，on：开机；off：关机；unknown：未知 */
    @SerializedName("PowerStatus")
    private String powerStatusParam;


    public String getLastChecked() {
        return lastCheckedParam;
    }

    public void setLastChecked(String lastCheckedParam) {
        this.lastCheckedParam = lastCheckedParam;
    }

    public String getPowerStatus() {
        return powerStatusParam;
    }

    public void setPowerStatus(String powerStatusParam) {
        this.powerStatusParam = powerStatusParam;
    }

}
