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

public class DiskSelectorV2 {

    /** 磁盘选择模式，by-path：按设备路径选择；by-id：按设备ID选择；by-wwn：按WWN选择（Kickstart模式会自动转换为by-id）；script：使用自定义脚本选择 */
    @SerializedName("Mode")
    private String modeParam;

    /** 自定义脚本，当Mode为script时使用，用于动态选择磁盘 */
    @SerializedName("Script")
    private String scriptParam;

    /** 选择器表达式，根据Mode指定磁盘标识，在Kickstart模式且Mode为by-wwn时，系统会自动在Selector前添加wwn-前缀转换为by-id格式 */
    @SerializedName("Selector")
    private String selectorParam;


    public String getMode() {
        return modeParam;
    }

    public void setMode(String modeParam) {
        this.modeParam = modeParam;
    }

    public String getScript() {
        return scriptParam;
    }

    public void setScript(String scriptParam) {
        this.scriptParam = scriptParam;
    }

    public String getSelector() {
        return selectorParam;
    }

    public void setSelector(String selectorParam) {
        this.selectorParam = selectorParam;
    }

}
