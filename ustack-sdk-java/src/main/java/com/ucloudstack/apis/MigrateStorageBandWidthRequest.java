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

public class MigrateStorageBandWidthRequest extends Request {

    /** 迁移带宽，限制迁移速率，单位：MiB/s */
    
    @OpenAPIParam("Bandwidth")
    private Integer bandwidthParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 目标存储集群ID，无Infos参数时必填 */
    
    @OpenAPIParam("DstSetID")
    private String dstSetIDParam;

    /** 磁盘迁移详情，格式：原盘ID|目标集群ID|目标盘ID|带宽，会覆盖Bandwidth和DstSetID */
    
    @OpenAPIParam("Infos")
    private List<String> infosParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 虚拟机ID，待调整带宽的虚拟机标识 */
    @NotEmpty
    @OpenAPIParam("VMID")
    private String vMIDParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getDstSetID() {
        return dstSetIDParam;
    }

    public void setDstSetID(String dstSetIDParam) {
        this.dstSetIDParam = dstSetIDParam;
    }

    public List<String> getInfos() {
        return infosParam;
    }

    public void setInfos(List<String> infosParam) {
        this.infosParam = infosParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
