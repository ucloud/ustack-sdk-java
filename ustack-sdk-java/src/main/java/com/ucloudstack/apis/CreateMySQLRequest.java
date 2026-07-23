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
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateMySQLRequest extends Request {

    /** 备份文件ID，用于从备份恢复创建MySQL实例，条件互斥：当提供BackupID时，HighAvailability不能为ActiveStandy；当提供BackupID时，DiskSetType和DiskSpace字段会被忽略 */
    
    @OpenAPIParam("BackupID")
    private String backupIDParam;

    /** 计费类型，用于指定计费模式，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费） */
    @NotEmpty
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 配置文件模板ID，用于指定MySQL实例的配置模板，系统会复制该模板创建新的配置文件 */
    @NotEmpty
    @OpenAPIParam("ConfigFileID")
    private String configFileIDParam;

    /** 存储集群ID，指定云硬盘所在的存储集群，条件必填：当BackupID为空时（全新创建）此字段为必填；从备份创建时此字段会被忽略 */
    
    @OpenAPIParam("DiskSetType")
    private String diskSetTypeParam;

    /** 存储容量，单位GiB，条件必填：当BackupID为空时（全新创建）此字段为必填且必须大于0；从备份创建时此字段会被忽略，使用备份中的容量信息 */
    
    @OpenAPIParam("DiskSpace")
    private Integer diskSpaceParam;

    /** 外网IP资源ID，用于绑定公网IP，如果提供，系统会检查该IP是否已被绑定到其他资源，若已绑定则创建失败 */
    
    @OpenAPIParam("EIPID")
    private String eIPIDParam;

    /** MySQL数据库高可用类型，取值范围：Standalone（单机版，创建1个VM节点）、ActiveStandy（高可用版/双节点主备，创建2个VM节点），默认值：Standalone，业务限制：当BackupID不为空（从备份恢复）时，拒绝ActiveStandy，只能创建单机实例 */
    
    @OpenAPIParam("HighAvailability")
    private String highAvailabilityParam;

    /** 内存大小，单位MiB，最小2048 MiB（2GB），必须是1024的倍数（即以GB为单位） */
    @NotEmpty
    @OpenAPIParam("Memory")
    private Integer memoryParam;

    /** MySQL实例名称，1-128个字符，仅支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** root用户密码，长度6-64个字符，支持字母、数字及部分特殊字符，必须包含至少2种字符类型 */
    @NotEmpty
    @OpenAPIParam("Password")
    private String passwordParam;

    /** 项目ID，用于实现资源的逻辑分组管理，未传时尝试分配默认项目 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 计费数量，指定计费周期的数量，按月/年计费时表示购买的月数/年数，按小时计费时强制为1 */
    @NotEmpty
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，用于说明和注释，长度为0-100个英文或中文字符，不能包含<script>、<a javascript:>等非法字符，用于XSS防护 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 恢复时间，指定从备份恢复的时间点，Unix时间戳（秒级），用于时间点恢复功能 */
    
    @OpenAPIParam("RestoreTime")
    private Integer restoreTimeParam;

    /** 子网ID，创建虚拟机时必须选择VPC网络和所属子网，即选择虚拟要加入的网络及IP网段 */
    @NotEmpty
    @OpenAPIParam("SubnetID")
    private String subnetIDParam;

    /** 标签键值对，用于资源标记和分类管理，格式为key:value的字符串，传入Base64编码的字符串 */
    
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** 删除保护策略，取值范围：0（开启删除保护，删除操作会被拒绝）、1（关闭删除保护，允许删除），默认值：0 */
    
    @OpenAPIParam("TerminationPolicy")
    private Integer terminationPolicyParam;

    /** 计算集群类型，MySQL实例所在计算集群类型，注意：AARCH64架构不支持MySQL 5.7版本 */
    @NotEmpty
    @OpenAPIParam("VMType")
    private String vMTypeParam;

    /** VPCID，创建虚拟机时必须选择VPC网络和所属子网，即选择虚拟要加入的网络及IP网段 */
    @NotEmpty
    @OpenAPIParam("VPCID")
    private String vPCIDParam;

    /** MySQL版本，必须为枚举值之一，取值范围：MySQL 5.7、MySQL 8.0，注意：AARCH64架构不支持MySQL 5.7版本 */
    @NotEmpty
    @OpenAPIParam("Version")
    private String versionParam;

    /** 外网安全组ID，用于外网访问控制，如果需要使用外网安全组，需提前创建安全组后获取其ID */
    
    @OpenAPIParam("WANSGID")
    private String wANSGIDParam;


    public String getBackupID() {
        return backupIDParam;
    }

    public void setBackupID(String backupIDParam) {
        this.backupIDParam = backupIDParam;
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

    public String getConfigFileID() {
        return configFileIDParam;
    }

    public void setConfigFileID(String configFileIDParam) {
        this.configFileIDParam = configFileIDParam;
    }

    public String getDiskSetType() {
        return diskSetTypeParam;
    }

    public void setDiskSetType(String diskSetTypeParam) {
        this.diskSetTypeParam = diskSetTypeParam;
    }

    public Integer getDiskSpace() {
        return diskSpaceParam;
    }

    public void setDiskSpace(Integer diskSpaceParam) {
        this.diskSpaceParam = diskSpaceParam;
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

    public Integer getRestoreTime() {
        return restoreTimeParam;
    }

    public void setRestoreTime(Integer restoreTimeParam) {
        this.restoreTimeParam = restoreTimeParam;
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

    public String getVersion() {
        return versionParam;
    }

    public void setVersion(String versionParam) {
        this.versionParam = versionParam;
    }

    public String getWANSGID() {
        return wANSGIDParam;
    }

    public void setWANSGID(String wANSGIDParam) {
        this.wANSGIDParam = wANSGIDParam;
    }

}
