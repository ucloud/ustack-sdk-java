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

public class AlertNotifyWebhookInfo {

    /** 创建时间，Webhook创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** HTTP请求的方法，取值：Post/Get */
    @SerializedName("Method")
    private String methodParam;

    /** Webhook名称，Webhook名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 通知组ID，Webhook所属通知组ID */
    @SerializedName("NotifyGroupID")
    private String notifyGroupIDParam;

    /** 通知组WebhookID，Webhook ID */
    @SerializedName("NotifyWebhookID")
    private String notifyWebhookIDParam;

    /** 更新时间，Webhook更新时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** Webhook URL地址，Webhook目标URL */
    @SerializedName("Url")
    private String urlParam;


    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getMethod() {
        return methodParam;
    }

    public void setMethod(String methodParam) {
        this.methodParam = methodParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getNotifyGroupID() {
        return notifyGroupIDParam;
    }

    public void setNotifyGroupID(String notifyGroupIDParam) {
        this.notifyGroupIDParam = notifyGroupIDParam;
    }

    public String getNotifyWebhookID() {
        return notifyWebhookIDParam;
    }

    public void setNotifyWebhookID(String notifyWebhookIDParam) {
        this.notifyWebhookIDParam = notifyWebhookIDParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getUrl() {
        return urlParam;
    }

    public void setUrl(String urlParam) {
        this.urlParam = urlParam;
    }

}
