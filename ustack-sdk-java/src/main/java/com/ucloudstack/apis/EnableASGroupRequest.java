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

public class EnableASGroupRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 伸缩组ID，要启用的伸缩组的唯一标识符，启用后伸缩组将开始自动伸缩功能，根据监控指标触发扩缩容操作 */
    @NotEmpty
    @OpenAPIParam("GroupID")
    private String groupIDParam;

    /** 地域ID，指定伸缩组所属的物理区域 */
    
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getGroupID() {
        return groupIDParam;
    }

    public void setGroupID(String groupIDParam) {
        this.groupIDParam = groupIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
