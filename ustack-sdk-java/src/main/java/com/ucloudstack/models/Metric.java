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

public class Metric {

    /** 权限列表，定义哪些角色或用户可以访问和使用该监控指标 */
    @SerializedName("Authority")
    private List<String> authorityParam;

    /** 监控指标详细信息列表，包含该资源类型下所有可用的具体监控指标 */
    @SerializedName("Infos")
    private List<MetricInfo> infosParam;

    /** 是否支持告警功能，标识该指标是否可以用于配置告警规则 */
    @SerializedName("IsAlerting")
    private Boolean isAlertingParam;

    /** 资源类型，标识该监控指标所监控的资源类型，如虚拟机、磁盘、网络等 */
    @SerializedName("TargetType")
    private String targetTypeParam;

    /** 是否需要单位转换回调，标识在显示指标数据时是否需要进行单位转换处理 */
    @SerializedName("UseYCallback")
    private Boolean useYCallbackParam;


    public List<String> getAuthority() {
        return authorityParam;
    }

    public void setAuthority(List<String> authorityParam) {
        this.authorityParam = authorityParam;
    }

    public List<MetricInfo> getInfos() {
        return infosParam;
    }

    public void setInfos(List<MetricInfo> infosParam) {
        this.infosParam = infosParam;
    }

    public Boolean getIsAlerting() {
        return isAlertingParam;
    }

    public void setIsAlerting(Boolean isAlertingParam) {
        this.isAlertingParam = isAlertingParam;
    }

    public String getTargetType() {
        return targetTypeParam;
    }

    public void setTargetType(String targetTypeParam) {
        this.targetTypeParam = targetTypeParam;
    }

    public Boolean getUseYCallback() {
        return useYCallbackParam;
    }

    public void setUseYCallback(Boolean useYCallbackParam) {
        this.useYCallbackParam = useYCallbackParam;
    }

}
