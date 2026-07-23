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

public class SourceInfo {

    /** 源虚拟机ID，被克隆的源虚拟机标识 */
    @SerializedName("SourceVMID")
    private String sourceVMIDParam;

    /** 整机快照ID，克隆使用的快照标识 */
    @SerializedName("VMSPID")
    private String vMSPIDParam;


    public String getSourceVMID() {
        return sourceVMIDParam;
    }

    public void setSourceVMID(String sourceVMIDParam) {
        this.sourceVMIDParam = sourceVMIDParam;
    }

    public String getVMSPID() {
        return vMSPIDParam;
    }

    public void setVMSPID(String vMSPIDParam) {
        this.vMSPIDParam = vMSPIDParam;
    }

}
