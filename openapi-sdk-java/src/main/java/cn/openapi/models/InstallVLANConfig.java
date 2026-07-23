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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class InstallVLANConfig {

    /** IP地址列表 */
    @SerializedName("IPs")
    private List<InstallIPConfig> iPsParam;

    /** VLAN名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 父接口 */
    @SerializedName("Parent")
    private String parentParam;

    /** VLAN ID */
    @SerializedName("VlanID")
    private Integer vlanIDParam;


    public List<InstallIPConfig> getIPs() {
        return iPsParam;
    }

    public void setIPs(List<InstallIPConfig> iPsParam) {
        this.iPsParam = iPsParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getParent() {
        return parentParam;
    }

    public void setParent(String parentParam) {
        this.parentParam = parentParam;
    }

    public Integer getVlanID() {
        return vlanIDParam;
    }

    public void setVlanID(Integer vlanIDParam) {
        this.vlanIDParam = vlanIDParam;
    }

}
