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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class LbVSPolicyInfo {

    /** CA证书ID，SNI协议开启时的CA证书ID */
    @SerializedName("CACertificateID")
    private String cACertificateIDParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 请求域名，转发规则关联的请求域名，值可为空表示仅匹配路径，若填写则遵循Nginx server_name规则（最长30字符，可使用*.example.com或mail.*一类通配格式） */
    @SerializedName("Domain")
    private String domainParam;

    /** 负载均衡ID，用于标识所属负载均衡实例 */
    @SerializedName("LBID")
    private String lBIDParam;

    /** 请求访问路径，转发规则关联的请求访问路径，如'/'， */
    @SerializedName("Path")
    private String pathParam;

    /** 转发规则ID，用于定位转发规则 */
    @SerializedName("PolicyID")
    private String policyIDParam;

    /** 转发规则状态，转发规则的状态，取值范围：Available（有效）、Deleted（已删除） */
    @SerializedName("PolicyStatus")
    private String policyStatusParam;

    /** 真实服务器列表，转发规则关联的真实服务器列表 */
    @SerializedName("RSInfos")
    private List<LbRSInfo> rSInfosParam;

    /** HTTP重定向转发规则ID，HTTP重定向指向的转发规则ID */
    @SerializedName("RedirectPolicyID")
    private String redirectPolicyIDParam;

    /** SSL认证模式，SNI协议开启时的SSL模式，取值范围：simplex、duplex */
    @SerializedName("SSLMode")
    private String sSLModeParam;

    /** 服务器证书ID，SNI协议开启时的服务器证书ID */
    @SerializedName("ServerCertificateID")
    private String serverCertificateIDParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 虚拟服务器ID，用于标识所属监听器 */
    @SerializedName("VSID")
    private String vSIDParam;


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

    public String getPolicyID() {
        return policyIDParam;
    }

    public void setPolicyID(String policyIDParam) {
        this.policyIDParam = policyIDParam;
    }

    public String getPolicyStatus() {
        return policyStatusParam;
    }

    public void setPolicyStatus(String policyStatusParam) {
        this.policyStatusParam = policyStatusParam;
    }

    public List<LbRSInfo> getRSInfos() {
        return rSInfosParam;
    }

    public void setRSInfos(List<LbRSInfo> rSInfosParam) {
        this.rSInfosParam = rSInfosParam;
    }

    public String getRedirectPolicyID() {
        return redirectPolicyIDParam;
    }

    public void setRedirectPolicyID(String redirectPolicyIDParam) {
        this.redirectPolicyIDParam = redirectPolicyIDParam;
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

}
