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

public class UpdateVMAdvancedOptionsRequest extends Request {

    /** 引导方式，虚拟机的系统引导协议，取值：bios、uefi */
    
    @UCloudStackParam("BootloaderType")
    private String bootloaderTypeParam;

    /** CPU模式，虚拟机的CPU模拟方式，取值：host-passthrough（直通）、custom（自定义） */
    
    @UCloudStackParam("CPUMode")
    private String cPUModeParam;

    /** CPU型号，仅在CPUMode为custom时生效，取值：default、general、other */
    
    @UCloudStackParam("CPUModel")
    private String cPUModelParam;

    /** DNS配置，虚拟机使用的DNS服务器列表 */
    
    @UCloudStackParam("DNS")
    private String dNSParam;

    /** 磁盘缓存模式，磁盘I/O缓存策略，取值：writeback、none、directsync */
    
    @UCloudStackParam("DiskCacheMode")
    private String diskCacheModeParam;

    /** 高可用模式，虚拟机的HA策略，取值：NeverStop（默认）、None */
    
    @UCloudStackParam("HighAvailability")
    private String highAvailabilityParam;

    /** ISO插槽配额，配置的ISO挂载插槽数量，需重启生效 */
    
    @UCloudStackParam("ISOTotal")
    private Integer iSOTotalParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 卸载ISO，标识是否卸载挂载的ISO镜像 */
    
    @UCloudStackParam("UninstallISO")
    private Boolean uninstallISOParam;

    /** Cloud-Init脚本，用于自定义系统初始化配置 */
    
    @UCloudStackParam("UserData")
    private String userDataParam;

    /** 虚拟机ID，待修改配置的虚拟机标识 */
    @NotEmpty
    @UCloudStackParam("VMID")
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
