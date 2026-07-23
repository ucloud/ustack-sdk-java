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

public class UpdateVMCPUModelRequest extends Request {

    /** CPU模式，虚拟机的CPU模拟方式，取值：host-passthrough（直通）、custom（自定义） */
    
    @OpenAPIParam("CPUMode")
    private String cPUModeParam;

    /** CPU型号，仅在CPUMode为custom时生效 */
    
    @OpenAPIParam("CPUModel")
    private String cPUModelParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 虚拟机ID，待修改配置的虚拟机标识 */
    @NotEmpty
    @OpenAPIParam("VMID")
    private String vMIDParam;


    public String getCPUMode() {
        return cPUModeParam;
    }

    public void setCPUMode(String cPUModeParam) {
        this.cPUModeParam = cPUModeParam;
    }

    public String getCPUModel() {
        return cPUModelParam;
    }

    public void setCPUModel(String cPUModelParam) {
        this.cPUModelParam = cPUModelParam;
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
