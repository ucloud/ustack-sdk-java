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

public class RestoreRangeInfo {

    /** 备份ID，备份的ID，返回的是全量备份的ID */
    @SerializedName("BackupID")
    private String backupIDParam;

    /** 开始时间，恢复的开始时间戳 */
    @SerializedName("BeginTimestamp")
    private Integer beginTimestampParam;

    /** 结束时间，恢复的结束时间戳 */
    @SerializedName("EndTimestamp")
    private Integer endTimestampParam;


    public String getBackupID() {
        return backupIDParam;
    }

    public void setBackupID(String backupIDParam) {
        this.backupIDParam = backupIDParam;
    }

    public Integer getBeginTimestamp() {
        return beginTimestampParam;
    }

    public void setBeginTimestamp(Integer beginTimestampParam) {
        this.beginTimestampParam = beginTimestampParam;
    }

    public Integer getEndTimestamp() {
        return endTimestampParam;
    }

    public void setEndTimestamp(Integer endTimestampParam) {
        this.endTimestampParam = endTimestampParam;
    }

}
