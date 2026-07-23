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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class TaskStepResource {

    /** 该资源在此任务中的最新执行情况，该资源在任务中的执行信息 */
    @SerializedName("Execution")
    private TaskExecution executionParam;

    /** 资源名称，资源名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 资源备注，资源描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 资源ID，步骤关联的资源ID */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源状态，资源不存在时为Deleted，否则为资源RStatus字符串 */
    @SerializedName("Status")
    private String statusParam;


    public TaskExecution getExecution() {
        return executionParam;
    }

    public void setExecution(TaskExecution executionParam) {
        this.executionParam = executionParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

}
