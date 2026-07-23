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

public class UpdateKickstartTemplateRequest extends Request {

    /** 模板内容 */
    @NotEmpty
    @OpenAPIParam("Content")
    private String contentParam;

    /** 模板描述 */
    
    @OpenAPIParam("Description")
    private String descriptionParam;

    /** 是否设为默认模板 */
    
    @OpenAPIParam("IsDefault")
    private Boolean isDefaultParam;

    /** 模板名称 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 操作系统发行版 */
    @NotEmpty
    @OpenAPIParam("OSDistribution")
    private String oSDistributionParam;

    /** 地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 支持的变量列表 */
    
    @OpenAPIParam("Variables")
    private List<String> variablesParam;


    public String getContent() {
        return contentParam;
    }

    public void setContent(String contentParam) {
        this.contentParam = contentParam;
    }

    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
    }

    public Boolean getIsDefault() {
        return isDefaultParam;
    }

    public void setIsDefault(Boolean isDefaultParam) {
        this.isDefaultParam = isDefaultParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getOSDistribution() {
        return oSDistributionParam;
    }

    public void setOSDistribution(String oSDistributionParam) {
        this.oSDistributionParam = oSDistributionParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getVariables() {
        return variablesParam;
    }

    public void setVariables(List<String> variablesParam) {
        this.variablesParam = variablesParam;
    }

}
