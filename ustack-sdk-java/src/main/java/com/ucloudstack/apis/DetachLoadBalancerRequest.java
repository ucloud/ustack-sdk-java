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

public class DetachLoadBalancerRequest extends Request {

    /** 伸缩组ID，要解除负载均衡关联的伸缩组唯一标识符 */
    @NotEmpty
    @OpenAPIParam("ASGroupID")
    private String aSGroupIDParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 负载均衡ID，要解除关联的负载均衡实例ID */
    @NotEmpty
    @OpenAPIParam("LBID")
    private String lBIDParam;

    /** 监听器ID，要解除关联的VServer监听器ID */
    @NotEmpty
    @OpenAPIParam("VServerID")
    private String vServerIDParam;


    public String getASGroupID() {
        return aSGroupIDParam;
    }

    public void setASGroupID(String aSGroupIDParam) {
        this.aSGroupIDParam = aSGroupIDParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getLBID() {
        return lBIDParam;
    }

    public void setLBID(String lBIDParam) {
        this.lBIDParam = lBIDParam;
    }

    public String getVServerID() {
        return vServerIDParam;
    }

    public void setVServerID(String vServerIDParam) {
        this.vServerIDParam = vServerIDParam;
    }

}
