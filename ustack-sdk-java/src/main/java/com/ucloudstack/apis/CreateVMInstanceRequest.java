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

public class CreateVMInstanceRequest extends Request {

    /** 审批名称，启用审批流程时的标题 */
    
    @OpenAPIParam("ApplicationName")
    private String applicationNameParam;

    /** 审批理由，启用审批流程时的说明 */
    
    @OpenAPIParam("ApplicationReason")
    private String applicationReasonParam;

    /** 外网带宽，指定外网IP的带宽上限，单位：Mbps，0表示不限制，仅在指定外网时有效 */
    
    @OpenAPIParam("Bandwidth")
    private Integer bandwidthParam;

    /** 引导顺序，可选字段，支持：hd（硬盘），cdrom（光驱），network（网络） */
    
    @OpenAPIParam("BootDevices")
    private List<String> bootDevicesParam;

    /** 系统盘总线类型，取值 virtio，ide，scsi */
    
    @OpenAPIParam("BootDiskBus")
    private String bootDiskBusParam;

    /** 系统盘磁盘缓存模式，当前生效的磁盘I/O缓存策略 */
    
    @OpenAPIParam("BootDiskCacheMode")
    private String bootDiskCacheModeParam;

    /** 系统盘ID，作为系统启动盘的已有云盘标识，与BootDiskSpace互斥 */
    
    @OpenAPIParam("BootDiskID")
    private String bootDiskIDParam;

    /** 系统盘QoS限速读带宽，单位MB/s，0表示不限制 */
    
    @OpenAPIParam("BootDiskReadBandwidth")
    private Integer bootDiskReadBandwidthParam;

    /** 系统盘QoS限速读IOPS，0表示不限制 */
    
    @OpenAPIParam("BootDiskReadIOPS")
    private Integer bootDiskReadIOPSParam;

    /** 启动盘加密密钥，用于加密系统盘的密钥信息，可选字段 */
    
    @OpenAPIParam("BootDiskSecret")
    private String bootDiskSecretParam;

    /** 系统盘集群类型，指定新建系统盘所属的存储集群，仅在BootDiskID为空时有效，影响系统盘的I/O性能，租户必须有访问权限 */
    
    @OpenAPIParam("BootDiskSetType")
    private String bootDiskSetTypeParam;

    /** 系统盘容量，指定新建系统盘的大小，单位：GiB，仅在BootDiskID为空时有效，调整此值可扩容系统盘 */
    
    @OpenAPIParam("BootDiskSpace")
    private Integer bootDiskSpaceParam;

    /** 系统盘QoS限速总带宽，单位MB/s，0表示不限制 */
    
    @OpenAPIParam("BootDiskTotalBandwidth")
    private Integer bootDiskTotalBandwidthParam;

    /** 系统盘QoS限速总IOPS，0表示不限制 */
    
    @OpenAPIParam("BootDiskTotalIOPS")
    private Integer bootDiskTotalIOPSParam;

    /** 系统盘QoS限速写带宽，单位MB/s，0表示不限制 */
    
    @OpenAPIParam("BootDiskWriteBandwidth")
    private Integer bootDiskWriteBandwidthParam;

    /** 系统盘QoS限速写IOPS，0表示不限制 */
    
    @OpenAPIParam("BootDiskWriteIOPS")
    private Integer bootDiskWriteIOPSParam;

    /** 启动源类型，指定用于创建虚拟机的介质类型，取值：Image（镜像）、Disk（云盘） */
    
    @OpenAPIParam("BootSourceType")
    private String bootSourceTypeParam;

    /** 引导方式，指定虚拟机的系统引导模式，bios兼容性更好，uefi支持更大磁盘和安全启动 */
    
    @OpenAPIParam("BootloaderType")
    private String bootloaderTypeParam;

    /** CDROM列表，指定需挂载的CDROM信息，最多支持3个CDROM */
    
    @OpenAPIParam("CDROMs")
    private List<CreateVMInstanceRequestCDROM> cDROMsParam;

    /** 核心数，虚拟机的vCPU核心数量，必须与所选计算集群的规格兼容 */
    @NotEmpty
    @OpenAPIParam("CPU")
    private Integer cPUParam;

