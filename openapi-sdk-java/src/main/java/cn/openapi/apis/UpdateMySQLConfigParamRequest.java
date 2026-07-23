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

public class UpdateMySQLConfigParamRequest extends Request {

    /** 是否自动重启，取值范围：0（仅更新参数，标记为待重启，不自动触发重启）、1（自动重启实例立即生效）， */
    @NotEmpty
    @OpenAPIParam("AutoRestart")
    private String autoRestartParam;

    /** 租户ID，实例所属租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** MySQL实例ID，实例唯一标识 */
    @NotEmpty
    @OpenAPIParam("MySQLID")
    private String mySQLIDParam;

    /** 配置参数，JSON格式的配置参数；MySQL 8.0不允许修改lower_case_table_names */
    @NotEmpty
    @OpenAPIParam("Params")
    private String paramsParam;

    /** 地域ID，实例所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public String getAutoRestart() {
        return autoRestartParam;
    }

    public void setAutoRestart(String autoRestartParam) {
        this.autoRestartParam = autoRestartParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getMySQLID() {
        return mySQLIDParam;
    }

    public void setMySQLID(String mySQLIDParam) {
        this.mySQLIDParam = mySQLIDParam;
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

}
