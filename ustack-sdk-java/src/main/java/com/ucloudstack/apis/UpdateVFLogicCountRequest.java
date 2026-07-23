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

public class UpdateVFLogicCountRequest extends Request {

    /** 节点IP地址，用于指定需要调整VF数量的物理机 */
    @NotEmpty
    @OpenAPIParam("HostIP")
    private String hostIPParam;

    /** 网卡PCI地址，用于指定需要调整的物理网卡 */
    @NotEmpty
    @OpenAPIParam("PCI")
    private String pCIParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 逻辑VF数量限制，需满足已使用VF数量<=VFLogicCount<=物理VF数量限制 */
    @NotEmpty
    @OpenAPIParam("VFLogicCount")
    private Integer vFLogicCountParam;


    public String getHostIP() {
        return hostIPParam;
    }

    public void setHostIP(String hostIPParam) {
        this.hostIPParam = hostIPParam;
    }

    public String getPCI() {
        return pCIParam;
    }

    public void setPCI(String pCIParam) {
        this.pCIParam = pCIParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public Integer getVFLogicCount() {
        return vFLogicCountParam;
    }

    public void setVFLogicCount(Integer vFLogicCountParam) {
        this.vFLogicCountParam = vFLogicCountParam;
    }

}
