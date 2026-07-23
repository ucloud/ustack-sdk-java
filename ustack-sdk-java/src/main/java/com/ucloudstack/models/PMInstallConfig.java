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

public class PMInstallConfig {

    /** 磁盘选择器 */
    @SerializedName("DiskSelector")
    private DiskSelectorV2 diskSelectorParam;

    /** 主机名 */
    @SerializedName("Hostname")
    private String hostnameParam;

    /** ISO镜像URL */
    @SerializedName("ISOURL")
    private String iSOURLParam;

    /** 镜像ID */
    @SerializedName("ImageID")
    private String imageIDParam;

    /** 镜像URL */
    @SerializedName("ImageURL")
    private String imageURLParam;

    /** 机器ID */
    @SerializedName("MachineID")
    private String machineIDParam;

    /** 机器序列号 */
    @SerializedName("MachineSN")
    private String machineSNParam;

    /** 模式 */
    @SerializedName("Mode")
    private String modeParam;

    /** 网络配置列表 */
    @SerializedName("Networks")
    private List<InstallNetworkConfig> networksParam;

    /** 操作系统发行版 */
    @SerializedName("OSDistribution")
    private String oSDistributionParam;

    /** 系统镜像ID */
    @SerializedName("OSMediaID")
    private String oSMediaIDParam;

    /** 操作系统名称 */
    @SerializedName("OSName")
    private String oSNameParam;

    /** 分区模板ID */
    @SerializedName("PartitionTemplateID")
    private String partitionTemplateIDParam;

    /** 分区模板名称 */
    @SerializedName("PartitionTemplateName")
    private String partitionTemplateNameParam;

    /** 密码 */
    @SerializedName("Password")
    private String passwordParam;

    /** SSH公钥列表 */
    @SerializedName("SSHPublicKeys")
    private List<String> sSHPublicKeysParam;

    /** Kickstart 模板 ID */
    @SerializedName("TemplateID")
    private String templateIDParam;

    /** Kickstart 模板名称 */
    @SerializedName("TemplateName")
    private String templateNameParam;

    /** 用户名 */
    @SerializedName("Username")
    private String usernameParam;


    public DiskSelectorV2 getDiskSelector() {
        return diskSelectorParam;
    }

    public void setDiskSelector(DiskSelectorV2 diskSelectorParam) {
        this.diskSelectorParam = diskSelectorParam;
    }

    public String getHostname() {
        return hostnameParam;
    }

    public void setHostname(String hostnameParam) {
        this.hostnameParam = hostnameParam;
    }

    public String getISOURL() {
        return iSOURLParam;
    }

    public void setISOURL(String iSOURLParam) {
        this.iSOURLParam = iSOURLParam;
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

    public String getMachineID() {
        return machineIDParam;
    }

    public void setMachineID(String machineIDParam) {
        this.machineIDParam = machineIDParam;
    }

    public String getMachineSN() {
        return machineSNParam;
    }

    public void setMachineSN(String machineSNParam) {
        this.machineSNParam = machineSNParam;
    }

    public String getMode() {
        return modeParam;
    }

    public void setMode(String modeParam) {
        this.modeParam = modeParam;
    }

    public List<InstallNetworkConfig> getNetworks() {
        return networksParam;
    }

    public void setNetworks(List<InstallNetworkConfig> networksParam) {
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

    public String getPartitionTemplateID() {
        return partitionTemplateIDParam;
    }

    public void setPartitionTemplateID(String partitionTemplateIDParam) {
        this.partitionTemplateIDParam = partitionTemplateIDParam;
    }

    public String getPartitionTemplateName() {
        return partitionTemplateNameParam;
    }

    public void setPartitionTemplateName(String partitionTemplateNameParam) {
        this.partitionTemplateNameParam = partitionTemplateNameParam;
    }

    public String getPassword() {
        return passwordParam;
    }

    public void setPassword(String passwordParam) {
        this.passwordParam = passwordParam;
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

    public String getTemplateName() {
        return templateNameParam;
    }

    public void setTemplateName(String templateNameParam) {
        this.templateNameParam = templateNameParam;
    }

    public String getUsername() {
        return usernameParam;
    }

    public void setUsername(String usernameParam) {
        this.usernameParam = usernameParam;
    }

}
