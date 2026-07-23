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

public class ApplyMySQLParamTplRequest extends Request {

    /** 租户ID，实例所属租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** MySQL实例ID，实例唯一标识 */
    @NotEmpty
    @OpenAPIParam("MySQLID")
    private String mySQLIDParam;

    /** 地域ID，实例所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 模板ID，参数模板ID */
    @NotEmpty
    @OpenAPIParam("TplID")
    private String tplIDParam;


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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getTplID() {
        return tplIDParam;
    }

    public void setTplID(String tplIDParam) {
        this.tplIDParam = tplIDParam;
    }

}
