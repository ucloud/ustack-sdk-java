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

public class DescribeUserRequest extends Request {

    /** 租户ID列表，请求传入用于按租户ID过滤；列表筛选场景使用；为空表示不筛选 */
    
    @OpenAPIParam("CompanyIDs")
    private List<Integer> companyIDsParam;

    /** 搜索关键词，请求传入用于按租户名称、邮箱或手机号匹配筛选；查询租户列表场景使用；为空表示不筛选 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，请求传入用于控制返回记录数；列表分页场景使用；Limit为0时默认10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，请求传入用于分页起始位置；列表分页场景使用；Offset为0表示从头开始 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 产品类型，请求传入用于筛选具备该产品能力的租户；产品能力筛选场景使用；需为合法产品类型，无效会返回参数非法或产品类型不存在 */
    
    @OpenAPIParam("ProductType")
    private String productTypeParam;

    /** 地域ID，请求传入用于筛选租户所属区域；产品能力筛选场景使用；与ProductType同时使用时用于排除该地域已禁用租户 */
    
    @OpenAPIParam("Region")
    private String regionParam;

    /** 用户ID列表，请求传入用于按用户ID过滤租户；列表筛选场景使用；为空表示不筛选 */
    
    @OpenAPIParam("UserIDs")
    private List<Integer> userIDsParam;


    public List<Integer> getCompanyIDs() {
        return companyIDsParam;
    }

    public void setCompanyIDs(List<Integer> companyIDsParam) {
        this.companyIDsParam = companyIDsParam;
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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<Integer> getUserIDs() {
        return userIDsParam;
    }

    public void setUserIDs(List<Integer> userIDsParam) {
        this.userIDsParam = userIDsParam;
    }

}
