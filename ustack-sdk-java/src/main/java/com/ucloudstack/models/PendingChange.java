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

public class PendingChange {

    /** 字段名称，待生效的配置字段名 */
    @SerializedName("Field")
    private String fieldParam;

    /** 需重启，标识更改是否需要重启电源才能生效 */
    @SerializedName("Restart")
    private Boolean restartParam;


    public String getField() {
        return fieldParam;
    }

    public void setField(String fieldParam) {
        this.fieldParam = fieldParam;
    }

    public Boolean getRestart() {
        return restartParam;
    }

    public void setRestart(Boolean restartParam) {
        this.restartParam = restartParam;
    }

}
