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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class HostDeviceInfo {

    /** 绑定类型，设备与虚拟机的关联方式 */
    @SerializedName("AttachedType")
    private String attachedTypeParam;

    /** 绑定虚拟机ID，当前挂载该设备的虚拟机标识 */
    @SerializedName("AttachedVMID")
    private String attachedVMIDParam;

    /** 总线编号，设备在节点上的总线编号 */
    @SerializedName("Bus")
    private Integer busParam;

    /** 租户唯一标识ID，资源归属租户，仅在设备已创建为资源时返回 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，资源归属租户名称，仅在设备已创建为资源时返回 */
    @SerializedName("CompnayName")
    private String compnayNameParam;

    /** 创建时间，资源创建时间的秒级Unix时间戳，仅在设备已创建为资源时返回 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 设备编号，设备在节点上的设备编号 */
    @SerializedName("Device")
    private Integer deviceParam;

    /** 租户邮箱，资源归属租户联系邮箱，仅在设备已创建为资源时返回 */
    @SerializedName("Email")
    private String emailParam;

    /** 外置设备ID，设备资源唯一标识，未创建为资源时可能为空 */
    @SerializedName("HostDeviceID")
    private String hostDeviceIDParam;

    /** 外置设备名称，资源名称，仅在设备已创建为资源时返回 */
    @SerializedName("HostDeviceName")
    private String hostDeviceNameParam;

    /** 设备类型，依据设备模板识别的类型，可能返回USB或GPU，未匹配模板时可能为空 */
    @SerializedName("HostDeviceType")
    private String hostDeviceTypeParam;

    /** 产品ID，物理设备的型号标识码 */
    @SerializedName("ProductID")
    private String productIDParam;

    /** 产品名称，设备模板对应的产品名称，未匹配模板时可能为空 */
    @SerializedName("ProductName")
    private String productNameParam;

    /** 项目ID，资源所属项目标识，仅在设备已创建为资源时返回 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，资源所属项目名称，仅在设备已创建为资源时返回 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，资源状态异常时的失败原因，仅在设备已创建为资源时返回 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 备注信息，资源备注，仅在设备已创建为资源时返回 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 序列号，物理设备的唯一序列号 */
    @SerializedName("Serial")
    private String serialParam;

    /** 设备状态，节点扫描状态可能为Attached、Attaching、Detached、Detaching、UnKnown、Lost；当资源状态非Available时返回资源状态Initializing、Failed、Deleting、Terminating、Deleted、Terminated */
    @SerializedName("Status")
    private String statusParam;

    /** 更新时间，资源更新时间的秒级Unix时间戳，仅在设备已创建为资源时返回 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 厂商ID，物理设备的制造商标识码 */
    @SerializedName("VendorID")
    private String vendorIDParam;

    /** 厂商名称，设备模板对应的厂商名称，未匹配模板时可能为空 */
    @SerializedName("VendorName")
    private String vendorNameParam;


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

    public Integer getBus() {
        return busParam;
    }

    public void setBus(Integer busParam) {
        this.busParam = busParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getCompnayName() {
        return compnayNameParam;
    }

    public void setCompnayName(String compnayNameParam) {
        this.compnayNameParam = compnayNameParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public Integer getDevice() {
        return deviceParam;
    }

    public void setDevice(Integer deviceParam) {
        this.deviceParam = deviceParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getHostDeviceID() {
        return hostDeviceIDParam;
    }

    public void setHostDeviceID(String hostDeviceIDParam) {
        this.hostDeviceIDParam = hostDeviceIDParam;
    }

    public String getHostDeviceName() {
        return hostDeviceNameParam;
    }

    public void setHostDeviceName(String hostDeviceNameParam) {
        this.hostDeviceNameParam = hostDeviceNameParam;
    }

    public String getHostDeviceType() {
        return hostDeviceTypeParam;
    }

    public void setHostDeviceType(String hostDeviceTypeParam) {
        this.hostDeviceTypeParam = hostDeviceTypeParam;
    }

    public String getProductID() {
        return productIDParam;
    }

    public void setProductID(String productIDParam) {
        this.productIDParam = productIDParam;
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

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
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

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getVendorID() {
        return vendorIDParam;
    }

    public void setVendorID(String vendorIDParam) {
        this.vendorIDParam = vendorIDParam;
    }

    public String getVendorName() {
        return vendorNameParam;
    }

    public void setVendorName(String vendorNameParam) {
        this.vendorNameParam = vendorNameParam;
    }

}
