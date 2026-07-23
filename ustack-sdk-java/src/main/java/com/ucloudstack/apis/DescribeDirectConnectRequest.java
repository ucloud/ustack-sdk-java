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

public class DescribeDirectConnectRequest extends Request {

    /** 租户ID，用于标识资源所属的租户，实现多租户环境下的资源隔离，若不指定则查询用户有权限访问的所有专线接入 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 专线接入ID列表，用于精确查询指定的专线接入资源，支持批量查询 */
    
    @OpenAPIParam("DirectConnectIDs")
    private List<String> directConnectIDsParam;

    /** 搜索关键词，用于模糊搜索专线接入的名称、描述等信息，长度不超过100个字符 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，取值范围：1-100，默认值：10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，用于实现分页查询，默认值：0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域ID，指定查询专线接入所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getDirectConnectIDs() {
        return directConnectIDsParam;
    }

    public void setDirectConnectIDs(List<String> directConnectIDsParam) {
        this.directConnectIDsParam = directConnectIDsParam;
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

}
