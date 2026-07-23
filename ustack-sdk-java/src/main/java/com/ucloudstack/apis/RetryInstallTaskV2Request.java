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

public class RetryInstallTaskV2Request extends Request {

    /** 租户ID，标识当前执行重试操作的租户，后台会校验任务所属租户与裸金属当前租户一致，不允许管理员租户（0或超级管理员）直接重试 */
    @NotEmpty
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 地域ID，指定任务所在地域，系统会基于地域选择Kunlun集群执行重试 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 装机任务ID，重试目标任务的唯一标识，后台将基于该ID读取任务详情、核验裸金属状态并重新下发装机流程 */
    @NotEmpty
    @UCloudStackParam("TaskID")
    private String taskIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getTaskID() {
        return taskIDParam;
    }

    public void setTaskID(String taskIDParam) {
        this.taskIDParam = taskIDParam;
    }

}
