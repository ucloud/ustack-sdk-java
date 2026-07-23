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

public class VMInfo {

    /** USB列表，虚拟机挂载的USB设备ID */
    @SerializedName("AttachedUSBIDs")
    private List<String> attachedUSBIDsParam;

    /** 基础镜像名称，用于创建虚拟机的源镜像名称 */
    @SerializedName("BasicImageName")
    private String basicImageNameParam;

    /** 引导顺序，可选字段，支持：hd（硬盘），cdrom（光驱），network（网络） */
    @SerializedName("BootDevices")
    private List<String> bootDevicesParam;

    /** 引导方式，虚拟机的系统引导协议 */
    @SerializedName("BootloaderType")
    private String bootloaderTypeParam;

    /** 光驱列表，挂载到虚拟机的光驱详细信息 */
    @SerializedName("CDROMInfos")
    private List<VmCDROMInfo> cDROMInfosParam;

    /** 核心数，虚拟机的vCPU核心数量 */
    @SerializedName("CPU")
    private Integer cPUParam;

    /** CPU每个插槽内核数，可选字段，默认等于CPU */
    @SerializedName("CPUCoresPerSocket")
    private Integer cPUCoresPerSocketParam;

    /** 是否隐藏虚拟化标记 */
    @SerializedName("CPUHypervisorDisable")
    private Boolean cPUHypervisorDisableParam;

    /** CPU频率限制百分比，可选字段，默认100% */
    @SerializedName("CPULimitPercent")
    private Integer cPULimitPercentParam;

    /** CPU模式，虚拟机的CPU模拟方式 */
    @SerializedName("CPUMode")
    private String cPUModeParam;

    /** CPU型号，虚拟机的CPU处理器型号 */
    @SerializedName("CPUModel")
    private String cPUModelParam;

    /** 集群通用CPU，标识CPU型号是否为集群兼容模式 */
    @SerializedName("CPUModelInSetIntersection")
    private Boolean cPUModelInSetIntersectionParam;

    /** 期望集群通用CPU，用户指定是否使用集群兼容模式 */
    @SerializedName("CPUModelInSetIntersectionSpec")
    private Boolean cPUModelInSetIntersectionSpecParam;

    /** 期望CPU型号，用户指定的预期CPU型号 */
    @SerializedName("CPUModelSpec")
    private String cPUModelSpecParam;

    /** CPU优先级，取值：Normal，High （高），可选字段，默认Normal */
    @SerializedName("CPUPriority")
    private String cPUPriorityParam;

    /** CPU利用率，10分钟平均CPU使用百分比 */
    @SerializedName("CPUUtilization")
    private Double cPUUtilizationParam;

    /** 是否可登录，标识虚拟机操作系统是否已就绪可供登录 */
    @SerializedName("CanLogin")
    private Boolean canLoginParam;

    /** 迁移/快照可取消，标识当前是否处于可取消的迁移状态 */
    @SerializedName("CanMigrateAbort")
    private Boolean canMigrateAbortParam;

    /** 计费类型，资源的计费模式状态 */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** Cloud-Init启用，标识是否已启用Cloud-Init */
    @SerializedName("CloudInitEnabled")
    private Boolean cloudInitEnabledParam;

    /** Cloud-Init运行中，标识Cloud-Init是否正在执行 */
    @SerializedName("CloudInitRunning")
    private Boolean cloudInitRunningParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，资源归属租户的可读名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，资源首次创建的秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** DNS配置，虚拟机使用的DNS服务器列表 */
    @SerializedName("DNS")
    private String dNSParam;

    /** DNS模式，DNS配置的分配方式，Auto-自动分配，Manual-手动指定 */
    @SerializedName("DNSMode")
    private String dNSModeParam;

    /** 磁盘缓存模式，当前生效的磁盘I/O缓存策略 */
    @SerializedName("DiskCacheMode")
    private String diskCacheModeParam;

    /** 磁盘列表，挂载到虚拟机的磁盘详细信息 */
    @SerializedName("DiskInfos")
    private List<VmDiskInfo> diskInfosParam;

    /** 租户邮箱，归属租户的联系电子邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 过期时间，资源的到期秒级Unix时间戳 */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 扁平网络网段，虚拟机绑定的扁平网络CIDR */
    @SerializedName("FlatNetwork")
    private String flatNetworkParam;

    /** 扁平网络ID，虚拟机绑定的扁平网络标识 */
    @SerializedName("FlatNetworkID")
    private String flatNetworkIDParam;

