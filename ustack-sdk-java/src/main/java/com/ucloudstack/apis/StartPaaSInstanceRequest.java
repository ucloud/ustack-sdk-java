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

public class StartPaaSInstanceRequest extends Request {

    /** 产品类型，取值范围与StopPaaSInstance一致；当类型为LB时，开机完成后会自动恢复绑定的弹性伸缩组配置 */
    @NotEmpty
    @UCloudStackParam("ProductType")
    private String productTypeParam;

    /** 地域ID，指定资源所属地域，用于获取相应的黄河服务 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 资源ID，指定要开启的PaaS资源，仅支持MYSQL/REDIS/OSS/FS/LB/NATGW/VPNGW */
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
