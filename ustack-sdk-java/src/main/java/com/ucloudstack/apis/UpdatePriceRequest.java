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

public class UpdatePriceRequest extends Request {

    /** 计费类型，指定计费方式，Dynamic表示按小时计费（兼容传HOUR）、Month表示按月计费（兼容MONTH）、Year表示按年计费（兼容YEAR） */
    @NotEmpty
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 价格规则信息，由一个或多个JSON对象通过竖线“|”拼接组成，例如："{\"LowerMultiple\":0,\"UpperMultiple\":0,\"Price\":0.6667}|{...}"，每个对象描述一个数量区间及其单价（单位：元），用于配置阶梯定价 */
    @NotEmpty
    @OpenAPIParam("PriceRuleInfo")
    private String priceRuleInfoParam;

    /** 产品ID，指定要更新价格的产品唯一标识，从ListProductResources获取 */
    @NotEmpty
    @OpenAPIParam("ProductID")
    private String productIDParam;

    /** 地域ID，指定价格所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 集群类型，指定资源所属的集群类型标识，从DescribeSet接口获取 */
    @NotEmpty
    @OpenAPIParam("SetType")
    private String setTypeParam;


    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
    }

    public String getPriceRuleInfo() {
        return priceRuleInfoParam;
    }

    public void setPriceRuleInfo(String priceRuleInfoParam) {
        this.priceRuleInfoParam = priceRuleInfoParam;
    }

    public String getProductID() {
        return productIDParam;
    }

    public void setProductID(String productIDParam) {
        this.productIDParam = productIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

}
