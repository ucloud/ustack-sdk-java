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

public class StopPaaSInstanceRequest extends Request {

    /** 产品类型，限定可关机的资源范围，取值：MYSQL/REDIS/OSS/FS/LB/NATGW/VPNGW；若资源与类型不匹配或类型未在列表中将返回错误 */
    @NotEmpty
    @UCloudStackParam("ProductType")
    private String productTypeParam;

    /** 地域ID，指定资源所属地域，用于定位对应的黄河区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 资源ID，指定要关机的PaaS资源，仅支持MYSQL/REDIS/OSS/FS/LB/NATGW/VPNGW几类资源，且资源状态必须为AVAILABLE */
    @NotEmpty
    @UCloudStackParam("ResourceID")
    private String resourceIDParam;


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

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

}