    /** CPU每个插槽内核数，可选字段，默认等于CPU */
    
    @OpenAPIParam("CPUCoresPerSocket")
    private Integer cPUCoresPerSocketParam;

    /** 虚拟机是否隐藏虚拟化 (hypervisor) 标记，可选字段，默认false */
    
    @OpenAPIParam("CPUHypervisorDisable")
    private Boolean cPUHypervisorDisableParam;

    /** CPU频率限制百分比，可选字段，默认100% */
    
    @OpenAPIParam("CPULimitPercent")
    private Integer cPULimitPercentParam;

    /** CPU模式，指定虚拟机CPU的模拟方式，host-passthrough提供最优性能但可移植性差，custom提供更好的兼容性 */
    
    @OpenAPIParam("CPUMode")
    private String cPUModeParam;

    /** CPU型号，指定虚拟机的CPU处理器型号，需与所选计算集群兼容 */
    
    @OpenAPIParam("CPUModel")
    private String cPUModelParam;

    /** CPU优先级，取值：Normal，High （高），可选字段，默认Normal */
    
    @OpenAPIParam("CPUPriority")
    private String cPUPriorityParam;

    /** 计费类型，用于指定计费模式，取值：Dynamic（按小时）、Month（按月）、Year（按年） */
    @NotEmpty
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** DNS配置，指定虚拟机的DNS服务器地址，多个服务器用逗号分隔 */
    
    @OpenAPIParam("DNS")
    private String dNSParam;

    /** 数据盘ID，需挂载的已有数据盘标识，与DataDiskSpace互斥，可选字段 */
    
    @OpenAPIParam("DataDiskID")
    private String dataDiskIDParam;

    /** 数据盘加密密钥，用于加密数据盘的密钥信息，仅在创建数据盘时有效，可选字段 */
    
    @OpenAPIParam("DataDiskSecret")
    private String dataDiskSecretParam;

    /** 数据盘集群类型，指定新建数据盘所属的存储集群，仅在DataDiskID为空且DataDiskSpace>0时有效，租户必须有访问权限，可选字段 */
    
    @OpenAPIParam("DataDiskSetType")
    private String dataDiskSetTypeParam;

    /** 数据盘容量，指定新建数据盘的大小，单位：GiB，当值为0时表示不创建数据盘，仅在DataDiskID为空时有效，与DataDiskID互斥 */
    
    @OpenAPIParam("DataDiskSpace")
    private Integer dataDiskSpaceParam;

    /** DataDisk列表，指定需挂载的磁盘信息 */
    
    @OpenAPIParam("DataDisks")
    private List<CreateVMInstanceRequestDataDisk> dataDisksParam;

    /** 磁盘缓存模式，指定磁盘I/O的缓存策略，directsync最安全但性能最低，writeback性能最优但可靠性风险高，none折中方案 */
    
    @OpenAPIParam("DiskCacheMode")
    private String diskCacheModeParam;

    /** 租户邮箱，归属租户的联系电子邮箱 */
    
    @OpenAPIParam("Email")
    private String emailParam;

    /** 扁平网络ID，虚拟机归属的扁平网络标识，与VPCID/SubnetID/OperatorName互斥，扁平网络模式下使用 */
    
    @OpenAPIParam("FlatNetworkID")
    private String flatNetworkIDParam;

    /** GPU数量，指定挂载的物理GPU数量，仅在GPUType为GPU时有效，必须不超过所选计算集群的可用数量 */
    
    @OpenAPIParam("GPU")
    private Integer gPUParam;

    /** GPU绑定优化，标识是否启用GPU与vCPU的绑定优化，提高GPU访问延迟性能，仅在配置GPU时有效 */
    
    @OpenAPIParam("GPUBindingEnable")
    private Boolean gPUBindingEnableParam;

    /** GPU规格，指定物理GPU的型号规格，仅在GPUType为GPU时有效且必填 */
    
    @OpenAPIParam("GPUMdevName")
    private String gPUMdevNameParam;

    /** GPU类型，指定虚拟机挂载的GPU资源类型，GPU（物理透传）提供最高性能和隔离，VGPU（虚拟化）提供资源灵活分配，不指定表示不挂载，可选字段 */
    
