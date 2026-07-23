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

public class ObserverInfo {

    /** 观察人邮箱地址，观察人的邮箱，用于接收审批进度通知 */
    @SerializedName("ObserverEmail")
    private String observerEmailParam;

    /** 观察人账号ID，可以查看审批进度但不参与审批决策的用户标识 */
    @SerializedName("ObserverMemberID")
    private Integer observerMemberIDParam;


    public String getObserverEmail() {
        return observerEmailParam;
    }

    public void setObserverEmail(String observerEmailParam) {
        this.observerEmailParam = observerEmailParam;
    }

    public Integer getObserverMemberID() {
        return observerMemberIDParam;
    }

    public void setObserverMemberID(Integer observerMemberIDParam) {
        this.observerMemberIDParam = observerMemberIDParam;
    }

}
