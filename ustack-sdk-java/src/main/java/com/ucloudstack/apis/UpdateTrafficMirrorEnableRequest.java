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

public class UpdateTrafficMirrorEnableRequest extends Request {

    /** 是否启用流量镜像，true表示启用，false表示禁用，启用时若全部源设备已失效（关联虚拟机被删除或销毁）将触发StatusNoAvailableSrcDevice错误，需要重新配置Sources */
    
    @OpenAPIParam("Enable")
    private Boolean enableParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 流量镜像ID，待更新的流量镜像唯一标识符，资源状态必须为Available，执行启停前会自动剔除已解绑或已删除虚拟机对应的源设备，若剔除后没有可用源设备会返回StatusNoAvailableSrcDevice错误 */
    @NotEmpty
    @OpenAPIParam("TrafficMirrorID")
    private String trafficMirrorIDParam;


    public Boolean getEnable() {
        return enableParam;
    }

    public void setEnable(Boolean enableParam) {
        this.enableParam = enableParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getTrafficMirrorID() {
        return trafficMirrorIDParam;
    }

    public void setTrafficMirrorID(String trafficMirrorIDParam) {
        this.trafficMirrorIDParam = trafficMirrorIDParam;
    }

}
