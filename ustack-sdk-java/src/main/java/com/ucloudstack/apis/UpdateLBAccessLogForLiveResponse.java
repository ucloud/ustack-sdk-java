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

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class UpdateLBAccessLogForLiveResponse extends Response {

    /** WebSocket会话ID，仅当Switch为On时返回，调用方需将该ID拼接为ws://{host}/logconsole?session={ID}以建立实时日志连接 */
    @SerializedName("WebSocketURL")
    private String webSocketURLParam;


    public String getWebSocketURL() {
        return webSocketURLParam;
    }

    public void setWebSocketURL(String webSocketURLParam) {
        this.webSocketURLParam = webSocketURLParam;
    }

}
