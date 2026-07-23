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

public class MigratePaaSStorageRequest extends Request {

    /** 计费类型，预留字段，系统会根据资源当前订单自动计算差价，可留空 */
    
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，保留字段，当前仅用于审计 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 实例ID，指定要迁移存储的虚拟机，必须属于上述资源且其当前存储集群类型与目标集群不同 */
    @NotEmpty
    @OpenAPIParam("InstanceID")
    private String instanceIDParam;

    /** 迁移限速，单位MB/s，写入资源注解后由控制器执行限速，0表示不限速 */
    
    @OpenAPIParam("MigrateLimit")
    private Integer migrateLimitParam;

    /** 目标存储集群ID，后台会校验集群存在且类型与当前不同，否则返回错误 */
    @NotEmpty
    @OpenAPIParam("MigrateStorageSetID")
    private String migrateStorageSetIDParam;

    /** 计费数量，预留字段，仅当ChargeType为预付费场景时使用，其他场景可留空 */
    
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，指定资源所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** PaaS资源ID，支持MYSQL、REDIS、FS、OSS、DTS等拥有虚拟机的PaaS资源；要求资源处于AVAILABLE，运行状态为Running，且若非DTS必须为最新版本 */
    @NotEmpty
    @OpenAPIParam("ResourceID")
    private String resourceIDParam;


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

    public String getInstanceID() {
        return instanceIDParam;
    }

    public void setInstanceID(String instanceIDParam) {
        this.instanceIDParam = instanceIDParam;
    }

    public Integer getMigrateLimit() {
        return migrateLimitParam;
    }

    public void setMigrateLimit(Integer migrateLimitParam) {
        this.migrateLimitParam = migrateLimitParam;
    }

    public String getMigrateStorageSetID() {
        return migrateStorageSetIDParam;
    }

    public void setMigrateStorageSetID(String migrateStorageSetIDParam) {
        this.migrateStorageSetIDParam = migrateStorageSetIDParam;
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

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

}
