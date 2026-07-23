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

public class AllocateNodeHostDeviceRequest extends Request {

    /** 外置设备ID，待分配的设备资源标识，设备必须处于未挂载状态 */
    @NotEmpty
    @UCloudStackParam("HostDeviceID")
    private String hostDeviceIDParam;

    /** 项目ID，资源所属的项目分组标识，为空则不关联项目 */
    
    @UCloudStackParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，用于标识外置设备资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 目标租户ID，指定设备要分配给的租户 */
    @NotEmpty
    @UCloudStackParam("TargetCompanyID")
    private Integer targetCompanyIDParam;


    public String getHostDeviceID() {
        return hostDeviceIDParam;
    }

    public void setHostDeviceID(String hostDeviceIDParam) {
        this.hostDeviceIDParam = hostDeviceIDParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public Integer getTargetCompanyID() {
        return targetCompanyIDParam;
    }

    public void setTargetCompanyID(Integer targetCompanyIDParam) {
        this.targetCompanyIDParam = targetCompanyIDParam;
    }

}
