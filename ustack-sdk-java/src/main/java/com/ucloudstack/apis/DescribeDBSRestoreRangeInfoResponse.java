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

public class DescribeDBSRestoreRangeInfoResponse extends Response {

    /** 最早可恢复时间，最早可恢复时间戳 */
    @SerializedName("BeginTimestamp")
    private Integer beginTimestampParam;

    /** 最晚可恢复时间，最晚可恢复时间戳 */
    @SerializedName("EndTimestamp")
    private Integer endTimestampParam;

    /** 恢复时间信息，恢复时间范围列表 */
    @SerializedName("RestoreRangeInfos")
    private List<RestoreRangeInfo> restoreRangeInfosParam;

    /** 备份源ID，备份源资源ID */
    @SerializedName("SourceInstanceID")
    private String sourceInstanceIDParam;


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

    public List<RestoreRangeInfo> getRestoreRangeInfos() {
        return restoreRangeInfosParam;
    }

    public void setRestoreRangeInfos(List<RestoreRangeInfo> restoreRangeInfosParam) {
        this.restoreRangeInfosParam = restoreRangeInfosParam;
    }

    public String getSourceInstanceID() {
        return sourceInstanceIDParam;
    }

    public void setSourceInstanceID(String sourceInstanceIDParam) {
        this.sourceInstanceIDParam = sourceInstanceIDParam;
    }

}
