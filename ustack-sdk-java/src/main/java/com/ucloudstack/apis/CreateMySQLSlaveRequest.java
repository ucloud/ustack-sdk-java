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

public class CreateMySQLSlaveRequest extends Request {

    /** 计费类型，取值Dynamic/Month/Year，分别对应HOUR/MONTH/YEAR */
    @NotEmpty
    @UCloudStackParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，实例所属租户 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 存储集群类型，实例数据盘所属存储集群类型 */
    @NotEmpty
    @UCloudStackParam("DiskSetType")
    private String diskSetTypeParam;

    /** 存储容量，单位GiB，且不得小于主库容量 */
    @NotEmpty
    @UCloudStackParam("DiskSpace")
    private Integer diskSpaceParam;

    /** 外网IP资源ID，用于绑定公网IP */
    
    @UCloudStackParam("EIPID")
    private String eIPIDParam;

    /** 主库ID，从库所属主库实例ID；必须为主库实例，单主库最多5个从库 */
    @NotEmpty
    @UCloudStackParam("MasterID")
    private String masterIDParam;

    /** 内存大小，单位MiB，必须是1024的倍数，且不得小于主库内存 */
    @NotEmpty
    @UCloudStackParam("Memory")
    private Integer memoryParam;

    /** 从库名称，从库实例名称，支持中文、英文字母、数字、点、下划线和中划线，长度1-128字符 */
    @NotEmpty
    @UCloudStackParam("Name")
    private String nameParam;

    /** 计费数量，用于指定购买时长的数量，按月/年计费时表示购买的月/年数，按小时计费时默认为1 */
    @NotEmpty
    @UCloudStackParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，实例所属地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 从库描述，从库实例备注，长度0-100字符，禁止http://或https://等非法字符 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 标签键值对，资源标签键值对列表，格式为Base64编码的key:value */
    
    @UCloudStackParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** 计算集群类型，实例所属计算集群类型 */
    @NotEmpty
    @UCloudStackParam("VMType")
    private String vMTypeParam;

    /** 外网安全组ID，用于外网访问控制 */
    
    @UCloudStackParam("WANSGID")
    private String wANSGIDParam;


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

    public String getMasterID() {
        return masterIDParam;
    }

    public void setMasterID(String masterIDParam) {
        this.masterIDParam = masterIDParam;
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

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

    public String getVMType() {
        return vMTypeParam;
    }

    public void setVMType(String vMTypeParam) {
        this.vMTypeParam = vMTypeParam;
    }

    public String getWANSGID() {
        return wANSGIDParam;
    }

    public void setWANSGID(String wANSGIDParam) {
        this.wANSGIDParam = wANSGIDParam;
    }

}
