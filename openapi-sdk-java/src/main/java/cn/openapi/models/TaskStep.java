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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class TaskStep {

    /** 步骤延迟，执行该步骤前等待的时间（秒） */
    @SerializedName("Delay")
    private Integer delayParam;

    /** 步骤次序，步骤执行顺序 */
    @SerializedName("Order")
    private Integer orderParam;

    /** 步骤包含的资源信息，步骤关联资源的执行情况 */
    @SerializedName("Resources")
    private List<TaskStepResource> resourcesParam;


    public Integer getDelay() {
        return delayParam;
    }

    public void setDelay(Integer delayParam) {
        this.delayParam = delayParam;
    }

    public Integer getOrder() {
        return orderParam;
    }

    public void setOrder(Integer orderParam) {
        this.orderParam = orderParam;
    }

    public List<TaskStepResource> getResources() {
        return resourcesParam;
    }

    public void setResources(List<TaskStepResource> resourcesParam) {
        this.resourcesParam = resourcesParam;
    }

}
