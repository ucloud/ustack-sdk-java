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
package cn.openapi.apis;

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class ResizeVMConfigRequest extends Request {

    /** 审批名称，启用审批流程时的标题 */
    
    @OpenAPIParam("ApplicationName")
    private String applicationNameParam;

    /** 审批理由，启用审批流程时的说明 */
    
    @OpenAPIParam("ApplicationReason")
    private String applicationReasonParam;

    /** 核心数，调整后的vCPU核心数量 */
    @NotEmpty
    @OpenAPIParam("CPU")
    private Integer cPUParam;

    /** CPU每个插槽内核数，可选字段，默认等于CPU */
    
    @OpenAPIParam("CPUCoresPerSocket")
    private Integer cPUCoresPerSocketParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** GPU数量，调整后的物理GPU数量，仅在GPUType为GPU时有效且必填 */
    
    @OpenAPIParam("GPU")
    private Integer gPUParam;

    /** GPU规格，调整后的物理GPU型号，仅在GPUType为GPU时有效且必填 */
    
    @OpenAPIParam("GPUMdevName")
    private String gPUMdevNameParam;

    /** GPU类型，调整后的GPU资源类型，取值：GPU、VGPU，暂未支持VGPU */
    
    @OpenAPIParam("GPUType")
    private String gPUTypeParam;

    /** vGPU规格，调整后的虚拟GPU规格，仅在GPUType为VGPU时有效且必填，预留字段，暂未支持 */
    
    @OpenAPIParam("MdevName")
    private String mdevNameParam;

    /** 内存容量，调整后的内存大小，单位：MiB */
    @NotEmpty
    @OpenAPIParam("Memory")
    private Integer memoryParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 虚拟机ID，待调整配置的虚拟机资源标识 */
    @NotEmpty
    @OpenAPIParam("VMID")
    private String vMIDParam;


    public String getApplicationName() {
        return applicationNameParam;
    }

    public void setApplicationName(String applicationNameParam) {
        this.applicationNameParam = applicationNameParam;
    }

    public String getApplicationReason() {
        return applicationReasonParam;
    }

    public void setApplicationReason(String applicationReasonParam) {
        this.applicationReasonParam = applicationReasonParam;
    }

    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
    }

    public Integer getCPUCoresPerSocket() {
        return cPUCoresPerSocketParam;
    }

    public void setCPUCoresPerSocket(Integer cPUCoresPerSocketParam) {
        this.cPUCoresPerSocketParam = cPUCoresPerSocketParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getGPU() {
        return gPUParam;
    }

    public void setGPU(Integer gPUParam) {
        this.gPUParam = gPUParam;
    }

    public String getGPUMdevName() {
        return gPUMdevNameParam;
    }

    public void setGPUMdevName(String gPUMdevNameParam) {
        this.gPUMdevNameParam = gPUMdevNameParam;
    }

    public String getGPUType() {
        return gPUTypeParam;
    }

    public void setGPUType(String gPUTypeParam) {
        this.gPUTypeParam = gPUTypeParam;
    }

    public String getMdevName() {
        return mdevNameParam;
    }

    public void setMdevName(String mdevNameParam) {
        this.mdevNameParam = mdevNameParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
