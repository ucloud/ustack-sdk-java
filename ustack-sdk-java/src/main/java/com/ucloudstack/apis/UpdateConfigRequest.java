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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateConfigRequest extends Request {

    /** 配置键，要更新的全局配置项唯一标识符 */
    @NotEmpty
    @OpenAPIParam("ConfigKey")
    private String configKeyParam;

    /** 配置值，要设置的新配置值，服务端会根据配置的ValueType与ValueRange校验取值是否符合要求，文件类型的配置也需要将Base64内容直接写入该字段，单独填写FileBytes不会生效 */
    
    @OpenAPIParam("ConfigValue")
    private String configValueParam;

    /** 文件内容Base64编码，保留字段，当前版本不会读取该字段，仍需将内容写入ConfigValue */
    
    @OpenAPIParam("FileBytes")
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
