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

public class MetricFilterCondition {

    /** 过滤条件的键名，指定要过滤的字段或标签名称 */
    @SerializedName("Key")
    private String keyParam;

    /** 过滤操作类型，定义过滤时使用的比较操作，如等于、包含、正则匹配等 */
    @SerializedName("Operation")
    private String operationParam;

    /** 过滤条件的值列表，指定过滤时要匹配的具体值 */
    @SerializedName("Values")
    private List<String> valuesParam;


    public String getKey() {
        return keyParam;
    }

    public void setKey(String keyParam) {
        this.keyParam = keyParam;
    }

    public String getOperation() {
        return operationParam;
    }

    public void setOperation(String operationParam) {
        this.operationParam = operationParam;
    }

    public List<String> getValues() {
        return valuesParam;
    }

    public void setValues(List<String> valuesParam) {
        this.valuesParam = valuesParam;
    }

}
