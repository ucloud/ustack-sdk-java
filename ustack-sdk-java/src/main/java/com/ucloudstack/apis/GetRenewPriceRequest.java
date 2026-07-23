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

public class GetRenewPriceRequest extends Request {

    /** 计费类型，续费的计费方式，Dynamic表示按小时计费（兼容HOUR）、Month表示按月计费（兼容MONTH）、Year表示按年计费（兼容YEAR）；若填写必须不低于资源当前计费模式，留空则沿用当前值 */
    
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，保留字段，续费价格始终根据资源所属租户的折扣计算，管理员可留空 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 续费时长，按Hour查询时系统固定为1小时且最多24小时，按Month最多11个月，按Year最多5年，不指定则默认为1 */
    
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源ID，要查询续费价格的资源唯一标识，必须是存在的资源ID */
    @NotEmpty
    @OpenAPIParam("ResourceID")
    private String resourceIDParam;


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

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

}
