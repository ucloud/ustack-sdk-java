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
package cn.openapi.apis;

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class GetRedisPriceRequest extends Request {

    /** 计费类型，取值Dynamic/Month/Year，分别对应HOUR/MONTH/YEAR */
    
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，资源所属租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 存储集群类型，实例数据盘所属存储集群类型 */
    
    @OpenAPIParam("DiskSetType")
    private String diskSetTypeParam;

    /** 高可用类型，影响价格计算，取值范围：Standalone（单机版）、ActiveStandy（高可用/主备版）；与订单中副本数一致 */
    @NotEmpty
    @OpenAPIParam("HighAvailability")
    private String highAvailabilityParam;

    /** 内存大小，单位MiB */
    @NotEmpty
    @OpenAPIParam("Memory")
    private Integer memoryParam;

    /** 计费数量，用于指定购买时长的数量，按月/年计费时表示购买的月/年数，按小时计费时默认为1 */
    
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** Redis实例ID，用于查询升级/变更价格 */
    
    @OpenAPIParam("RedisID")
    private String redisIDParam;

    /** 地域ID，资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 线程数量，Redis7.0有效 */
    
    @OpenAPIParam("Threads")
    private Integer threadsParam;

    /** 计算集群类型，用于计算价格 */
    @NotEmpty
    @OpenAPIParam("VMType")
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

    public Integer getQuantity() {
        return quantityParam;
    }

    public void setQuantity(Integer quantityParam) {
        this.quantityParam = quantityParam;
    }

    public String getRedisID() {
        return redisIDParam;
    }

    public void setRedisID(String redisIDParam) {
        this.redisIDParam = redisIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public Integer getThreads() {
        return threadsParam;
    }

    public void setThreads(Integer threadsParam) {
        this.threadsParam = threadsParam;
    }

    public String getVMType() {
        return vMTypeParam;
    }

    public void setVMType(String vMTypeParam) {
        this.vMTypeParam = vMTypeParam;
    }

}
