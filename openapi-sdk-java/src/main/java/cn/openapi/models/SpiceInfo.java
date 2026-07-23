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

public class SpiceInfo {

    /** Spice服务IP，Spice连接地址 */
    @SerializedName("SpiceIP")
    private String spiceIPParam;

    /** Spice连接密码，用于Spice认证的密码 */
    @SerializedName("SpicePassword")
    private String spicePasswordParam;

    /** Spice服务端口，Spice连接端口 */
    @SerializedName("SpicePort")
    private Integer spicePortParam;

    /** 虚拟机ID，目标虚拟机资源标识 */
    @SerializedName("VMID")
    private String vMIDParam;


    public String getSpiceIP() {
        return spiceIPParam;
    }

    public void setSpiceIP(String spiceIPParam) {
        this.spiceIPParam = spiceIPParam;
    }

    public String getSpicePassword() {
        return spicePasswordParam;
    }

    public void setSpicePassword(String spicePasswordParam) {
        this.spicePasswordParam = spicePasswordParam;
    }

    public Integer getSpicePort() {
        return spicePortParam;
    }

    public void setSpicePort(Integer spicePortParam) {
        this.spicePortParam = spicePortParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
