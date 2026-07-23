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

public class RedisRedisConfigParam {

    /** 配置ID，参数模板ID */
    @SerializedName("ConfigID")
    private String configIDParam;

    /** 创建时间，Unix时间戳（秒） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 配置项描述，参数描述信息 */
    @SerializedName("Description")
    private String descriptionParam;

    /** 配置项，参数名称 */
    @SerializedName("Key")
    private String keyParam;

    /** 是否需要重启，0不需要，1需要 */
    @SerializedName("NeedRestart")
    private Integer needRestartParam;

    /** 更新时间，Unix时间戳（秒） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 配置值，参数值 */
    @SerializedName("Value")
    private String valueParam;

    /** 值类型，参数类型 */
    @SerializedName("ValueType")
    private String valueTypeParam;


    public String getConfigID() {
        return configIDParam;
    }

    public void setConfigID(String configIDParam) {
        this.configIDParam = configIDParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
    }

    public String getKey() {
        return keyParam;
    }

    public void setKey(String keyParam) {
        this.keyParam = keyParam;
    }

    public Integer getNeedRestart() {
        return needRestartParam;
    }

    public void setNeedRestart(Integer needRestartParam) {
        this.needRestartParam = needRestartParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getValue() {
        return valueParam;
    }

    public void setValue(String valueParam) {
        this.valueParam = valueParam;
    }

    public String getValueType() {
        return valueTypeParam;
    }

    public void setValueType(String valueTypeParam) {
        this.valueTypeParam = valueTypeParam;
    }

}
