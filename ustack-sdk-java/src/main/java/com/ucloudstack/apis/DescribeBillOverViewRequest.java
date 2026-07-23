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

public class DescribeBillOverViewRequest extends Request {

    /** 查询起始时间，账单的起始时间戳，单位为秒，若不指定则根据CycleCount和CycleUnit自动计算，指定后必须与CycleCount配合使用 */
    
    @OpenAPIParam("BeginTime")
    private Integer beginTimeParam;

    /** 计费类型列表，过滤指定计费类型的账单概览，Hour表示按小时计费、Month表示按月计费、Year表示按年计费，不填写默认查询所有计费类型 */
    
    @OpenAPIParam("ChargeTypes")
    private List<String> chargeTypesParam;

    /** 租户ID列表，过滤指定租户的账单概览，不填写默认查询所有租户，普通租户权限自动限制为当前租户，系统管理员可查询所有租户 */
    
    @OpenAPIParam("CompanyIDs")
    private List<Integer> companyIDsParam;

    /** 统计周期数量，要统计的周期数量，最多支持6个周期，若BeginTime和EndTime为空，则从当前时间向前统计CycleCount个周期，例如CycleUnit为month，CycleCount为6表示最近6个月 */
    @NotEmpty
    @OpenAPIParam("CycleCount")
    private Integer cycleCountParam;

    /** 统计周期单位，时间统计的周期单位，决定时间分组粒度，hour表示按小时统计、day表示按天统计、week表示按周统计、month表示按月统计、year表示按年统计 */
    @NotEmpty
    @OpenAPIParam("CycleUnit")
    private String cycleUnitParam;

    /** 合并维度，统计数据的聚合维度，product表示按产品聚合、region表示按地域聚合、project表示按项目聚合、order表示按订单类型聚合、charge表示按计费类型聚合、account表示按租户账号（邮箱）聚合 */
    @NotEmpty
    @OpenAPIParam("Dimension")
    private String dimensionParam;

    /** 查询结束时间，账单的结束时间戳，单位为秒，若不指定则使用当前时间，指定后必须大于BeginTime */
    
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 分页大小，限制每个统计周期返回的维度详情数量，默认返回全部 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，限制每个统计周期的维度详情从第几条开始返回 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 订单类型列表，过滤指定订单类型的账单详情，BUY表示购买、RENEW表示续费、UPGRADE表示升级、DOWNGRADE表示降级、REFUND表示退款，不填写默认查询所有订单类型 */
    
    @OpenAPIParam("OrderTypes")
    private List<String> orderTypesParam;

    /** 产品类型列表，过滤指定产品类型的账单概览，不填写默认查询所有产品，产品类型从ListProductResources获取 */
    
    @OpenAPIParam("ProductTypes")
    private List<String> productTypesParam;

    /** 项目组ID列表，过滤指定项目组的账单概览，不填写默认查询所有项目组 */
    @NotEmpty
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域列表，过滤指定地域的账单概览，不填写默认查询所有地域，支持多地域过滤 */
    
    @OpenAPIParam("Regions")
    private List<String> regionsParam;

    /** 排序方式，保留字段，当前接口会固定按金额降序排列维度详情，设置该字段不会改变排序结果 */
    
    @OpenAPIParam("Sort")
    private String sortParam;

    /** 排序字段，保留字段，当前仅支持按金额排序，设置该字段不会生效 */
    
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

    public Integer getCycleCount() {
        return cycleCountParam;
    }

    public void setCycleCount(Integer cycleCountParam) {
        this.cycleCountParam = cycleCountParam;
    }

    public String getCycleUnit() {
        return cycleUnitParam;
    }

    public void setCycleUnit(String cycleUnitParam) {
        this.cycleUnitParam = cycleUnitParam;
    }

    public String getDimension() {
        return dimensionParam;
    }

    public void setDimension(String dimensionParam) {
        this.dimensionParam = dimensionParam;
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
