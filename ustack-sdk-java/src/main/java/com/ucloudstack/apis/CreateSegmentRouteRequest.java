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

public class CreateSegmentRouteRequest extends Request {

    /** 目的地址，路由的目标网段，必须为CIDR格式，系统会自动使用net.ParseCIDR格式化为标准CIDR表示（如10.0.0.0/16），不能与外网线路中已存在的路由目的地址冲突 */
    @NotEmpty
    @UCloudStackParam("Destination")
    private String destinationParam;

    /** 下一跳IP地址，必须为合法的IP地址格式，且必须在外网线路网段范围内 */
    @NotEmpty
    @UCloudStackParam("NextHop")
    private String nextHopParam;

    /** 地域ID，指定外网线路路由所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符 */
    
    @UCloudStackParam("Remark")
    private String remarkParam;

    /** 外网线路ID，指定要添加路由规则的外网线路，单个外网线路最多支持50条自定义路由 */
    @NotEmpty
    @UCloudStackParam("SegmentID")
    private String segmentIDParam;


    public String getDestination() {
        return destinationParam;
    }

    public void setDestination(String destinationParam) {
        this.destinationParam = destinationParam;
    }

    public String getNextHop() {
        return nextHopParam;
    }

    public void setNextHop(String nextHopParam) {
        this.nextHopParam = nextHopParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getSegmentID() {
        return segmentIDParam;
    }

    public void setSegmentID(String segmentIDParam) {
        this.segmentIDParam = segmentIDParam;
    }

}
