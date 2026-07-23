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

public class StorageSetBlockBackupStatus {

    /** 异常备份卷ID列表，处于异常状态的备份卷ID列表 */
    @SerializedName("AbnormalVolumeIDs")
    private List<String> abnormalVolumeIDsParam;

    /** 备份卷总数，该存储集群中卷备份的总数量 */
    @SerializedName("BackupVolumeTotalCount")
    private Integer backupVolumeTotalCountParam;

    /** 健康状态，卷备份的整体健康状态，如healthy、degraded、error等 */
    @SerializedName("Health")
    private String healthParam;


    public List<String> getAbnormalVolumeIDs() {
        return abnormalVolumeIDsParam;
    }

    public void setAbnormalVolumeIDs(List<String> abnormalVolumeIDsParam) {
        this.abnormalVolumeIDsParam = abnormalVolumeIDsParam;
    }

    public Integer getBackupVolumeTotalCount() {
        return backupVolumeTotalCountParam;
    }

    public void setBackupVolumeTotalCount(Integer backupVolumeTotalCountParam) {
        this.backupVolumeTotalCountParam = backupVolumeTotalCountParam;
    }

    public String getHealth() {
        return healthParam;
    }

    public void setHealth(String healthParam) {
        this.healthParam = healthParam;
    }

}
