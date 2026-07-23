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

public class GetEIPPriceRequest extends Request {

    /** 带宽，单位为Mbps，取值范围由线路规格配置确定，默认为1-20000 */
    @NotEmpty
    @OpenAPIParam("Bandwidth")
    private Integer bandwidthParam;

    /** 计费类型，指定EIP的计费模式，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费），兼容hour/month/year，计费类型别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR，hour->HOUR、month->MONTH、year->YEAR */
    @NotEmpty
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** EIP数量，指定要查询价格的EIP数量 */
    @NotEmpty
    @OpenAPIParam("Count")
    private Integer countParam;

    /** 运营商网段名称，指定EIP所属的运营商网络段 */
    @NotEmpty
    @OpenAPIParam("OpertatorName")
    private String opertatorNameParam;

    /** 计费数量，指定计费周期的数量，按月/年计费时表示购买Quantity个月/年 */
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
