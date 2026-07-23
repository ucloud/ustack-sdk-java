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

public class AliasSetRequest extends Request {

    /** 集群类型别名，为计算集群类型设置的自定义名称，用于更易读的展示，通过调用RenameResource接口修改资源名称实现，别名长度限制为1-128个字符 */
    @NotEmpty
    @OpenAPIParam("Alias")
    private String aliasParam;

    /** 地域ID，指定计算集群所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 计算集群类型，用于唯一标识计算集群的类型 */
    @NotEmpty
    @OpenAPIParam("SetType")
    private String setTypeParam;


    public String getAlias() {
        return aliasParam;
    }

    public void setAlias(String aliasParam) {
        this.aliasParam = aliasParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

}
