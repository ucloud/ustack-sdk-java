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

public class MetricFilter {

    /** 过滤器的具体条件配置，定义过滤的键值对和操作方式 */
    @SerializedName("Condition")
    private MetricFilterCondition conditionParam;

    /** 过滤器的描述信息，说明该过滤器的作用和用途 */
    @SerializedName("Description")
    private String descriptionParam;


    public MetricFilterCondition getCondition() {
        return conditionParam;
    }

    public void setCondition(MetricFilterCondition conditionParam) {
        this.conditionParam = conditionParam;
    }

    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
    }

}
