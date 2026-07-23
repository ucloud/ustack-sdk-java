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
package com.ucloudstack.apis;

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class DescribePlatformStorageResponse extends Response {

    /** 默认存储集群类型，平台通用存储使用的默认集群类型 */
    @SerializedName("DefaultSetType")
    private String defaultSetTypeParam;

    /** 状态，平台通用存储的运行状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 总量，平台通用存储总容量，单位GiB */
    @SerializedName("Total")
    private Integer totalParam;

    /** 已使用，平台通用存储已使用容量，单位GiB */
    @SerializedName("Used")
    private Integer usedParam;


    public String getDefaultSetType() {
        return defaultSetTypeParam;
    }

    public void setDefaultSetType(String defaultSetTypeParam) {
        this.defaultSetTypeParam = defaultSetTypeParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public Integer getTotal() {
        return totalParam;
    }

    public void setTotal(Integer totalParam) {
        this.totalParam = totalParam;
    }

    public Integer getUsed() {
        return usedParam;
    }

    public void setUsed(Integer usedParam) {
        this.usedParam = usedParam;
    }

}
