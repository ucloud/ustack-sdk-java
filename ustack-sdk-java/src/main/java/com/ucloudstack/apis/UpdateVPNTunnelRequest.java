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

public class UpdateVPNTunnelRequest extends Request {

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** IKE认证算法，IKE阶段使用的认证算法，取值：md5、sha1、sha256 */
    @NotEmpty
    @UCloudStackParam("IKEAuthenticationAlgorithm")
    private String iKEAuthenticationAlgorithmParam;

    /** IKE DH组，IKE阶段使用的Diffie-Hellman密钥交换组，取值范围：0、1、2、5、14、24（0为历史兼容值） */
    
    @UCloudStackParam("IKEDhGroup")
    private Integer iKEDhGroupParam;

    /** IKE加密算法，IKE阶段使用的加密算法，取值：3des、aes128、aes192、aes256 */
    @NotEmpty
    @UCloudStackParam("IKEEncryptionAlgorithm")
    private String iKEEncryptionAlgorithmParam;

    /** IKE交换模式，仅当IKEVersion为v1时生效，取值：main（主模式）、aggressive（野蛮模式），为空时默认main */
    
    @UCloudStackParam("IKEExchangeMode")
    private String iKEExchangeModeParam;

    /** IKE本端标识，IKE协商时本端身份标识，为空时使用本端IP地址作为标识，传Auto表示使用本端IP地址 */
    
    @UCloudStackParam("IKELocalLabel")
    private String iKELocalLabelParam;

    /** IKE对端标识，IKE协商时对端身份标识，为空时使用对端IP地址作为标识，传Auto表示使用对端IP地址 */
    
    @UCloudStackParam("IKERemoteLabel")
    private String iKERemoteLabelParam;

    /** IKE SA生存时间，IKE安全关联的生存时间（秒），超时后将重新协商，取值范围：3600-86400 */
    @NotEmpty
    @UCloudStackParam("IKESALifetime")
    private Integer iKESALifetimeParam;

    /** IKE协议版本，Internet Key Exchange协议版本，取值：v1（IKEv1）、v2（IKEv2） */
    @NotEmpty
    @UCloudStackParam("IKEVersion")
    private String iKEVersionParam;

    /** IPSec认证算法，IPSec阶段使用的认证算法，取值：md5、sha1、sha256 */
    @NotEmpty
    @UCloudStackParam("IPSecAuthenticationAlgorithm")
    private String iPSecAuthenticationAlgorithmParam;

    /** IPSec加密算法，IPSec阶段使用的加密算法，仅当IPSecProtocol为ESP时生效，若不指定则默认为aes128，取值：3des、aes128、aes192、aes256 */
    
    @UCloudStackParam("IPSecEncryptionAlgorithm")
    private String iPSecEncryptionAlgorithmParam;

    /** IPSec PFS DH组，Perfect Forward Secrecy使用的Diffie-Hellman组，0表示不启用PFS，取值范围：0、1、2、5、14、24 */
    
    @UCloudStackParam("IPSecPFSDhGroup")
    private Integer iPSecPFSDhGroupParam;

    /** IPSec安全协议，IPSec使用的安全传输协议，取值：AH（仅认证）、ESP（认证加密） */
    @NotEmpty
    @UCloudStackParam("IPSecProtocol")
    private String iPSecProtocolParam;

    /** IPSec SA生存时间，IPSec安全关联生存时间（秒），超时后重新协商，取值范围：3600-86400，若不指定则默认为86400 */
    
    @UCloudStackParam("IPSecSALifetime")
    private Integer iPSecSALifetimeParam;

    /** 本端子网ID列表，更新后通过隧道互通的本端子网，子网需存在且归属当前租户与地域，且需有可用IP；本端子网与对端网段、VPN网关外网网段不可重叠，且与已有隧道组合不可重复 */
    @NotEmpty
    @UCloudStackParam("LocalSubnetIDs")
    private List<String> localSubnetIDsParam;

    /** 预共享密钥，更新后的预共享密钥，长度1-128字符，不能包含空格或? */
    @NotEmpty
    @UCloudStackParam("PreSharedKey")
    private String preSharedKeyParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 对端子网CIDR列表，更新后通过隧道互通的对端网段，每个网段需为合法CIDR且为网络地址，列表内网段不可重叠；不得与本端子网网段或VPN网关外网网段重叠，同一VPC内不得与已有隧道对端网段重叠 */
    @NotEmpty
    @UCloudStackParam("RemoteSubnets")
    private List<String> remoteSubnetsParam;

