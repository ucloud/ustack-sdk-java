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

public class ParametersHistoriesInfos {

    /** 新值，参数修改后的值 */
    @SerializedName("NewValue")
    private String newValueParam;

    /** 旧值，参数修改前的值 */
    @SerializedName("OldValue")
    private String oldValueParam;

    /** 参数名称，数据库配置参数的名称 */
    @SerializedName("ParameterName")
    private String parameterNameParam;

    /** 更新时间，从审计日志中的UpdateTime字段解析出的Unix时间戳 */
    @SerializedName("Updatetime")
    private Integer updatetimeParam;


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

    public Integer getUpdatetime() {
        return updatetimeParam;
    }

    public void setUpdatetime(Integer updatetimeParam) {
        this.updatetimeParam = updatetimeParam;
    }

}
