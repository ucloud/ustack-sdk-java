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

public class UpdateLBLogRequest extends Request {

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 负载均衡ID，用于定位需要更新访问日志配置的负载均衡实例 */
    @NotEmpty
    @UCloudStackParam("LBID")
    private String lBIDParam;

    /** 访问日志开关，是否开启访问日志，取值范围：On、Off */
    @NotEmpty
    @UCloudStackParam("LogAccessEnable")
    private String logAccessEnableParam;

    /** 日志存储OSS ID，用于存储访问日志的OSS实例ID，当访问日志开关为On时必填，该OSS实例必须存在、状态可用，且与负载均衡位于同一VPC */
    
    @UCloudStackParam("LogOssID")
    private String logOssIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getLBID() {
        return lBIDParam;
    }

    public void setLBID(String lBIDParam) {
        this.lBIDParam = lBIDParam;
    }

    public String getLogAccessEnable() {
        return logAccessEnableParam;
    }

    public void setLogAccessEnable(String logAccessEnableParam) {
        this.logAccessEnableParam = logAccessEnableParam;
    }

    public String getLogOssID() {
        return logOssIDParam;
    }

    public void setLogOssID(String logOssIDParam) {
        this.logOssIDParam = logOssIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
