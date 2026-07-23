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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class LoadBalancerInfo {

    /** 负载均衡ID */
    @SerializedName("LBID")
    private String lBIDParam;

    /** 负载均衡名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 监听端口，伸缩成员加入负载均衡时使用的端口号 */
    @SerializedName("Port")
    private Integer portParam;

    /** 监听器ID */
    @SerializedName("VServerID")
    private String vServerIDParam;

    /** 负载均衡权重，伸缩成员在负载均衡中的权重值 */
    @SerializedName("Weight")
    private Integer weightParam;


    public String getLBID() {
        return lBIDParam;
    }

    public void setLBID(String lBIDParam) {
        this.lBIDParam = lBIDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public Integer getPort() {
        return portParam;
    }

    public void setPort(Integer portParam) {
        this.portParam = portParam;
    }

    public String getVServerID() {
        return vServerIDParam;
    }

    public void setVServerID(String vServerIDParam) {
        this.vServerIDParam = vServerIDParam;
    }

    public Integer getWeight() {
        return weightParam;
    }

    public void setWeight(Integer weightParam) {
        this.weightParam = weightParam;
    }

}
