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

public class RegionConfigSyncStatusInfo {

    /** 已完成同步任务数 */
    @SerializedName("CompletedCount")
    private Integer completedCountParam;

    /** 配置键，地域配置项的唯一标识符 */
    @SerializedName("ConfigKey")
    private String configKeyParam;

    /** 同步状态，Synced 表示已同步，Syncing 表示同步中 */
    @SerializedName("SyncStatus")
    private String syncStatusParam;

    /** 同步任务总数 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public Integer getCompletedCount() {
        return completedCountParam;
    }

    public void setCompletedCount(Integer completedCountParam) {
        this.completedCountParam = completedCountParam;
    }

    public String getConfigKey() {
        return configKeyParam;
    }

    public void setConfigKey(String configKeyParam) {
        this.configKeyParam = configKeyParam;
    }

    public String getSyncStatus() {
        return syncStatusParam;
    }

    public void setSyncStatus(String syncStatusParam) {
        this.syncStatusParam = syncStatusParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
