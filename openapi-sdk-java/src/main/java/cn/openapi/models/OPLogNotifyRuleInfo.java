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

public class OPLogNotifyRuleInfo {

    /** 租户ID，规则所属租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，规则创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，规则所属租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 监控级别列表，取值：success/failure */
    @SerializedName("MonitorLevel")
    private List<String> monitorLevelParam;

    /** 监控模块列表，监控模块列表 */
    @SerializedName("MonitorModule")
    private List<String> monitorModuleParam;

    /** 监控地域，监控地域ID */
    @SerializedName("MonitorRegion")
    private String monitorRegionParam;

    /** 监控地域别名，地域显示名称 */
    @SerializedName("MonitorRegionAlias")
    private String monitorRegionAliasParam;

    /** 通知组ID，通知组ID */
    @SerializedName("NotifyGroupID")
    private String notifyGroupIDParam;

    /** 通知组名称，通知组名称 */
    @SerializedName("NotifyGroupName")
    private String notifyGroupNameParam;

    /** 规则ID，规则唯一标识 */
    @SerializedName("RuleID")
    private String ruleIDParam;

    /** 更新时间，规则更新时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
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

    public String getMonitorRegionAlias() {
        return monitorRegionAliasParam;
    }

    public void setMonitorRegionAlias(String monitorRegionAliasParam) {
        this.monitorRegionAliasParam = monitorRegionAliasParam;
    }

    public String getNotifyGroupID() {
        return notifyGroupIDParam;
    }

    public void setNotifyGroupID(String notifyGroupIDParam) {
        this.notifyGroupIDParam = notifyGroupIDParam;
    }

    public String getNotifyGroupName() {
        return notifyGroupNameParam;
    }

    public void setNotifyGroupName(String notifyGroupNameParam) {
        this.notifyGroupNameParam = notifyGroupNameParam;
    }

    public String getRuleID() {
        return ruleIDParam;
    }

    public void setRuleID(String ruleIDParam) {
        this.ruleIDParam = ruleIDParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
