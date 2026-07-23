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

public class GetClusterPriceRequest extends Request {

    /** CPU核数 */
    
    @OpenAPIParam("CPU")
    private Integer cPUParam;

    /** 计费类型 */
    @NotEmpty
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** ClusterID */
    
    @OpenAPIParam("ClusterID")
    private String clusterIDParam;

    /** 租户ID */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 计算集群类型 */
    @NotEmpty
    @OpenAPIParam("ComputeclassType")
    private String computeclassTypeParam;

    /** 高可用 */
    
    @OpenAPIParam("HighAvailability")
    private String highAvailabilityParam;

    /** 内存大小 */
    
    @OpenAPIParam("Memory")
    private Integer memoryParam;

    /** 计费周期 */
    
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 存储集群类型 */
    @NotEmpty
    @OpenAPIParam("StorageclassType")
    private String storageclassTypeParam;


    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
    }

    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public String getClusterID() {
        return clusterIDParam;
    }

    public void setClusterID(String clusterIDParam) {
        this.clusterIDParam = clusterIDParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getComputeclassType() {
        return computeclassTypeParam;
    }

    public void setComputeclassType(String computeclassTypeParam) {
        this.computeclassTypeParam = computeclassTypeParam;
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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getStorageclassType() {
        return storageclassTypeParam;
    }

    public void setStorageclassType(String storageclassTypeParam) {
        this.storageclassTypeParam = storageclassTypeParam;
    }

}
