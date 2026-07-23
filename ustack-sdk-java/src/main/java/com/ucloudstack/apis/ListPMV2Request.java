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

public class ListPMV2Request extends Request {

    /** 租户ID，过滤指定租户下的裸金属资源，若不指定则返回所有租户的资源 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 主机名，按 Kunlun 机器主机名进行模糊匹配 */
    
    @OpenAPIParam("Hostname")
    private String hostnameParam;

    /** 带外IP，按 Kunlun 机器 IPMI IP 进行模糊匹配 */
    
    @OpenAPIParam("IPMIIP")
    private String iPMIIPParam;

    /** 关键词搜索，支持按裸金属ID、序列号、机架位置进行模糊匹配 */
    
    @OpenAPIParam("Keyword")
    private String keywordParam;

    /** 每页数量，指定每页返回的记录数，默认值为20，最大值为100 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 偏移量，指定跳过的记录数，最小值为0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 裸金属ID列表，精确匹配指定ID的裸金属 */
    
    @OpenAPIParam("PMIDs")
    private List<String> pMIDsParam;

    /** 项目ID列表，过滤指定项目下的裸金属资源 */
    
    @OpenAPIParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 序列号列表，精确匹配指定序列号的裸金属 */
    
    @OpenAPIParam("SNs")
    private List<String> sNsParam;

    /** 搜索字段，Tag 表示仅按资源标签 key/value 搜索 */
    
    @OpenAPIParam("SearchField")
    private String searchFieldParam;

    /** 标签键值对筛选，格式为 key:value 的 Base64 编码字符串；相同 key 的多个 value 按 OR 处理，不同 key 之间按 AND 处理 */
    @NotEmpty
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getHostname() {
        return hostnameParam;
    }

    public void setHostname(String hostnameParam) {
        this.hostnameParam = hostnameParam;
    }

    public String getIPMIIP() {
        return iPMIIPParam;
    }

    public void setIPMIIP(String iPMIIPParam) {
        this.iPMIIPParam = iPMIIPParam;
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

    public List<String> getPMIDs() {
        return pMIDsParam;
    }

    public void setPMIDs(List<String> pMIDsParam) {
        this.pMIDsParam = pMIDsParam;
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

    public List<String> getSNs() {
        return sNsParam;
    }

    public void setSNs(List<String> sNsParam) {
        this.sNsParam = sNsParam;
    }

    public String getSearchField() {
        return searchFieldParam;
    }

    public void setSearchField(String searchFieldParam) {
        this.searchFieldParam = searchFieldParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

}
