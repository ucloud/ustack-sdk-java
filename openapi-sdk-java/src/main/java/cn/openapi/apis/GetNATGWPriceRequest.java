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

public class GetNATGWPriceRequest extends Request {

    /** 计费类型，取值范围：Dynamic、Month、Year；兼容历史值：hour、month、year，别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR */
    @NotEmpty
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 高可用模式，NAT网关的高可用配置方式，ActiveStandy为主备高可用，Standalone为单机模式，默认ActiveStandy */
    
    @OpenAPIParam("HighAvailability")
    private String highAvailabilityParam;

    /** NAT网关ID，用于查询升级到指定高可用模式的差价，不填写则查询新建价格 */
    
    @OpenAPIParam("NATGWID")
    private String nATGWIDParam;

    /** 计费数量，用于指定购买时长的数量，按月/年计费时表示购买的月/年数，按小时计费时默认为1， */
    @NotEmpty
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 计算集群类型，用于指定NAT网关虚拟机运行的计算集群 */
    @NotEmpty
    @OpenAPIParam("VMType")
    private String vMTypeParam;


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

    public String getHighAvailability() {
        return highAvailabilityParam;
    }

    public void setHighAvailability(String highAvailabilityParam) {
        this.highAvailabilityParam = highAvailabilityParam;
    }

    public String getNATGWID() {
        return nATGWIDParam;
    }

    public void setNATGWID(String nATGWIDParam) {
        this.nATGWIDParam = nATGWIDParam;
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

    public String getVMType() {
        return vMTypeParam;
    }

    public void setVMType(String vMTypeParam) {
        this.vMTypeParam = vMTypeParam;
    }

}