    @OpenAPIParam("GPUType")
    private String gPUTypeParam;

    /** 高可用模式，指定虚拟机的高可用策略，NeverStop启用自动重启，None禁用 */
    
    @OpenAPIParam("HighAvailability")
    private String highAvailabilityParam;

    /** 指定主机运行 */
    
    @OpenAPIParam("HostID")
    private String hostIDParam;

    /** 主机名称，虚拟机操作系统内部的主机名 */
    
    @OpenAPIParam("Hostname")
    private String hostnameParam;

    /** 隔离组ID，指定虚拟机所属的物理隔离组，用于提高虚拟机间的物理隔离，可选字段 */
    
    @OpenAPIParam("IGID")
    private String iGIDParam;

    /** IP版本，指定网络地址的协议版本，取值：IPv4、IPv6 */
    
    @OpenAPIParam("IPVersion")
    private String iPVersionParam;

    /** 镜像ID，作为启动源的基础镜像标识，与BootDiskID互斥，两者必须指定其一，镜像必须与计算集群架构匹配，租户必须有访问权限 */
    
    @OpenAPIParam("ImageID")
    private String imageIDParam;

    /** 电源策略，指定虚拟机创建完成后的电源状态，取值：Running，Stopped，可选字段，默认Running */
    
    @OpenAPIParam("InitialState")
    private String initialStateParam;

    /** 内网IP，指定虚拟机在子网中的内网IP地址，若未指定则由系统自动分配 */
    
    @OpenAPIParam("InternalIP")
    private String internalIPParam;

    /** 外网IP，指定虚拟机绑定的公网IP地址，若未指定则由系统自动分配 */
    
    @OpenAPIParam("InternetIP")
    private String internetIPParam;

    /** 内网入向带宽，内网网卡的入站流量带宽限额，单位：Mbps，0表示不限制，与PFCode（SR-IOV）互斥 */
    
    @OpenAPIParam("LANInAverageBandwidth")
    private Integer lANInAverageBandwidthParam;

    /** 内网MAC，指定内网网卡的MAC地址，需为unicast地址，不能与WANMAC重复，若未指定则由系统自动分配，可选字段 */
    
    @OpenAPIParam("LANMAC")
    private String lANMACParam;

    /** 内网出向带宽，内网网卡的出站流量带宽限额，单位：Mbps，0表示不限制，与PFCode（SR-IOV）互斥 */
    
    @OpenAPIParam("LANOutAverageBandwidth")
    private Integer lANOutAverageBandwidthParam;

    /** 内网安全组ID，绑定到内网网卡的安全策略组标识 */
    
    @OpenAPIParam("LANSGID")
    private String lANSGIDParam;

    /** vGPU规格，指定虚拟GPU的配置规格，仅在GPUType为VGPU时有效且必填，预留字段，暂未支持 */
    
    @OpenAPIParam("MdevName")
    private String mdevNameParam;

    /** 内存容量，虚拟机的内存大小，单位：MiB，必须是1024的倍数 */
    @NotEmpty
    @OpenAPIParam("Memory")
    private Integer memoryParam;

    /** 网卡列表，指定需挂载的网卡信息 */
    
    @OpenAPIParam("NICs")
    private List<CreateVMInstanceRequestNIC> nICsParam;

    /** 虚拟机名称，自定义的云主机实例标识，长度1-128个字符，仅支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 操作系统发行版，标识操作系统的具体家族，ImageID为空时必填 */
    
    @OpenAPIParam("OSDistribution")
    private String oSDistributionParam;

    /** 操作系统类型，标识操作系统的核心分类，ImageID为空时必填 */
    
    @OpenAPIParam("OSType")
    private String oSTypeParam;

    /** 操作系统版本，标识发行版内部的具体版本信息 */
    
    @OpenAPIParam("OSVersion")
    private String oSVersionParam;

    /** 线路ID，虚拟机绑定的外网线路资源标识，与FlatNetworkID互斥，用于WAN网络的外网IP绑定，在VPC模式下，若Bandwidth>0则必填 */
    
