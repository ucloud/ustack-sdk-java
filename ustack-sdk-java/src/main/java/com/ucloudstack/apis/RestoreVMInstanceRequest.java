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

public class RestoreVMInstanceRequest extends Request {

    /** 允许跨机，标识是否允许调度到其他宿主机 */
    
    @UCloudStackParam("AllowOtherHost")
    private Boolean allowOtherHostParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 快照ID，从快照恢复时指定，从暂存恢复时可为空 */
    
    @UCloudStackParam("SPID")
    private String sPIDParam;

    /** 虚拟机ID，待恢复的虚拟机标识 */
    @NotEmpty
    @UCloudStackParam("VMID")
    private String vMIDParam;


    public Boolean getAllowOtherHost() {
        return allowOtherHostParam;
    }

    public void setAllowOtherHost(Boolean allowOtherHostParam) {
        this.allowOtherHostParam = allowOtherHostParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSPID() {
        return sPIDParam;
    }

    public void setSPID(String sPIDParam) {
        this.sPIDParam = sPIDParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
