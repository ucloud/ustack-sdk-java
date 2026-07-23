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
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateInstallTaskV2Request extends Request {

    /** 租户ID，必须分配给非管理员租户才能进行装机（CompanyID不能为0或超级管理员ID） */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 磁盘选择器，JSON格式字符串，指定安装目标磁盘，必填，支持by-path、by-id、by-wwn、script四种选择模式 */
    @NotEmpty
    @OpenAPIParam("DiskSelector")
    private String diskSelectorParam;

    /** 主机名，设置安装后的主机名 */
    @NotEmpty
    @OpenAPIParam("Hostname")
    private String hostnameParam;

    /** 镜像ID，clone模式必填，指定克隆源镜像 */
    
    @OpenAPIParam("ImageID")
    private String imageIDParam;

    /** 镜像URL，clone模式必填，指定镜像文件访问地址 */
    
    @OpenAPIParam("ImageURL")
    private String imageURLParam;

    /** 安装模式，指定系统安装方式，clone：克隆模式（从镜像克隆）；kickstart：Kickstart自动化安装，clone模式要求ImageID和ImageURL必填，kickstart模式要求OSMediaID和TemplateID必填 */
    @NotEmpty
    @OpenAPIParam("InstallMode")
    private String installModeParam;

    /** 网络配置，JSON格式字符串，NetworkConfigV2数组，至少配置一个网卡，必填，示例包含物理网卡、Bond、VLAN等多种类型 */
    @NotEmpty
    @OpenAPIParam("Networks")
    private String networksParam;

    /** 操作系统发行版，标识操作系统类型 */
    @NotEmpty
    @OpenAPIParam("OSDistribution")
    private String oSDistributionParam;

    /** 系统镜像ID，kickstart模式必填，指定操作系统ISO镜像 */
    
    @OpenAPIParam("OSMediaID")
    private String oSMediaIDParam;

    /** 操作系统完整名称，包含版本和架构信息 */
    @NotEmpty
    @OpenAPIParam("OSName")
    private String oSNameParam;

    /** 裸金属ID，指定要进行装机操作的裸金属实例 */
    @NotEmpty
    @OpenAPIParam("PMID")
    private String pMIDParam;

    /** 分区模板ID，指定磁盘分区方案，可选 */
    
    @OpenAPIParam("PartitionTemplateID")
    private String partitionTemplateIDParam;

    /** 密码，系统管理员密码，用于系统登录 */
    @NotEmpty
    @OpenAPIParam("Password")
    private String passwordParam;

    /** 安装后脚本，在系统安装完成后执行的自定义脚本，可选 */
    
    @OpenAPIParam("PostInstallScript")
    private String postInstallScriptParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** SSH密钥ID列表，配置SSH公钥认证，可选 */
    
    @OpenAPIParam("SSHKeyIDs")
    private List<String> sSHKeyIDsParam;

    /** SSH公钥列表，直接指定SSH公钥内容，可选 */
    
    @OpenAPIParam("SSHPublicKeys")
    private List<String> sSHPublicKeysParam;

    /** Kickstart模板ID，kickstart模式必填，指定自动化安装模板 */
    
    @OpenAPIParam("TemplateID")
    private String templateIDParam;

    /** 模板变量，JSON格式字符串，用于Kickstart模板渲染时的变量替换 */
    
    @OpenAPIParam("TemplateVars")
    private String templateVarsParam;

    /** 用户名，系统管理员用户名，若不指定则默认为root */
    @NotEmpty
    @OpenAPIParam("Username")
    private String usernameParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getDiskSelector() {
        return diskSelectorParam;
    }

    public void setDiskSelector(String diskSelectorParam) {
        this.diskSelectorParam = diskSelectorParam;
    }

    public String getHostname() {
        return hostnameParam;
    }

    public void setHostname(String hostnameParam) {
        this.hostnameParam = hostnameParam;
    }

    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
    }

    public String getImageURL() {
        return imageURLParam;
    }

    public void setImageURL(String imageURLParam) {
        this.imageURLParam = imageURLParam;
    }

    public String getInstallMode() {
        return installModeParam;
    }

    public void setInstallMode(String installModeParam) {
        this.installModeParam = installModeParam;
    }

    public String getNetworks() {
        return networksParam;
    }

    public void setNetworks(String networksParam) {
        this.networksParam = networksParam;
    }

    public String getOSDistribution() {
        return oSDistributionParam;
    }

    public void setOSDistribution(String oSDistributionParam) {
        this.oSDistributionParam = oSDistributionParam;
    }

    public String getOSMediaID() {
        return oSMediaIDParam;
    }

    public void setOSMediaID(String oSMediaIDParam) {
        this.oSMediaIDParam = oSMediaIDParam;
    }

    public String getOSName() {
        return oSNameParam;
    }

    public void setOSName(String oSNameParam) {
        this.oSNameParam = oSNameParam;
    }

    public String getPMID() {
        return pMIDParam;
    }

    public void setPMID(String pMIDParam) {
        this.pMIDParam = pMIDParam;
    }

    public String getPartitionTemplateID() {
        return partitionTemplateIDParam;
    }

    public void setPartitionTemplateID(String partitionTemplateIDParam) {
        this.partitionTemplateIDParam = partitionTemplateIDParam;
    }

    public String getPassword() {
        return passwordParam;
    }

    public void setPassword(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    public String getPostInstallScript() {
        return postInstallScriptParam;
    }

    public void setPostInstallScript(String postInstallScriptParam) {
        this.postInstallScriptParam = postInstallScriptParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getSSHKeyIDs() {
        return sSHKeyIDsParam;
    }

    public void setSSHKeyIDs(List<String> sSHKeyIDsParam) {
        this.sSHKeyIDsParam = sSHKeyIDsParam;
    }

    public List<String> getSSHPublicKeys() {
        return sSHPublicKeysParam;
    }

    public void setSSHPublicKeys(List<String> sSHPublicKeysParam) {
        this.sSHPublicKeysParam = sSHPublicKeysParam;
    }

    public String getTemplateID() {
        return templateIDParam;
    }

    public void setTemplateID(String templateIDParam) {
        this.templateIDParam = templateIDParam;
    }

    public String getTemplateVars() {
        return templateVarsParam;
    }

    public void setTemplateVars(String templateVarsParam) {
        this.templateVarsParam = templateVarsParam;
    }

    public String getUsername() {
        return usernameParam;
    }

    public void setUsername(String usernameParam) {
        this.usernameParam = usernameParam;
    }

}
