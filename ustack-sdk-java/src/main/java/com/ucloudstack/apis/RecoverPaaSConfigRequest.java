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

public class RecoverPaaSConfigRequest extends Request {

    /** 地域ID，指定资源所属地域，用于调用对应的资源服务 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 资源ID，指定要恢复配置的PaaS资源，仅支持MYSQL/REDIS/OSS/FS四类资源。默认要求资源处于AVAILABLE且hhpaas状态为Config_Mismatch；对于带 legacy 标记且尚未 normalized 的 Running 状态 MySQL，也允许执行恢复配置 */
    @NotEmpty
    @UCloudStackParam("ResourceID")
    private String resourceIDParam;


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
