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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class OPLogInfo {

    /** API名称，触发该操作日志的接口名称 */
    @SerializedName("APIName")
    private String aPINameParam;

    /** 客户端IP，发起请求的客户端IP地址 */
    @SerializedName("ClientIp")
    private String clientIpParam;

    /** 租户ID，日志所属租户的唯一标识 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 错误上下文，用于前端参数化翻译，包含错误相关的键值对 */
    @SerializedName("Context")
    private Map<String, String> contextParam;

    /** 创建时间，日志生成的Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** HTTP请求响应详情，记录请求与响应的原始信息 */
    @SerializedName("HttpInfo")
    private HttpInfo httpInfoParam;

    /** 返回信息，API响应的描述信息 */
    @SerializedName("Message")
    private String messageParam;

    /** 操作日志ID，系统生成的唯一标识 */
    @SerializedName("OPLogID")
    private Integer oPLogIDParam;

    /** 产品类型，操作涉及的产品分类 */
    @SerializedName("ProductType")
    private String productTypeParam;

    /** 地域ID，操作发生的地域标识 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别称，地域的显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 资源ID，操作涉及的资源唯一标识 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 操作后关联资源快照，记录资源名称、类型和IP信息 */
    @SerializedName("ResourcesAfter")
    private List<OPLogResource> resourcesAfterParam;

    /** 操作前关联资源快照，记录资源名称、类型和IP信息 */
    @SerializedName("ResourcesBefore")
    private List<OPLogResource> resourcesBeforeParam;

    /** 返回码，API响应的状态码；0表示成功，非0表示失败 */
    @SerializedName("RetCode")
    private Integer retCodeParam;

    /** 更新时间，日志信息最后更新的Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 账号邮箱，执行操作的用户邮箱 */
    @SerializedName("UserEmail")
    private String userEmailParam;


    public String getAPIName() {
        return aPINameParam;
    }

    public void setAPIName(String aPINameParam) {
        this.aPINameParam = aPINameParam;
    }

    public String getClientIp() {
        return clientIpParam;
    }

    public void setClientIp(String clientIpParam) {
        this.clientIpParam = clientIpParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Map<String, String> getContext() {
        return contextParam;
    }

    public void setContext(Map<String, String> contextParam) {
        this.contextParam = contextParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public HttpInfo getHttpInfo() {
        return httpInfoParam;
    }

    public void setHttpInfo(HttpInfo httpInfoParam) {
        this.httpInfoParam = httpInfoParam;
    }

    public String getMessage() {
        return messageParam;
    }

    public void setMessage(String messageParam) {
        this.messageParam = messageParam;
    }

    public Integer getOPLogID() {
        return oPLogIDParam;
    }

    public void setOPLogID(Integer oPLogIDParam) {
        this.oPLogIDParam = oPLogIDParam;
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

    public String getRegionAlias() {
        return regionAliasParam;
    }

    public void setRegionAlias(String regionAliasParam) {
        this.regionAliasParam = regionAliasParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public List<OPLogResource> getResourcesAfter() {
        return resourcesAfterParam;
    }

    public void setResourcesAfter(List<OPLogResource> resourcesAfterParam) {
        this.resourcesAfterParam = resourcesAfterParam;
    }

    public List<OPLogResource> getResourcesBefore() {
        return resourcesBeforeParam;
    }

    public void setResourcesBefore(List<OPLogResource> resourcesBeforeParam) {
        this.resourcesBeforeParam = resourcesBeforeParam;
    }

    public Integer getRetCode() {
        return retCodeParam;
    }

    public void setRetCode(Integer retCodeParam) {
        this.retCodeParam = retCodeParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getUserEmail() {
        return userEmailParam;
    }

    public void setUserEmail(String userEmailParam) {
        this.userEmailParam = userEmailParam;
    }

}
