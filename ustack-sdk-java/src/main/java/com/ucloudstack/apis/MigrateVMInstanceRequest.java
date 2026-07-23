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

public class MigrateVMInstanceRequest extends Request {

    /** 是否自动收敛 */
    
    @OpenAPIParam("AutoConverge")
    private Boolean autoConvergeParam;

    /** 计算实例ID，用于标识待迁移的虚拟机 */
    @NotEmpty
    @OpenAPIParam("CIID")
    private String cIIDParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 物理机IP地址，用于标识源宿主机IP */
    
    @OpenAPIParam("HostIP")
    private String hostIPParam;

    /** 目标宿主机IP地址，需为合法IP且不可与HostIP相同 */
    
    @OpenAPIParam("MigrateHostIP")
    private String migrateHostIPParam;

    /** 目标集群ID，用于标识目标集群 */
    @NotEmpty
    @OpenAPIParam("MigrateSetID")
    private String migrateSetIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 计算集群ID，源虚拟机所在计算集群标识 */
    
    @OpenAPIParam("SetID")
    private String setIDParam;


    public Boolean getAutoConverge() {
        return autoConvergeParam;
    }

    public void setAutoConverge(Boolean autoConvergeParam) {
        this.autoConvergeParam = autoConvergeParam;
    }

    public String getCIID() {
        return cIIDParam;
    }

    public void setCIID(String cIIDParam) {
        this.cIIDParam = cIIDParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getHostIP() {
        return hostIPParam;
    }

    public void setHostIP(String hostIPParam) {
        this.hostIPParam = hostIPParam;
    }

    public String getMigrateHostIP() {
        return migrateHostIPParam;
    }

    public void setMigrateHostIP(String migrateHostIPParam) {
        this.migrateHostIPParam = migrateHostIPParam;
    }

    public String getMigrateSetID() {
        return migrateSetIDParam;
    }

    public void setMigrateSetID(String migrateSetIDParam) {
        this.migrateSetIDParam = migrateSetIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

}
