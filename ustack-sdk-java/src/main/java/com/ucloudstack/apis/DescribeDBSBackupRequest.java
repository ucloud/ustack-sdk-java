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

public class DescribeDBSBackupRequest extends Request {

    /** 备份ID列表，筛选指定备份 */
    
    @UCloudStackParam("BackupIDs")
    private List<String> backupIDsParam;

    /** 备份类型，取值Logical/Physical/Snapshot/Incremental */
    
    @UCloudStackParam("BackupType")
    private String backupTypeParam;

    /** 租户ID，用于筛选指定租户的备份 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 分页大小，指定每页返回的记录数，默认10 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，默认0 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 计划ID，筛选指定备份计划 */
    
    @UCloudStackParam("PlanID")
    private String planIDParam;

    /** 源资源ID，备份源资源ID */
    
    @UCloudStackParam("SrcResourceID")
    private String srcResourceIDParam;

    /** 源数据地域，备份源资源所属地域 */
    
    @UCloudStackParam("SrcResourceRegion")
    private String srcResourceRegionParam;

    /** 存储池ID，筛选指定存储池 */
    
    @UCloudStackParam("StorageID")
    private String storageIDParam;


    public List<String> getBackupIDs() {
        return backupIDsParam;
    }

    public void setBackupIDs(List<String> backupIDsParam) {
        this.backupIDsParam = backupIDsParam;
    }

    public String getBackupType() {
        return backupTypeParam;
    }

    public void setBackupType(String backupTypeParam) {
        this.backupTypeParam = backupTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public String getPlanID() {
        return planIDParam;
    }

    public void setPlanID(String planIDParam) {
        this.planIDParam = planIDParam;
    }

    public String getSrcResourceID() {
        return srcResourceIDParam;
    }

    public void setSrcResourceID(String srcResourceIDParam) {
        this.srcResourceIDParam = srcResourceIDParam;
    }

    public String getSrcResourceRegion() {
        return srcResourceRegionParam;
    }

    public void setSrcResourceRegion(String srcResourceRegionParam) {
        this.srcResourceRegionParam = srcResourceRegionParam;
    }

    public String getStorageID() {
        return storageIDParam;
    }

    public void setStorageID(String storageIDParam) {
        this.storageIDParam = storageIDParam;
    }

}
