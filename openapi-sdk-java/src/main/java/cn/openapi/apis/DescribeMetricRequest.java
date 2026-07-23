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
package cn.openapi.apis;

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class DescribeMetricRequest extends Request {

    /** 过滤标签列表，仅返回同时包含所有指定标签的指标，弹性伸缩监控会通过horizontal_vm/horizontal_vs/vertical_vm/vertical_eip等标签区分不同模式 */
    
    @OpenAPIParam("Labels")
    private List<String> labelsParam;

    /** 地域，指定要访问的Prometheus及后台服务；当TargetTypes包含STORAGE_SET且传入TargetID时必须填写 */
    
    @OpenAPIParam("Region")
    private String regionParam;

    /** 监控目标资源ID，需要与TargetTypes中的类型匹配，Handler会把该ID写入指标PromQL的resource_id（或特定标签）过滤条件，例如VM/COMPUTE_SET/REDIS等直接填资源ID，STORAGE_SET/FS/CLUSTER填SetID，OSD或对象存储需填SetID:子资源，VPNGW_TUNNEL填隧道ID，AS_GROUP填伸缩组ID等；为空时仅返回模板定义，不拼装资源级PromQL */
    
    @OpenAPIParam("TargetID")
    private String targetIDParam;

    /** 实例ID，PaaS多实例资源可通过该参数指定具体实例，仅在同时指定TargetID时生效 */
    
    @OpenAPIParam("TargetInstanceID")
    private String targetInstanceIDParam;

    /** 监控资源类型列表，限定需要返回的监控对象，支持类型（HOST/VM/COMPUTE_SET/STORAGE_SET/REGION/LB/LB_VSERVER/NATGW/VPNGW/VPNGW_TUNNEL/EIP/AS_GROUP/OSS/FS/REDIS/PM/MYSQL/DBS等）；为空时返回指标文件中启用了告警且当前租户已授权的所有资源类型 */
    
    @OpenAPIParam("TargetTypes")
    private List<String> targetTypesParam;


    public List<String> getLabels() {
        return labelsParam;
    }

    public void setLabels(List<String> labelsParam) {
        this.labelsParam = labelsParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getTargetID() {
        return targetIDParam;
    }

    public void setTargetID(String targetIDParam) {
        this.targetIDParam = targetIDParam;
    }

    public String getTargetInstanceID() {
        return targetInstanceIDParam;
    }

    public void setTargetInstanceID(String targetInstanceIDParam) {
        this.targetInstanceIDParam = targetInstanceIDParam;
    }

    public List<String> getTargetTypes() {
        return targetTypesParam;
    }

    public void setTargetTypes(List<String> targetTypesParam) {
        this.targetTypesParam = targetTypesParam;
    }

}