    @OpenAPIParam("OperatorName")
    private String operatorNameParam;

    /** 网卡型号，指定物理网卡的硬件型号编码，支持SR-IOV加速，与内网带宽限速互斥 */
    
    @OpenAPIParam("PFCode")
    private String pFCodeParam;

    /** 登录密码，虚拟机的初始系统管理员密码，仅当所选镜像支持QGA或Cloud-Init时有效，密码强度规则由RegionConfigKeyVMPasswordLength与RegionConfigKeyVMPasswordComplexity配置决定 */
    
    @OpenAPIParam("Password")
    private String passwordParam;

    /** 项目ID，用于实现资源的逻辑分组管理，未传时尝试分配默认项目 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 购买时长，指定计费周期的数量 */
    @NotEmpty
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注信息，对虚拟机资源的补充说明，长度0-100个字符，禁止包含<script>标签或javascript链接 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 子网ID，虚拟机归属的VPC子网标识，与FlatNetworkID互斥，VPC模式下必填（需与VPCID同时指定） */
    
    @OpenAPIParam("SubnetID")
    private String subnetIDParam;

    /** Cloud-Init支持，标识是否在虚拟机中启用Cloud-Init，用于虚拟机的自动化初始化配置 */
    
    @OpenAPIParam("SupportCloudInit")
    private Boolean supportCloudInitParam;

    /** 热插拔支持，标识虚拟机是否支持设备热插拔，允许在虚拟机运行时添加/移除设备 */
    
    @OpenAPIParam("SupportHotplug")
    private Boolean supportHotplugParam;

    /** QGA支持，标识是否在虚拟机中安装QEMU Guest Agent，支持虚拟机内部命令执行和密码重置 */
    
    @OpenAPIParam("SupportQGA")
    private Boolean supportQGAParam;

    /** 标签键值对，用于资源的分类标记与自动化管理 */
    
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** USB挂载类型，指定USB设备的连接方式，取值：redir（重定向）、pass-through（直通），仅在USBDeviceID有效时生效 */
    
    @OpenAPIParam("USBAttachType")
    private String uSBAttachTypeParam;

    /** USB设备ID，需挂载到虚拟机的USB设备标识 */
    
    @OpenAPIParam("USBDeviceID")
    private String uSBDeviceIDParam;

    /** Cloud-Init脚本，虚拟机启动时的自定义初始化配置脚本，仅当镜像支持Cloud-Init时有效，YAML或Shell格式，需 base64 编码后传入，可选字段 */
    
    @OpenAPIParam("UserData")
    private String userDataParam;

    /** 降级允许，标识vCPU绑定在迁移时是否允许降级为非绑定模式，提高迁移成功率但可能降低性能 */
    
    @OpenAPIParam("VCPUBindingDegrandable")
    private Boolean vCPUBindingDegrandableParam;

    /** vCPU绑定详情，vCPU与物理CPU的具体绑定关系，由系统自动生成，基于VCPUBindingNode */
    
    @OpenAPIParam("VCPUBindingInfos")
    private List<String> vCPUBindingInfosParam;

    /** vCPU绑定节点，指定vCPU绑定的物理NUMA节点，用于性能优化和延迟敏感应用，可选字段 */
    
    @OpenAPIParam("VCPUBindingNode")
    private String vCPUBindingNodeParam;

    /** 计算集群类型，指定虚拟机所属的物理资源集群，决定了虚拟机的架构（x86/ARM）和性能规格 */
    @NotEmpty
    @OpenAPIParam("VMType")
    private String vMTypeParam;

    /** VPCID，虚拟机归属的专有网络标识，与FlatNetworkID互斥，VPC模式下必填（需与SubnetID同时指定） */
    
    @OpenAPIParam("VPCID")
    private String vPCIDParam;

    /** 外网MAC，指定外网网卡的MAC地址，需为unicast地址，不能与LANMAC重复，仅在外网网卡存在时有效，可选字段 */
    
    @OpenAPIParam("WANMAC")
    private String wANMACParam;

    /** WAN网络配置，创建阶段用于声明WAN网卡及其IP配置；当前仅支持1张WAN网卡，单网卡可配置多个WAN IP */
    
