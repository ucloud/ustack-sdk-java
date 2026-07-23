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

public class USBInfo {

    /** 加载类型，取值Passthrough、redir */
    @SerializedName("AttachedType")
    private String attachedTypeParam;

    /** 已加载的虚拟机ID，当状态为Attached时有效 */
    @SerializedName("AttachedVMID")
    private String attachedVMIDParam;

    /** 产品类型，USB设备类型 */
    @SerializedName("Class")
    private String classParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，资源归属租户的可读名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 计算集群ID，USB设备所在计算集群标识 */
    @SerializedName("ComputeSetID")
    private String computeSetIDParam;

    /** 创建时间，USB设备纳管的秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，归属租户的联系电子邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 宿主机IP，USB设备所在宿主机IP */
    @SerializedName("HostIP")
    private String hostIPParam;

    /** 设备名称，USB设备在平台中的显示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 产品名称，USB设备产品名称 */
    @SerializedName("Product")
    private String productParam;

    /** 项目ID，资源所属的项目分组标识 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，资源归属项目的显示名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 加载失败原因，USB设备加载失败时的错误说明 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，USB设备所属的地理标识 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的人性化显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注信息，USB设备的补充说明 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 序列号，USB设备的硬件序列号 */
    @SerializedName("Serial")
    private String serialParam;

    /** 加载状态，取值Attached、Detached、Lost */
    @SerializedName("Status")
    private String statusParam;

    /** USB设备ID，USB设备资源标识 */
    @SerializedName("USBDeviceID")
    private String uSBDeviceIDParam;

    /** 厂商名称，USB设备厂商名称 */
    @SerializedName("Vendor")
    private String vendorParam;

    /** USB协议版本 */
    @SerializedName("Version")
    private String versionParam;


    public String getAttachedType() {
        return attachedTypeParam;
    }

    public void setAttachedType(String attachedTypeParam) {
        this.attachedTypeParam = attachedTypeParam;
    }

    public String getAttachedVMID() {
        return attachedVMIDParam;
    }

    public void setAttachedVMID(String attachedVMIDParam) {
        this.attachedVMIDParam = attachedVMIDParam;
    }

    public String getClazz() {
        return classParam;
    }

    public void setClazz(String classParam) {
        this.classParam = classParam;
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

    public String getComputeSetID() {
        return computeSetIDParam;
    }

    public void setComputeSetID(String computeSetIDParam) {
        this.computeSetIDParam = computeSetIDParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getHostIP() {
        return hostIPParam;
    }

    public void setHostIP(String hostIPParam) {
        this.hostIPParam = hostIPParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getProduct() {
        return productParam;
    }

    public void setProduct(String productParam) {
        this.productParam = productParam;
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

    public String getRegionAlias() {
        return regionAliasParam;
    }

    public void setRegionAlias(String regionAliasParam) {
        this.regionAliasParam = regionAliasParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getSerial() {
        return serialParam;
    }

    public void setSerial(String serialParam) {
        this.serialParam = serialParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getUSBDeviceID() {
        return uSBDeviceIDParam;
    }

    public void setUSBDeviceID(String uSBDeviceIDParam) {
        this.uSBDeviceIDParam = uSBDeviceIDParam;
    }

    public String getVendor() {
        return vendorParam;
    }

    public void setVendor(String vendorParam) {
        this.vendorParam = vendorParam;
    }

    public String getVersion() {
        return versionParam;
    }

    public void setVersion(String versionParam) {
        this.versionParam = versionParam;
    }

}
