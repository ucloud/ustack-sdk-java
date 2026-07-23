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

public class DescribeDTSLogRequest extends Request {

    /** DTS任务ID，待查询日志的DTS任务唯一标识 */
    @NotEmpty
    @OpenAPIParam("DTSID")
    private String dTSIDParam;

    /** 任务阶段名称，指定查询哪个阶段的日志，常见值包括：precheck、struct-sync、full-data-sync、incremental-data-sync等 */
    @NotEmpty
    @OpenAPIParam("DTSStage")
    private String dTSStageParam;

    /** 结束时间戳，秒级Unix时间戳，用于指定日志查询结束时间 */
    
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 日志数量限制，指定最多返回的日志条数 */
    
    @OpenAPIParam("LogLimit")
    private Integer logLimitParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 开始时间戳，秒级Unix时间戳，用于指定日志查询起始时间 */
    
    @OpenAPIParam("StartTime")
    private Integer startTimeParam;

    /** 日志类型，指定查询的日志类别，取值范围：default（默认日志）、monitor（监控日志） */
    @NotEmpty
    @OpenAPIParam("Type")
    private String typeParam;


    public String getDTSID() {
        return dTSIDParam;
    }

    public void setDTSID(String dTSIDParam) {
        this.dTSIDParam = dTSIDParam;
    }

    public String getDTSStage() {
        return dTSStageParam;
    }

    public void setDTSStage(String dTSStageParam) {
        this.dTSStageParam = dTSStageParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
    }

    public Integer getLogLimit() {
        return logLimitParam;
    }

    public void setLogLimit(Integer logLimitParam) {
        this.logLimitParam = logLimitParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public Integer getStartTime() {
        return startTimeParam;
    }

    public void setStartTime(Integer startTimeParam) {
        this.startTimeParam = startTimeParam;
    }

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

}
