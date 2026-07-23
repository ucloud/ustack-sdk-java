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

public class GetDTSPriceRequest extends Request {

    /** CPU核数，用于指定DTS实例的CPU配置 */
    @NotEmpty
    @OpenAPIParam("CPU")
    private Integer cPUParam;

    /** 计费类型，用于指定计费模式，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费）；兼容历史值：hour、month、year，别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR */
    @NotEmpty
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 计算集群类型，用于指定DTS实例运行的计算集群 */
    @NotEmpty
    @OpenAPIParam("ComputeClass")
    private String computeClassParam;

    /** 购买数量，用于批量购买时指定购买的DTS实例数量 */
    @NotEmpty
    @OpenAPIParam("Count")
    private Integer countParam;

    /** DTS任务ID，用于计算升级配置时的费用差价；不指定则计算新购价格 */
    
    @OpenAPIParam("DTSID")
    private String dTSIDParam;

    /** 内存大小，单位GB，用于指定DTS实例的内存配置 */
    @NotEmpty
    @OpenAPIParam("Memory")
    private Integer memoryParam;

    /** 计费数量，用于指定购买时长的数量，按月/年计费时表示购买的月/年数，按小时计费时默认为1， */
    @NotEmpty
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 存储集群类型，用于指定DTS实例系统盘所在存储集群 */
    @NotEmpty
    @OpenAPIParam("StorageClass")
    private String storageClassParam;


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

    public String getComputeClass() {
        return computeClassParam;
    }

    public void setComputeClass(String computeClassParam) {
        this.computeClassParam = computeClassParam;
    }

    public Integer getCount() {
        return countParam;
    }

    public void setCount(Integer countParam) {
        this.countParam = countParam;
    }

    public String getDTSID() {
        return dTSIDParam;
    }

    public void setDTSID(String dTSIDParam) {
        this.dTSIDParam = dTSIDParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
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

    public String getStorageClass() {
        return storageClassParam;
    }

    public void setStorageClass(String storageClassParam) {
        this.storageClassParam = storageClassParam;
    }

}
