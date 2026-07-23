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

public class NIC {

    /** IP详情，网卡IP信息 */
    @SerializedName("IPs")
    private List<IP> iPsParam;

    /** MAC地址，网卡MAC地址 */
    @SerializedName("MAC")
    private String mACParam;

    /** 网卡名称，网卡设备名 */
    @SerializedName("Name")
    private String nameParam;


    public List<IP> getIPs() {
        return iPsParam;
    }

    public void setIPs(List<IP> iPsParam) {
        this.iPsParam = iPsParam;
    }

    public String getMAC() {
        return mACParam;
    }

    public void setMAC(String mACParam) {
        this.mACParam = mACParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

}