    /** 扁平网络名称，虚拟机绑定的扁平网络显示名 */
    @SerializedName("FlatNetworkName")
    private String flatNetworkNameParam;

    /** GPU数量，挂载的物理GPU数量 */
    @SerializedName("GPU")
    private Integer gPUParam;

    /** GPU绑定启用，标识是否已启用GPU绑定优化 */
    @SerializedName("GPUBindingEnabled")
    private Boolean gPUBindingEnabledParam;

    /** GPU规格，挂载的物理GPU型号 */
    @SerializedName("GPUMdevName")
    private String gPUMdevNameParam;

    /** GPU类型，虚拟机挂载的GPU资源类型 */
    @SerializedName("GPUType")
    private String gPUTypeParam;

    /** 高可用模式，虚拟机的高可用策略配置 */
    @SerializedName("HighAvailability")
    private String highAvailabilityParam;

    /** 宿主机IP，虚拟机运行所在的物理机IP */
    @SerializedName("HostIP")
    private String hostIPParam;

    /** 宿主机UUID，物理主机的唯一标识符 */
    @SerializedName("HostUUID")
    private String hostUUIDParam;

    /** 主机名称，虚拟机内部的Hostname */
    @SerializedName("Hostname")
    private String hostnameParam;

    /** 空余的可热插拔pci插槽数量 */
    @SerializedName("HotPlugPCISlotAvailable")
    private Integer hotPlugPCISlotAvailableParam;

    /** 隔离组ID列表，虚拟机加入的物理隔离组 */
    @SerializedName("IGIDs")
    private List<String> iGIDsParam;

    /** IP列表，虚拟机的网络IP配置信息 */
    @SerializedName("IPInfos")
    private List<IPInfo> iPInfosParam;

    /** IPv4出口，绑定的IPv4弹性IP标识 */
    @SerializedName("IPv4OutputName")
    private String iPv4OutputNameParam;

    /** IPv6出口，绑定的IPv6弹性IP标识 */
    @SerializedName("IPv6OutputName")
    private String iPv6OutputNameParam;

    /** ISO插槽配额，配置的ISO挂载插槽数量 */
    @SerializedName("ISOTotalSpec")
    private Integer iSOTotalSpecParam;

    /** ISO插槽状态，当前实际可用的ISO插槽数量 */
    @SerializedName("ISOTotalStatus")
    private Integer iSOTotalStatusParam;

    /** 镜像ID，创建虚拟机所使用的镜像标识 */
    @SerializedName("ImageID")
    private String imageIDParam;

    /** ISO来源，标识虚拟机是否由ISO镜像创建 */
    @SerializedName("IsFromISO")
    private Boolean isFromISOParam;

    /** vGPU规格，挂载的虚拟GPU配置规格 */
    @SerializedName("MdevName")
    private String mdevNameParam;

    /** 内存利用率，10分钟平均内存使用百分比 */
    @SerializedName("MemUsage")
    private Double memUsageParam;

    /** 内存容量，虚拟机的内存大小，单位：MiB */
    @SerializedName("Memory")
    private Integer memoryParam;

    /** 网卡列表，挂载到虚拟机的网卡详细信息 */
    @SerializedName("NICInfos")
    private List<VmNICInfo> nICInfosParam;

    /** 虚拟机名称，自定义的云主机实例标识 */
    @SerializedName("Name")
    private String nameParam;

    /** 网络类型，虚拟机网络接入类型 */
    @SerializedName("NetworkType")
    private String networkTypeParam;

    /** 系统名称，操作系统的完整显示名称 */
    @SerializedName("OSName")
    private String oSNameParam;

    /** 系统类型，操作系统的核心分类 */
    @SerializedName("OSType")
    private String oSTypeParam;

    /** 待生效配置，需要重启才能生效的变更项 */
    @SerializedName("PendingChanges")
    private List<PendingChange> pendingChangesParam;

    /** 项目ID，资源所属的项目分组标识 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，资源归属项目的显示名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** QGA启用，标识是否已启用QEMU Guest Agent */
    @SerializedName("QGAEnabled")
    private Boolean qGAEnabledParam;

    /** QGA运行中，标识QEMU Guest Agent是否在线 */
    @SerializedName("QGARunning")
    private Boolean qGARunningParam;

    /** 失败原因，虚拟机创建或操作失败时的错误原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，资源所属的地理标识 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的人性化显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注信息，对虚拟机资源的补充说明 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 集群架构，计算集群的CPU指令集架构 */
    @SerializedName("SetArch")
    private String setArchParam;

