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

public class ForwardClusterRequest extends Request {

    /** 响应体格式 */
    
    @OpenAPIParam("Accept")
    private String acceptParam;

    /** 集群名称 */
    @NotEmpty
    @OpenAPIParam("ClusterID")
    private String clusterIDParam;

    /** 租户ID */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 请求体格式 */
    
    @OpenAPIParam("ContentType")
    private String contentTypeParam;

    /** 转发Body数据是否被编码 */
    
    @OpenAPIParam("EncodedBody")
    private Boolean encodedBodyParam;

    /** 语言 */
    
    @OpenAPIParam("Language")
    private String languageParam;

    /** 请求类型 */
    
    @OpenAPIParam("Method")
    private String methodParam;

    /** 请求路径 */
    
    @OpenAPIParam("Path")
    private String pathParam;

    /** Region */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 转发Body数据 */
    
    @OpenAPIParam("RequestBody")
    private String requestBodyParam;

    /** 请求版本 */
    
    @OpenAPIParam("Version")
    private String versionParam;


    public String getAccept() {
        return acceptParam;
    }

    public void setAccept(String acceptParam) {
        this.acceptParam = acceptParam;
    }

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

    public String getContentType() {
        return contentTypeParam;
    }

    public void setContentType(String contentTypeParam) {
        this.contentTypeParam = contentTypeParam;
    }

    public Boolean getEncodedBody() {
        return encodedBodyParam;
    }

    public void setEncodedBody(Boolean encodedBodyParam) {
        this.encodedBodyParam = encodedBodyParam;
    }

    public String getLanguage() {
        return languageParam;
    }

    public void setLanguage(String languageParam) {
        this.languageParam = languageParam;
    }

    public String getMethod() {
        return methodParam;
    }

    public void setMethod(String methodParam) {
        this.methodParam = methodParam;
    }

    public String getPath() {
        return pathParam;
    }

    public void setPath(String pathParam) {
        this.pathParam = pathParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRequestBody() {
        return requestBodyParam;
    }

    public void setRequestBody(String requestBodyParam) {
        this.requestBodyParam = requestBodyParam;
    }

    public String getVersion() {
        return versionParam;
    }

    public void setVersion(String versionParam) {
        this.versionParam = versionParam;
    }

}
