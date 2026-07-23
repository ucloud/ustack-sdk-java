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

public class CPU {

    /** 核数，CPU物理核数 */
    @SerializedName("Cores")
    private Integer coresParam;

    /** 制造商，CPU厂商 */
    @SerializedName("Manufacturer")
    private String manufacturerParam;

    /** 名称，CPU型号名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 插槽数，CPU插槽数量 */
    @SerializedName("Sockets")
    private Integer socketsParam;

    /** 线程数，CPU线程数 */
    @SerializedName("Threads")
    private Integer threadsParam;


    public Integer getCores() {
        return coresParam;
    }

    public void setCores(Integer coresParam) {
        this.coresParam = coresParam;
    }

    public String getManufacturer() {
        return manufacturerParam;
    }

    public void setManufacturer(String manufacturerParam) {
        this.manufacturerParam = manufacturerParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public Integer getSockets() {
        return socketsParam;
    }

    public void setSockets(Integer socketsParam) {
        this.socketsParam = socketsParam;
    }

    public Integer getThreads() {
        return threadsParam;
    }

    public void setThreads(Integer threadsParam) {
        this.threadsParam = threadsParam;
    }

}
