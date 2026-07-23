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

public class UpdateVMDiskCacheModeRequest extends Request {

    /** 缓存类型，取值 directsync、none、writeback */
    
    @UCloudStackParam("CacheMode")
    private String cacheModeParam;

    /** 磁盘id */
    
    @UCloudStackParam("Disk")
    private String diskParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 虚拟机ID，待修改配置的虚拟机标识 */
    @NotEmpty
    @UCloudStackParam("VMID")
    private String vMIDParam;


    public String getCacheMode() {
        return cacheModeParam;
    }

    public void setCacheMode(String cacheModeParam) {
        this.cacheModeParam = cacheModeParam;
    }

    public String getDisk() {
        return diskParam;
    }

    public void setDisk(String diskParam) {
        this.diskParam = diskParam;
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
