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

public class UpgradeDiskRequest extends Request {

    /** 审批名称，用于审批流程的标题描述，当启用审批流程时使用 */
    
    @OpenAPIParam("ApplicationName")
    private String applicationNameParam;

    /** 审批理由，用于说明申请升级磁盘的原因，当启用审批流程时使用 */
    
    @OpenAPIParam("ApplicationReason")
    private String applicationReasonParam;

    /** 租户ID，资源所属租户标识 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 磁盘ID，要升级的磁盘标识 */
    @NotEmpty
    @OpenAPIParam("DiskID")
    private String diskIDParam;

    /** 磁盘大小，单位GiB，用于扩容到指定容量 */
    @NotEmpty
    @OpenAPIParam("DiskSpace")
    private Integer diskSpaceParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public String getApplicationName() {
        return applicationNameParam;
    }

    public void setApplicationName(String applicationNameParam) {
        this.applicationNameParam = applicationNameParam;
    }

    public String getApplicationReason() {
        return applicationReasonParam;
    }

    public void setApplicationReason(String applicationReasonParam) {
        this.applicationReasonParam = applicationReasonParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getDiskID() {
        return diskIDParam;
    }

    public void setDiskID(String diskIDParam) {
        this.diskIDParam = diskIDParam;
    }

    public Integer getDiskSpace() {
        return diskSpaceParam;
    }

    public void setDiskSpace(Integer diskSpaceParam) {
        this.diskSpaceParam = diskSpaceParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
