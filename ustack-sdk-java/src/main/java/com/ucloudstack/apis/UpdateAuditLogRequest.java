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

public class UpdateAuditLogRequest extends Request {

    /** 审计日志事件，写入资源注解的事件列表，多个事件用逗号分隔；未填写时默认写入QUERY */
    
    @UCloudStackParam("AuditEvents")
    private String auditEventsParam;

    /** 审计状态，0表示关闭审计日志，1表示开启审计日志，状态必须为以下两个值之一 */
    
    @UCloudStackParam("AuditStatus")
    private Integer auditStatusParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 资源ID，指定要开关审计日志的数据库资源，如MySQL实例，资源状态必须为AVAILABLE且运行状态为Running */
    @NotEmpty
    @UCloudStackParam("ResourceID")
    private String resourceIDParam;

    /** 资源类型，目前仅支持MYSQL，传入其他取值会被校验拒绝 */
    @NotEmpty
    @UCloudStackParam("ResourceType")
    private String resourceTypeParam;


    public String getAuditEvents() {
        return auditEventsParam;
    }

    public void setAuditEvents(String auditEventsParam) {
        this.auditEventsParam = auditEventsParam;
    }

    public Integer getAuditStatus() {
        return auditStatusParam;
    }

    public void setAuditStatus(Integer auditStatusParam) {
        this.auditStatusParam = auditStatusParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

}
