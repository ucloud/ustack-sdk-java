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

public class ConnectionInfos {

    /** 连接状态，来自ss/netstat输出的状态，如ESTABLISHED/TIME_WAIT */
    @SerializedName("ConnectionStatus")
    private String connectionStatusParam;

    /** 请求地址，客户端IP及端口 */
    @SerializedName("RequestAdd")
    private String requestAddParam;

    /** 请求端租户ID，仅当客户端IP可映射到具体租户资源时返回 */
    @SerializedName("RequestResourceCompanyID")
    private Integer requestResourceCompanyIDParam;

    /** 请求端资源ID，系统尝试根据客户端IP反查租户资源，若无法匹配则为空 */
    @SerializedName("RequestResourceID")
    private String requestResourceIDParam;

    /** 请求端资源名称，只有当IP成功匹配到租户资源时才会返回，未匹配时为空 */
    @SerializedName("RequestResourceName")
    private String requestResourceNameParam;

    /** 响应地址，PaaS服务端虚拟机的内网IP及端口 */
    @SerializedName("ResponseAdd")
    private String responseAddParam;

    /** 查询时间，接口返回该连接时记录的时间戳（Unix时间） */
    @SerializedName("SearchTime")
    private Integer searchTimeParam;


    public String getConnectionStatus() {
        return connectionStatusParam;
    }

    public void setConnectionStatus(String connectionStatusParam) {
        this.connectionStatusParam = connectionStatusParam;
    }

    public String getRequestAdd() {
        return requestAddParam;
    }

    public void setRequestAdd(String requestAddParam) {
        this.requestAddParam = requestAddParam;
    }

    public Integer getRequestResourceCompanyID() {
        return requestResourceCompanyIDParam;
    }

    public void setRequestResourceCompanyID(Integer requestResourceCompanyIDParam) {
        this.requestResourceCompanyIDParam = requestResourceCompanyIDParam;
    }

    public String getRequestResourceID() {
        return requestResourceIDParam;
    }

    public void setRequestResourceID(String requestResourceIDParam) {
        this.requestResourceIDParam = requestResourceIDParam;
    }

    public String getRequestResourceName() {
        return requestResourceNameParam;
    }

    public void setRequestResourceName(String requestResourceNameParam) {
        this.requestResourceNameParam = requestResourceNameParam;
    }

    public String getResponseAdd() {
        return responseAddParam;
    }

    public void setResponseAdd(String responseAddParam) {
        this.responseAddParam = responseAddParam;
    }

    public Integer getSearchTime() {
        return searchTimeParam;
    }

    public void setSearchTime(Integer searchTimeParam) {
        this.searchTimeParam = searchTimeParam;
    }

}
