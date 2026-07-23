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

public class TaskExecution {

    /** 最新执行结束时间，执行结束时间戳，为0表示未结束 */
    @SerializedName("EndsAt")
    private Integer endsAtParam;

    /** 最新执行信息，执行结果说明 */
    @SerializedName("Message")
    private String messageParam;

    /** 最新执行结果，取值可能为NotStarted/Succeed/Failed/Interrupted或空字符串 */
    @SerializedName("Result")
    private String resultParam;

    /** 最新执行开始时间，执行开始时间戳 */
    @SerializedName("StartsAt")
    private Integer startsAtParam;


    public Integer getEndsAt() {
        return endsAtParam;
    }

    public void setEndsAt(Integer endsAtParam) {
        this.endsAtParam = endsAtParam;
    }

    public String getMessage() {
        return messageParam;
    }

    public void setMessage(String messageParam) {
        this.messageParam = messageParam;
    }

    public String getResult() {
        return resultParam;
    }

    public void setResult(String resultParam) {
        this.resultParam = resultParam;
    }

    public Integer getStartsAt() {
        return startsAtParam;
    }

    public void setStartsAt(Integer startsAtParam) {
        this.startsAtParam = startsAtParam;
    }

}
