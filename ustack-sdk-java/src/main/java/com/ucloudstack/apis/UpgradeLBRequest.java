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

public class UpgradeLBRequest extends Request {

    /** CPU核数，负载均衡升级后的CPU核数，必须大于当前CPU核数，仅支持升级不支持降级 */
    @NotEmpty
    @OpenAPIParam("CPU")
    private Integer cPUParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 负载均衡ID，用于定位需要升级规格的负载均衡实例 */
    @NotEmpty
    @OpenAPIParam("LBID")
    private String lBIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
