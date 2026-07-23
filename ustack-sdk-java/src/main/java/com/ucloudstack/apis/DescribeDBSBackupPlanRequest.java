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

public class DescribeDBSBackupPlanRequest extends Request {

    /** 备份ID，筛选指定备份 */
    
    @OpenAPIParam("BackupID")
    private String backupIDParam;

    /** 租户ID，用于筛选指定租户的计划 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 分页大小，指定每页返回的记录数，默认10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数，默认0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 备份计划ID，筛选指定计划 */
    
    @OpenAPIParam("PlanID")
    private String planIDParam;

    /** 地域ID，备份计划所属地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备份源ID，筛选指定备份源 */
    
    @OpenAPIParam("SrcResourceID")
    private String srcResourceIDParam;


    public String getBackupID() {
        return backupIDParam;
    }

    public void setBackupID(String backupIDParam) {
        this.backupIDParam = backupIDParam;
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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSrcResourceID() {
        return srcResourceIDParam;
    }

    public void setSrcResourceID(String srcResourceIDParam) {
        this.srcResourceIDParam = srcResourceIDParam;
    }

}
