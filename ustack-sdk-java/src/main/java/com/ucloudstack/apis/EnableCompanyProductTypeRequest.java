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

public class EnableCompanyProductTypeRequest extends Request {

    /** 租户ID列表，用于指定要启用服务的租户集合 */
    @NotEmpty
    @UCloudStackParam("CompanyIDs")
    private List<Integer> companyIDsParam;

    /** 产品类型，指定要启用的产品服务 */
    @NotEmpty
    @UCloudStackParam("ProductType")
    private String productTypeParam;

    /** 地域ID，指定产品服务所属区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;


    public List<Integer> getCompanyIDs() {
        return companyIDsParam;
    }

    public void setCompanyIDs(List<Integer> companyIDsParam) {
        this.companyIDsParam = companyIDsParam;
    }

    public String getProductType() {
        return productTypeParam;
    }

    public void setProductType(String productTypeParam) {
        this.productTypeParam = productTypeParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
