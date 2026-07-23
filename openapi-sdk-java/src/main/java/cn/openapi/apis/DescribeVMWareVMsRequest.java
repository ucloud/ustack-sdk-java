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

public class DescribeVMWareVMsRequest extends Request {

    /** 集群名称，VMware集群标识 */
    
    @OpenAPIParam("Cluster")
    private String clusterParam;

    /** 配置名称，VMware配置标识 */
    @NotEmpty
    @OpenAPIParam("ConfigName")
    private String configNameParam;

    /** 数据中心，VMware数据中心标识 */
    @NotEmpty
    @OpenAPIParam("Datacenter")
    private String datacenterParam;


    public String getCluster() {
        return clusterParam;
    }

    public void setCluster(String clusterParam) {
        this.clusterParam = clusterParam;
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
