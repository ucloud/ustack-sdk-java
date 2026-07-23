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

public class UpdateVSRequest extends Request {

    /** 后端协议，后端使用的协议，取值范围：空（默认HTTP）、HTTP、HTTPS，仅在协议为HTTPS时有效 */
    
    @OpenAPIParam("BackendProtocol")
    private String backendProtocolParam;

    /** CA证书ID，用于验证客户端证书的签名，仅当协议为HTTPS且SSLMode为双向认证时有效 */
    
    @OpenAPIParam("CACertificateID")
    private String cACertificateIDParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** HTTP健康检查域名，HTTP检查时校验的HOST字段域名，当健康检查类型为Path时可配置，且需满足validate.IsValidDomain规则（与Nginx server_name一致，支持*.example.com/mail.*等通配） */
    
    @OpenAPIParam("Domain")
    private String domainParam;

    /** 健康检查类型，健康检查的类型，取值范围：Port、Path，TCP和UDP协议只支持Port类型 */
    
    @OpenAPIParam("HealthcheckType")
    private String healthcheckTypeParam;

    /** 请求体大小限制，单位MB，最大512；仅HTTP/HTTPS协议有效，0表示保留原值 */
    
    @OpenAPIParam("HttpClientMaxBodySizeMB")
    private Integer httpClientMaxBodySizeMBParam;

    /** 请求头大小限制，单位KB，最大512；仅HTTP/HTTPS协议有效，0表示保留原值 */
    
    @OpenAPIParam("HttpClientMaxHeaderSizeKB")
    private Integer httpClientMaxHeaderSizeKBParam;

    /** 连接空闲超时时间，负载均衡的连接空闲超时时间，单位为秒，默认值为60s */
    
    @OpenAPIParam("KeepaliveTimeout")
    private Integer keepaliveTimeoutParam;

    /** 负载均衡ID，用于定位需要更新监听器的负载均衡实例 */
    @NotEmpty
    @OpenAPIParam("LBID")
    private String lBIDParam;

    /** HTTP健康检查路径，HTTP检查时的请求路径，当健康检查类型为Path时可配置，且必须指定以/开头的合法URL路径 */
    
    @OpenAPIParam("Path")
    private String pathParam;

    /** 会话保持KEY，会话保持的键，当类型为Manual时为必填，仅当协议为HTTP时有效 */
    
    @OpenAPIParam("PersistenceKey")
    private String persistenceKeyParam;

    /** 会话保持类型，会话保持的类型，取值范围：None、Auto、Manual，若不指定则默认为None */
    
    @OpenAPIParam("PersistenceType")
    private String persistenceTypeParam;

    /** 虚拟服务器端口，VServer的监听端口，端口范围为1~65535，其中323、9102~9105、60909~60910被系统占用 */
    
    @OpenAPIParam("Port")
    private Integer portParam;

    /** TCP Proxy Protocol开关，是否开启TCP Proxy Protocol，取值范围：On、Off */
    
    @OpenAPIParam("ProxyProtocolEnable")
    private String proxyProtocolEnableParam;

    /** HTTP重定向开关，是否开启HTTP重定向，仅HTTP协议有效；取值范围：On、Off */
    
    @OpenAPIParam("RedirectEnable")
    private String redirectEnableParam;

    /** HTTP重定向目标VSID，重定向到的虚拟服务器ID，仅当RedirectEnable=On时必填，其余情况下必须为空 */
    
    @OpenAPIParam("RedirectVsID")
    private String redirectVsIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** SSL认证模式，SSL的认证模式，取值范围：simplex（单向认证）、duplex（双向认证），必填字段，仅HTTPS协议时生效 */
    @NotEmpty
    @OpenAPIParam("SSLMode")
    private String sSLModeParam;

    /** 调度算法，负载均衡的调度算法，取值范围：wrr、least_conn、hash、ip_hash */
    
    @OpenAPIParam("Scheduler")
    private String schedulerParam;

    /** 服务器证书ID，用于证明服务器的身份，仅当协议为HTTPS时有效 */
    
    @OpenAPIParam("ServerCertificateID")
    private String serverCertificateIDParam;

    /** 虚拟服务器ID，用于定位需要更新的监听器实例，仅支持来源为Default的监听器（Service/Ingress来源由容器系统管理，调用会返回StatusCanNotModifyNoDefaultOriginVS错误） */
    @NotEmpty
    @OpenAPIParam("VSID")
    private String vSIDParam;


    public String getBackendProtocol() {
        return backendProtocolParam;
    }

    public void setBackendProtocol(String backendProtocolParam) {
        this.backendProtocolParam = backendProtocolParam;
    }

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

    public String getHealthcheckType() {
        return healthcheckTypeParam;
    }

    public void setHealthcheckType(String healthcheckTypeParam) {
        this.healthcheckTypeParam = healthcheckTypeParam;
    }

    public Integer getHttpClientMaxBodySizeMB() {
        return httpClientMaxBodySizeMBParam;
    }

    public void setHttpClientMaxBodySizeMB(Integer httpClientMaxBodySizeMBParam) {
        this.httpClientMaxBodySizeMBParam = httpClientMaxBodySizeMBParam;
    }

    public Integer getHttpClientMaxHeaderSizeKB() {
        return httpClientMaxHeaderSizeKBParam;
    }

    public void setHttpClientMaxHeaderSizeKB(Integer httpClientMaxHeaderSizeKBParam) {
        this.httpClientMaxHeaderSizeKBParam = httpClientMaxHeaderSizeKBParam;
    }

    public Integer getKeepaliveTimeout() {
        return keepaliveTimeoutParam;
    }

    public void setKeepaliveTimeout(Integer keepaliveTimeoutParam) {
        this.keepaliveTimeoutParam = keepaliveTimeoutParam;
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

    public String getPersistenceKey() {
        return persistenceKeyParam;
    }

    public void setPersistenceKey(String persistenceKeyParam) {
        this.persistenceKeyParam = persistenceKeyParam;
    }

    public String getPersistenceType() {
        return persistenceTypeParam;
    }

    public void setPersistenceType(String persistenceTypeParam) {
        this.persistenceTypeParam = persistenceTypeParam;
    }

    public Integer getPort() {
        return portParam;
    }

    public void setPort(Integer portParam) {
        this.portParam = portParam;
    }

    public String getProxyProtocolEnable() {
        return proxyProtocolEnableParam;
    }

    public void setProxyProtocolEnable(String proxyProtocolEnableParam) {
        this.proxyProtocolEnableParam = proxyProtocolEnableParam;
    }

    public String getRedirectEnable() {
        return redirectEnableParam;
    }

    public void setRedirectEnable(String redirectEnableParam) {
        this.redirectEnableParam = redirectEnableParam;
    }

    public String getRedirectVsID() {
        return redirectVsIDParam;
    }

    public void setRedirectVsID(String redirectVsIDParam) {
        this.redirectVsIDParam = redirectVsIDParam;
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

    public String getScheduler() {
        return schedulerParam;
    }

    public void setScheduler(String schedulerParam) {
        this.schedulerParam = schedulerParam;
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
