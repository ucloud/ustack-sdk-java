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

public class CreateSMCRequest extends Request {

    /** Agent版本号，用于标识迁移源端的Agent版本，如v1.0.1，用于兼容性检查和功能管理 */
    
    @UCloudStackParam("AgentVersion")
    private String agentVersionParam;

    /** 源端CPU架构类型，用于指导目标云硬盘的初始化，如x86_64或aarch64 */
    
    @UCloudStackParam("Arch")
    private String archParam;

    /** 源端启动加载器类型，如BIOS或UEFI，影响目标虚拟机的启动配置 */
    
    @UCloudStackParam("BootloaderType")
    private String bootloaderTypeParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 源端CPU核心数，影响迁移性能和目标VM的配置选择 */
    
    @UCloudStackParam("Cores")
    private Integer coresParam;

    /** 源端磁盘分区列表，每个磁盘分区记录文件系统类型、大小、挂载点等信息，用于制定磁盘映射策略 */
    
    @UCloudStackParam("Disks")
    private List<Disk> disksParam;

    /** 源端操作系统发行版名称，如CentOS、Ubuntu、Debian等，用于配置兼容的运行环境 */
    
    @UCloudStackParam("Distribution")
    private String distributionParam;

    /** 源端操作系统发行版版本号，如7.9、20.04等，与Distribution搭配确定精确的系统版本 */
    
    @UCloudStackParam("DistributionVersion")
    private String distributionVersionParam;

    /** 源端主机名，用于标识源服务器的网络身份 */
    
    @UCloudStackParam("Hostname")
    private String hostnameParam;

    /** 源端IP地址，用于与源服务器通信和数据同步 */
    
    @UCloudStackParam("IP")
    private String iPParam;

    /** 源端操作系统内核版本号，如3.10.0-1160等，用于判断驱动和模块兼容性 */
    
    @UCloudStackParam("Kernel")
    private String kernelParam;

    /** 源端内存大小，单位MB，用于评估数据同步性能和目标VM配置需求 */
    
    @UCloudStackParam("Memory")
    private Integer memoryParam;

    /** SMC任务名称，长度为1-128个字符，名称只能包含中英文、数字、点（.）、下划线（_）和中划线（-），用于标识迁移任务 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** 源端操作系统类型，表示源服务器的操作系统，如Linux或Windows */
    
    @UCloudStackParam("OS")
    private String oSParam;

    /** 项目ID，用于实现资源的逻辑分组管理，同一项目下的资源可统一计费和权限管理 */
    
    @UCloudStackParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，指定SMC任务所属的物理区域，决定了迁移资源在哪个云数据中心部署 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注说明，用于进行说明和注释，长度为0-100个英文或中文字符，不能包含http://或https://等非法字符 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 标签键值对列表，用于资源标记和分类管理，格式为key:value的字符串列表，若需特殊字符应使用Base64编码 */
    @NotEmpty
    @UCloudStackParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;


    public String getAgentVersion() {
        return agentVersionParam;
    }

    public void setAgentVersion(String agentVersionParam) {
        this.agentVersionParam = agentVersionParam;
    }

    public String getArch() {
        return archParam;
    }

    public void setArch(String archParam) {
        this.archParam = archParam;
    }

    public String getBootloaderType() {
        return bootloaderTypeParam;
    }

    public void setBootloaderType(String bootloaderTypeParam) {
        this.bootloaderTypeParam = bootloaderTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCores() {
        return coresParam;
    }

    public void setCores(Integer coresParam) {
        this.coresParam = coresParam;
    }

    public List<Disk> getDisks() {
        return disksParam;
    }

    public void setDisks(List<Disk> disksParam) {
        this.disksParam = disksParam;
    }

    public String getDistribution() {
        return distributionParam;
    }

    public void setDistribution(String distributionParam) {
        this.distributionParam = distributionParam;
    }

    public String getDistributionVersion() {
        return distributionVersionParam;
    }

    public void setDistributionVersion(String distributionVersionParam) {
        this.distributionVersionParam = distributionVersionParam;
    }

    public String getHostname() {
        return hostnameParam;
    }

    public void setHostname(String hostnameParam) {
        this.hostnameParam = hostnameParam;
    }

    public String getIP() {
        return iPParam;
    }

    public void setIP(String iPParam) {
        this.iPParam = iPParam;
    }

    public String getKernel() {
        return kernelParam;
    }

    public void setKernel(String kernelParam) {
        this.kernelParam = kernelParam;
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

    public String getOS() {
        return oSParam;
    }

    public void setOS(String oSParam) {
        this.oSParam = oSParam;
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

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

}
