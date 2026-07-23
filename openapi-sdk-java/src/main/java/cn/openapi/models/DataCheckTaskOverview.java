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

public class DataCheckTaskOverview {

    /** 结束时间，秒级Unix时间戳 */
    @SerializedName("EndTime")
    private Integer endTimeParam;

    /** 校验结果，取值范围：Consistent、Inconsistent */
    @SerializedName("Result")
    private String resultParam;

    /** 采样频率，每多少条记录采样一次 */
    @SerializedName("SampleInterval")
    private Integer sampleIntervalParam;

    /** 开始时间，秒级Unix时间戳 */
    @SerializedName("StartTime")
    private Integer startTimeParam;

    /** 任务状态，数据校验任务状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 校验任务ID，数据校验任务唯一标识 */
    @SerializedName("TaskID")
    private String taskIDParam;


    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
    }

    public String getResult() {
        return resultParam;
    }

    public void setResult(String resultParam) {
        this.resultParam = resultParam;
    }

    public Integer getSampleInterval() {
        return sampleIntervalParam;
    }

    public void setSampleInterval(Integer sampleIntervalParam) {
        this.sampleIntervalParam = sampleIntervalParam;
    }

    public Integer getStartTime() {
        return startTimeParam;
    }

    public void setStartTime(Integer startTimeParam) {
        this.startTimeParam = startTimeParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getTaskID() {
        return taskIDParam;
    }

    public void setTaskID(String taskIDParam) {
        this.taskIDParam = taskIDParam;
    }

}
