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

public class GetCreateNICPriceRequest extends Request {

    /** 带宽，单位Mbps，指定网卡的带宽规格 */
    @NotEmpty
    @OpenAPIParam("Bandwidth")
    private Integer bandwidthParam;

    /** 计费类型，用于指定计费模式；取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费），兼容hour/month/year；计费类型别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR，hour->HOUR、month->MONTH、year->YEAR */
    @NotEmpty
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 购买数量，指定一次性购买的网卡数量，用于批量询价 */
    @NotEmpty
    @OpenAPIParam("Count")
    private Integer countParam;

    /** 外网线路ID，指定外网网卡使用的线路，用于计算价格 */
    @NotEmpty
    @OpenAPIParam("OpertatorName")
    private String opertatorNameParam;

    /** 计费数量，按月/年计费时表示购买Quantity个月/年 */
    @NotEmpty
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
    }

    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCount() {
        return countParam;
    }

    public void setCount(Integer countParam) {
        this.countParam = countParam;
    }

    public String getOpertatorName() {
        return opertatorNameParam;
    }

    public void setOpertatorName(String opertatorNameParam) {
        this.opertatorNameParam = opertatorNameParam;
    }

    public Integer getQuantity() {
        return quantityParam;
    }

    public void setQuantity(Integer quantityParam) {
        this.quantityParam = quantityParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
