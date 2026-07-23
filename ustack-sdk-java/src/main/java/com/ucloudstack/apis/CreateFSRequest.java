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

public class CreateFSRequest extends Request {

    /** 备份ID，用于从快照恢复创建文件存储，指定后自动继承容量和存储集群类型 */
    
    @OpenAPIParam("BackupID")
    private String backupIDParam;

    /** 计费类型，计费模式，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费）；兼容历史值：hour、month、year，别名映射：Dynamic→HOUR、Month→MONTH、Year→YEAR */
    @NotEmpty
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，资源所属租户标识 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 存储集群类型，用于指定数据盘使用的存储集群，指定BackupID时自动继承快照存储类型 */
    @NotEmpty
    @OpenAPIParam("DiskSetType")
    private String diskSetTypeParam;

    /** 存储容量，单位GiB，最小值100，指定BackupID时自动继承快照容量 */
    @NotEmpty
    @OpenAPIParam("DiskSpace")
    private Integer diskSpaceParam;

    /** 弹性公网IP ID，为文件存储绑定公网IP，该EIP需未绑定其他资源 */
    
    @OpenAPIParam("EIPID")
    private String eIPIDParam;

    /** 文件存储名称，支持中英文、数字、点、下划线和中划线，长度1-128个字符 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 项目组ID，资源所属项目组，未传时尝试分配默认项目 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 计费数量，用于指定购买时长的数量，按月/年计费时表示购买的月/年数，按小时计费时默认为1 */
    @NotEmpty
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，用于说明，长度0-100个中英文字符，禁止包含http://或https://等非法字符 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 子网ID，文件存储所属子网标识 */
    @NotEmpty
    @OpenAPIParam("SubnetID")
    private String subnetIDParam;

    /** 标签键值对，用于资源标记和分类管理，格式为key:value的字符串，传入Base64编码 */
    
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** 删除保护策略，取值范围：0（开启删除保护，拒绝删除操作）、1（关闭删除保护，允许删除） */
    
    @OpenAPIParam("TerminationPolicy")
    private Integer terminationPolicyParam;

    /** 计算集群类型，系统会根据集群架构自动选择对应镜像（x86_64或AArch64） */
    @NotEmpty
    @OpenAPIParam("VMType")
    private String vMTypeParam;

    /** VPC ID，文件存储所属VPC的唯一标识 */
    @NotEmpty
    @OpenAPIParam("VPCID")
    private String vPCIDParam;

    /** 外网安全组ID，用于控制文件存储的公网访问规则 */
    
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

    public String getWANSGID() {
        return wANSGIDParam;
    }

    public void setWANSGID(String wANSGIDParam) {
        this.wANSGIDParam = wANSGIDParam;
    }

}
