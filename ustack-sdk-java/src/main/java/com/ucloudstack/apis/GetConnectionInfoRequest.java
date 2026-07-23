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
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class GetConnectionInfoRequest extends Request {

    /** 开始时间，保留字段，当前版本的连接查询不会按时间范围过滤 */
    
    @OpenAPIParam("BeginTime")
    private Integer beginTimeParam;

    /** 租户ID，保留字段，当前不会影响查询范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 结束时间，保留字段，当前版本的连接查询不会按时间范围过滤 */
    
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 分页大小，后台在汇总所有连接后按Offset+Limit切片，取值范围1-100，未填写或超出范围时按20处理 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定在采集到的连接列表中的起始位置，未填写时默认为0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 产品类型，传入Taishan定义的product_type字符串（如MYSQL、REDIS、OSS、FS等），系统会据此选择ss/netstat/showmount等方式采集连接日志，未知类型会返回错误 */
    @NotEmpty
    @OpenAPIParam("ProductType")
    private String productTypeParam;

    /** 地域ID，必须与目标资源所属地域一致，后端会基于该字段获取对应黄河集群及Agent */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源ID，PaaS资源唯一标识，仅当资源处于AVAILABLE且hhpaas运行状态为工作态时才会继续采集连接，否则返回错误 */
    @NotEmpty
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

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

}
