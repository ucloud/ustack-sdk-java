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

public class CreateVPNTunnelRequest extends Request {

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** IKE认证算法，IKE阶段使用的认证算法，取值：md5、sha1、sha256 */
    @NotEmpty
    @OpenAPIParam("IKEAuthenticationAlgorithm")
    private String iKEAuthenticationAlgorithmParam;

    /** IKE DH组，IKE阶段使用的Diffie-Hellman密钥交换组，取值范围：0、1、2、5、14、24（0为历史兼容值） */
    
    @OpenAPIParam("IKEDhGroup")
    private Integer iKEDhGroupParam;

    /** IKE加密算法，IKE阶段使用的加密算法，取值：3des、aes128、aes192、aes256 */
    @NotEmpty
    @OpenAPIParam("IKEEncryptionAlgorithm")
    private String iKEEncryptionAlgorithmParam;

    /** IKE交换模式，仅当IKEVersion为v1时生效，取值：main（主模式）、aggressive（野蛮模式），为空时默认main */
    
    @OpenAPIParam("IKEExchangeMode")
    private String iKEExchangeModeParam;

    /** IKE本端标识，IKE协商时本端身份标识，为空时使用本端IP地址作为标识 */
    
    @OpenAPIParam("IKELocalLabel")
    private String iKELocalLabelParam;

    /** IKE对端标识，IKE协商时对端身份标识，为空时使用对端IP地址作为标识 */
    
    @OpenAPIParam("IKERemoteLabel")
    private String iKERemoteLabelParam;

    /** IKE SA生存时间，IKE安全关联的生存时间（秒），超时后将重新协商，取值范围：3600-86400 */
    @NotEmpty
    @OpenAPIParam("IKESALifetime")
    private Integer iKESALifetimeParam;

    /** IKE协议版本，Internet Key Exchange协议版本，取值：v1（IKEv1）、v2（IKEv2） */
    @NotEmpty
    @OpenAPIParam("IKEVersion")
    private String iKEVersionParam;

    /** IPSec认证算法，IPSec阶段使用的认证算法，取值：md5、sha1、sha256 */
    @NotEmpty
    @OpenAPIParam("IPSecAuthenticationAlgorithm")
    private String iPSecAuthenticationAlgorithmParam;

    /** IPSec加密算法，IPSec阶段使用的加密算法，仅当IPSecProtocol为ESP时生效，若不指定则默认为aes128，取值：3des、aes128、aes192、aes256 */
    
    @OpenAPIParam("IPSecEncryptionAlgorithm")
    private String iPSecEncryptionAlgorithmParam;

    /** IPSec PFS DH组，Perfect Forward Secrecy使用的Diffie-Hellman组，0表示不启用PFS，取值范围：0、1、2、5、14、24 */
    
    @OpenAPIParam("IPSecPFSDhGroup")
    private Integer iPSecPFSDhGroupParam;

    /** IPSec安全协议，IPSec使用的安全传输协议，取值：AH（仅认证）、ESP（认证加密） */
    @NotEmpty
    @OpenAPIParam("IPSecProtocol")
    private String iPSecProtocolParam;

    /** IPSec SA生存时间，IPSec安全关联生存时间（秒），超时后重新协商，取值范围：3600-86400，若不指定则默认为86400 */
    
    @OpenAPIParam("IPSecSALifetime")
    private Integer iPSecSALifetimeParam;

    /** 本端子网ID列表，指定通过隧道互通的本端子网，子网需存在且归属当前租户与地域，且需有可用IP；本端子网与对端网段、VPN网关外网网段不可重叠，且与已有隧道组合不可重复 */
    @NotEmpty
    @OpenAPIParam("LocalSubnetIDs")
    private List<String> localSubnetIDsParam;

    /** VPN隧道名称，支持中文、英文字母、数字、点、下划线和中划线，长度1-128字符 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 预共享密钥，用于IPSec隧道协商，长度1-128字符，不能包含空格或? */
    @NotEmpty
    @OpenAPIParam("PreSharedKey")
    private String preSharedKeyParam;

    /** 项目ID，用于标识资源所属项目分组，未传时尝试分配默认项目 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，长度0-100字符，禁止http://或https://等非法字符 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 对端子网CIDR列表，指定通过隧道互通的对端网段，每个网段需为合法CIDR且为网络地址，列表内网段不可重叠；不得与本端子网网段或VPN网关外网网段重叠，同一VPC内不得与已有隧道对端网段重叠 */
    @NotEmpty
    @OpenAPIParam("RemoteSubnets")
    private List<String> remoteSubnetsParam;

    /** 对端网关ID，对端VPN网关唯一标识 */
    @NotEmpty
    @OpenAPIParam("RemoteVPNGWID")
    private String remoteVPNGWIDParam;

    /** 标签键值对，格式为Base64编码的key:value字符串，用于资源标记和分类管理 */
    
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** VPN网关ID，本地VPN网关唯一标识，需处于Running状态且资源可用，单个VPN网关隧道数量受系统上限限制 */
    @NotEmpty
    @OpenAPIParam("VPNGWID")
    private String vPNGWIDParam;


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

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPreSharedKey() {
        return preSharedKeyParam;
    }

    public void setPreSharedKey(String preSharedKeyParam) {
        this.preSharedKeyParam = preSharedKeyParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public List<String> getRemoteSubnets() {
        return remoteSubnetsParam;
    }

    public void setRemoteSubnets(List<String> remoteSubnetsParam) {
        this.remoteSubnetsParam = remoteSubnetsParam;
    }

    public String getRemoteVPNGWID() {
        return remoteVPNGWIDParam;
    }

    public void setRemoteVPNGWID(String remoteVPNGWIDParam) {
        this.remoteVPNGWIDParam = remoteVPNGWIDParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

    public String getVPNGWID() {
        return vPNGWIDParam;
    }

    public void setVPNGWID(String vPNGWIDParam) {
        this.vPNGWIDParam = vPNGWIDParam;
    }

}
