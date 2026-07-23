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

public class GetContainerLogsRequest extends Request {

    /** 集群id */
    @NotEmpty
    @OpenAPIParam("ClusterID")
    private String clusterIDParam;

    /** 租户ID */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 容器名 */
    @NotEmpty
    @OpenAPIParam("Container")
    private String containerParam;

    /** 结束时间,unixnano */
    
    @OpenAPIParam("End")
    private Integer endParam;

    /** 关键词 */
    
    @OpenAPIParam("Keywords")
    private List<String> keywordsParam;

    /** 关键词排除 */
    
    @OpenAPIParam("KeywordsIgnore")
    private List<String> keywordsIgnoreParam;

    /** 数量限制 */
    
    @OpenAPIParam("LineLimit")
    private Integer lineLimitParam;

    /** 命名空间 */
    @NotEmpty
    @OpenAPIParam("Namespace")
    private String namespaceParam;

    /** 是否在集群内 */
    
    @OpenAPIParam("NotInCluster")
    private Boolean notInClusterParam;

    /** pod名字 */
    @NotEmpty
    @OpenAPIParam("Pod")
    private String podParam;

    /** Region */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 起始时间,unixnano */
    
    @OpenAPIParam("Start")
    private Integer startParam;


    public String getClusterID() {
        return clusterIDParam;
    }

    public void setClusterID(String clusterIDParam) {
        this.clusterIDParam = clusterIDParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getContainer() {
        return containerParam;
    }

    public void setContainer(String containerParam) {
        this.containerParam = containerParam;
    }

    public Integer getEnd() {
        return endParam;
    }

    public void setEnd(Integer endParam) {
        this.endParam = endParam;
    }

    public List<String> getKeywords() {
        return keywordsParam;
    }

    public void setKeywords(List<String> keywordsParam) {
        this.keywordsParam = keywordsParam;
    }

    public List<String> getKeywordsIgnore() {
        return keywordsIgnoreParam;
    }

    public void setKeywordsIgnore(List<String> keywordsIgnoreParam) {
        this.keywordsIgnoreParam = keywordsIgnoreParam;
    }

    public Integer getLineLimit() {
        return lineLimitParam;
    }

    public void setLineLimit(Integer lineLimitParam) {
        this.lineLimitParam = lineLimitParam;
    }

    public String getNamespace() {
        return namespaceParam;
    }

    public void setNamespace(String namespaceParam) {
        this.namespaceParam = namespaceParam;
    }

    public Boolean getNotInCluster() {
        return notInClusterParam;
    }

    public void setNotInCluster(Boolean notInClusterParam) {
        this.notInClusterParam = notInClusterParam;
    }

    public String getPod() {
        return podParam;
    }

    public void setPod(String podParam) {
        this.podParam = podParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public Integer getStart() {
        return startParam;
    }

    public void setStart(Integer startParam) {
        this.startParam = startParam;
    }

}
