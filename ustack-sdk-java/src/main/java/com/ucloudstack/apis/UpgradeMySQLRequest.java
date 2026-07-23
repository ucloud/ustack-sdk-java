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

public class UpgradeMySQLRequest extends Request {

    /** 租户ID，资源所属租户 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 目标存储容量，单位：GiB，最小值为10GB，升级限制：不能小于当前磁盘容量；若存在从库，从库磁盘必须先升级到大于等于此规格；若无变更则该项不生效 */
    @NotEmpty
    @OpenAPIParam("DiskSpace")
    private Integer diskSpaceParam;

    /** 目标内存大小，单位：MiB，必须是1024的倍数，升级限制：不能小于当前内存；AARCH64架构不支持热升级，实例必须先停止；若无变更则该项不生效 */
    @NotEmpty
    @OpenAPIParam("Memory")
    private Integer memoryParam;

    /** MySQL实例ID，指定要升级的MySQL实例；注意：资源必须为AVAILABLE，存在从库时需先将从库规格升级到不小于目标规格 */
    @NotEmpty
    @OpenAPIParam("MySQLID")
    private String mySQLIDParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getDiskSpace() {
        return diskSpaceParam;
    }

    public void setDiskSpace(Integer diskSpaceParam) {
        this.diskSpaceParam = diskSpaceParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public String getMySQLID() {
        return mySQLIDParam;
    }

    public void setMySQLID(String mySQLIDParam) {
        this.mySQLIDParam = mySQLIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