    @OpenAPIParam("WANNetworkConfig")
    private WANNetworkConfig wANNetworkConfigParam;

    /** 外网安全组ID，绑定到外网网卡的安全策略组标识，仅在指定外网时有效 */
    
    @OpenAPIParam("WANSGID")
    private String wANSGIDParam;


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

    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public List<String> getBootDevices() {
        return bootDevicesParam;
    }

    public void setBootDevices(List<String> bootDevicesParam) {
        this.bootDevicesParam = bootDevicesParam;
    }

    public String getBootDiskBus() {
        return bootDiskBusParam;
    }

    public void setBootDiskBus(String bootDiskBusParam) {
        this.bootDiskBusParam = bootDiskBusParam;
    }

    public String getBootDiskCacheMode() {
        return bootDiskCacheModeParam;
    }

    public void setBootDiskCacheMode(String bootDiskCacheModeParam) {
        this.bootDiskCacheModeParam = bootDiskCacheModeParam;
    }

    public String getBootDiskID() {
        return bootDiskIDParam;
    }

    public void setBootDiskID(String bootDiskIDParam) {
        this.bootDiskIDParam = bootDiskIDParam;
    }

    public Integer getBootDiskReadBandwidth() {
        return bootDiskReadBandwidthParam;
    }

    public void setBootDiskReadBandwidth(Integer bootDiskReadBandwidthParam) {
        this.bootDiskReadBandwidthParam = bootDiskReadBandwidthParam;
    }

    public Integer getBootDiskReadIOPS() {
        return bootDiskReadIOPSParam;
    }

    public void setBootDiskReadIOPS(Integer bootDiskReadIOPSParam) {
        this.bootDiskReadIOPSParam = bootDiskReadIOPSParam;
    }

    public String getBootDiskSecret() {
        return bootDiskSecretParam;
    }

    public void setBootDiskSecret(String bootDiskSecretParam) {
        this.bootDiskSecretParam = bootDiskSecretParam;
    }

    public String getBootDiskSetType() {
        return bootDiskSetTypeParam;
    }

    public void setBootDiskSetType(String bootDiskSetTypeParam) {
        this.bootDiskSetTypeParam = bootDiskSetTypeParam;
    }

    public Integer getBootDiskSpace() {
        return bootDiskSpaceParam;
    }

    public void setBootDiskSpace(Integer bootDiskSpaceParam) {
        this.bootDiskSpaceParam = bootDiskSpaceParam;
    }

    public Integer getBootDiskTotalBandwidth() {
        return bootDiskTotalBandwidthParam;
    }

    public void setBootDiskTotalBandwidth(Integer bootDiskTotalBandwidthParam) {
        this.bootDiskTotalBandwidthParam = bootDiskTotalBandwidthParam;
    }

    public Integer getBootDiskTotalIOPS() {
        return bootDiskTotalIOPSParam;
    }

    public void setBootDiskTotalIOPS(Integer bootDiskTotalIOPSParam) {
        this.bootDiskTotalIOPSParam = bootDiskTotalIOPSParam;
    }

    public Integer getBootDiskWriteBandwidth() {
        return bootDiskWriteBandwidthParam;
    }

    public void setBootDiskWriteBandwidth(Integer bootDiskWriteBandwidthParam) {
        this.bootDiskWriteBandwidthParam = bootDiskWriteBandwidthParam;
    }

    public Integer getBootDiskWriteIOPS() {
        return bootDiskWriteIOPSParam;
    }

    public void setBootDiskWriteIOPS(Integer bootDiskWriteIOPSParam) {
        this.bootDiskWriteIOPSParam = bootDiskWriteIOPSParam;
    }

    public String getBootSourceType() {
        return bootSourceTypeParam;
    }

    public void setBootSourceType(String bootSourceTypeParam) {
        this.bootSourceTypeParam = bootSourceTypeParam;
    }

    public String getBootloaderType() {
        return bootloaderTypeParam;
    }

    public void setBootloaderType(String bootloaderTypeParam) {
        this.bootloaderTypeParam = bootloaderTypeParam;
    }

