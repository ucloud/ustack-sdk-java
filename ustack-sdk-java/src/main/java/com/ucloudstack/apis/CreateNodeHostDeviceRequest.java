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

public class CreateNodeHostDeviceRequest extends Request {

    /** 总线编号，设备在节点上的总线编号，来源于扫描结果 */
    @NotEmpty
    @OpenAPIParam("Bus")
    private Integer busParam;

    /** 租户唯一标识ID，标识请求发起租户，未指定TargetCompanyID时作为资源归属租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 设备编号，设备在节点上的设备编号，来源于扫描结果 */
    @NotEmpty
    @OpenAPIParam("Device")
    private Integer deviceParam;

    /** 外置设备名称，用于创建资源名称，长度1-128个字符，仅支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("HostDeviceName")
    private String hostDeviceNameParam;

    /** 设备类型，用于标识外置设备类型，如USB、GPU */
    
    @OpenAPIParam("HostDeviceType")
    private String hostDeviceTypeParam;

    /** 物理机节点ID，设备所在物理机标识，必须为计算授权通过的节点 */
    @NotEmpty
    @OpenAPIParam("NodeID")
    private String nodeIDParam;

    /** 产品名称，用于设备模板匹配或创建，两者（VendorName与ProductName）都为空则不创建模板 */
    
    @OpenAPIParam("ProductName")
    private String productNameParam;

    /** 项目ID，资源所属的项目分组标识，为空则不关联项目 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，用于标识外置设备资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注信息，用于补充说明，需符合uremark规则（0-100字符，禁止包含<script>/javascript） */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 目标租户ID，指定资源归属的目标租户，填写后覆盖CompanyID */
    
    @OpenAPIParam("TargetCompanyID")
    private Integer targetCompanyIDParam;

    /** 厂商名称，用于设备模板匹配或创建，两者（VendorName与ProductName）都为空则不创建模板 */
    
    @OpenAPIParam("VendorName")
    private String vendorNameParam;


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

    public Integer getDevice() {
        return deviceParam;
    }

    public void setDevice(Integer deviceParam) {
        this.deviceParam = deviceParam;
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

    public String getNodeID() {
        return nodeIDParam;
    }

    public void setNodeID(String nodeIDParam) {
        this.nodeIDParam = nodeIDParam;
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

    public Integer getTargetCompanyID() {
        return targetCompanyIDParam;
    }

    public void setTargetCompanyID(Integer targetCompanyIDParam) {
        this.targetCompanyIDParam = targetCompanyIDParam;
    }

    public String getVendorName() {
        return vendorNameParam;
    }

    public void setVendorName(String vendorNameParam) {
        this.vendorNameParam = vendorNameParam;
    }

}
