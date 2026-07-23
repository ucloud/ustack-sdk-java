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

public class UnifiedTag {

    /** 标签键，用于标识资源分类的关键字符串 */
    @SerializedName("Key")
    private String keyParam;

    /** 标签值，与标签键配对使用，用于资源的筛选和管理 */
    @SerializedName("Value")
    private String valueParam;


    public String getKey() {
        return keyParam;
    }

    public void setKey(String keyParam) {
        this.keyParam = keyParam;
    }

    public String getValue() {
        return valueParam;
    }

    public void setValue(String valueParam) {
        this.valueParam = valueParam;
    }

}