    public List<CreateVMInstanceRequestCDROM> getCDROMs() {
        return cDROMsParam;
    }

    public void setCDROMs(List<CreateVMInstanceRequestCDROM> cDROMsParam) {
        this.cDROMsParam = cDROMsParam;
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

    public String getCPUPriority() {
        return cPUPriorityParam;
    }

    public void setCPUPriority(String cPUPriorityParam) {
        this.cPUPriorityParam = cPUPriorityParam;
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

    public String getDNS() {
        return dNSParam;
    }

    public void setDNS(String dNSParam) {
        this.dNSParam = dNSParam;
    }

    public String getDataDiskID() {
        return dataDiskIDParam;
    }

    public void setDataDiskID(String dataDiskIDParam) {
        this.dataDiskIDParam = dataDiskIDParam;
    }

    public String getDataDiskSecret() {
        return dataDiskSecretParam;
    }

    public void setDataDiskSecret(String dataDiskSecretParam) {
        this.dataDiskSecretParam = dataDiskSecretParam;
    }

    public String getDataDiskSetType() {
        return dataDiskSetTypeParam;
    }

    public void setDataDiskSetType(String dataDiskSetTypeParam) {
        this.dataDiskSetTypeParam = dataDiskSetTypeParam;
    }

    public Integer getDataDiskSpace() {
        return dataDiskSpaceParam;
    }

    public void setDataDiskSpace(Integer dataDiskSpaceParam) {
        this.dataDiskSpaceParam = dataDiskSpaceParam;
    }

    public List<CreateVMInstanceRequestDataDisk> getDataDisks() {
        return dataDisksParam;
    }

    public void setDataDisks(List<CreateVMInstanceRequestDataDisk> dataDisksParam) {
        this.dataDisksParam = dataDisksParam;
    }

    public String getDiskCacheMode() {
        return diskCacheModeParam;
    }

    public void setDiskCacheMode(String diskCacheModeParam) {
        this.diskCacheModeParam = diskCacheModeParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getFlatNetworkID() {
        return flatNetworkIDParam;
    }

    public void setFlatNetworkID(String flatNetworkIDParam) {
        this.flatNetworkIDParam = flatNetworkIDParam;
    }

    public Integer getGPU() {
        return gPUParam;
    }

    public void setGPU(Integer gPUParam) {
        this.gPUParam = gPUParam;
    }

    public Boolean getGPUBindingEnable() {
        return gPUBindingEnableParam;
    }

    public void setGPUBindingEnable(Boolean gPUBindingEnableParam) {
        this.gPUBindingEnableParam = gPUBindingEnableParam;
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

    public String getHostID() {
        return hostIDParam;
    }

    public void setHostID(String hostIDParam) {
        this.hostIDParam = hostIDParam;
    }

    public String getHostname() {
        return hostnameParam;
    }

    public void setHostname(String hostnameParam) {
        this.hostnameParam = hostnameParam;
    }

    public String getIGID() {
        return iGIDParam;
    }

    public void setIGID(String iGIDParam) {
        this.iGIDParam = iGIDParam;
    }

    public String getIPVersion() {
        return iPVersionParam;
    }

    public void setIPVersion(String iPVersionParam) {
        this.iPVersionParam = iPVersionParam;
    }

    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
    }

    public String getInitialState() {
        return initialStateParam;
    }

    public void setInitialState(String initialStateParam) {
        this.initialStateParam = initialStateParam;
    }

    public String getInternalIP() {
        return internalIPParam;
    }

    public void setInternalIP(String internalIPParam) {
        this.internalIPParam = internalIPParam;
    }

    public String getInternetIP() {
        return internetIPParam;
    }

    public void setInternetIP(String internetIPParam) {
        this.internetIPParam = internetIPParam;
    }

    public Integer getLANInAverageBandwidth() {
        return lANInAverageBandwidthParam;
    }

    public void setLANInAverageBandwidth(Integer lANInAverageBandwidthParam) {
        this.lANInAverageBandwidthParam = lANInAverageBandwidthParam;
    }

    public String getLANMAC() {
        return lANMACParam;
    }

    public void setLANMAC(String lANMACParam) {
        this.lANMACParam = lANMACParam;
    }

    public Integer getLANOutAverageBandwidth() {
        return lANOutAverageBandwidthParam;
    }

    public void setLANOutAverageBandwidth(Integer lANOutAverageBandwidthParam) {
        this.lANOutAverageBandwidthParam = lANOutAverageBandwidthParam;
    }

    public String getLANSGID() {
        return lANSGIDParam;
    }

    public void setLANSGID(String lANSGIDParam) {
        this.lANSGIDParam = lANSGIDParam;
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

    public List<CreateVMInstanceRequestNIC> getNICs() {
        return nICsParam;
    }

    public void setNICs(List<CreateVMInstanceRequestNIC> nICsParam) {
        this.nICsParam = nICsParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getOSDistribution() {
        return oSDistributionParam;
    }

    public void setOSDistribution(String oSDistributionParam) {
        this.oSDistributionParam = oSDistributionParam;
    }

    public String getOSType() {
        return oSTypeParam;
    }

    public void setOSType(String oSTypeParam) {
        this.oSTypeParam = oSTypeParam;
    }

    public String getOSVersion() {
        return oSVersionParam;
    }

    public void setOSVersion(String oSVersionParam) {
        this.oSVersionParam = oSVersionParam;
    }

    public String getOperatorName() {
        return operatorNameParam;
    }

    public void setOperatorName(String operatorNameParam) {
        this.operatorNameParam = operatorNameParam;
    }

    public String getPFCode() {
        return pFCodeParam;
    }

    public void setPFCode(String pFCodeParam) {
        this.pFCodeParam = pFCodeParam;
    }

    public String getPassword() {
        return passwordParam;
    }

    public void setPassword(String passwordParam) {
        this.passwordParam = passwordParam;
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

    public String getSubnetID() {
        return subnetIDParam;
    }

    public void setSubnetID(String subnetIDParam) {
        this.subnetIDParam = subnetIDParam;
    }

    public Boolean getSupportCloudInit() {
        return supportCloudInitParam;
    }

    public void setSupportCloudInit(Boolean supportCloudInitParam) {
        this.supportCloudInitParam = supportCloudInitParam;
    }

    public Boolean getSupportHotplug() {
        return supportHotplugParam;
    }

    public void setSupportHotplug(Boolean supportHotplugParam) {
        this.supportHotplugParam = supportHotplugParam;
    }

    public Boolean getSupportQGA() {
        return supportQGAParam;
    }

    public void setSupportQGA(Boolean supportQGAParam) {
        this.supportQGAParam = supportQGAParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

    public String getUSBAttachType() {
        return uSBAttachTypeParam;
    }

    public void setUSBAttachType(String uSBAttachTypeParam) {
        this.uSBAttachTypeParam = uSBAttachTypeParam;
    }

    public String getUSBDeviceID() {
        return uSBDeviceIDParam;
    }

    public void setUSBDeviceID(String uSBDeviceIDParam) {
        this.uSBDeviceIDParam = uSBDeviceIDParam;
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

    public List<String> getVCPUBindingInfos() {
        return vCPUBindingInfosParam;
    }

    public void setVCPUBindingInfos(List<String> vCPUBindingInfosParam) {
        this.vCPUBindingInfosParam = vCPUBindingInfosParam;
    }

    public String getVCPUBindingNode() {
        return vCPUBindingNodeParam;
    }

    public void setVCPUBindingNode(String vCPUBindingNodeParam) {
        this.vCPUBindingNodeParam = vCPUBindingNodeParam;
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

    public String getWANMAC() {
        return wANMACParam;
    }

    public void setWANMAC(String wANMACParam) {
        this.wANMACParam = wANMACParam;
    }

    public WANNetworkConfig getWANNetworkConfig() {
        return wANNetworkConfigParam;
    }

    public void setWANNetworkConfig(WANNetworkConfig wANNetworkConfigParam) {
        this.wANNetworkConfigParam = wANNetworkConfigParam;
    }

    public String getWANSGID() {
        return wANSGIDParam;
    }

    public void setWANSGID(String wANSGIDParam) {
        this.wANSGIDParam = wANSGIDParam;
    }

}