    /** VPN隧道ID，待更新的VPN隧道唯一标识，隧道需处于Running状态 */
    @NotEmpty
    @UCloudStackParam("VPNTunnelID")
    private String vPNTunnelIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getIKEAuthenticationAlgorithm() {
        return iKEAuthenticationAlgorithmParam;
    }

    public void setIKEAuthenticationAlgorithm(String iKEAuthenticationAlgorithmParam) {
        this.iKEAuthenticationAlgorithmParam = iKEAuthenticationAlgorithmParam;
    }

    public Integer getIKEDhGroup() {
        return iKEDhGroupParam;
    }

    public void setIKEDhGroup(Integer iKEDhGroupParam) {
        this.iKEDhGroupParam = iKEDhGroupParam;
    }

    public String getIKEEncryptionAlgorithm() {
        return iKEEncryptionAlgorithmParam;
    }

    public void setIKEEncryptionAlgorithm(String iKEEncryptionAlgorithmParam) {
        this.iKEEncryptionAlgorithmParam = iKEEncryptionAlgorithmParam;
    }

    public String getIKEExchangeMode() {
        return iKEExchangeModeParam;
    }

    public void setIKEExchangeMode(String iKEExchangeModeParam) {
        this.iKEExchangeModeParam = iKEExchangeModeParam;
    }

    public String getIKELocalLabel() {
        return iKELocalLabelParam;
    }

    public void setIKELocalLabel(String iKELocalLabelParam) {
        this.iKELocalLabelParam = iKELocalLabelParam;
    }

    public String getIKERemoteLabel() {
        return iKERemoteLabelParam;
    }

    public void setIKERemoteLabel(String iKERemoteLabelParam) {
        this.iKERemoteLabelParam = iKERemoteLabelParam;
    }

    public Integer getIKESALifetime() {
        return iKESALifetimeParam;
    }

    public void setIKESALifetime(Integer iKESALifetimeParam) {
        this.iKESALifetimeParam = iKESALifetimeParam;
    }

    public String getIKEVersion() {
        return iKEVersionParam;
    }

    public void setIKEVersion(String iKEVersionParam) {
        this.iKEVersionParam = iKEVersionParam;
    }

    public String getIPSecAuthenticationAlgorithm() {
        return iPSecAuthenticationAlgorithmParam;
    }

    public void setIPSecAuthenticationAlgorithm(String iPSecAuthenticationAlgorithmParam) {
        this.iPSecAuthenticationAlgorithmParam = iPSecAuthenticationAlgorithmParam;
    }

    public String getIPSecEncryptionAlgorithm() {
        return iPSecEncryptionAlgorithmParam;
    }

    public void setIPSecEncryptionAlgorithm(String iPSecEncryptionAlgorithmParam) {
        this.iPSecEncryptionAlgorithmParam = iPSecEncryptionAlgorithmParam;
    }

    public Integer getIPSecPFSDhGroup() {
        return iPSecPFSDhGroupParam;
    }

    public void setIPSecPFSDhGroup(Integer iPSecPFSDhGroupParam) {
        this.iPSecPFSDhGroupParam = iPSecPFSDhGroupParam;
    }

    public String getIPSecProtocol() {
        return iPSecProtocolParam;
    }

    public void setIPSecProtocol(String iPSecProtocolParam) {
        this.iPSecProtocolParam = iPSecProtocolParam;
    }

    public Integer getIPSecSALifetime() {
        return iPSecSALifetimeParam;
    }

    public void setIPSecSALifetime(Integer iPSecSALifetimeParam) {
        this.iPSecSALifetimeParam = iPSecSALifetimeParam;
    }

    public List<String> getLocalSubnetIDs() {
        return localSubnetIDsParam;
    }

    public void setLocalSubnetIDs(List<String> localSubnetIDsParam) {
        this.localSubnetIDsParam = localSubnetIDsParam;
    }

    public String getPreSharedKey() {
        return preSharedKeyParam;
    }

    public void setPreSharedKey(String preSharedKeyParam) {
        this.preSharedKeyParam = preSharedKeyParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getRemoteSubnets() {
        return remoteSubnetsParam;
    }

    public void setRemoteSubnets(List<String> remoteSubnetsParam) {
        this.remoteSubnetsParam = remoteSubnetsParam;
    }

    public String getVPNTunnelID() {
        return vPNTunnelIDParam;
    }

    public void setVPNTunnelID(String vPNTunnelIDParam) {
        this.vPNTunnelIDParam = vPNTunnelIDParam;
    }

}
