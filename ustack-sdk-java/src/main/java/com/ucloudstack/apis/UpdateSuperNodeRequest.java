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

public class UpdateSuperNodeRequest extends Request {

    /** 集群Id */
    @NotEmpty
    @UCloudStackParam("ClusterID")
    private String clusterIDParam;

    /** 租户ID */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 节点最大CPU数量 */
    
    @UCloudStackParam("MaxCPU")
    private Integer maxCPUParam;

    /** 节点最大内存容量 */
    
    @UCloudStackParam("MaxMemory")
    private Integer maxMemoryParam;

    /** 节点最大pod数量 */
    
    @UCloudStackParam("MaxPods")
    private Integer maxPodsParam;

    /** 节点名称 */
    @NotEmpty
    @UCloudStackParam("NodeName")
    private String nodeNameParam;

    /** 地域 */
    @NotEmpty
    @UCloudStackParam("Region")
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

    public String getNodeName() {
        return nodeNameParam;
    }

    public void setNodeName(String nodeNameParam) {
        this.nodeNameParam = nodeNameParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
