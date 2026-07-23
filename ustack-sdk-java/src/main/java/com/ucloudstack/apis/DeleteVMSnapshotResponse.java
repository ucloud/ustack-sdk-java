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

public class DeleteVMSnapshotResponse extends Response {

    /** 快照ID列表，被删除的快照标识列表 */
    @SerializedName("SPIDs")
    private List<String> sPIDsParam;


    public List<String> getSPIDs() {
        return sPIDsParam;
    }

    public void setSPIDs(List<String> sPIDsParam) {
        this.sPIDsParam = sPIDsParam;
    }

}
