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
package cn.openapi.apis;

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class UpdatePartitionTemplateRequest extends Request {

    /** 分区配置 */
    
    @OpenAPIParam("Config")
    private String configParam;

    /** 模板描述 */
    
    @OpenAPIParam("Description")
    private String descriptionParam;

    /** 模板ID */
    @NotEmpty
    @OpenAPIParam("ID")
    private String iDParam;

    /** 是否默认 */
    
    @OpenAPIParam("IsDefault")
    private String isDefaultParam;

    /** 模板名称 */
    
    @OpenAPIParam("Name")
    private String nameParam;

    /** 地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public String getConfig() {
        return configParam;
    }

    public void setConfig(String configParam) {
        this.configParam = configParam;
    }

    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
    }

    public String getID() {
        return iDParam;
    }

    public void setID(String iDParam) {
        this.iDParam = iDParam;
    }

    public String getIsDefault() {
        return isDefaultParam;
    }

    public void setIsDefault(String isDefaultParam) {
        this.isDefaultParam = isDefaultParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
