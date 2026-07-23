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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class ContainerInfo {

    /** CPU资源上限，单位核 */
    @SerializedName("CPULimit")
    private Integer cPULimitParam;

    /** CPU资源下限，单位核 */
    @SerializedName("CPURequest")
    private Integer cPURequestParam;

    /** 内存资源上限，单位GiB */
    @SerializedName("MemoryLimit")
    private Integer memoryLimitParam;

    /** 内存资源下限，单位GiB */
    @SerializedName("MemoryRequest")
    private Integer memoryRequestParam;

    /** 容器名称，用于展示容器名称 */
    @SerializedName("Name")
    private String nameParam;


    public Integer getCPULimit() {
        return cPULimitParam;
    }

    public void setCPULimit(Integer cPULimitParam) {
        this.cPULimitParam = cPULimitParam;
    }

    public Integer getCPURequest() {
        return cPURequestParam;
    }

    public void setCPURequest(Integer cPURequestParam) {
        this.cPURequestParam = cPURequestParam;
    }

    public Integer getMemoryLimit() {
        return memoryLimitParam;
    }

    public void setMemoryLimit(Integer memoryLimitParam) {
        this.memoryLimitParam = memoryLimitParam;
    }

    public Integer getMemoryRequest() {
        return memoryRequestParam;
    }

    public void setMemoryRequest(Integer memoryRequestParam) {
        this.memoryRequestParam = memoryRequestParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

}
