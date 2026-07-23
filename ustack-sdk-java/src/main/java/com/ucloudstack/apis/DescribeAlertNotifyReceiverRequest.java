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

public class DescribeAlertNotifyReceiverRequest extends Request {

    /** 分页大小，指定每页返回的记录数，取值范围1-100，Limit为0时默认10，结果按创建时间倒序返回 */
    
    @OpenAPIParam("Limit")
    private Integer limitParam;

    /** 通知组ID，查询指定通知组下的接收人，若指定则查询该组的所有接收人 */
    @NotEmpty
    @OpenAPIParam("NotifyGroupID")
    private String notifyGroupIDParam;

    /** 分页偏移量，指定跳过的记录数，与Limit配合遍历所有接收人 */
    
    @OpenAPIParam("Offset")
    private Integer offsetParam;


    public Integer getLimit() {
        return limitParam;
    }

    public void setLimit(Integer limitParam) {
        this.limitParam = limitParam;
    }

    public String getNotifyGroupID() {
        return notifyGroupIDParam;
    }

    public void setNotifyGroupID(String notifyGroupIDParam) {
        this.notifyGroupIDParam = notifyGroupIDParam;
    }

    public Integer getOffset() {
        return offsetParam;
    }

    public void setOffset(Integer offsetParam) {
        this.offsetParam = offsetParam;
    }

}
