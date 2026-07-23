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

public class CreateRedisConfigFileRequest extends Request {

    /** 租户ID，模板所属租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 原配置ID，从已有模板复制 */
    
    @OpenAPIParam("ConfigID")
    private String configIDParam;

    /** 描述，模板描述信息 */
    
    @OpenAPIParam("Description")
    private String descriptionParam;

    /** 名称，模板名称，长度为1-128个字符，名称只能包含中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 配置项，自定义配置项；当ConfigID为空时必填 */
    
    @OpenAPIParam("Params")
    private String paramsParam;

    /** 地域ID，模板所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 版本，Redis版本 */
    @NotEmpty
    @OpenAPIParam("Version")
    private String versionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getConfigID() {
        return configIDParam;
    }

    public void setConfigID(String configIDParam) {
        this.configIDParam = configIDParam;
    }

    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getParams() {
        return paramsParam;
    }

    public void setParams(String paramsParam) {
        this.paramsParam = paramsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getVersion() {
        return versionParam;
    }

    public void setVersion(String versionParam) {
        this.versionParam = versionParam;
    }

}
