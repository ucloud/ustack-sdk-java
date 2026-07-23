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

public class ListOSMediaV2Request extends Request {

    /** 租户ID，过滤指定租户下的系统镜像，若不指定则返回所有租户的镜像 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 关键词搜索，支持按 MediaID、Name、OSName、OSDistribution、ImageID(系统镜像ID) 进行关键词搜索 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 每页数量，指定每页返回的记录数，默认值为20，最大值为100 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 系统镜像类型，可选值：ISO */
    
    @OpenAPIParam("MediaType")
    private String mediaTypeParam;

    /** 操作系统发行版（如：CentOS、OpenEuler），支持模糊匹配 */
    
    @OpenAPIParam("OSDistribution")
    private String oSDistributionParam;

    /** 操作系统完整名称（如：CentOS 7.4 x86_64），支持模糊匹配 */
    
    @OpenAPIParam("OSName")
    private String oSNameParam;

    /** 偏移量，指定跳过的记录数，最小值为0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 项目ID列表，过滤指定项目下的系统镜像 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


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

    public String getMediaType() {
        return mediaTypeParam;
    }

    public void setMediaType(String mediaTypeParam) {
        this.mediaTypeParam = mediaTypeParam;
    }

    public String getOSDistribution() {
        return oSDistributionParam;
    }

    public void setOSDistribution(String oSDistributionParam) {
        this.oSDistributionParam = oSDistributionParam;
    }

    public String getOSName() {
        return oSNameParam;
    }

    public void setOSName(String oSNameParam) {
        this.oSNameParam = oSNameParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public List<String> getProjectIDs() {
        return projectIDsParam;
    }

    public void setProjectIDs(List<String> projectIDsParam) {
        this.projectIDsParam = projectIDsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
