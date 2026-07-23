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

public class VPNTunnelInfo {

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 连接状态，IPSec隧道连接状态，创建/更新/删除中为空 */
    @SerializedName("ConnectState")
    private String connectStateParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 删除时间，秒级Unix时间戳 */
    @SerializedName("DeleteTime")
    private Integer deleteTimeParam;

    /** 租户邮箱，资源所属租户的联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** IKE认证算法，IKE阶段使用的认证算法，取值：md5、sha1、sha256 */
    @SerializedName("IKEAuthenticationAlgorithm")
    private String iKEAuthenticationAlgorithmParam;

    /** IKE DH组，IKE阶段使用的Diffie-Hellman密钥交换组，取值范围：0、1、2、5、14、24（0为历史兼容值） */
    @SerializedName("IKEDhGroup")
    private Integer iKEDhGroupParam;

    /** IKE加密算法，IKE阶段使用的加密算法，取值：3des、aes128、aes192、aes256 */
    @SerializedName("IKEEncryptionAlgorithm")
    private String iKEEncryptionAlgorithmParam;

    /** IKE交换模式，仅当IKEVersion为v1时有效，IKEVersion为v2时为空 */
    @SerializedName("IKEExchangeMode")
    private String iKEExchangeModeParam;

    /** IKE本端标识，IKE协商时本端身份标识，空值表示使用IP地址作为标识 */
    @SerializedName("IKELocalLabel")
    private String iKELocalLabelParam;

    /** IKE对端标识，IKE协商时对端身份标识，空值表示使用IP地址作为标识 */
    @SerializedName("IKERemoteLabel")
    private String iKERemoteLabelParam;

    /** IKE SA生存时间，IKE安全关联的生存时间（秒） */
    @SerializedName("IKESALifetime")
    private Integer iKESALifetimeParam;

    /** IKE协议版本，Internet Key Exchange协议版本，取值：v1、v2 */
    @SerializedName("IKEVersion")
    private String iKEVersionParam;

    /** IPSec认证算法，IPSec阶段使用的认证算法，取值：md5、sha1、sha256 */
    @SerializedName("IPSecAuthenticationAlgorithm")
    private String iPSecAuthenticationAlgorithmParam;

    /** IPSec加密算法，IPSec阶段使用的加密算法，仅当IPSecProtocol为ESP时有效，IPSecProtocol为AH时为空，取值：3des、aes128、aes192、aes256 */
    @SerializedName("IPSecEncryptionAlgorithm")
    private String iPSecEncryptionAlgorithmParam;

    /** IPSec PFS DH组，Perfect Forward Secrecy使用的Diffie-Hellman组，取值范围：0、1、2、5、14、24（0表示不启用PFS） */
    @SerializedName("IPSecPFSDhGroup")
    private Integer iPSecPFSDhGroupParam;

    /** IPSec安全协议，IPSec使用的安全传输协议，取值：AH、ESP */
    @SerializedName("IPSecProtocol")
    private String iPSecProtocolParam;

    /** IPSec SA生存时间，IPSec安全关联的生存时间（秒） */
    @SerializedName("IPSecSALifetime")
    private Integer iPSecSALifetimeParam;

    /** 本端子网ID列表，通过隧道互通的本端子网ID列表 */
    @SerializedName("LocalSubnetIDs")
    private List<String> localSubnetIDsParam;

    /** VPN隧道名称，用于展示资源名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 预共享密钥，IPSec隧道协商使用的预共享密钥 */
    @SerializedName("PreSharedKey")
    private String preSharedKeyParam;

    /** 项目ID，资源所属项目分组 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，资源所属项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 备注，VPN隧道的描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 对端子网CIDR列表，通过隧道互通的对端网段列表 */
    @SerializedName("RemoteSubnets")
    private List<String> remoteSubnetsParam;

    /** 对端网关ID，对端VPN网关唯一标识 */
    @SerializedName("RemoteVPNGWID")
    private String remoteVPNGWIDParam;

    /** 对端网关IP，用于详情和列表展示 */
    @SerializedName("RemoteVPNGWIP")
    private String remoteVPNGWIPParam;

    /** 对端网关名称，用于详情和列表展示 */
    @SerializedName("RemoteVPNGWName")
    private String remoteVPNGWNameParam;

    /** 隧道状态，来自资源状态与底层隧道状态，创建/更新/删除中可能覆盖为资源状态 */
    @SerializedName("State")
    private String stateParam;

    /** 本端子网CIDR列表，用于详情和列表展示 */
    @SerializedName("Subnets")
    private List<String> subnetsParam;

    /** 标签列表，用于资源标记和分类管理 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** VPCID，VPN网关所属VPC */
    @SerializedName("VPCID")
    private String vPCIDParam;

    /** VPN网关ID，本地VPN网关唯一标识 */
    @SerializedName("VPNGWID")
    private String vPNGWIDParam;

    /** 本地VPN网关外网IP，用于详情和列表展示 */
    @SerializedName("VPNGWIP")
    private String vPNGWIPParam;

    /** 本地VPN网关名称，用于详情和列表展示 */
    @SerializedName("VPNGWName")
    private String vPNGWNameParam;

    /** VPN隧道ID，VPN隧道唯一标识 */
    @SerializedName("VPNTunnelID")
    private String vPNTunnelIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getConnectState() {
        return connectStateParam;
    }

    public void setConnectState(String connectStateParam) {
        this.connectStateParam = connectStateParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public Integer getDeleteTime() {
        return deleteTimeParam;
    }

    public void setDeleteTime(Integer deleteTimeParam) {
        this.deleteTimeParam = deleteTimeParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
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

    public String getProjectName() {
        return projectNameParam;
    }

    public void setProjectName(String projectNameParam) {
        this.projectNameParam = projectNameParam;
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

    public String getRemoteVPNGWIP() {
        return remoteVPNGWIPParam;
    }

    public void setRemoteVPNGWIP(String remoteVPNGWIPParam) {
        this.remoteVPNGWIPParam = remoteVPNGWIPParam;
    }

    public String getRemoteVPNGWName() {
        return remoteVPNGWNameParam;
    }

    public void setRemoteVPNGWName(String remoteVPNGWNameParam) {
        this.remoteVPNGWNameParam = remoteVPNGWNameParam;
    }

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public List<String> getSubnets() {
        return subnetsParam;
    }

    public void setSubnets(List<String> subnetsParam) {
        this.subnetsParam = subnetsParam;
    }

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getVPCID() {
        return vPCIDParam;
    }

    public void setVPCID(String vPCIDParam) {
        this.vPCIDParam = vPCIDParam;
    }

    public String getVPNGWID() {
        return vPNGWIDParam;
    }

    public void setVPNGWID(String vPNGWIDParam) {
        this.vPNGWIDParam = vPNGWIDParam;
    }

    public String getVPNGWIP() {
        return vPNGWIPParam;
    }

    public void setVPNGWIP(String vPNGWIPParam) {
        this.vPNGWIPParam = vPNGWIPParam;
    }

    public String getVPNGWName() {
        return vPNGWNameParam;
    }

    public void setVPNGWName(String vPNGWNameParam) {
        this.vPNGWNameParam = vPNGWNameParam;
    }

    public String getVPNTunnelID() {
        return vPNTunnelIDParam;
    }

    public void setVPNTunnelID(String vPNTunnelIDParam) {
        this.vPNTunnelIDParam = vPNTunnelIDParam;
    }

}
