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

public class VCPUBinding {

    /** pCPU编号，宿主机的物理CPU索引或范围 */
    @SerializedName("PCPU")
    private String pCPUParam;

    /** vCPU编号，虚拟机的虚拟CPU索引 */
    @SerializedName("VCPU")
    private Integer vCPUParam;


    public String getPCPU() {
        return pCPUParam;
    }

    public void setPCPU(String pCPUParam) {
        this.pCPUParam = pCPUParam;
    }

    public Integer getVCPU() {
        return vCPUParam;
    }

    public void setVCPU(Integer vCPUParam) {
        this.vCPUParam = vCPUParam;
    }

}
