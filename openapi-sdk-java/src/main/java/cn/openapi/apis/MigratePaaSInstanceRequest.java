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
package cn.openapi.apis;

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class MigratePaaSInstanceRequest extends Request {

    /** 租户ID，保留字段 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 实例ID，指定要迁移的虚拟机，必须属于该PaaS资源，若指定的实例不在资源的虚拟机列表中或已经位于目标集群，接口会返回参数错误 */
    @NotEmpty
    @OpenAPIParam("InstanceID")
    private String instanceIDParam;

    /** 目标计算集群ID，系统会验证集群存在，若传入的集群不存在会返回错误 */
    @NotEmpty
    @OpenAPIParam("MigrateComputeSetID")
    private String migrateComputeSetIDParam;

    /** 目标宿主机IP，可选字段，不传时由控制器自动调度；传入时需为有效IPv4 */
    
    @OpenAPIParam("MigrateHostIP")
    private String migrateHostIPParam;

    /** 地域ID，指定资源所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源ID，支持MYSQL、REDIS、OSS、FS、LB、NATGW、VPNGW、DTS等PaaS资源；资源状态必须为AVAILABLE且运行状态为Running或Stopped */
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
