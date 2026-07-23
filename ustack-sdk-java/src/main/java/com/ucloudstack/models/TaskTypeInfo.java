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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class TaskTypeInfo {

    /** 支持的资源类型列表，任务可作用的资源类型 */
    @SerializedName("ResourceTypes")
    private List<String> resourceTypesParam;

    /** 任务名称，编排任务名称 */
    @SerializedName("TaskName")
    private String taskNameParam;

    /** 任务类型，编排任务类型标识 */
    @SerializedName("TaskType")
    private String taskTypeParam;


    public List<String> getResourceTypes() {
        return resourceTypesParam;
    }

    public void setResourceTypes(List<String> resourceTypesParam) {
        this.resourceTypesParam = resourceTypesParam;
    }

    public String getTaskName() {
        return taskNameParam;
    }

    public void setTaskName(String taskNameParam) {
        this.taskNameParam = taskNameParam;
    }

    public String getTaskType() {
        return taskTypeParam;
    }

    public void setTaskType(String taskTypeParam) {
        this.taskTypeParam = taskTypeParam;
    }

}
