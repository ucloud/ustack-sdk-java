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

public class DescribePriceRequest extends Request {

    /** 租户ID，用于标识需查看价格的租户；普通租户需填写自身CompanyID，系统管理员可填写目标租户，传0或留空则返回未叠加折扣的全局价格 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 关键字搜索，支持按产品名称、集群类型等进行模糊搜索，使用搜索引擎进行全文检索，会在搜索索引中查找匹配的价格记录 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的价格记录数量 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定从第几条记录开始返回 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 产品ID列表，过滤指定产品的价格信息，不填写默认查询所有产品，支持的产品类型从ListProductResources获取 */
    
    @UCloudStackParam("ProductIDs")
    private List<String> productIDsParam;

    /** 地域ID，指定价格所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 集群类型列表，过滤指定集群类型的价格信息，不填写默认查询所有集群类型，集群类型从DescribeSet接口获取 */
    
    @UCloudStackParam("SetTypes")
    private List<String> setTypesParam;


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

    public List<String> getProductIDs() {
        return productIDsParam;
    }

    public void setProductIDs(List<String> productIDsParam) {
        this.productIDsParam = productIDsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getSetTypes() {
        return setTypesParam;
    }

    public void setSetTypes(List<String> setTypesParam) {
        this.setTypesParam = setTypesParam;
    }

}
