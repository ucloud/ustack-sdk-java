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

public class CreateClusterRequest extends Request {

    /** 审批名称 */
    
    @UCloudStackParam("ApplicationName")
    private String applicationNameParam;

    /** 审批理由 */
    
    @UCloudStackParam("ApplicationReason")
    private String applicationReasonParam;

    /** 计费类型 */
    @NotEmpty
    @UCloudStackParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 计算集群类型 */
    @NotEmpty
    @UCloudStackParam("ComputeclassType")
    private String computeclassTypeParam;

    /** APIServer EIPID */
    
    @UCloudStackParam("EIPID")
    private String eIPIDParam;

    /** 高可用类型 */
    
    @UCloudStackParam("HighAvailability")
    private String highAvailabilityParam;

    /** k8s版本号。可为1.25.0,1.34.9 */
    @NotEmpty
    @UCloudStackParam("K8SVersion")
    private String k8SVersionParam;

    /** 名称 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** Pod子网ID */
    
    @UCloudStackParam("PodSubnetIDs")
    private List<String> podSubnetIDsParam;

    /** 项目组ID */
    
    @UCloudStackParam("ProjectID")
    private String projectIDParam;

    /** 计费数量 */
    @NotEmpty
    @UCloudStackParam("Quantity")
    private Integer quantityParam;

    /** 地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** Service CIDR 或 Serivce 所在子网Id */
    
    @UCloudStackParam("ServiceCIDR")
    private String serviceCIDRParam;

    /** 存储集群类型 */
    @NotEmpty
    @UCloudStackParam("StorageclassType")
    private String storageclassTypeParam;

    /** 子网Id */
    @NotEmpty
    @UCloudStackParam("SubnetID")
    private String subnetIDParam;

    /** 标签键值对 */
    
    @UCloudStackParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** VpcID */
    @NotEmpty
    @UCloudStackParam("VpcID")
    private String vpcIDParam;


    public String getApplicationName() {
        return applicationNameParam;
    }

    public void setApplicationName(String applicationNameParam) {
        this.applicationNameParam = applicationNameParam;
    }

    public String getApplicationReason() {
        return applicationReasonParam;
    }

    public void setApplicationReason(String applicationReasonParam) {
        this.applicationReasonParam = applicationReasonParam;
    }

    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getComputeclassType() {
        return computeclassTypeParam;
    }

    public void setComputeclassType(String computeclassTypeParam) {
        this.computeclassTypeParam = computeclassTypeParam;
    }

    public String getEIPID() {
        return eIPIDParam;
    }

    public void setEIPID(String eIPIDParam) {
        this.eIPIDParam = eIPIDParam;
    }

    public String getHighAvailability() {
        return highAvailabilityParam;
    }

    public void setHighAvailability(String highAvailabilityParam) {
        this.highAvailabilityParam = highAvailabilityParam;
    }

    public String getK8SVersion() {
        return k8SVersionParam;
    }

    public void setK8SVersion(String k8SVersionParam) {
        this.k8SVersionParam = k8SVersionParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public List<String> getPodSubnetIDs() {
        return podSubnetIDsParam;
    }

    public void setPodSubnetIDs(List<String> podSubnetIDsParam) {
        this.podSubnetIDsParam = podSubnetIDsParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public Integer getQuantity() {
        return quantityParam;
    }

    public void setQuantity(Integer quantityParam) {
        this.quantityParam = quantityParam;
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

    public String getServiceCIDR() {
        return serviceCIDRParam;
    }

    public void setServiceCIDR(String serviceCIDRParam) {
        this.serviceCIDRParam = serviceCIDRParam;
    }

    public String getStorageclassType() {
        return storageclassTypeParam;
    }

    public void setStorageclassType(String storageclassTypeParam) {
        this.storageclassTypeParam = storageclassTypeParam;
    }

    public String getSubnetID() {
        return subnetIDParam;
    }

    public void setSubnetID(String subnetIDParam) {
        this.subnetIDParam = subnetIDParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

    public String getVpcID() {
        return vpcIDParam;
    }

    public void setVpcID(String vpcIDParam) {
        this.vpcIDParam = vpcIDParam;
    }

}
