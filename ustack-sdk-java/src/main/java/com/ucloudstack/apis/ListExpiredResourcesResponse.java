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

public class ListExpiredResourcesResponse extends Response {

    /** 过期资源信息列表，按资源类型分组，包含符合条件的所有过期资源的详细信息 */
    @SerializedName("Infos")
    private List<ExpiredResourceInfo> infosParam;


    public List<ExpiredResourceInfo> getInfos() {
        return infosParam;
    }

    public void setInfos(List<ExpiredResourceInfo> infosParam) {
        this.infosParam = infosParam;
    }

}
