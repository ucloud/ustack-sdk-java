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

public class CreateLBRequest extends Request {

    /** 审批名称，用于标识此次资源申请的审批流程 */
    
    @UCloudStackParam("ApplicationName")
    private String applicationNameParam;

    /** 审批理由，说明申请此负载均衡资源的业务原因 */
    
    @UCloudStackParam("ApplicationReason")
    private String applicationReasonParam;

    /** CPU核数，指定负载均衡实例的CPU规格，取值范围：1、2、4、8，若不指定则默认为2核 */
    
    @UCloudStackParam("CPU")
    private Integer cPUParam;

    /** 计费类型，用于指定计费模式，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费）；兼容历史值：hour、month、year，别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR，hour->HOUR、month->MONTH、year->YEAR */
    @NotEmpty
    @UCloudStackParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 存储集群类型，指定负载均衡实例使用的存储集群，若不指定则系统自动选择最空闲的存储集群 */
    
    @UCloudStackParam("DiskSetType")
    private String diskSetTypeParam;

    /** 弹性公网IP的ID，为WAN类型负载均衡提供公网访问能力；LBType为WAN时必填且EIP必须未绑定 */
    
    @UCloudStackParam("EIPID")
    private String eIPIDParam;

    /** 高可用模式，指定负载均衡部署架构；取值ActiveStandy（双活高可用）、Standalone（单机模式） */
    
    @UCloudStackParam("HighAvailability")
    private String highAvailabilityParam;

    /** 负载均衡类型，决定负载均衡的网络访问范围；取值LAN（内网，仅VPC内部访问）、WAN（外网，可从公网访问） */
    @NotEmpty
    @UCloudStackParam("LBType")
    private String lBTypeParam;

    /** 负载均衡名称，用于标识负载均衡，支持中文、英文字母、数字、点、下划线和中划线，长度1-128字符 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** 项目ID，负载均衡所属项目分组标识，未传时尝试分配默认项目 */
    
    @UCloudStackParam("ProjectID")
    private String projectIDParam;

    /** 计费数量，用于指定购买时长的数量；按月/年计费时表示购买的月/年数 */
    @NotEmpty
    @UCloudStackParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注信息，长度0-100字符，禁止http://或https://等非法字符 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 安全组ID，用于控制负载均衡的网络访问规则，当LBType为WAN时必填，LBType为LAN时必须为空 */
    
    @UCloudStackParam("SGID")
    private String sGIDParam;

    /** 子网ID，指定负载均衡所属的子网，决定负载均衡的内网IP地址段 */
    @NotEmpty
    @UCloudStackParam("SubnetID")
    private String subnetIDParam;

    /** 标签键值对，格式为Base64编码的key:value字符串，用于资源标记和分类管理 */
    
    @UCloudStackParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** 删除保护开关，用于防止误删除；0表示开启删除保护，1表示关闭删除保护 */
    
    @UCloudStackParam("TerminationPolicy")
    private Integer terminationPolicyParam;

    /** 计算集群类型，指定负载均衡实例运行的计算集群 */
    @NotEmpty
    @UCloudStackParam("VMType")
    private String vMTypeParam;

    /** VPCID，指定负载均衡所属的私有网络 */
    @NotEmpty
    @UCloudStackParam("VPCID")
    private String vPCIDParam;


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

    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
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

    public String getDiskSetType() {
        return diskSetTypeParam;
    }

    public void setDiskSetType(String diskSetTypeParam) {
        this.diskSetTypeParam = diskSetTypeParam;
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

    public String getLBType() {
        return lBTypeParam;
    }

    public void setLBType(String lBTypeParam) {
        this.lBTypeParam = lBTypeParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
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

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
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

    public Integer getTerminationPolicy() {
        return terminationPolicyParam;
    }

    public void setTerminationPolicy(Integer terminationPolicyParam) {
        this.terminationPolicyParam = terminationPolicyParam;
    }

    public String getVMType() {
        return vMTypeParam;
    }

    public void setVMType(String vMTypeParam) {
        this.vMTypeParam = vMTypeParam;
    }

    public String getVPCID() {
        return vPCIDParam;
    }

    public void setVPCID(String vPCIDParam) {
        this.vPCIDParam = vPCIDParam;
    }

}
