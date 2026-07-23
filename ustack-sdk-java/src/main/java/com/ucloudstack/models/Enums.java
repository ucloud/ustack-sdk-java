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

public class Enums {

    /** 枚举项标题，用于在界面上显示的枚举选项名称 */
    @SerializedName("Title")
    private String titleParam;

    /** 枚举项的实际值，用于系统内部处理和存储的枚举值 */
    @SerializedName("Value")
    private String valueParam;


    public String getTitle() {
        return titleParam;
    }

    public void setTitle(String titleParam) {
        this.titleParam = titleParam;
    }

    public String getValue() {
        return valueParam;
    }

    public void setValue(String valueParam) {
        this.valueParam = valueParam;
    }

}
