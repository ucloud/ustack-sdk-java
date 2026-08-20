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
package com.ucloudstack.apis;

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateVMInstanceResponse extends Response {

    /** 磁盘ID，系统盘的唯一标识 */
    @SerializedName("DiskID")
    private String diskIDParam;

    /** 外网资源ID，绑定的弹性IP标识 */
    @SerializedName("EIPID")
    private String eIPIDParam;

    /** 外网资源ID列表，创建阶段生成的WAN IP标识列表；首个元素与EIPID一致，后续元素为附加WAN IP的标识 */
    @SerializedName("EIPIDs")
    private List<String> eIPIDsParam;

    /** 扁平网络ID，绑定的扁平网络IP标识 */
    @SerializedName("FlatIPID")
    private String flatIPIDParam;

    /** 虚拟机ID，创建成功的云主机实例标识 */
    @SerializedName("VMID")
    private String vMIDParam;


    public String getDiskID() {
        return diskIDParam;
    }

    public void setDiskID(String diskIDParam) {
        this.diskIDParam = diskIDParam;
    }

    public String getEIPID() {
        return eIPIDParam;
    }

    public void setEIPID(String eIPIDParam) {
        this.eIPIDParam = eIPIDParam;
    }

    public List<String> getEIPIDs() {
        return eIPIDsParam;
    }

    public void setEIPIDs(List<String> eIPIDsParam) {
        this.eIPIDsParam = eIPIDsParam;
    }

    public String getFlatIPID() {
        return flatIPIDParam;
    }

    public void setFlatIPID(String flatIPIDParam) {
        this.flatIPIDParam = flatIPIDParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
