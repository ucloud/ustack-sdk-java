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

public class VFInfo {

    /** PCI位置，VF网卡PCI地址 */
    @SerializedName("PCI")
    private String pCIParam;

    /** 关联网卡，关联网卡标识 */
    @SerializedName("RelatedNIC")
    private String relatedNICParam;

    /** 关联虚拟机，关联虚拟机标识 */
    @SerializedName("RelatedVM")
    private String relatedVMParam;


    public String getPCI() {
        return pCIParam;
    }

    public void setPCI(String pCIParam) {
        this.pCIParam = pCIParam;
    }

    public String getRelatedNIC() {
        return relatedNICParam;
    }

    public void setRelatedNIC(String relatedNICParam) {
        this.relatedNICParam = relatedNICParam;
    }

    public String getRelatedVM() {
        return relatedVMParam;
    }

    public void setRelatedVM(String relatedVMParam) {
        this.relatedVMParam = relatedVMParam;
    }

}
