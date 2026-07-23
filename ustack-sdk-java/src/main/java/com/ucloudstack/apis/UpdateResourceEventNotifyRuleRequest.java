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

public class UpdateResourceEventNotifyRuleRequest extends Request {

    /** 监控级别列表，取值：info/warning/error */
    @NotEmpty
    @UCloudStackParam("MonitorLevel")
    private List<String> monitorLevelParam;

    /** 监控模块列表，指定监控哪些资源模块的事件 */
    @NotEmpty
    @UCloudStackParam("MonitorModule")
    private List<String> monitorModuleParam;

    /** 监控地域，指定监控地域的资源事件 */
    @NotEmpty
    @UCloudStackParam("MonitorRegion")
    private String monitorRegionParam;

    /** 通知组ID，资源事件通知规则所属通知组ID */
    @NotEmpty
    @UCloudStackParam("NotifyGroupID")
    private String notifyGroupIDParam;

    /** 规则ID，资源事件通知规则ID */
    @NotEmpty
    @UCloudStackParam("RuleID")
    private String ruleIDParam;


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

    public String getRuleID() {
        return ruleIDParam;
    }

    public void setRuleID(String ruleIDParam) {
        this.ruleIDParam = ruleIDParam;
    }

}
