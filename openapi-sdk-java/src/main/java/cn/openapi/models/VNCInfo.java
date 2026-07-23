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

public class VNCInfo {

    /** 虚拟机ID，目标虚拟机资源标识 */
    @SerializedName("VMID")
    private String vMIDParam;

    /** VNC服务IP，VNC连接地址 */
    @SerializedName("VNCIP")
    private String vNCIPParam;

    /** VNC连接密码，用于VNC认证的密码 */
    @SerializedName("VNCPassword")
    private String vNCPasswordParam;

    /** VNC服务端口，VNC连接端口 */
    @SerializedName("VNCPort")
    private Integer vNCPortParam;


    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

    public String getVNCIP() {
        return vNCIPParam;
    }

    public void setVNCIP(String vNCIPParam) {
        this.vNCIPParam = vNCIPParam;
    }

    public String getVNCPassword() {
        return vNCPasswordParam;
    }

    public void setVNCPassword(String vNCPasswordParam) {
        this.vNCPasswordParam = vNCPasswordParam;
    }

    public Integer getVNCPort() {
        return vNCPortParam;
    }

    public void setVNCPort(Integer vNCPortParam) {
        this.vNCPortParam = vNCPortParam;
    }

}