    /** 集群ID，计算集群的唯一标识符 */
    @SerializedName("SetID")
    private String setIDParam;

    /** 密码已设，标识虚拟机是否已配置管理员密码 */
    @SerializedName("SetPassword")
    private Boolean setPasswordParam;

    /** 空间利用率，系统盘当前空间使用百分比 */
    @SerializedName("SpaceUsage")
    private Double spaceUsageParam;

    /** 运行状态，虚拟机当前的生命周期状态 */
    @SerializedName("State")
    private String stateParam;

    /** 处理进度，当前异步操作的完成百分比 */
    @SerializedName("StatusProcessProgress")
    private Double statusProcessProgressParam;

    /** 子网ID，虚拟机所属的VPC子网标识 */
    @SerializedName("SubnetID")
    private String subnetIDParam;

    /** 子网名称，虚拟机所属子网的显示名称 */
    @SerializedName("SubnetName")
    private String subnetNameParam;

    /** 热插拔支持，标识是否支持设备热插拔 */
    @SerializedName("SupportHotplug")
    private Boolean supportHotplugParam;

    /** 标签列表，资源的分类标记信息 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 实例UUID，虚拟机的底层实例唯一标识 */
    @SerializedName("UUID")
    private String uUIDParam;

    /** 更新时间，资源末次变更的秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** Cloud-Init脚本，即UserData配置内容 */
    @SerializedName("UserData")
    private String userDataParam;

    /** 降级允许，标识vCPU绑定在迁移时是否允许降级 */
    @SerializedName("VCPUBindingDegrandable")
    private Boolean vCPUBindingDegrandableParam;

    /** vCPU绑定详情，vCPU与物理CPU的具体绑定关系 */
    @SerializedName("VCPUBindingInfos")
    private List<VCPUBinding> vCPUBindingInfosParam;

    /** vCPU绑定节点，vCPU所在的物理NUMA节点 */
    @SerializedName("VCPUBindingNode")
    private String vCPUBindingNodeParam;

    /** vGPUID，挂载的虚拟GPU实例标识 */
    @SerializedName("VGPUID")
    private String vGPUIDParam;

    /** 虚拟机ID，云主机实例的唯一标识符 */
    @SerializedName("VMID")
    private String vMIDParam;

    /** NUMA信息，虚拟机的NUMA拓扑详情 */
    @SerializedName("VMNumaInfos")
    private List<VMNumaInfo> vMNumaInfosParam;

    /** 快照列表，虚拟机的快照历史信息 */
    @SerializedName("VMSPInfos")
    private List<VMSPInfo> vMSPInfosParam;

    /** 计算集群类型，虚拟机所属的物理资源集群 */
    @SerializedName("VMType")
    private String vMTypeParam;

    /** 集群别名，计算集群的人性化显示名称 */
    @SerializedName("VMTypeAlias")
    private String vMTypeAliasParam;

    /** VPCID，虚拟机所属的专有网络标识 */
    @SerializedName("VPCID")
    private String vPCIDParam;

    /** VPC名称，虚拟机所属VPC的显示名称 */
    @SerializedName("VPCName")
    private String vPCNameParam;

    /** WAN网络配置，当前虚拟机的结构化WAN网卡及IP配置；仅回显直绑WAN网卡及其IP，不包含NAT出口 */
    @SerializedName("WANNetworkConfig")
    private WANNetworkConfig wANNetworkConfigParam;


    public List<String> getAttachedUSBIDs() {
        return attachedUSBIDsParam;
    }

    public void setAttachedUSBIDs(List<String> attachedUSBIDsParam) {
        this.attachedUSBIDsParam = attachedUSBIDsParam;
    }

    public String getBasicImageName() {
        return basicImageNameParam;
    }

    public void setBasicImageName(String basicImageNameParam) {
        this.basicImageNameParam = basicImageNameParam;
    }

    public List<String> getBootDevices() {
        return bootDevicesParam;
    }

    public void setBootDevices(List<String> bootDevicesParam) {
        this.bootDevicesParam = bootDevicesParam;
    }

    public String getBootloaderType() {
        return bootloaderTypeParam;
    }

    public void setBootloaderType(String bootloaderTypeParam) {
        this.bootloaderTypeParam = bootloaderTypeParam;
    }

    public List<VmCDROMInfo> getCDROMInfos() {
        return cDROMInfosParam;
    }

