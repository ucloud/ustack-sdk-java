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

public class MySQLConfigOpLogInfo {

    /** 修改后的值，新参数值 */
    @SerializedName("NewValue")
    private String newValueParam;

    /** 修改前的值，原参数值 */
    @SerializedName("OldValue")
    private String oldValueParam;

    /** 参数名称，配置参数名称 */
    @SerializedName("ParameterName")
    private String parameterNameParam;

    /** 更新时间，Unix时间戳（秒） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public String getNewValue() {
        return newValueParam;
    }

    public void setNewValue(String newValueParam) {
        this.newValueParam = newValueParam;
    }

    public String getOldValue() {
        return oldValueParam;
    }

    public void setOldValue(String oldValueParam) {
        this.oldValueParam = oldValueParam;
    }

    public String getParameterName() {
        return parameterNameParam;
    }

    public void setParameterName(String parameterNameParam) {
        this.parameterNameParam = parameterNameParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
