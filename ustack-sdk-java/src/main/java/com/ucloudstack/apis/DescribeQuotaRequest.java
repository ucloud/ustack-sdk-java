/**
 * Copyright 2026 UCloud Technology Co., Ltd.
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
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribeQuotaRequest extends Request {

    /** 租户ID，指定要查询配额的租户，用于筛选指定租户的配额信息 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 配额因子列表，用于过滤特定计量维度的配额 */
    
    @UCloudStackParam("FactorTypes")
    private List<String> factorTypesParam;

    /** 搜索关键词，用于模糊搜索配额信息 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，取值范围1-100 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，从0开始计数 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 产品类型列表，用于过滤特定产品的配额 */
    
    @UCloudStackParam("ProductTypes")
    private List<String> productTypesParam;

    /** 地域ID，指定要查询配额的地域，必须填写且需要具备该地域的访问权限 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getFactorTypes() {
        return factorTypesParam;
    }

    public void setFactorTypes(List<String> factorTypesParam) {
        this.factorTypesParam = factorTypesParam;
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

    public List<String> getProductTypes() {
        return productTypesParam;
    }

    public void setProductTypes(List<String> productTypesParam) {
        this.productTypesParam = productTypesParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
