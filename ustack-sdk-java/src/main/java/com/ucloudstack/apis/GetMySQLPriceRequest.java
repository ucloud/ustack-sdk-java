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

public class GetMySQLPriceRequest extends Request {

    /** 计费类型，用于指定计费模式，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费） */
    @NotEmpty
    @UCloudStackParam("ChargeType")
    private String chargeTypeParam;

    /** 租户唯一标识ID，用于标识资源所属的租户，实现多租户环境下的资源隔离 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 存储集群ID，指定云硬盘所在的存储集群 */
    @NotEmpty
    @UCloudStackParam("DiskSetType")
    private String diskSetTypeParam;

    /** 存储容量，单位GiB，最小值为10GB */
    @NotEmpty
    @UCloudStackParam("DiskSpace")
    private Integer diskSpaceParam;

    /** MySQL数据库高可用类型，影响价格计算（双节点vs单节点），取值范围：Standalone（单机版）、ActiveStandy（高可用版/双节点主备） */
    @NotEmpty
    @UCloudStackParam("HighAvailability")
    private String highAvailabilityParam;

    /** 内存大小，单位MiB，必须是1024的倍数 */
    @NotEmpty
    @UCloudStackParam("Memory")
    private Integer memoryParam;

    /** MySQL实例ID，用于区分查询类型，若为空，查询新购价格；若不为空，查询升级差价 */
    
    @UCloudStackParam("MySQLID")
    private String mySQLIDParam;

    /** 计费时长，按月/年计费时表示购买的月数/年数，按小时计费时为1 */
    @NotEmpty
    @UCloudStackParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 计算集群类型，用于获取bootDiskSpace信息进行价格计算 */
    @NotEmpty
    @UCloudStackParam("VMType")
    private String vMTypeParam;


    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getDiskSetType() {
        return diskSetTypeParam;
    }

    public void setDiskSetType(String diskSetTypeParam) {
        this.diskSetTypeParam = diskSetTypeParam;
    }

    public Integer getDiskSpace() {
        return diskSpaceParam;
    }

    public void setDiskSpace(Integer diskSpaceParam) {
        this.diskSpaceParam = diskSpaceParam;
    }

    public String getHighAvailability() {
        return highAvailabilityParam;
    }

    public void setHighAvailability(String highAvailabilityParam) {
        this.highAvailabilityParam = highAvailabilityParam;
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

    public Integer getQuantity() {
        return quantityParam;
    }

    public void setQuantity(Integer quantityParam) {
        this.quantityParam = quantityParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getVMType() {
        return vMTypeParam;
    }

    public void setVMType(String vMTypeParam) {
        this.vMTypeParam = vMTypeParam;
    }

}
