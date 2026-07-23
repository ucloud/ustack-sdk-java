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

public class DescribeComputeClassDRSRecordsRequest extends Request {

    /** 开始时间，秒级Unix时间戳，与EndTime一起限定任务创建时间区间，缺省表示不限制 */
    
    @UCloudStackParam("BeginTime")
    private Integer beginTimeParam;

    /** 租户ID */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 结束时间，秒级Unix时间戳，需大于等于BeginTime，缺省表示不限制 */
    
    @UCloudStackParam("EndTime")
    private Integer endTimeParam;

    /** 虚拟机ID关键字，非空时仅返回包含该关键字的虚拟机记录 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，默认10 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，默认0 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 地域ID */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 计算集群ID，指定要查询的DRS记录所属ComputeClass */
    @NotEmpty
    @UCloudStackParam("SetID")
    private String setIDParam;


    public Integer getBeginTime() {
        return beginTimeParam;
    }

    public void setBeginTime(Integer beginTimeParam) {
        this.beginTimeParam = beginTimeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getEndTime() {
        return endTimeParam;
    }

    public void setEndTime(Integer endTimeParam) {
        this.endTimeParam = endTimeParam;
    }

    public String getKeyword() {
        return keywordParam;
    }

    public void setKeyword(String keywordParam) {
        this.keywordParam = keywordParam;
    }

    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
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

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

}
