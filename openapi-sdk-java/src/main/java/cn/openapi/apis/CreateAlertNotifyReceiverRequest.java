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

public class CreateAlertNotifyReceiverRequest extends Request {

    /** 接收人邮箱地址，用于接收告警通知邮件，同一通知组内邮箱不能重复 */
    @NotEmpty
    @OpenAPIParam("Email")
    private String emailParam;

    /** 接收人名称，长度1-128字符，支持中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 通知组ID，接收人所属通知组 */
    @NotEmpty
    @OpenAPIParam("NotifyGroupID")
    private String notifyGroupIDParam;

    /** 接收人电话号码，用于接收告警通知 */
    
    @OpenAPIParam("Phone")
    private String phoneParam;


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

    public String getPhone() {
        return phoneParam;
    }

    public void setPhone(String phoneParam) {
        this.phoneParam = phoneParam;
    }

}
