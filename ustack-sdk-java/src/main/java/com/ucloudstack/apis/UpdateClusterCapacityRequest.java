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

public class UpdateClusterCapacityRequest extends Request {

    /** 集群Id */
    @NotEmpty
    @OpenAPIParam("ClusterID")
    private String clusterIDParam;

    /** 租户ID */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 集群最大CPU数量 */
    
    @OpenAPIParam("MaxCPU")
    private Integer maxCPUParam;

    /** 集群最大内存容量 */
    
    @OpenAPIParam("MaxMemory")
    private Integer maxMemoryParam;

    /** 集群最大内存容量 */
    
    @OpenAPIParam("MaxPods")
    private Integer maxPodsParam;

    /** 集群最大存储容量 */
    
    @OpenAPIParam("MaxStorage")
    private Integer maxStorageParam;

    /** 集群最大存储容量分配策略 */
    
    @OpenAPIParam("MaxStorageAllocation")
    private String maxStorageAllocationParam;

    /** Region */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


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

    public Integer getMaxCPU() {
        return maxCPUParam;
    }

    public void setMaxCPU(Integer maxCPUParam) {
        this.maxCPUParam = maxCPUParam;
    }

    public Integer getMaxMemory() {
        return maxMemoryParam;
    }

    public void setMaxMemory(Integer maxMemoryParam) {
        this.maxMemoryParam = maxMemoryParam;
    }

    public Integer getMaxPods() {
        return maxPodsParam;
    }

    public void setMaxPods(Integer maxPodsParam) {
        this.maxPodsParam = maxPodsParam;
    }

    public Integer getMaxStorage() {
        return maxStorageParam;
    }

    public void setMaxStorage(Integer maxStorageParam) {
        this.maxStorageParam = maxStorageParam;
    }

    public String getMaxStorageAllocation() {
        return maxStorageAllocationParam;
    }

    public void setMaxStorageAllocation(String maxStorageAllocationParam) {
        this.maxStorageAllocationParam = maxStorageAllocationParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
