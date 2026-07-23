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

public class UpdatePMV2Request extends Request {

    /** BMC类型名称，标识硬件厂商的BMC类型，可选 */
    
    @UCloudStackParam("BMCTypeName")
    private String bMCTypeNameParam;

    /** 自定义监控地址，用于Prometheus等监控系统采集指标，可选 */
    
    @UCloudStackParam("CustomMetricsPath")
    private String customMetricsPathParam;

    /** IPMI管理IP地址，用于带外管理访问，可选 */
    
    @UCloudStackParam("IPMIIP")
    private String iPMIIPParam;

    /** IPMI密码，用于IPMI身份验证，可选 */
    
    @UCloudStackParam("IPMIPassword")
    private String iPMIPasswordParam;

    /** IPMI用户名，用于IPMI身份验证，可选 */
    
    @UCloudStackParam("IPMIUsername")
    private String iPMIUsernameParam;

    /** 生产厂商，从BMC/IPMI FRU信息采集，可选 */
    
    @UCloudStackParam("Manufacturer")
    private String manufacturerParam;

    /** 资源名称，长度为1-128个字符，名称只能包含中英文、数字、点（.）、下划线（_）和中划线（-），可选，若不指定则不更新 */
    
    @UCloudStackParam("Name")
    private String nameParam;

    /** 裸金属ID，指定要更新的裸金属实例 */
    @NotEmpty
    @UCloudStackParam("PMID")
    private String pMIDParam;

    /** 产品名称，从BMC/IPMI FRU信息采集，可选 */
    
    @UCloudStackParam("ProductName")
    private String productNameParam;

    /** 机架位置，标识裸金属在数据中心的物理位置，可选 */
    
    @UCloudStackParam("RackLocation")
    private String rackLocationParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符，可选，若不指定则不更新 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;


    public String getBMCTypeName() {
        return bMCTypeNameParam;
    }

    public void setBMCTypeName(String bMCTypeNameParam) {
        this.bMCTypeNameParam = bMCTypeNameParam;
    }

    public String getCustomMetricsPath() {
        return customMetricsPathParam;
    }

    public void setCustomMetricsPath(String customMetricsPathParam) {
        this.customMetricsPathParam = customMetricsPathParam;
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

    public String getRackLocation() {
        return rackLocationParam;
    }

    public void setRackLocation(String rackLocationParam) {
        this.rackLocationParam = rackLocationParam;
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

}
