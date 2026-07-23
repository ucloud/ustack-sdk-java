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

public class GetMigratePaaSInstancePriceRequest extends Request {

    /** 是否为取消迁移，true表示按照旧集群（AK_MIGRATE_OLD_SET_HOST_IP记录）计算回滚差价；false表示按MigrateComputeSetID计算迁移差价 */
    
    @UCloudStackParam("AbortMigrate")
    private Boolean abortMigrateParam;

    /** 租户ID，保留字段 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 实例ID，要查询差价的虚拟机，必须属于该PaaS资源 */
    @NotEmpty
    @UCloudStackParam("InstanceID")
    private String instanceIDParam;

    /** 目标计算集群ID，AbortMigrate为false时必填并会被校验；为true时忽略此字段 */
    
    @UCloudStackParam("MigrateComputeSetID")
    private String migrateComputeSetIDParam;

    /** 目标宿主机IP，可选字段；当前计费逻辑未使用，当AbortMigrate为true时忽略此值 */
    
    @UCloudStackParam("MigrateHostIP")
    private String migrateHostIPParam;

    /** 地域ID，指定资源所属地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 资源ID，需为支持计算迁移的PaaS资源且处于AVAILABLE状态 */
    @NotEmpty
    @UCloudStackParam("ResourceID")
    private String resourceIDParam;


    public Boolean getAbortMigrate() {
        return abortMigrateParam;
    }

    public void setAbortMigrate(Boolean abortMigrateParam) {
        this.abortMigrateParam = abortMigrateParam;
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

    public String getMigrateComputeSetID() {
        return migrateComputeSetIDParam;
    }

    public void setMigrateComputeSetID(String migrateComputeSetIDParam) {
        this.migrateComputeSetIDParam = migrateComputeSetIDParam;
    }

    public String getMigrateHostIP() {
        return migrateHostIPParam;
    }

    public void setMigrateHostIP(String migrateHostIPParam) {
        this.migrateHostIPParam = migrateHostIPParam;
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
