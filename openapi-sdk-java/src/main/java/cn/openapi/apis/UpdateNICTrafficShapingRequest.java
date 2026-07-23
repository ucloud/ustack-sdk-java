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

public class UpdateNICTrafficShapingRequest extends Request {

    /** 租户ID，用于多租户资源隔离与权限控制 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 入向平均带宽，单位Mbps，用于限制入向流量；-1表示取消限速，0表示保持不变，正数表示设置为指定带宽，取值范围由网卡规格配置确定， */
    
    @OpenAPIParam("InAverageBandwidth")
    private Integer inAverageBandwidthParam;

    /** 网卡ID，指定要修改流量整形策略的网卡资源；网卡启用SR-IOV时不可修改 */
    @NotEmpty
    @OpenAPIParam("NICID")
    private String nICIDParam;

    /** 出向平均带宽，单位Mbps，用于限制出向流量；-1表示取消限速，0表示保持不变，正数表示设置为指定带宽，取值范围由网卡规格配置确定， */
    
    @OpenAPIParam("OutAverageBandwidth")
    private Integer outAverageBandwidthParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getInAverageBandwidth() {
        return inAverageBandwidthParam;
    }

    public void setInAverageBandwidth(Integer inAverageBandwidthParam) {
        this.inAverageBandwidthParam = inAverageBandwidthParam;
    }

    public String getNICID() {
        return nICIDParam;
    }

    public void setNICID(String nICIDParam) {
        this.nICIDParam = nICIDParam;
    }

    public Integer getOutAverageBandwidth() {
        return outAverageBandwidthParam;
    }

    public void setOutAverageBandwidth(Integer outAverageBandwidthParam) {
        this.outAverageBandwidthParam = outAverageBandwidthParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
