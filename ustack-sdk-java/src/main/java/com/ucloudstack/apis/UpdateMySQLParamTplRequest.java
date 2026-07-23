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
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateMySQLParamTplRequest extends Request {

    /** 租户ID，模板所属租户 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 名称，模板名称；填写后仅更新名称与Remark */
    
    @UCloudStackParam("Name")
    private String nameParam;

    /** 配置参数，JSON格式的配置参数；当Name为空时必填 */
    
    @UCloudStackParam("Params")
    private String paramsParam;

    /** 地域ID，模板所属地域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 描述，模板描述信息；与Name一起用于更新模板元信息 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 模板ID，参数模板ID */
    @NotEmpty
    @UCloudStackParam("TplID")
    private String tplIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getParams() {
        return paramsParam;
    }

    public void setParams(String paramsParam) {
        this.paramsParam = paramsParam;
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

    public String getTplID() {
        return tplIDParam;
    }

    public void setTplID(String tplIDParam) {
        this.tplIDParam = tplIDParam;
    }

}
