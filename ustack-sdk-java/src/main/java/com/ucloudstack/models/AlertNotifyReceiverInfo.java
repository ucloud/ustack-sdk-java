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

public class AlertNotifyReceiverInfo {

    /** 创建时间，接收人创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 接收人邮箱地址，用于接收告警通知邮件 */
    @SerializedName("Email")
    private String emailParam;

    /** 接收人名称，接收人名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 所属通知组ID，接收人所属通知组ID */
    @SerializedName("NotifyGroupID")
    private String notifyGroupIDParam;

    /** 接收人ID，接收人唯一标识 */
    @SerializedName("NotifyReceiverID")
    private String notifyReceiverIDParam;

    /** 接收人电话号码，用于接收告警通知的电话号 */
    @SerializedName("Phone")
    private String phoneParam;

    /** 更新时间，接收人更新时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
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

    public String getNotifyReceiverID() {
        return notifyReceiverIDParam;
    }

    public void setNotifyReceiverID(String notifyReceiverIDParam) {
        this.notifyReceiverIDParam = notifyReceiverIDParam;
    }

    public String getPhone() {
        return phoneParam;
    }

    public void setPhone(String phoneParam) {
        this.phoneParam = phoneParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
