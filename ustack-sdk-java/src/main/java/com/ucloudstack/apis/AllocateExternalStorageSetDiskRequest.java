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

public class AllocateExternalStorageSetDiskRequest extends Request {

    /** 租户ID，资源所属租户的权限上下文 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 硬盘ID，待分配的外置存储盘资源ID */
    @NotEmpty
    @UCloudStackParam("DiskID")
    private String diskIDParam;

    /** 项目ID，资源分配到目标租户后的项目归属，未传时尝试分配默认项目 */
    
    @UCloudStackParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 目标租户ID，指定资源分配后的归属租户 */
    
    @UCloudStackParam("TargetCompanyID")
    private Integer targetCompanyIDParam;


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
