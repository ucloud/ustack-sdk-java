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

public class CreatePortGroupResponse extends Response {

    /** 端口组ID，创建成功后返回的端口组唯一标识符 */
    @SerializedName("PortGroupID")
    private String portGroupIDParam;


    public String getPortGroupID() {
        return portGroupIDParam;
    }

    public void setPortGroupID(String portGroupIDParam) {
        this.portGroupIDParam = portGroupIDParam;
    }

}
