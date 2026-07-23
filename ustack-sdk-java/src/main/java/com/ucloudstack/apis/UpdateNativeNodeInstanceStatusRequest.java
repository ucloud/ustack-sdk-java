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

public class UpdateNativeNodeInstanceStatusRequest extends Request {

    /** 集群Id */
    @NotEmpty
    @UCloudStackParam("ClusterID")
    private String clusterIDParam;

    /** 租户ID */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 节点实例状态 */
    @NotEmpty
    @UCloudStackParam("InstanceStatus")
    private String instanceStatusParam;

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

    public String getInstanceStatus() {
        return instanceStatusParam;
    }

    public void setInstanceStatus(String instanceStatusParam) {
        this.instanceStatusParam = instanceStatusParam;
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
