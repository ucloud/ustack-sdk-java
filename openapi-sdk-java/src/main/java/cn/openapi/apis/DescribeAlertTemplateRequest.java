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

public class DescribeAlertTemplateRequest extends Request {

    /** 租户ID，过滤指定租户的告警模板，若为空则返回所有租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 搜索关键字，按模板名称或备注进行模糊搜索；若设定该字段，系统会先使用全文检索筛选模板ID，再结合其它过滤条件查询 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，取值范围1-100，若未指定TemplateID则使用该值，Limit为0时默认10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域ID，过滤指定地域的告警模板 */
    
    @OpenAPIParam("Region")
    private String regionParam;

    /** 告警模板ID，指定精确查询的模板ID；指定后强制返回该模板（Limit 自动置为1） */
    
    @OpenAPIParam("TemplateID")
    private String templateIDParam;

    /** 告警模板类型列表，过滤指定资源类型的模板，支持多个类型同时查询 */
    
    @OpenAPIParam("TemplateTypes")
    private List<String> templateTypesParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getKeyword() {
        return keywordParam;
    }

    public void setKeyword(String keywordParam) {
        this.keywordParam = keywordParam;
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

    public String getTemplateID() {
        return templateIDParam;
    }

    public void setTemplateID(String templateIDParam) {
        this.templateIDParam = templateIDParam;
    }

    public List<String> getTemplateTypes() {
        return templateTypesParam;
    }

    public void setTemplateTypes(List<String> templateTypesParam) {
        this.templateTypesParam = templateTypesParam;
    }

}
