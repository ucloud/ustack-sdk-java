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

public class UpdateDirectConnectBandwidthRequest extends Request {

    /** 带宽限制，单位为Mbps，取值范围：1-20000，实际不超过物理带宽上限，同时设置上行和下行带宽 */
    @NotEmpty
    @OpenAPIParam("Bandwidth")
    private Integer bandwidthParam;

    /** 专线接入ID，指定要更新带宽限制的专线接入资源ID */
    @NotEmpty
    @OpenAPIParam("DirectConnectID")
    private String directConnectIDParam;

    /** 地域ID，指定要更新的专线接入所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public String getDirectConnectID() {
        return directConnectIDParam;
    }

    public void setDirectConnectID(String directConnectIDParam) {
        this.directConnectIDParam = directConnectIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
