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
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribeCertificateRequest extends Request {

    /** 证书ID列表，用于筛选指定证书，当Origin为Ingress时必填 */
    
    @UCloudStackParam("CertificateIDs")
    private List<String> certificateIDsParam;

    /** 证书类型，证书的类型，取值范围：ServerCrt、CACrt，空表示不筛选类型 */
    
    @UCloudStackParam("CertificateType")
    private String certificateTypeParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 搜索关键词，用于搜索证书 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 负载均衡ID，用于筛选已绑定证书的负载均衡，当Origin为Ingress时必填 */
    
    @UCloudStackParam("LBID")
    private String lBIDParam;

    /** 分页大小，指定每页返回的记录数 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 证书来源，证书的来源，取值范围：Default、Ingress，空表示不筛选来源 */
    
    @UCloudStackParam("Origin")
    private String originParam;

    /** 项目ID列表，用于筛选指定项目的证书 */
    
    @UCloudStackParam("ProjectIDs")
    private List<String> projectIDsParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 虚拟服务器ID，用于筛选已绑定证书的虚拟服务器，当Origin为Ingress时必填 */
    
    @UCloudStackParam("VSID")
    private String vSIDParam;


    public List<String> getCertificateIDs() {
        return certificateIDsParam;
    }

    public void setCertificateIDs(List<String> certificateIDsParam) {
        this.certificateIDsParam = certificateIDsParam;
    }

    public String getCertificateType() {
        return certificateTypeParam;
    }

    public void setCertificateType(String certificateTypeParam) {
        this.certificateTypeParam = certificateTypeParam;
    }

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

    public String getLBID() {
        return lBIDParam;
    }

    public void setLBID(String lBIDParam) {
        this.lBIDParam = lBIDParam;
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

    public String getOrigin() {
        return originParam;
    }

    public void setOrigin(String originParam) {
        this.originParam = originParam;
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

    public String getVSID() {
        return vSIDParam;
    }

    public void setVSID(String vSIDParam) {
        this.vSIDParam = vSIDParam;
    }

}
