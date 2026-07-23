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

public class MySQLConfigParamInfo {

    /** 参数描述，参数的描述信息 */
    @SerializedName("Description")
    private String descriptionParam;

    /** 参数名称，配置参数名称 */
    @SerializedName("Key")
    private String keyParam;

    /** 是否需要重启，0不需要，1需要 */
    @SerializedName("NeedRestart")
    private Integer needRestartParam;

    /** 参数值，配置参数值 */
    @SerializedName("Value")
    private String valueParam;

    /** 参数值范围，配置参数值范围 */
    @SerializedName("ValueRange")
    private String valueRangeParam;

    /** 参数类型，配置参数类型 */
    @SerializedName("ValueType")
    private String valueTypeParam;


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

    public String getValue() {
        return valueParam;
    }

    public void setValue(String valueParam) {
        this.valueParam = valueParam;
    }

    public String getValueRange() {
        return valueRangeParam;
    }

    public void setValueRange(String valueRangeParam) {
        this.valueRangeParam = valueRangeParam;
    }

    public String getValueType() {
        return valueTypeParam;
    }

    public void setValueType(String valueTypeParam) {
        this.valueTypeParam = valueTypeParam;
    }

}
