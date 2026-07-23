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

public class DescribeProductSpecificationRequest extends Request {

    /** 搜索关键词，用于模糊搜索规格信息 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，若不指定则默认为500 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，从0开始计数 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 产品类型列表，用于过滤特定产品的规格，如VM、DISK等 */
    
    @UCloudStackParam("ProductTypes")
    private List<String> productTypesParam;

    /** 地域ID，指定要查询规格的地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 资源类型，用于过滤特定资源的规格 */
    
    @UCloudStackParam("ResourceType")
    private String resourceTypeParam;

    /** 集群类型列表，用于过滤特定集群的规格，如compute、storage等 */
    
    @UCloudStackParam("SetTypes")
    private List<String> setTypesParam;

    /** 规格ID列表，指定要查询的规格ID，用于精确查询 */
    
    @UCloudStackParam("SpecificationIDs")
    private List<String> specificationIDsParam;

    /** 规格名称，用于精确匹配规格名称 */
    
    @UCloudStackParam("SpecificationName")
    private String specificationNameParam;


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

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public List<String> getSetTypes() {
        return setTypesParam;
    }

    public void setSetTypes(List<String> setTypesParam) {
        this.setTypesParam = setTypesParam;
    }

    public List<String> getSpecificationIDs() {
        return specificationIDsParam;
    }

    public void setSpecificationIDs(List<String> specificationIDsParam) {
        this.specificationIDsParam = specificationIDsParam;
    }

    public String getSpecificationName() {
        return specificationNameParam;
    }

    public void setSpecificationName(String specificationNameParam) {
        this.specificationNameParam = specificationNameParam;
    }

}
