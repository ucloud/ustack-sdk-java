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

public class UpdateTrafficMirrorRequest extends Request {

    /** 目的设备信息，JSON字符串，字段含义与创建接口一致（dstType仅支持PhysicalPort或VM，dstDevice为物理端口名称或虚拟机ID，vlan仅PhysicalPort需填且取值0-4094），PhysicalPort会校验VLAN不与管理/存储/隧道网络冲突，冲突时返回StatusNICOrVlANConflictWithPhysicalNetwork */
    @NotEmpty
    @UCloudStackParam("Destination")
    private String destinationParam;

    /** 报文截取最大长度，单位为字节，取值范围为42-65535，若不指定则使用默认值 */
    
    @UCloudStackParam("MaxLength")
    private Integer maxLengthParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 流量镜像ID，待更新的流量镜像唯一标识符，资源状态必须为Available，执行更新前会自动剔除已解绑或已删除虚拟机对应的源设备，若剔除后没有可用源设备会返回StatusNoAvailableSrcDevice错误 */
    @NotEmpty
    @UCloudStackParam("TrafficMirrorID")
    private String trafficMirrorIDParam;


    public String getDestination() {
        return destinationParam;
    }

    public void setDestination(String destinationParam) {
        this.destinationParam = destinationParam;
    }

    public Integer getMaxLength() {
        return maxLengthParam;
    }

    public void setMaxLength(Integer maxLengthParam) {
        this.maxLengthParam = maxLengthParam;
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
