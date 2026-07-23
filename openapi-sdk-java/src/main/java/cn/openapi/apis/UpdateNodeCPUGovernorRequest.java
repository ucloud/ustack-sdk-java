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

public class UpdateNodeCPUGovernorRequest extends Request {

    /** 电源模式，取值performance（性能）、powersave（节能）、ondemand（自动，部分机器不支持） */
    @NotEmpty
    @OpenAPIParam("Governor")
    private String governorParam;

    /** 节点ID，用于标识节点唯一标识 */
    @NotEmpty
    @OpenAPIParam("HostID")
    private String hostIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public String getGovernor() {
        return governorParam;
    }

    public void setGovernor(String governorParam) {
        this.governorParam = governorParam;
    }

    public String getHostID() {
        return hostIDParam;
    }

    public void setHostID(String hostIDParam) {
        this.hostIDParam = hostIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
