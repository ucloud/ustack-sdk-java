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

public class GetPMHardwareV2Response extends Response {

    /** 硬件信息，包含CPU、内存、磁盘、网卡等硬件配置的JSON格式数据 */
    @SerializedName("HardwareInfo")
    private String hardwareInfoParam;

    /** 最后更新时间，硬件信息上次更新的Unix时间戳（秒） */
    @SerializedName("LastUpdateTime")
    private Integer lastUpdateTimeParam;


    public String getHardwareInfo() {
        return hardwareInfoParam;
    }

    public void setHardwareInfo(String hardwareInfoParam) {
        this.hardwareInfoParam = hardwareInfoParam;
    }

    public Integer getLastUpdateTime() {
        return lastUpdateTimeParam;
    }

    public void setLastUpdateTime(Integer lastUpdateTimeParam) {
        this.lastUpdateTimeParam = lastUpdateTimeParam;
    }

}
