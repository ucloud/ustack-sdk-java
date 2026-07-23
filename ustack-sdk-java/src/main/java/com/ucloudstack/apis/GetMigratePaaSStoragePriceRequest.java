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

public class GetMigratePaaSStoragePriceRequest extends Request {

    /** 租户ID，保留字段 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 实例ID，指定要评估存储迁移费用的虚拟机，必须属于该PaaS资源 */
    @NotEmpty
    @OpenAPIParam("InstanceID")
    private String instanceIDParam;

    /** 目标存储集群ID，后台会验证集群存在且合法 */
    @NotEmpty
    @OpenAPIParam("MigrateStorageSetID")
    private String migrateStorageSetIDParam;

    /** 地域ID，指定资源所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** PaaS资源ID，需处于AVAILABLE状态，且仅支持发起存储迁移的资源类型（MYSQL、REDIS、FS、OSS、DTS等） */
    @NotEmpty
    @OpenAPIParam("ResourceID")
    private String resourceIDParam;


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

    public String getMigrateStorageSetID() {
        return migrateStorageSetIDParam;
    }

    public void setMigrateStorageSetID(String migrateStorageSetIDParam) {
        this.migrateStorageSetIDParam = migrateStorageSetIDParam;
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
