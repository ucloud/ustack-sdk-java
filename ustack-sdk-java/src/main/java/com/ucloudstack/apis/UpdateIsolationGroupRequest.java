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

public class UpdateIsolationGroupRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 隔离组ID，指定要更新的隔离组 */
    @NotEmpty
    @OpenAPIParam("IGID")
    private String iGIDParam;

    /** 是否启用，设置策略是否生效，不传表示不修改 */
    
    @OpenAPIParam("IsEnable")
    private Boolean isEnableParam;

    /** 是否强制执行，设置策略执行方式，不传表示不修改 */
    
    @OpenAPIParam("IsForce")
    private Boolean isForceParam;

    /** 策略对象列表，用于更新隔离组策略对象 */
    
    @OpenAPIParam("PolicyObj")
    private List<String> policyObjParam;

    /** 策略类型，用于更新隔离组策略类型，取值VMAffinity/VMAntiAffinity */
    
    @OpenAPIParam("PolicyType")
    private String policyTypeParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getIGID() {
        return iGIDParam;
    }

    public void setIGID(String iGIDParam) {
        this.iGIDParam = iGIDParam;
    }

    public Boolean getIsEnable() {
        return isEnableParam;
    }

    public void setIsEnable(Boolean isEnableParam) {
        this.isEnableParam = isEnableParam;
    }

    public Boolean getIsForce() {
        return isForceParam;
    }

    public void setIsForce(Boolean isForceParam) {
        this.isForceParam = isForceParam;
    }

    public List<String> getPolicyObj() {
        return policyObjParam;
    }

    public void setPolicyObj(List<String> policyObjParam) {
        this.policyObjParam = policyObjParam;
    }

    public String getPolicyType() {
        return policyTypeParam;
    }

    public void setPolicyType(String policyTypeParam) {
        this.policyTypeParam = policyTypeParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
