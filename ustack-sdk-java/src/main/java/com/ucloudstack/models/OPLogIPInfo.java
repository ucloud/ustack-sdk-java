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

public class OPLogIPInfo {

    /** 具体IP地址，操作发生时记录的IP值 */
    @SerializedName("IP")
    private String iPParam;

    /** IP资源ID，关联IP资源的唯一标识 */
    @SerializedName("IPID")
    private String iPIDParam;

    /** IP资源类型，EIP/FLATIP/VIP */
    @SerializedName("IPType")
    private String iPTypeParam;


    public String getIP() {
        return iPParam;
    }

    public void setIP(String iPParam) {
        this.iPParam = iPParam;
    }

    public String getIPID() {
        return iPIDParam;
    }

    public void setIPID(String iPIDParam) {
        this.iPIDParam = iPIDParam;
    }

    public String getIPType() {
        return iPTypeParam;
    }

    public void setIPType(String iPTypeParam) {
        this.iPTypeParam = iPTypeParam;
    }

}
