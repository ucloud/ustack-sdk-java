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

public class DescribeAuditLogResponse extends Response {

    /** 审计日志事件，从资源注解hhpaas.AK_AUDIT_EVENTS中读取的当前配置 */
    @SerializedName("AuditEvents")
    private String auditEventsParam;

    /** 审计日志列表，包含所有匹配的审计日志详细信息，按执行时间倒序排列 */
    @SerializedName("Infos")
    private List<AuditLogInfos> infosParam;

    /** 总数，成功解析且未被IgnoreQuery过滤的审计日志条目数 */
    @SerializedName("TotalCount")
    private Integer totalCountParam;


    public String getAuditEvents() {
        return auditEventsParam;
    }

    public void setAuditEvents(String auditEventsParam) {
        this.auditEventsParam = auditEventsParam;
    }

    public List<AuditLogInfos> getInfos() {
        return infosParam;
    }

    public void setInfos(List<AuditLogInfos> infosParam) {
        this.infosParam = infosParam;
    }

    public Integer getTotalCount() {
        return totalCountParam;
    }

    public void setTotalCount(Integer totalCountParam) {
        this.totalCountParam = totalCountParam;
    }

}
