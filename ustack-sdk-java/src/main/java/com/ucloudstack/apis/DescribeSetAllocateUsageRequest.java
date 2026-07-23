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

public class DescribeSetAllocateUsageRequest extends Request {

    /** 当为true时，即使不指定Region也返回所有地域下的所有集群信息 */
    
    @OpenAPIParam("IncludeAllClusters")
    private Boolean includeAllClustersParam;

    /** 地域ID，若不指定则查询所有有权限访问的地域，返回结果以地域为维度；若指定则查询单个地域，返回结果以地域下的集群为维度 */
    
    @OpenAPIParam("Region")
    private String regionParam;


    public Boolean getIncludeAllClusters() {
        return includeAllClustersParam;
    }

    public void setIncludeAllClusters(Boolean includeAllClustersParam) {
        this.includeAllClustersParam = includeAllClustersParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
