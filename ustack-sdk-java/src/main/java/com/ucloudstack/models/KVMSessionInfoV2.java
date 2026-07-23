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

public class KVMSessionInfoV2 {

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间 */
    @SerializedName("CreatedAt")
    private Integer createdAtParam;

    /** 过期时间 */
    @SerializedName("ExpiresAt")
    private Integer expiresAtParam;

    /** 实例名称 */
    @SerializedName("InstanceName")
    private String instanceNameParam;

    /** 裸金属ID */
    @SerializedName("PMID")
    private String pMIDParam;

    /** 地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 序列号 */
    @SerializedName("SN")
    private String sNParam;

    /** 服务器IP */
    @SerializedName("ServerIP")
    private String serverIPParam;

    /** 会话ID */
    @SerializedName("SessionID")
    private String sessionIDParam;

    /** 状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 访问令牌 */
    @SerializedName("Token")
    private String tokenParam;

    /** 访问URL */
    @SerializedName("URL")
    private String uRLParam;

    /** VNC端口 */
    @SerializedName("VNCPort")
    private Integer vNCPortParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCreatedAt() {
        return createdAtParam;
    }

    public void setCreatedAt(Integer createdAtParam) {
        this.createdAtParam = createdAtParam;
    }

    public Integer getExpiresAt() {
        return expiresAtParam;
    }

    public void setExpiresAt(Integer expiresAtParam) {
        this.expiresAtParam = expiresAtParam;
    }

    public String getInstanceName() {
        return instanceNameParam;
    }

    public void setInstanceName(String instanceNameParam) {
        this.instanceNameParam = instanceNameParam;
    }

    public String getPMID() {
        return pMIDParam;
    }

    public void setPMID(String pMIDParam) {
        this.pMIDParam = pMIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSN() {
        return sNParam;
    }

    public void setSN(String sNParam) {
        this.sNParam = sNParam;
    }

    public String getServerIP() {
        return serverIPParam;
    }

    public void setServerIP(String serverIPParam) {
        this.serverIPParam = serverIPParam;
    }

    public String getSessionID() {
        return sessionIDParam;
    }

    public void setSessionID(String sessionIDParam) {
        this.sessionIDParam = sessionIDParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getToken() {
        return tokenParam;
    }

    public void setToken(String tokenParam) {
        this.tokenParam = tokenParam;
    }

    public String getURL() {
        return uRLParam;
    }

    public void setURL(String uRLParam) {
        this.uRLParam = uRLParam;
    }

    public Integer getVNCPort() {
        return vNCPortParam;
    }

    public void setVNCPort(Integer vNCPortParam) {
        this.vNCPortParam = vNCPortParam;
    }

}
