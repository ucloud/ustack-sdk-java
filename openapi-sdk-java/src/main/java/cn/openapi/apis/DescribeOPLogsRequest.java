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

public class DescribeOPLogsRequest extends Request {

    /** 开始时间，查询时间范围的起始Unix时间戳，需小于EndTime */
    @NotEmpty
    @OpenAPIParam("BeginTime")
    private Integer beginTimeParam;

    /** 租户ID，用于筛选指定租户的操作日志 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 结束时间，查询时间范围的结束Unix时间戳，需大于BeginTime */
    @NotEmpty
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 是否成功，筛选成功或失败的操作日志；取值：1 表示成功，0 表示失败，空表示全部 */
    
    @OpenAPIParam("IsSuccess")
    private String isSuccessParam;

    /** 关键词，用于按API名称、资源ID等字段检索 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，控制单次返回数量 */
    @NotEmpty
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，用于分页起点 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 产品类型，用于筛选特定产品的操作日志；为空时默认TYPE_NONE */
    
    @OpenAPIParam("ProductType")
    private String productTypeParam;

    /** 资源ID，用于筛选特定资源的操作日志 */
    
    @OpenAPIParam("ResourceID")
    private String resourceIDParam;


    public Integer getBeginTime() {
        return beginTimeParam;
    }

    public void setBeginTime(Integer beginTimeParam) {
        this.beginTimeParam = beginTimeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
    }

    public String getIsSuccess() {
        return isSuccessParam;
    }

    public void setIsSuccess(String isSuccessParam) {
        this.isSuccessParam = isSuccessParam;
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

    public String getProductType() {
        return productTypeParam;
    }

    public void setProductType(String productTypeParam) {
        this.productTypeParam = productTypeParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

}
