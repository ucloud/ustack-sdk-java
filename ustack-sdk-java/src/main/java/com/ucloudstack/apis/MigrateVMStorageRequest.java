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

public class MigrateVMStorageRequest extends Request {

    /** 计费类型，新磁盘的计费模式，取值：Dynamic、Month、Year */
    
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 磁盘迁移信息，格式：原盘ID|目标集群ID|目标盘ID，目标盘ID可为空（自动创建） */
    @NotEmpty
    @OpenAPIParam("Infos")
    private List<String> infosParam;

    /** 计费周期，购买的时长，按月/年计费时表示月数/年数 */
    
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 保留原盘，标识迁移后是否保留源磁盘 */
    
    @OpenAPIParam("ReserveOriginDisk")
    private Boolean reserveOriginDiskParam;

    /** 虚拟机ID，待迁移存储的虚拟机标识 */
    @NotEmpty
    @OpenAPIParam("VMID")
    private String vMIDParam;


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

    public List<String> getInfos() {
        return infosParam;
    }

    public void setInfos(List<String> infosParam) {
        this.infosParam = infosParam;
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

    public Boolean getReserveOriginDisk() {
        return reserveOriginDiskParam;
    }

    public void setReserveOriginDisk(Boolean reserveOriginDiskParam) {
        this.reserveOriginDiskParam = reserveOriginDiskParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
