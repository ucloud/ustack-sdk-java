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

public class DTSServiceRestartPolicy {

    /** 是否开启增量同步阶段的 DTS 自恢复；不传表示沿用 DTS 默认自恢复策略 */
    @SerializedName("Enabled")
    private Boolean enabledParam;

    /** 一个 start limit 窗口内允许的最大自动重启次数；为0时使用 DTS 默认值 */
    @SerializedName("MaxRestartCount")
    private Integer maxRestartCountParam;

    /** systemd RestartSec 秒数；为0时使用 DTS 默认值 */
    @SerializedName("RestartSec")
    private Integer restartSecParam;

    /** systemd StartLimitIntervalSec 秒数；为0时使用 DTS 默认值 */
    @SerializedName("StartLimitIntervalSec")
    private Integer startLimitIntervalSecParam;


    public Boolean getEnabled() {
        return enabledParam;
    }

    public void setEnabled(Boolean enabledParam) {
        this.enabledParam = enabledParam;
    }

    public Integer getMaxRestartCount() {
        return maxRestartCountParam;
    }

    public void setMaxRestartCount(Integer maxRestartCountParam) {
        this.maxRestartCountParam = maxRestartCountParam;
    }

    public Integer getRestartSec() {
        return restartSecParam;
    }

    public void setRestartSec(Integer restartSecParam) {
        this.restartSecParam = restartSecParam;
    }

    public Integer getStartLimitIntervalSec() {
        return startLimitIntervalSecParam;
    }

    public void setStartLimitIntervalSec(Integer startLimitIntervalSecParam) {
        this.startLimitIntervalSecParam = startLimitIntervalSecParam;
    }

}
