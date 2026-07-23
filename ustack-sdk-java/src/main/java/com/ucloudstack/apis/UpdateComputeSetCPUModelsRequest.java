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

public class UpdateComputeSetCPUModelsRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，普通租户需填写自身CompanyID；管理员租户（CompanyID=200000231）或留空时按管理员权限操作 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 禁用的CPU模型列表，指定要在该计算集群中禁用的CPU模型，禁用后虚拟机无法使用这些CPU模型，用于解决CPU兼容性问题 */
    
    @OpenAPIParam("DisabledCPUModels")
    private List<String> disabledCPUModelsParam;

    /** 地域ID，指定计算集群所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 计算集群ID，指定要修改CPU模型配置的计算集群唯一标识，由底层Huanghe系统生成 */
    @NotEmpty
    @OpenAPIParam("SetID")
    private String setIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getDisabledCPUModels() {
        return disabledCPUModelsParam;
    }

    public void setDisabledCPUModels(List<String> disabledCPUModelsParam) {
        this.disabledCPUModelsParam = disabledCPUModelsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

}
