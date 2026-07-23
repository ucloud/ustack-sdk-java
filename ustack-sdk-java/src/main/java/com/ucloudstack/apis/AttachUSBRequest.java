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

public class AttachUSBRequest extends Request {

    /** 加载类型，取值Passthrough、redir */
    @NotEmpty
    @UCloudStackParam("AttachType")
    private String attachTypeParam;

    /** 租户唯一标识ID，用于验证USB设备归属权限，确保只能操作属于当前租户的设备 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** USB设备ID，指定要加载到虚拟机的USB设备 */
    @NotEmpty
    @UCloudStackParam("USBDeviceID")
    private String uSBDeviceIDParam;

    /** 虚拟机ID，USB设备要加载到的目标虚拟机 */
    @NotEmpty
    @UCloudStackParam("VMID")
    private String vMIDParam;


    public String getAttachType() {
        return attachTypeParam;
    }

    public void setAttachType(String attachTypeParam) {
        this.attachTypeParam = attachTypeParam;
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

    public String getUSBDeviceID() {
        return uSBDeviceIDParam;
    }

    public void setUSBDeviceID(String uSBDeviceIDParam) {
        this.uSBDeviceIDParam = uSBDeviceIDParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
