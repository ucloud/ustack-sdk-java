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

public class UpdateSubnetRouteRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 目的地址，IPv4CIDR格式，路由必须已存在才能更新 */
    @NotEmpty
    @OpenAPIParam("Destination")
    private String destinationParam;

    /** 下一跳标识，VIP/VM类型为资源ID，Custom类型为IPv4地址且必须属于当前子网 */
    @NotEmpty
    @OpenAPIParam("NextHop")
    private String nextHopParam;

    /** 下一跳类型，取值VIP/VM/Custom，VIP/VM会验证资源存在性和子网归属 */
    @NotEmpty
    @OpenAPIParam("NextHopType")
    private String nextHopTypeParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，用于补充说明 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 子网ID */
    @NotEmpty
    @OpenAPIParam("SubnetID")
    private String subnetIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getDestination() {
        return destinationParam;
    }

    public void setDestination(String destinationParam) {
        this.destinationParam = destinationParam;
    }

    public String getNextHop() {
        return nextHopParam;
    }

    public void setNextHop(String nextHopParam) {
        this.nextHopParam = nextHopParam;
    }

    public String getNextHopType() {
        return nextHopTypeParam;
    }

    public void setNextHopType(String nextHopTypeParam) {
        this.nextHopTypeParam = nextHopTypeParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getSubnetID() {
        return subnetIDParam;
    }

    public void setSubnetID(String subnetIDParam) {
        this.subnetIDParam = subnetIDParam;
    }

}
