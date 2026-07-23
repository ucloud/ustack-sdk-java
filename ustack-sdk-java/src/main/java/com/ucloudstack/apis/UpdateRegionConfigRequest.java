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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateRegionConfigRequest extends Request {

    /** 配置键，要更新的地域配置项唯一标识符， */
    @NotEmpty
    @OpenAPIParam("ConfigKey")
    private String configKeyParam;

    /** 配置值，要设置的新配置值，ConfigKey为VPCNetwork时，需为有效的VPC网段（CIDR格式） */
    
    @OpenAPIParam("ConfigValue")
    private String configValueParam;

    /** 地域ID，指定要更新配置的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
