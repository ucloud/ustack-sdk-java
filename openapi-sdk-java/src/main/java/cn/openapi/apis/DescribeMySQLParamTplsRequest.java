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

public class DescribeMySQLParamTplsRequest extends Request {

    /** 租户ID，模板所属租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 分页大小，指定每页返回的记录数，默认10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，默认0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域ID，配置模板所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 模板ID列表，筛选指定模板 */
    
    @OpenAPIParam("TplIDs")
    private List<String> tplIDsParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getTplIDs() {
        return tplIDsParam;
    }

    public void setTplIDs(List<String> tplIDsParam) {
        this.tplIDsParam = tplIDsParam;
    }

}
