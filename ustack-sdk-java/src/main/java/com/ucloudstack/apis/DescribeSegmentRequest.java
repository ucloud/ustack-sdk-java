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

public class DescribeSegmentRequest extends Request {

    /** 租户ID，用于标识资源所属的租户，实现多租户环境下的资源隔离，若不指定则查询用户有权限访问的所有外网线路 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** IP版本，用于筛选指定IP协议版本的外网线路，可选值：IPv4、IPv6，预留字段，暂不支持 */
    
    @OpenAPIParam("IPVersion")
    private String iPVersionParam;

    /** 搜索关键词，用于模糊搜索外网线路的名称、描述等信息，长度不超过100个字符 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，取值范围：1-100，默认值：10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，用于实现分页查询，默认值：0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域ID，指定查询外网线路所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 外网线路ID列表，用于精确查询指定ID的外网线路，支持批量查询多个线路 */
    
    @OpenAPIParam("SegmentIDs")
    private List<String> segmentIDsParam;

    /** 是否统计并返回外网线路中的EIP资源使用情况，包括已绑定、空闲、失败、回收站状态的EIP数量 */
    
    @OpenAPIParam("ShowIPResourceCount")
    private Boolean showIPResourceCountParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getIPVersion() {
        return iPVersionParam;
    }

    public void setIPVersion(String iPVersionParam) {
        this.iPVersionParam = iPVersionParam;
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

    public List<String> getSegmentIDs() {
        return segmentIDsParam;
    }

    public void setSegmentIDs(List<String> segmentIDsParam) {
        this.segmentIDsParam = segmentIDsParam;
    }

    public Boolean getShowIPResourceCount() {
        return showIPResourceCountParam;
    }

    public void setShowIPResourceCount(Boolean showIPResourceCountParam) {
        this.showIPResourceCountParam = showIPResourceCountParam;
    }

}
