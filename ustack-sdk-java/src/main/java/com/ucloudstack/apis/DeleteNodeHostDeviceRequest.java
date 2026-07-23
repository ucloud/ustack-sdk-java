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

public class DeleteNodeHostDeviceRequest extends Request {

    /** 租户唯一标识ID，标识请求发起租户 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 外置设备ID，待删除设备的资源标识 */
    @NotEmpty
    @UCloudStackParam("HostDeviceID")
    private String hostDeviceIDParam;

    /** 设备类型，标识待删除设备的类型 */
    @NotEmpty
    @UCloudStackParam("HostDeviceType")
    private String hostDeviceTypeParam;

    /** 地域ID，用于标识外置设备资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getHostDeviceID() {
        return hostDeviceIDParam;
    }

    public void setHostDeviceID(String hostDeviceIDParam) {
        this.hostDeviceIDParam = hostDeviceIDParam;
    }

    public String getHostDeviceType() {
        return hostDeviceTypeParam;
    }

    public void setHostDeviceType(String hostDeviceTypeParam) {
        this.hostDeviceTypeParam = hostDeviceTypeParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
