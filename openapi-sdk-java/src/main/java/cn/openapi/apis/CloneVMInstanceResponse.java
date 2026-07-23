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
package cn.openapi.apis;

import cn.openapi.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class CloneVMInstanceResponse extends Response {

    /** 外网资源ID列表，克隆创建时绑定的所有弹性IP标识 */
    @SerializedName("EIPIDs")
    private List<String> eIPIDsParam;

    /** 任务ID，克隆任务的唯一标识 */
    @SerializedName("VMCID")
    private String vMCIDParam;

    /** 虚拟机ID，新创建的虚拟机资源标识 */
    @SerializedName("VMID")
    private String vMIDParam;


    public List<String> getEIPIDs() {
        return eIPIDsParam;
    }

    public void setEIPIDs(List<String> eIPIDsParam) {
        this.eIPIDsParam = eIPIDsParam;
    }

    public String getVMCID() {
        return vMCIDParam;
    }

    public void setVMCID(String vMCIDParam) {
        this.vMCIDParam = vMCIDParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
