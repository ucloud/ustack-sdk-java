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

public class PMInfoV2 {

    /** BMC信息，包含BMC版本、厂商等详细信息 */
    @SerializedName("BMCInfo")
    private String bMCInfoParam;

    /** BMC类型名称，标识硬件厂商的BMC类型（如Dell iDRAC、HP iLO等） */
    @SerializedName("BMCTypeName")
    private String bMCTypeNameParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，租户的显示名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，Unix时间戳（秒） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 自定义监控地址，用于Prometheus等监控系统采集指标，必须是有效的http/https URL且包含Host */
    @SerializedName("CustomMetricsPath")
    private String customMetricsPathParam;

    /** 联系人邮箱地址 */
    @SerializedName("Email")
    private String emailParam;

    /** 资源过期时间，Unix时间戳（秒），到期后资源可能被回收 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 硬件信息，包含CPU、内存、磁盘等硬件配置的JSON格式数据 */
    @SerializedName("HardwareInfo")
    private String hardwareInfoParam;

    /** 主机名，裸金属当前登记的主机名 */
    @SerializedName("Hostname")
    private String hostnameParam;

    /** IPMI管理IP地址，用于带外管理访问 */
    @SerializedName("IPMIIP")
    private String iPMIIPParam;

    /** IPMI密码，用于IPMI身份验证 */
    @SerializedName("IPMIPassword")
    private String iPMIPasswordParam;

    /** IPMI用户名，用于IPMI身份验证 */
    @SerializedName("IPMIUsername")
    private String iPMIUsernameParam;

    /** IP地址列表，裸金属绑定的所有IP地址 */
    @SerializedName("IPs")
    private List<String> iPsParam;

    /** 安装模式，系统安装方式，clone：克隆模式；kickstart：Kickstart自动化安装 */
    @SerializedName("InstallMode")
    private String installModeParam;

    /** 生产厂商，从BMC/IPMI FRU信息采集 */
    @SerializedName("Manufacturer")
    private String manufacturerParam;

    /** 资源名称，长度为1-128个字符，名称只能包含中英文、数字、点（.）、下划线（_）和中划线（-） */
    @SerializedName("Name")
    private String nameParam;

    /** 裸金属ID，由Taishan生成，作为Kunlun的资源标识 */
    @SerializedName("PMID")
    private String pMIDParam;

    /** 产品名称，从BMC/IPMI FRU信息采集 */
    @SerializedName("ProductName")
    private String productNameParam;

    /** 项目ID，用于实现资源的逻辑分组管理 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，项目的显示名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 机架位置，标识裸金属在数据中心的物理位置 */
    @SerializedName("RackLocation")
    private String rackLocationParam;

    /** 资源申请原因，说明申请该资源的用途和目的 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，标识资源所属的物理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符，可为空 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 序列号，从硬件获取的物理机唯一序列号 */
    @SerializedName("SN")
    private String sNParam;

    /** 裸金属状态，表示当前运行状态，Available：可用；Manageable：可管理；Uppering：上架中；UpperFailed：上架失败；Enrolled：已登记；InUse：使用中 */
    @SerializedName("Status")
    private String statusParam;

    /** 统一标签，用于资源标记和分类管理 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，Unix时间戳（秒） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 有效性检查结果，系统对裸金属进行健康检查的结果信息 */
    @SerializedName("ValidityCheckResults")
    private List<String> validityCheckResultsParam;


    public String getBMCInfo() {
        return bMCInfoParam;
    }

    public void setBMCInfo(String bMCInfoParam) {
        this.bMCInfoParam = bMCInfoParam;
    }

    public String getBMCTypeName() {
        return bMCTypeNameParam;
    }

    public void setBMCTypeName(String bMCTypeNameParam) {
        this.bMCTypeNameParam = bMCTypeNameParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getCompanyName() {
        return companyNameParam;
    }

    public void setCompanyName(String companyNameParam) {
        this.companyNameParam = companyNameParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getCustomMetricsPath() {
        return customMetricsPathParam;
    }

    public void setCustomMetricsPath(String customMetricsPathParam) {
        this.customMetricsPathParam = customMetricsPathParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
    }

    public String getHardwareInfo() {
        return hardwareInfoParam;
    }

    public void setHardwareInfo(String hardwareInfoParam) {
        this.hardwareInfoParam = hardwareInfoParam;
    }

    public String getHostname() {
        return hostnameParam;
    }

    public void setHostname(String hostnameParam) {
        this.hostnameParam = hostnameParam;
    }

    public String getIPMIIP() {
        return iPMIIPParam;
    }

    public void setIPMIIP(String iPMIIPParam) {
        this.iPMIIPParam = iPMIIPParam;
    }

    public String getIPMIPassword() {
        return iPMIPasswordParam;
    }

    public void setIPMIPassword(String iPMIPasswordParam) {
        this.iPMIPasswordParam = iPMIPasswordParam;
    }

    public String getIPMIUsername() {
        return iPMIUsernameParam;
    }

    public void setIPMIUsername(String iPMIUsernameParam) {
        this.iPMIUsernameParam = iPMIUsernameParam;
    }

    public List<String> getIPs() {
        return iPsParam;
    }

    public void setIPs(List<String> iPsParam) {
        this.iPsParam = iPsParam;
    }

    public String getInstallMode() {
        return installModeParam;
    }

    public void setInstallMode(String installModeParam) {
        this.installModeParam = installModeParam;
    }

    public String getManufacturer() {
        return manufacturerParam;
    }

    public void setManufacturer(String manufacturerParam) {
        this.manufacturerParam = manufacturerParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPMID() {
        return pMIDParam;
    }

    public void setPMID(String pMIDParam) {
        this.pMIDParam = pMIDParam;
    }

    public String getProductName() {
        return productNameParam;
    }

    public void setProductName(String productNameParam) {
        this.productNameParam = productNameParam;
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

    public String getRackLocation() {
        return rackLocationParam;
    }

    public void setRackLocation(String rackLocationParam) {
        this.rackLocationParam = rackLocationParam;
    }

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
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

    public String getSN() {
        return sNParam;
    }

    public void setSN(String sNParam) {
        this.sNParam = sNParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
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

    public List<String> getValidityCheckResults() {
        return validityCheckResultsParam;
    }

    public void setValidityCheckResults(List<String> validityCheckResultsParam) {
        this.validityCheckResultsParam = validityCheckResultsParam;
    }

}
