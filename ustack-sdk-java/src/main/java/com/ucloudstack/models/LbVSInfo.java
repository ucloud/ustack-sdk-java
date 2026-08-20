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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class LbVSInfo {

    /** 后端协议，后端使用的协议，取值范围：空（默认HTTP）、HTTP、HTTPS */
    @SerializedName("BackendProtocol")
    private String backendProtocolParam;

    /** CA证书ID，用于验证客户端证书的签名，仅当协议为HTTPS且SSLMode为双向认证时有效 */
    @SerializedName("CACertificateID")
    private String cACertificateIDParam;

    /** 创建时间，资源创建的时间戳（秒） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** HTTP健康检查域名，HTTP检查时校验的HOST字段域名 */
    @SerializedName("Domain")
    private String domainParam;

    /** 健康检查类型，健康检查的类型，取值范围：Port、Path */
    @SerializedName("HealthcheckType")
    private String healthcheckTypeParam;

    /** 请求体大小限制，单位MB，最大512；未配置时返回历史兼容默认展示值64 */
    @SerializedName("HttpClientMaxBodySizeMB")
    private Integer httpClientMaxBodySizeMBParam;

    /** 请求头大小限制，单位KB，最大512；未配置时返回历史兼容默认展示值32 */
    @SerializedName("HttpClientMaxHeaderSizeKB")
    private Integer httpClientMaxHeaderSizeKBParam;

    /** 连接空闲超时时间，负载均衡的连接空闲超时时间，单位为秒 */
    @SerializedName("KeepaliveTimeout")
    private Integer keepaliveTimeoutParam;

    /** 负载均衡ID，用于标识所属负载均衡实例 */
    @SerializedName("LBID")
    private String lBIDParam;

    /** 虚拟服务器来源，标识监听器来源，取值范围：Default、Service、Ingress */
    @SerializedName("Origin")
    private String originParam;

    /** HTTP健康检查路径，HTTP检查时的请求路径 */
    @SerializedName("Path")
    private String pathParam;

    /** 会话保持KEY，会话保持的键 */
    @SerializedName("PersistenceKey")
    private String persistenceKeyParam;

    /** 会话保持类型，会话保持的类型，取值范围：None、Auto、Manual */
    @SerializedName("PersistenceType")
    private String persistenceTypeParam;

    /** 虚拟服务器端口，VServer的监听端口，端口范围为1~65535 */
    @SerializedName("Port")
    private Integer portParam;

    /** 虚拟服务器协议，VServer的监听协议，取值范围：TCP、UDP、HTTP、HTTPS */
    @SerializedName("Protocol")
    private String protocolParam;

    /** TCP Proxy Protocol开关，是否开启TCP Proxy Protocol，取值范围：On、Off */
    @SerializedName("ProxyProtocolEnable")
    private String proxyProtocolEnableParam;

    /** 真实服务器健康状态，健康检查的状态，取值范围：Empty（全部异常）、Parts（部分异常）、All（全部正常） */
    @SerializedName("RSHealthStatus")
    private String rSHealthStatusParam;

    /** 真实服务器列表，VServer关联的真实服务器列表 */
    @SerializedName("RSInfos")
    private List<LbRSInfo> rSInfosParam;

    /** HTTP重定向目标VSID，重定向到的虚拟服务器ID */
    @SerializedName("RedirectVsID")
    private String redirectVsIDParam;

    /** SSL认证模式，SSL的认证模式，取值范围：simplex（单向认证）、duplex（双向认证） */
    @SerializedName("SSLMode")
    private String sSLModeParam;

    /** 调度算法，负载均衡的调度算法，取值范围：wrr、least_conn、hash、ip_hash */
    @SerializedName("Scheduler")
    private String schedulerParam;

    /** 服务器证书ID，用于证明服务器的身份，仅当协议为HTTPS时有效 */
    @SerializedName("ServerCertificateID")
    private String serverCertificateIDParam;

    /** 更新时间，资源最后更新的时间戳（秒） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 虚拟服务器ID，用于标识所属监听器 */
    @SerializedName("VSID")
    private String vSIDParam;

    /** 转发规则列表，VServer关联的转发规则列表 */
    @SerializedName("VSPolicyInfos")
    private List<LbVSPolicyInfo> vSPolicyInfosParam;

    /** 虚拟服务器状态，VServer的资源状态，取值范围：Available（可用）、Updating（更新中）、Deleted（已删除） */
    @SerializedName("VSStatus")
    private String vSStatusParam;


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

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
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

    public String getOrigin() {
        return originParam;
    }

    public void setOrigin(String originParam) {
        this.originParam = originParam;
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

    public String getProtocol() {
        return protocolParam;
    }

    public void setProtocol(String protocolParam) {
        this.protocolParam = protocolParam;
    }

    public String getProxyProtocolEnable() {
        return proxyProtocolEnableParam;
    }

    public void setProxyProtocolEnable(String proxyProtocolEnableParam) {
        this.proxyProtocolEnableParam = proxyProtocolEnableParam;
    }

    public String getRSHealthStatus() {
        return rSHealthStatusParam;
    }

    public void setRSHealthStatus(String rSHealthStatusParam) {
        this.rSHealthStatusParam = rSHealthStatusParam;
    }

    public List<LbRSInfo> getRSInfos() {
        return rSInfosParam;
    }

    public void setRSInfos(List<LbRSInfo> rSInfosParam) {
        this.rSInfosParam = rSInfosParam;
    }

    public String getRedirectVsID() {
        return redirectVsIDParam;
    }

    public void setRedirectVsID(String redirectVsIDParam) {
        this.redirectVsIDParam = redirectVsIDParam;
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

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getVSID() {
        return vSIDParam;
    }

    public void setVSID(String vSIDParam) {
        this.vSIDParam = vSIDParam;
    }

    public List<LbVSPolicyInfo> getVSPolicyInfos() {
        return vSPolicyInfosParam;
    }

    public void setVSPolicyInfos(List<LbVSPolicyInfo> vSPolicyInfosParam) {
        this.vSPolicyInfosParam = vSPolicyInfosParam;
    }

    public String getVSStatus() {
        return vSStatusParam;
    }

    public void setVSStatus(String vSStatusParam) {
        this.vSStatusParam = vSStatusParam;
    }

}
