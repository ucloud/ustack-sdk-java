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

public class UpdateTrafficMirrorSourcesRequest extends Request {

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 源设备信息列表，JSON数组的每个元素都是JSON字符串，需包含srcDevice（从DescribeTrafficMirrorSources返回的网卡ID）和direction（取值inbound、outbound、all），最多支持20个源设备，direction为all时会同时占用该网卡的入/出方向，单网卡同一方向只允许配置一次且不能与其他流量镜像冲突，重复会返回StatusSourceDeviceDirectionHasBeenUsed错误 */
    @NotEmpty
    @OpenAPIParam("Sources")
    private List<String> sourcesParam;

    /** 流量镜像ID，待更新的流量镜像唯一标识符，资源状态必须为Available，执行更新前会自动剔除已解绑或已删除虚拟机对应的源设备，若剔除后没有可用源设备会返回StatusNoAvailableSrcDevice错误 */
    @NotEmpty
    @OpenAPIParam("TrafficMirrorID")
    private String trafficMirrorIDParam;


    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getSources() {
        return sourcesParam;
    }

    public void setSources(List<String> sourcesParam) {
        this.sourcesParam = sourcesParam;
    }

    public String getTrafficMirrorID() {
        return trafficMirrorIDParam;
    }

    public void setTrafficMirrorID(String trafficMirrorIDParam) {
        this.trafficMirrorIDParam = trafficMirrorIDParam;
    }

}
