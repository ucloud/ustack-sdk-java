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

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateOPLogNotifyRuleRequest extends Request {

    /** 租户ID，操作日志通知规则所属租户 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 监控级别列表，取值：success/failure */
    @NotEmpty
    @OpenAPIParam("MonitorLevel")
    private List<String> monitorLevelParam;

    /** 监控模块列表，指定监控哪些资源模块的操作日志 */
    @NotEmpty
    @OpenAPIParam("MonitorModule")
    private List<String> monitorModuleParam;

    /** 监控地域，指定监控地域的操作日志 */
    @NotEmpty
    @OpenAPIParam("MonitorRegion")
    private String monitorRegionParam;

    /** 通知组ID，操作日志触发通知目标组ID */
    @NotEmpty
    @OpenAPIParam("NotifyGroupID")
    private String notifyGroupIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public List<String> getMonitorLevel() {
        return monitorLevelParam;
    }

    public void setMonitorLevel(List<String> monitorLevelParam) {
        this.monitorLevelParam = monitorLevelParam;
    }

    public List<String> getMonitorModule() {
        return monitorModuleParam;
    }

    public void setMonitorModule(List<String> monitorModuleParam) {
        this.monitorModuleParam = monitorModuleParam;
    }

    public String getMonitorRegion() {
        return monitorRegionParam;
    }

    public void setMonitorRegion(String monitorRegionParam) {
        this.monitorRegionParam = monitorRegionParam;
    }

    public String getNotifyGroupID() {
        return notifyGroupIDParam;
    }

    public void setNotifyGroupID(String notifyGroupIDParam) {
        this.notifyGroupIDParam = notifyGroupIDParam;
    }

}
