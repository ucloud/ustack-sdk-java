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

public class ConfigBaseInfo {

    /** 配置键，全局配置项的唯一标识符 */
    @SerializedName("ConfigKey")
    private String configKeyParam;

    /** 配置值，当前全局配置项的取值 */
    @SerializedName("ConfigValue")
    private String configValueParam;

    /** 文件内容Base64编码，用于图片等文件类型配置项 */
    @SerializedName("FileBytes")
    private String fileBytesParam;


    public String getConfigKey() {
        return configKeyParam;
    }

    public void setConfigKey(String configKeyParam) {
        this.configKeyParam = configKeyParam;
    }

    public String getConfigValue() {
        return configValueParam;
    }

    public void setConfigValue(String configValueParam) {
        this.configValueParam = configValueParam;
    }

    public String getFileBytes() {
        return fileBytesParam;
    }

    public void setFileBytes(String fileBytesParam) {
        this.fileBytesParam = fileBytesParam;
    }

}
