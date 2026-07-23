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

public class GetVMWareClusterDatastoreRequest extends Request {

    /** 集群ID，VMware计算集群标识 */
    @NotEmpty
    @OpenAPIParam("ClusterID")
    private String clusterIDParam;

    /** 集群名称，VMware计算集群标识 */
    @NotEmpty
    @OpenAPIParam("ClusterName")
    private String clusterNameParam;

    /** vmware配置名称，指定VMware连接配置标识 */
    @NotEmpty
    @OpenAPIParam("ConfigName")
    private String configNameParam;

    /** 数据中心名称，VMware数据中心标识 */
    @NotEmpty
    @OpenAPIParam("Datacenter")
    private String datacenterParam;


    public String getClusterID() {
        return clusterIDParam;
    }

    public void setClusterID(String clusterIDParam) {
        this.clusterIDParam = clusterIDParam;
    }

    public String getClusterName() {
        return clusterNameParam;
    }

    public void setClusterName(String clusterNameParam) {
        this.clusterNameParam = clusterNameParam;
    }

    public String getConfigName() {
        return configNameParam;
    }

    public void setConfigName(String configNameParam) {
        this.configNameParam = configNameParam;
    }

    public String getDatacenter() {
        return datacenterParam;
    }

    public void setDatacenter(String datacenterParam) {
        this.datacenterParam = datacenterParam;
    }

}
