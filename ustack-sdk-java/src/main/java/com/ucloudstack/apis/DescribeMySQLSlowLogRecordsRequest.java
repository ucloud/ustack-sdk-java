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

public class DescribeMySQLSlowLogRecordsRequest extends Request {

    /** 开始时间，查询慢日志的开始时间（Unix秒级时间戳） */
    @NotEmpty
    @OpenAPIParam("BeginTime")
    private Integer beginTimeParam;

    /** 结束时间，查询慢日志的结束时间（Unix秒级时间戳） */
    @NotEmpty
    @OpenAPIParam("EndTime")
    private Integer endTimeParam;

    /** 分页大小，指定每页返回的记录数，默认10 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** MySQL实例ID，指定要查询慢日志的MySQL实例；注意：资源必须为AVAILABLE状态且为工作状态，只查询Ready状态的VM */
    @NotEmpty
    @OpenAPIParam("MySQLID")
    private String mySQLIDParam;

    /** 分页偏移量，指定跳过的记录数，默认0 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


    public Integer getBeginTime() {
        return beginTimeParam;
    }

    public void setBeginTime(Integer beginTimeParam) {
        this.beginTimeParam = beginTimeParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public String getMySQLID() {
        return mySQLIDParam;
    }

    public void setMySQLID(String mySQLIDParam) {
        this.mySQLIDParam = mySQLIDParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
