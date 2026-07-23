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

public class DescribeBillDetailRequest extends Request {

    /** 查询起始时间，账单的起始时间戳，单位为秒，时间范围不能超过2个月，必须小于结束时间 */
    @NotEmpty
    @OpenAPIParam("BeginTime")
    private Integer beginTimeParam;

    /** 计费类型列表，过滤指定计费类型的账单详情，Hour表示按小时计费、Month表示按月计费、Year表示按年计费，不填写默认查询所有计费类型 */
    
    @OpenAPIParam("ChargeTypes")
    private List<String> chargeTypesParam;

    /** 租户ID列表，过滤指定租户的账单详情，不填写默认查询所有租户，普通租户权限自动限制为当前租户，系统管理员可查询所有租户 */
    
    @OpenAPIParam("CompanyIDs")
    private List<Integer> companyIDsParam;

    /** 查询结束时间，账单的结束时间戳，单位为秒，时间范围不能超过2个月，必须大于起始时间且不超过起始时间加2个月 */
    @NotEmpty
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 分页大小，指定每页返回的账单记录数量 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定从第几条账单记录开始返回 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 订单类型列表，过滤指定订单类型的账单详情，BUY表示购买、RENEW表示续费、UPGRADE表示升级、DOWNGRADE表示降级、REFUND表示退款，不填写默认查询所有订单类型 */
    
    @OpenAPIParam("OrderTypes")
    private List<String> orderTypesParam;

    /** 产品类型列表，过滤指定产品类型的账单详情，不填写默认查询所有产品，产品类型从ListProductResources获取 */
    
    @OpenAPIParam("ProductTypes")
    private List<String> productTypesParam;

    /** 项目组ID列表，过滤指定项目组的账单详情，不填写默认查询所有项目组；传空字符串时表示筛选未归属项目组数据 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域列表，过滤指定地域的账单详情，不填写默认查询所有地域，支持多地域过滤 */
    
    @OpenAPIParam("Regions")
    private List<String> regionsParam;

    /** 排序方式，保留字段，账单详情固定按创建时间倒序返回，设置该字段不会改变排序结果 */
    
    @OpenAPIParam("Sort")
    private String sortParam;

    /** 排序字段，保留字段，当前仅支持按创建时间排序，设置该字段不会生效 */
    
    @OpenAPIParam("SortBy")
    private String sortByParam;


    public Integer getBeginTime() {
        return beginTimeParam;
    }

    public void setBeginTime(Integer beginTimeParam) {
        this.beginTimeParam = beginTimeParam;
    }

    public List<String> getChargeTypes() {
        return chargeTypesParam;
    }

    public void setChargeTypes(List<String> chargeTypesParam) {
        this.chargeTypesParam = chargeTypesParam;
    }

    public List<Integer> getCompanyIDs() {
        return companyIDsParam;
    }

    public void setCompanyIDs(List<Integer> companyIDsParam) {
        this.companyIDsParam = companyIDsParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
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

    public List<String> getOrderTypes() {
        return orderTypesParam;
    }

    public void setOrderTypes(List<String> orderTypesParam) {
        this.orderTypesParam = orderTypesParam;
    }

    public List<String> getProductTypes() {
        return productTypesParam;
    }

    public void setProductTypes(List<String> productTypesParam) {
        this.productTypesParam = productTypesParam;
    }

    public List<String> getProjectIDs() {
        return projectIDsParam;
    }

    public void setProjectIDs(List<String> projectIDsParam) {
        this.projectIDsParam = projectIDsParam;
    }

    public List<String> getRegions() {
        return regionsParam;
    }

    public void setRegions(List<String> regionsParam) {
        this.regionsParam = regionsParam;
    }

    public String getSort() {
        return sortParam;
    }

    public void setSort(String sortParam) {
        this.sortParam = sortParam;
    }

    public String getSortBy() {
        return sortByParam;
    }

    public void setSortBy(String sortByParam) {
        this.sortByParam = sortByParam;
    }

}
