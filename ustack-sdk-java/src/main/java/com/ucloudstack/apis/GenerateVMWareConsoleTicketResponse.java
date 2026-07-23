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

public class GenerateVMWareConsoleTicketResponse extends Response {

    /** VMware控制台访问链接，用于打开VMware控制台 */
    @SerializedName("Link")
    private String linkParam;


    public String getLink() {
        return linkParam;
    }

    public void setLink(String linkParam) {
        this.linkParam = linkParam;
    }

}
