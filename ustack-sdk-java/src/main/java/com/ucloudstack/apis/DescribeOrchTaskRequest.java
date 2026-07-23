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

public class DescribeOrchTaskRequest extends Request {

    /** 租户ID，筛选指定租户的任务 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 搜索关键词，按任务名称或备注模糊搜索 */
    
    @UCloudStackParam("Keyword")
    private String keywordParam;

    /** 分页大小，指定每页返回的记录数，Limit为0时默认10 */
    
    @UCloudStackParam("Limit")
    private Integer limitParam;

    /** 分页偏移量，指定跳过的记录数 */
    
    @UCloudStackParam("Offset")
    private Integer offsetParam;

    /** 地域，筛选指定地域的任务 */
    
    @UCloudStackParam("Region")
    private String regionParam;

    /** 任务状态过滤，精确匹配OrchTaskInfo.Status字段；可为业务状态（NotStarted/Pending/Processing/Pausing/Paused/Completed/Aborting/Aborted/Invalied）或资源状态（Creating/Deleting/Deleted/Destroying等） */
    
    @UCloudStackParam("Status")
    private String statusParam;

    /** 任务ID列表，精确筛选指定任务 */
    
    @UCloudStackParam("TaskIDs")
    private List<String> taskIDsParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
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

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public List<String> getTaskIDs() {
        return taskIDsParam;
    }

    public void setTaskIDs(List<String> taskIDsParam) {
        this.taskIDsParam = taskIDsParam;
    }

}
