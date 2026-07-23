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

public class CreateVSPolicyRequest extends Request {

    /** CA证书ID，SNI协议开启时的CA证书ID */
    
    @OpenAPIParam("CACertificateID")
    private String cACertificateIDParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 请求域名，转发规则关联的请求域名，值可为空表示仅匹配路径，若填写必须符合Nginx server_name规则（最长30字符，支持以*.开头或.*结尾的通配域名），且需与Path组合保持唯一 */
    
    @OpenAPIParam("Domain")
    private String domainParam;

    /** 负载均衡ID，用于定位需要创建转发规则的负载均衡实例 */
    @NotEmpty
    @OpenAPIParam("LBID")
    private String lBIDParam;

    /** 请求访问路径，转发规则关联的请求访问路径，如'/'，域名和路径至少需要指定一项，且组合必须唯一 */
    
    @OpenAPIParam("Path")
    private String pathParam;

    /** 真实服务器ID列表，用于绑定到该转发规则的服务节点 */
    
    @OpenAPIParam("RSIDs")
    private List<String> rSIDsParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** SSL认证模式，SNI协议开启时的SSL模式，取值范围：simplex、duplex */
    
    @OpenAPIParam("SSLMode")
    private String sSLModeParam;

    /** 服务器证书ID，SNI协议开启时的服务器证书ID */
    
    @OpenAPIParam("ServerCertificateID")
    private String serverCertificateIDParam;

    /** 虚拟服务器ID，用于定位需要绑定转发规则的监听器，仅支持来源为Default的监听器（Service/Ingress来源由容器系统管理，调用会返回StatusCanNotModifyNoDefaultOriginVS错误） */
    @NotEmpty
    @OpenAPIParam("VSID")
    private String vSIDParam;


    public String getCACertificateID() {
        return cACertificateIDParam;
    }

    public void setCACertificateID(String cACertificateIDParam) {
        this.cACertificateIDParam = cACertificateIDParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getDomain() {
        return domainParam;
    }

    public void setDomain(String domainParam) {
        this.domainParam = domainParam;
    }

    public String getLBID() {
        return lBIDParam;
    }

    public void setLBID(String lBIDParam) {
        this.lBIDParam = lBIDParam;
    }

    public String getPath() {
        return pathParam;
    }

    public void setPath(String pathParam) {
        this.pathParam = pathParam;
    }

    public List<String> getRSIDs() {
        return rSIDsParam;
    }

    public void setRSIDs(List<String> rSIDsParam) {
        this.rSIDsParam = rSIDsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSSLMode() {
        return sSLModeParam;
    }

    public void setSSLMode(String sSLModeParam) {
        this.sSLModeParam = sSLModeParam;
    }

    public String getServerCertificateID() {
        return serverCertificateIDParam;
    }

    public void setServerCertificateID(String serverCertificateIDParam) {
        this.serverCertificateIDParam = serverCertificateIDParam;
    }

    public String getVSID() {
        return vSIDParam;
    }

    public void setVSID(String vSIDParam) {
        this.vSIDParam = vSIDParam;
    }

}
