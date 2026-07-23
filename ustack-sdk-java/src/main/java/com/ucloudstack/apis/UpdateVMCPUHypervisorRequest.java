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

public class UpdateVMCPUHypervisorRequest extends Request {

    /** 是否隐藏虚拟化标记，true表示隐藏，false表示不隐藏 */
    
    @UCloudStackParam("CPUHypervisorDisable")
    private Boolean cPUHypervisorDisableParam;

    /** 租户唯一标识ID */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 虚拟机ID */
    @NotEmpty
    @UCloudStackParam("VMID")
    private String vMIDParam;


    public Boolean getCPUHypervisorDisable() {
        return cPUHypervisorDisableParam;
    }

    public void setCPUHypervisorDisable(Boolean cPUHypervisorDisableParam) {
        this.cPUHypervisorDisableParam = cPUHypervisorDisableParam;
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

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
