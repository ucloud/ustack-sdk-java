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
package cn.openapi.apis;

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class DeleteAlertNotifyReceiverRequest extends Request {

    /** 接收人ID，待删除的接收人ID，可通过创建或查询接收人接口获取 */
    @NotEmpty
    @OpenAPIParam("NotifyReceiverID")
    private String notifyReceiverIDParam;


    public String getNotifyReceiverID() {
        return notifyReceiverIDParam;
    }

    public void setNotifyReceiverID(String notifyReceiverIDParam) {
        this.notifyReceiverIDParam = notifyReceiverIDParam;
    }

}
