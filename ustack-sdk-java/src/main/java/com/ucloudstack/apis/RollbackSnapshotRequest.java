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

public class RollbackSnapshotRequest extends Request {

    /** 租户ID，资源所属租户标识 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 磁盘ID，要回滚的目标磁盘标识，磁盘必须处于可用状态且不在回收站 */
    @NotEmpty
    @UCloudStackParam("DiskID")
    private String diskIDParam;

    /** 地域ID，指定资源所属的地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 快照ID，要回滚到的快照标识 */
    @NotEmpty
    @UCloudStackParam("SnapshotID")
    private String snapshotIDParam;


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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSnapshotID() {
        return snapshotIDParam;
    }

    public void setSnapshotID(String snapshotIDParam) {
        this.snapshotIDParam = snapshotIDParam;
    }

}
