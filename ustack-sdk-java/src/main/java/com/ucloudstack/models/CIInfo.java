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

public class CIInfo {

    /** 绑定资源ID，虚拟机关联资源标识 */
    @SerializedName("BindResourceID")
    private String bindResourceIDParam;

    /** 绑定资源名称，虚拟机关联资源名称 */
    @SerializedName("BindResourceName")
    private String bindResourceNameParam;

    /** 绑定资源类型，虚拟机关联的资源类型 */
    @SerializedName("BindResourceType")
    private String bindResourceTypeParam;

    /** CPU核数，虚拟机分配的vCPU数量 */
    @SerializedName("CPU")
    private Integer cPUParam;

    /** 是否可取消迁移，当前迁移是否允许取消 */
    @SerializedName("CanMigrateAbort")
    private Boolean canMigrateAbortParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 所属租户邮箱，资源归属租户的联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** GPU数量，虚拟机分配的GPU数量 */
    @SerializedName("GPU")
    private Integer gPUParam;

    /** GPU规格，物理GPU规格名称 */
    @SerializedName("GPUMdevName")
    private String gPUMdevNameParam;

    /** 物理机ID，虚拟机所在宿主机标识 */
    @SerializedName("HostID")
    private String hostIDParam;

    /** 物理机IP地址，宿主机管理IP地址 */
    @SerializedName("HostIP")
    private String hostIPParam;

    /** 物理机IPv6地址，宿主机管理IPv6地址 */
    @SerializedName("HostIPv6")
    private String hostIPv6Param;

    /** 镜像ID，虚拟机启动镜像标识 */
    @SerializedName("ImageID")
    private String imageIDParam;

    /** 镜像名称，虚拟机启动镜像名称 */
    @SerializedName("ImageName")
    private String imageNameParam;

    /** 内网IP地址，虚拟机内网地址，优先返回IPv4地址 */
    @SerializedName("InternalIP")
    private String internalIPParam;

    /** vGPU规格，虚拟GPU配置规格名称 */
    @SerializedName("MdevName")
    private String mdevNameParam;

    /** 内存大小，虚拟机分配内存容量，单位MiB */
    @SerializedName("Memory")
    private Integer memoryParam;

    /** 虚拟机名称，宿主机上运行的虚拟机名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 地域ID，虚拟机所属地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的人性化显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 虚拟机描述，资源用途说明 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 集群别名，虚拟机所在计算集群的自定义名称 */
    @SerializedName("SetAlias")
    private String setAliasParam;

    /** 计算集群架构，虚拟机所在集群CPU架构 */
    @SerializedName("SetArch")
    private String setArchParam;

    /** 计算集群ID，虚拟机所在计算集群标识 */
    @SerializedName("SetID")
    private String setIDParam;

    /** 集群类型，虚拟机所在计算集群的类型标识 */
    @SerializedName("SetType")
    private String setTypeParam;

    /** 运行状态，虚拟机当前状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 虚拟机用途，业务用途说明 */
    @SerializedName("Usage")
    private String usageParam;

    /** vCPU绑定节点，虚拟机绑定的物理节点 */
    @SerializedName("VCPUBindingNode")
    private String vCPUBindingNodeParam;

    /** vGPUID，虚拟GPU实例标识 */
    @SerializedName("VGPUID")
    private String vGPUIDParam;

    /** 虚拟机ID，虚拟机唯一标识 */
    @SerializedName("VMID")
    private String vMIDParam;

    /** 计算集群别名，虚拟机所在计算集群的人性化显示名称 */
    @SerializedName("VMTypeAlias")
    private String vMTypeAliasParam;


    public String getBindResourceID() {
        return bindResourceIDParam;
    }

    public void setBindResourceID(String bindResourceIDParam) {
        this.bindResourceIDParam = bindResourceIDParam;
    }

    public String getBindResourceName() {
        return bindResourceNameParam;
    }

    public void setBindResourceName(String bindResourceNameParam) {
        this.bindResourceNameParam = bindResourceNameParam;
    }

    public String getBindResourceType() {
        return bindResourceTypeParam;
    }

    public void setBindResourceType(String bindResourceTypeParam) {
        this.bindResourceTypeParam = bindResourceTypeParam;
    }

    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
    }

    public Boolean getCanMigrateAbort() {
        return canMigrateAbortParam;
    }

    public void setCanMigrateAbort(Boolean canMigrateAbortParam) {
        this.canMigrateAbortParam = canMigrateAbortParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
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

    public Integer getGPU() {
        return gPUParam;
    }

    public void setGPU(Integer gPUParam) {
        this.gPUParam = gPUParam;
    }

    public String getGPUMdevName() {
        return gPUMdevNameParam;
    }

    public void setGPUMdevName(String gPUMdevNameParam) {
        this.gPUMdevNameParam = gPUMdevNameParam;
    }

    public String getHostID() {
        return hostIDParam;
    }

    public void setHostID(String hostIDParam) {
        this.hostIDParam = hostIDParam;
    }

    public String getHostIP() {
        return hostIPParam;
    }

    public void setHostIP(String hostIPParam) {
        this.hostIPParam = hostIPParam;
    }

    public String getHostIPv6() {
        return hostIPv6Param;
    }

    public void setHostIPv6(String hostIPv6Param) {
        this.hostIPv6Param = hostIPv6Param;
    }

    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
    }

    public String getImageName() {
        return imageNameParam;
    }

    public void setImageName(String imageNameParam) {
        this.imageNameParam = imageNameParam;
    }

    public String getInternalIP() {
        return internalIPParam;
    }

    public void setInternalIP(String internalIPParam) {
        this.internalIPParam = internalIPParam;
    }

    public String getMdevName() {
        return mdevNameParam;
    }

    public void setMdevName(String mdevNameParam) {
        this.mdevNameParam = mdevNameParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
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

    public String getSetAlias() {
        return setAliasParam;
    }

    public void setSetAlias(String setAliasParam) {
        this.setAliasParam = setAliasParam;
    }

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getUsage() {
        return usageParam;
    }

    public void setUsage(String usageParam) {
        this.usageParam = usageParam;
    }

    public String getVCPUBindingNode() {
        return vCPUBindingNodeParam;
    }

    public void setVCPUBindingNode(String vCPUBindingNodeParam) {
        this.vCPUBindingNodeParam = vCPUBindingNodeParam;
    }

    public String getVGPUID() {
        return vGPUIDParam;
    }

    public void setVGPUID(String vGPUIDParam) {
        this.vGPUIDParam = vGPUIDParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

    public String getVMTypeAlias() {
        return vMTypeAliasParam;
    }

    public void setVMTypeAlias(String vMTypeAliasParam) {
        this.vMTypeAliasParam = vMTypeAliasParam;
    }

}
