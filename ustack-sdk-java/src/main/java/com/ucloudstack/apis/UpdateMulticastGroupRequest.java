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

public class UpdateMulticastGroupRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 接收方虚拟机ID列表，更新后的组播接收端，数量范围1-9个，虚拟机必须与该组播组所属VPC匹配，不能包含发送方，且在同一VPC下IP+Port相同的组播组中不得重复；违反会返回StatusMulticastGroupMemberVPCMismatch或StatusMulticastGroupMemberDuplicate */
    @NotEmpty
    @OpenAPIParam("MulticastDest")
    private List<String> multicastDestParam;

    /** 组播组ID，指定要更新的组播组唯一标识符 */
    @NotEmpty
    @OpenAPIParam("MulticastGroupID")
    private String multicastGroupIDParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getMulticastDest() {
        return multicastDestParam;
    }

    public void setMulticastDest(List<String> multicastDestParam) {
        this.multicastDestParam = multicastDestParam;
    }

    public String getMulticastGroupID() {
        return multicastGroupIDParam;
    }

    public void setMulticastGroupID(String multicastGroupIDParam) {
        this.multicastGroupIDParam = multicastGroupIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
