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

public class OperateAlertRequest extends Request {

    /** 告警指纹，前端可从DescribeAlert返回中透传，用于辅助展示与历史关联；当前写接口的精确定位以 AlertOccurrenceKey 为准 */
    
    @OpenAPIParam("AlertFingerprint")
    private String alertFingerprintParam;

    /** 告警实例标识，前端从DescribeAlert返回中透传，用于精确定位一条当前告警实例 */
    @NotEmpty
    @OpenAPIParam("AlertOccurrenceKey")
    private String alertOccurrenceKeyParam;

    /** 租户ID，告警所属租户；普通租户不传时默认使用当前租户，管理员代操作其他租户时必须明确传入 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 忽略截止时间，Unix时间戳(秒)；当Operation=Ignore时必填且必须大于当前时间，其它操作忽略该值 */
    
    @OpenAPIParam("IgnoreUntil")
    private Integer ignoreUntilParam;

    /** 操作类型，取值：Handle、Reopen、Ignore、CancelIgnore；命名为 Operation 以避免与通用 API 路由字段 Action 冲突 */
    @NotEmpty
    @OpenAPIParam("Operation")
    private String operationParam;

    /** 地域，告警所属地域，用于校验当前告警归属并在状态不存在时回查实时告警 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 操作备注，用于记录处理说明，长度0-255字符 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 资源ID，触发告警的目标资源ID，用于权限校验和回查当前告警 */
    @NotEmpty
    @OpenAPIParam("TargetID")
    private String targetIDParam;


    public String getAlertFingerprint() {
        return alertFingerprintParam;
    }

    public void setAlertFingerprint(String alertFingerprintParam) {
        this.alertFingerprintParam = alertFingerprintParam;
    }

    public String getAlertOccurrenceKey() {
        return alertOccurrenceKeyParam;
    }

    public void setAlertOccurrenceKey(String alertOccurrenceKeyParam) {
        this.alertOccurrenceKeyParam = alertOccurrenceKeyParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getIgnoreUntil() {
        return ignoreUntilParam;
    }

    public void setIgnoreUntil(Integer ignoreUntilParam) {
        this.ignoreUntilParam = ignoreUntilParam;
    }

    public String getOperation() {
        return operationParam;
    }

    public void setOperation(String operationParam) {
        this.operationParam = operationParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getTargetID() {
        return targetIDParam;
    }

    public void setTargetID(String targetIDParam) {
        this.targetIDParam = targetIDParam;
    }

}
