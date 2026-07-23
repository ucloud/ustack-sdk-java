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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class NATGWEIPInfo {

    /** IP地址，EIP的公网IP地址 */
    @SerializedName("IP")
    private String iPParam;

    /** 弹性公网IPID，用于标识EIP资源 */
    @SerializedName("IPID")
    private String iPIDParam;

    /** IP状态，EIP的当前状态 */
    @SerializedName("IPStatus")
    private String iPStatusParam;


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

    public String getIPStatus() {
        return iPStatusParam;
    }

    public void setIPStatus(String iPStatusParam) {
        this.iPStatusParam = iPStatusParam;
    }

}
