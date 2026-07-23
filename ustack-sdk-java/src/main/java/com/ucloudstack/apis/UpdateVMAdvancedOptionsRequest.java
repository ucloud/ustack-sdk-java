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

public class UpdateVMAdvancedOptionsRequest extends Request {

    /** 已废弃，不生效 */
    
    @OpenAPIParam("BootloaderType")
    private String bootloaderTypeParam;

    /** 已废弃，不生效 */
    
    @OpenAPIParam("CPUMode")
    private String cPUModeParam;

    /** 已废弃，不生效 */
    
    @OpenAPIParam("CPUModel")
    private String cPUModelParam;

    /** DNS配置，虚拟机使用的DNS服务器列表 */
    
    @OpenAPIParam("DNS")
    private String dNSParam;

    /** 已废弃，不生效 */
    
    @OpenAPIParam("DiskCacheMode")
    private String diskCacheModeParam;

    /** 已废弃，不生效 */
    
    @OpenAPIParam("HighAvailability")
    private String highAvailabilityParam;

    /** 已废弃，不生效 */
    
    @OpenAPIParam("ISOTotal")
    private Integer iSOTotalParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 已废弃，不生效 */
    
    @OpenAPIParam("UninstallISO")
    private Boolean uninstallISOParam;

    /** 自定义数据，需 base64 编码后传入 */
    
    @OpenAPIParam("UserData")
    private String userDataParam;

    /** 虚拟机ID，待修改配置的虚拟机标识 */
    @NotEmpty
    @OpenAPIParam("VMID")
    private String vMIDParam;


    public String getBootloaderType() {
        return bootloaderTypeParam;
    }

    public void setBootloaderType(String bootloaderTypeParam) {
        this.bootloaderTypeParam = bootloaderTypeParam;
    }

    public String getCPUMode() {
        return cPUModeParam;
    }

    public void setCPUMode(String cPUModeParam) {
        this.cPUModeParam = cPUModeParam;
    }

    public String getCPUModel() {
        return cPUModelParam;
    }

    public void setCPUModel(String cPUModelParam) {
        this.cPUModelParam = cPUModelParam;
    }

    public String getDNS() {
        return dNSParam;
    }

    public void setDNS(String dNSParam) {
        this.dNSParam = dNSParam;
    }

    public String getDiskCacheMode() {
        return diskCacheModeParam;
    }

    public void setDiskCacheMode(String diskCacheModeParam) {
        this.diskCacheModeParam = diskCacheModeParam;
    }

    public String getHighAvailability() {
        return highAvailabilityParam;
    }

    public void setHighAvailability(String highAvailabilityParam) {
        this.highAvailabilityParam = highAvailabilityParam;
    }

    public Integer getISOTotal() {
        return iSOTotalParam;
    }

    public void setISOTotal(Integer iSOTotalParam) {
        this.iSOTotalParam = iSOTotalParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public Boolean getUninstallISO() {
        return uninstallISOParam;
    }

    public void setUninstallISO(Boolean uninstallISOParam) {
        this.uninstallISOParam = uninstallISOParam;
    }

    public String getUserData() {
        return userDataParam;
    }

    public void setUserData(String userDataParam) {
        this.userDataParam = userDataParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
