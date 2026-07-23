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

public class DiskLightOffRequest extends Request {

    /** RAID卡ControllerID，用于指定磁盘所属RAID控制器 */
    @NotEmpty
    @OpenAPIParam("ControllerID")
    private String controllerIDParam;

    /** 磁盘柜编号，用于指定磁盘所在磁盘柜位置 */
    @NotEmpty
    @OpenAPIParam("Enclosure")
    private String enclosureParam;

    /** 物理机IP地址，用于指定磁盘所在宿主机 */
    @NotEmpty
    @OpenAPIParam("HostIP")
    private String hostIPParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 磁盘插槽号，用于指定磁盘在磁盘柜中的插槽位置 */
    
    @OpenAPIParam("Slot")
    private String slotParam;


    public String getControllerID() {
        return controllerIDParam;
    }

    public void setControllerID(String controllerIDParam) {
        this.controllerIDParam = controllerIDParam;
    }

    public String getEnclosure() {
        return enclosureParam;
    }

    public void setEnclosure(String enclosureParam) {
        this.enclosureParam = enclosureParam;
    }

    public String getHostIP() {
        return hostIPParam;
    }

    public void setHostIP(String hostIPParam) {
        this.hostIPParam = hostIPParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSlot() {
        return slotParam;
    }

    public void setSlot(String slotParam) {
        this.slotParam = slotParam;
    }

}
