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

public class RenewResourceRequest extends Request {

    /** 计费类型，取值：Dynamic/Month/Year，后台会阻止降级（例如Year改为Month），安全产品只允许Month；同时兼容传入大写值HOUR/MONTH/YEAR */
    
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，从该租户账户扣费 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 续费时长，按Hour续费时系统固定为1小时；按Month续费最多11个月，按Year续费最多5年 */
    
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，必须与资源实际所在地域一致，用于匹配历史订单 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源ID，要续费的资源唯一标识；若传入虚拟机启动盘（ID以-boot结尾）会自动改为对应虚拟机ID并同时续费启动盘 */
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