    public void setCDROMInfos(List<VmCDROMInfo> cDROMInfosParam) {
        this.cDROMInfosParam = cDROMInfosParam;
    }

    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
    }

    public Integer getCPUCoresPerSocket() {
        return cPUCoresPerSocketParam;
    }

    public void setCPUCoresPerSocket(Integer cPUCoresPerSocketParam) {
        this.cPUCoresPerSocketParam = cPUCoresPerSocketParam;
    }

    public Boolean getCPUHypervisorDisable() {
        return cPUHypervisorDisableParam;
    }

    public void setCPUHypervisorDisable(Boolean cPUHypervisorDisableParam) {
        this.cPUHypervisorDisableParam = cPUHypervisorDisableParam;
    }

    public Integer getCPULimitPercent() {
        return cPULimitPercentParam;
    }

    public void setCPULimitPercent(Integer cPULimitPercentParam) {
        this.cPULimitPercentParam = cPULimitPercentParam;
    }

    public String getCPUMode() {
        return cPUModeParam;
    }

    public void setCPUMode(String cPUModeParam) {
        this.cPUModeParam = cPUModeParam;
    }

    public String getCPUModel() {
        return cPUModelParam;
    }

    public void setCPUModel(String cPUModelParam) {
        this.cPUModelParam = cPUModelParam;
    }

    public Boolean getCPUModelInSetIntersection() {
        return cPUModelInSetIntersectionParam;
    }

    public void setCPUModelInSetIntersection(Boolean cPUModelInSetIntersectionParam) {
        this.cPUModelInSetIntersectionParam = cPUModelInSetIntersectionParam;
    }

    public Boolean getCPUModelInSetIntersectionSpec() {
        return cPUModelInSetIntersectionSpecParam;
    }

    public void setCPUModelInSetIntersectionSpec(Boolean cPUModelInSetIntersectionSpecParam) {
        this.cPUModelInSetIntersectionSpecParam = cPUModelInSetIntersectionSpecParam;
    }

    public String getCPUModelSpec() {
        return cPUModelSpecParam;
    }

    public void setCPUModelSpec(String cPUModelSpecParam) {
        this.cPUModelSpecParam = cPUModelSpecParam;
    }

    public String getCPUPriority() {
        return cPUPriorityParam;
    }

    public void setCPUPriority(String cPUPriorityParam) {
        this.cPUPriorityParam = cPUPriorityParam;
    }

    public Double getCPUUtilization() {
        return cPUUtilizationParam;
    }

    public void setCPUUtilization(Double cPUUtilizationParam) {
        this.cPUUtilizationParam = cPUUtilizationParam;
    }

    public Boolean getCanLogin() {
        return canLoginParam;
    }

    public void setCanLogin(Boolean canLoginParam) {
        this.canLoginParam = canLoginParam;
    }

    public Boolean getCanMigrateAbort() {
        return canMigrateAbortParam;
    }

    public void setCanMigrateAbort(Boolean canMigrateAbortParam) {
        this.canMigrateAbortParam = canMigrateAbortParam;
    }

    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public Boolean getCloudInitEnabled() {
        return cloudInitEnabledParam;
    }

    public void setCloudInitEnabled(Boolean cloudInitEnabledParam) {
        this.cloudInitEnabledParam = cloudInitEnabledParam;
    }

    public Boolean getCloudInitRunning() {
        return cloudInitRunningParam;
    }

    public void setCloudInitRunning(Boolean cloudInitRunningParam) {
        this.cloudInitRunningParam = cloudInitRunningParam;
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

    public String getDNS() {
        return dNSParam;
    }

    public void setDNS(String dNSParam) {
        this.dNSParam = dNSParam;
    }

    public String getDNSMode() {
        return dNSModeParam;
    }

    public void setDNSMode(String dNSModeParam) {
        this.dNSModeParam = dNSModeParam;
    }

    public String getDiskCacheMode() {
        return diskCacheModeParam;
    }

    public void setDiskCacheMode(String diskCacheModeParam) {
        this.diskCacheModeParam = diskCacheModeParam;
    }

    public List<VmDiskInfo> getDiskInfos() {
        return diskInfosParam;
    }

    public void setDiskInfos(List<VmDiskInfo> diskInfosParam) {
        this.diskInfosParam = diskInfosParam;
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

    public String getFlatNetwork() {
        return flatNetworkParam;
    }

    public void setFlatNetwork(String flatNetworkParam) {
        this.flatNetworkParam = flatNetworkParam;
    }

    public String getFlatNetworkID() {
        return flatNetworkIDParam;
    }

    public void setFlatNetworkID(String flatNetworkIDParam) {
        this.flatNetworkIDParam = flatNetworkIDParam;
    }

    public String getFlatNetworkName() {
        return flatNetworkNameParam;
    }

    public void setFlatNetworkName(String flatNetworkNameParam) {
        this.flatNetworkNameParam = flatNetworkNameParam;
    }

    public Integer getGPU() {
        return gPUParam;
    }

    public void setGPU(Integer gPUParam) {
        this.gPUParam = gPUParam;
    }

    public Boolean getGPUBindingEnabled() {
        return gPUBindingEnabledParam;
    }

    public void setGPUBindingEnabled(Boolean gPUBindingEnabledParam) {
        this.gPUBindingEnabledParam = gPUBindingEnabledParam;
    }

    public String getGPUMdevName() {
        return gPUMdevNameParam;
    }

    public void setGPUMdevName(String gPUMdevNameParam) {
        this.gPUMdevNameParam = gPUMdevNameParam;
    }

    public String getGPUType() {
        return gPUTypeParam;
    }

    public void setGPUType(String gPUTypeParam) {
        this.gPUTypeParam = gPUTypeParam;
    }

    public String getHighAvailability() {
        return highAvailabilityParam;
    }

    public void setHighAvailability(String highAvailabilityParam) {
        this.highAvailabilityParam = highAvailabilityParam;
    }

    public String getHostIP() {
        return hostIPParam;
    }

    public void setHostIP(String hostIPParam) {
        this.hostIPParam = hostIPParam;
    }

    public String getHostUUID() {
        return hostUUIDParam;
    }

    public void setHostUUID(String hostUUIDParam) {
        this.hostUUIDParam = hostUUIDParam;
    }

    public String getHostname() {
        return hostnameParam;
    }

    public void setHostname(String hostnameParam) {
        this.hostnameParam = hostnameParam;
    }

    public Integer getHotPlugPCISlotAvailable() {
        return hotPlugPCISlotAvailableParam;
    }

    public void setHotPlugPCISlotAvailable(Integer hotPlugPCISlotAvailableParam) {
        this.hotPlugPCISlotAvailableParam = hotPlugPCISlotAvailableParam;
    }

    public List<String> getIGIDs() {
        return iGIDsParam;
    }

    public void setIGIDs(List<String> iGIDsParam) {
        this.iGIDsParam = iGIDsParam;
    }

    public List<IPInfo> getIPInfos() {
        return iPInfosParam;
    }

    public void setIPInfos(List<IPInfo> iPInfosParam) {
        this.iPInfosParam = iPInfosParam;
    }

    public String getIPv4OutputName() {
        return iPv4OutputNameParam;
    }

    public void setIPv4OutputName(String iPv4OutputNameParam) {
        this.iPv4OutputNameParam = iPv4OutputNameParam;
    }

    public String getIPv6OutputName() {
        return iPv6OutputNameParam;
    }

    public void setIPv6OutputName(String iPv6OutputNameParam) {
        this.iPv6OutputNameParam = iPv6OutputNameParam;
    }

    public Integer getISOTotalSpec() {
        return iSOTotalSpecParam;
    }

    public void setISOTotalSpec(Integer iSOTotalSpecParam) {
        this.iSOTotalSpecParam = iSOTotalSpecParam;
    }

    public Integer getISOTotalStatus() {
        return iSOTotalStatusParam;
    }

    public void setISOTotalStatus(Integer iSOTotalStatusParam) {
        this.iSOTotalStatusParam = iSOTotalStatusParam;
    }

    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
    }

    public Boolean getIsFromISO() {
        return isFromISOParam;
    }

    public void setIsFromISO(Boolean isFromISOParam) {
        this.isFromISOParam = isFromISOParam;
    }

    public String getMdevName() {
        return mdevNameParam;
    }

    public void setMdevName(String mdevNameParam) {
        this.mdevNameParam = mdevNameParam;
    }

    public Double getMemUsage() {
        return memUsageParam;
    }

    public void setMemUsage(Double memUsageParam) {
        this.memUsageParam = memUsageParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public List<VmNICInfo> getNICInfos() {
        return nICInfosParam;
    }

    public void setNICInfos(List<VmNICInfo> nICInfosParam) {
        this.nICInfosParam = nICInfosParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getNetworkType() {
        return networkTypeParam;
    }

    public void setNetworkType(String networkTypeParam) {
        this.networkTypeParam = networkTypeParam;
    }

    public String getOSName() {
        return oSNameParam;
    }

    public void setOSName(String oSNameParam) {
        this.oSNameParam = oSNameParam;
    }

    public String getOSType() {
        return oSTypeParam;
    }

    public void setOSType(String oSTypeParam) {
        this.oSTypeParam = oSTypeParam;
    }

    public List<PendingChange> getPendingChanges() {
        return pendingChangesParam;
    }

    public void setPendingChanges(List<PendingChange> pendingChangesParam) {
        this.pendingChangesParam = pendingChangesParam;
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

    public Boolean getQGAEnabled() {
        return qGAEnabledParam;
    }

    public void setQGAEnabled(Boolean qGAEnabledParam) {
        this.qGAEnabledParam = qGAEnabledParam;
    }

    public Boolean getQGARunning() {
        return qGARunningParam;
    }

    public void setQGARunning(Boolean qGARunningParam) {
        this.qGARunningParam = qGARunningParam;
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

    public Boolean getSetPassword() {
        return setPasswordParam;
    }

    public void setSetPassword(Boolean setPasswordParam) {
        this.setPasswordParam = setPasswordParam;
    }

    public Double getSpaceUsage() {
        return spaceUsageParam;
    }

    public void setSpaceUsage(Double spaceUsageParam) {
        this.spaceUsageParam = spaceUsageParam;
    }

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public Double getStatusProcessProgress() {
        return statusProcessProgressParam;
    }

    public void setStatusProcessProgress(Double statusProcessProgressParam) {
        this.statusProcessProgressParam = statusProcessProgressParam;
    }

    public String getSubnetID() {
        return subnetIDParam;
    }

    public void setSubnetID(String subnetIDParam) {
        this.subnetIDParam = subnetIDParam;
    }

    public String getSubnetName() {
        return subnetNameParam;
    }

    public void setSubnetName(String subnetNameParam) {
        this.subnetNameParam = subnetNameParam;
    }

    public Boolean getSupportHotplug() {
        return supportHotplugParam;
    }

    public void setSupportHotplug(Boolean supportHotplugParam) {
        this.supportHotplugParam = supportHotplugParam;
    }

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public String getUUID() {
        return uUIDParam;
    }

    public void setUUID(String uUIDParam) {
        this.uUIDParam = uUIDParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getUserData() {
        return userDataParam;
    }

    public void setUserData(String userDataParam) {
        this.userDataParam = userDataParam;
    }

    public Boolean getVCPUBindingDegrandable() {
        return vCPUBindingDegrandableParam;
    }

    public void setVCPUBindingDegrandable(Boolean vCPUBindingDegrandableParam) {
        this.vCPUBindingDegrandableParam = vCPUBindingDegrandableParam;
    }

    public List<VCPUBinding> getVCPUBindingInfos() {
        return vCPUBindingInfosParam;
    }

    public void setVCPUBindingInfos(List<VCPUBinding> vCPUBindingInfosParam) {
        this.vCPUBindingInfosParam = vCPUBindingInfosParam;
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

    public List<VMNumaInfo> getVMNumaInfos() {
        return vMNumaInfosParam;
    }

    public void setVMNumaInfos(List<VMNumaInfo> vMNumaInfosParam) {
        this.vMNumaInfosParam = vMNumaInfosParam;
    }

    public List<VMSPInfo> getVMSPInfos() {
        return vMSPInfosParam;
    }

    public void setVMSPInfos(List<VMSPInfo> vMSPInfosParam) {
        this.vMSPInfosParam = vMSPInfosParam;
    }

    public String getVMType() {
        return vMTypeParam;
    }

    public void setVMType(String vMTypeParam) {
        this.vMTypeParam = vMTypeParam;
    }

    public String getVMTypeAlias() {
        return vMTypeAliasParam;
    }

    public void setVMTypeAlias(String vMTypeAliasParam) {
        this.vMTypeAliasParam = vMTypeAliasParam;
    }

    public String getVPCID() {
        return vPCIDParam;
    }

    public void setVPCID(String vPCIDParam) {
        this.vPCIDParam = vPCIDParam;
    }

    public String getVPCName() {
        return vPCNameParam;
    }

    public void setVPCName(String vPCNameParam) {
        this.vPCNameParam = vPCNameParam;
    }

    public WANNetworkConfig getWANNetworkConfig() {
        return wANNetworkConfigParam;
    }

    public void setWANNetworkConfig(WANNetworkConfig wANNetworkConfigParam) {
        this.wANNetworkConfigParam = wANNetworkConfigParam;
    }

}
