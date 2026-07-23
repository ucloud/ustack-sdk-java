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

public class GenerateVMWareConsoleTicketRequest extends Request {

    /** vmware配置名称，指定VMware连接配置标识 */
    @NotEmpty
    @UCloudStackParam("ConfigName")
    private String configNameParam;

    /** 数据中心名称，VMware数据中心标识 */
    @NotEmpty
    @UCloudStackParam("Datacenter")
    private String datacenterParam;

    /** 虚拟机ID，VMware虚拟机标识 */
    @NotEmpty
    @UCloudStackParam("VMID")
    private String vMIDParam;

    /** 虚拟机名称，VMware虚拟机显示名称 */
    @NotEmpty
    @UCloudStackParam("VMName")
    private String vMNameParam;


    public String getConfigName() {
        return configNameParam;
    }

    public void setConfigName(String configNameParam) {
        this.configNameParam = configNameParam;
    }

    public String getDatacenter() {
        return datacenterParam;
    }

    public void setDatacenter(String datacenterParam) {
        this.datacenterParam = datacenterParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

    public String getVMName() {
        return vMNameParam;
    }

    public void setVMName(String vMNameParam) {
        this.vMNameParam = vMNameParam;
    }

}
