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

public class ListGlobalConfigsRequest extends Request {

    /** 配置类型，用于筛选全局配置的分类，如系统配置、安全配置等 */
    @NotEmpty
    @OpenAPIParam("ConfigType")
    private String configTypeParam;


    public String getConfigType() {
        return configTypeParam;
    }

    public void setConfigType(String configTypeParam) {
        this.configTypeParam = configTypeParam;
    }

}
