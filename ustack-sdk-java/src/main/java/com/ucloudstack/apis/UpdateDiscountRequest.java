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

public class UpdateDiscountRequest extends Request {

    /** 计费类型，指定计费方式，Dynamic表示按小时计费（兼容传HOUR）、Month表示按月计费（兼容MONTH）、Year表示按年计费（兼容YEAR） */
    @NotEmpty
    @UCloudStackParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，指定要更新折扣的租户唯一标识，为该租户设置专属折扣 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 折扣比例，设置的折扣百分比，100表示无折扣，50表示五折，设置为0表示免费 */
    @NotEmpty
    @UCloudStackParam("Discount")
    private Double discountParam;

    /** 产品ID，指定要更新折扣的产品唯一标识 */
    @NotEmpty
    @UCloudStackParam("ProductID")
    private String productIDParam;

    /** 地域ID，指定价格所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 集群类型，指定资源所属的集群类型标识，从DescribeSet接口获取 */
    @NotEmpty
    @UCloudStackParam("SetType")
    private String setTypeParam;


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

    public Double getDiscount() {
        return discountParam;
    }

    public void setDiscount(Double discountParam) {
        this.discountParam = discountParam;
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
