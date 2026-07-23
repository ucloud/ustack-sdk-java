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

public class ContainerLogInfo {

    /** 内容 */
    @SerializedName("Body")
    private String bodyParam;

    /** 时间 */
    @SerializedName("Time")
    private Integer timeParam;


    public String getBody() {
        return bodyParam;
    }

    public void setBody(String bodyParam) {
        this.bodyParam = bodyParam;
    }

    public Integer getTime() {
        return timeParam;
    }

    public void setTime(Integer timeParam) {
        this.timeParam = timeParam;
    }

}
