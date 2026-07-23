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

public class SetComputeClassDRSVMRuleRequest extends Request {

    /** 是否添加黑名单，true为新增或更新黑名单，false表示删除指定VM规则 */
    
    @OpenAPIParam("Add")
    private Boolean addParam;

    /** 租户ID，用于按租户范围筛选可操作的DRS配置 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 备注信息，可选字段，后台会对内容进行Base64编码后写入Huanghe */
    
    @OpenAPIParam("Reason")
    private String reasonParam;

    /** 地域ID，指定要操作的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 计算集群ID，指定要更新黑名单的ComputeClass */
    @NotEmpty
    @OpenAPIParam("SetID")
    private String setIDParam;

    /** 规则类型，Manual表示手工迁移保护，Ignore表示忽略DRS迁移，仅在Add为true时必填 */
    
    @OpenAPIParam("Type")
    private String typeParam;

    /** 虚拟机ID，指定需要添加或移除的虚拟机，必须存在于当前集群 */
    
    @OpenAPIParam("VMID")
    private String vMIDParam;


    public Boolean getAdd() {
        return addParam;
    }

    public void setAdd(Boolean addParam) {
        this.addParam = addParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
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

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
