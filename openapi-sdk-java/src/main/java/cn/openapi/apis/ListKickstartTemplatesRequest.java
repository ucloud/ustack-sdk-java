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

public class ListKickstartTemplatesRequest extends Request {

    /** 关键词搜索，支持按模板名称、OSDistribution 进行关键词搜索 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 每页数量，指定每页返回的记录数，默认值为10，最大值为100 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 操作系统发行版，支持模糊匹配，如：CentOS、Rocky、Ubuntu、OpenEuler等 */
    
    @OpenAPIParam("OSDistribution")
    private String oSDistributionParam;

    /** 偏移量，指定跳过的记录数，最小值为0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


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

    public String getOSDistribution() {
        return oSDistributionParam;
    }

    public void setOSDistribution(String oSDistributionParam) {
        this.oSDistributionParam = oSDistributionParam;
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
