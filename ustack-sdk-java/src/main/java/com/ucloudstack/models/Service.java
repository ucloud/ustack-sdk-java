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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class Service {

    /** 是否授权，标识子服务是否对租户开放 */
    @SerializedName("Authorized")
    private String authorizedParam;

    /** 子服务名称，子服务显示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 子服务产品ID，子服务唯一标识 */
    @SerializedName("ServiceProductKey")
    private String serviceProductKeyParam;

    /** 子服务产品类型，子服务的类型标识 */
    @SerializedName("ServiceProductType")
    private String serviceProductTypeParam;


    public String getAuthorized() {
        return authorizedParam;
    }

    public void setAuthorized(String authorizedParam) {
        this.authorizedParam = authorizedParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getServiceProductKey() {
        return serviceProductKeyParam;
    }

    public void setServiceProductKey(String serviceProductKeyParam) {
        this.serviceProductKeyParam = serviceProductKeyParam;
    }

    public String getServiceProductType() {
        return serviceProductTypeParam;
    }

    public void setServiceProductType(String serviceProductTypeParam) {
        this.serviceProductTypeParam = serviceProductTypeParam;
    }

}
