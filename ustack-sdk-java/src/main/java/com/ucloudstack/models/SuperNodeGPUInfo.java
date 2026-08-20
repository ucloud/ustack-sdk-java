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

public class SuperNodeGPUInfo {

    /** GPU的颗数 */
    @SerializedName("GPU")
    private Integer gPUParam;

    /** GPU的规格 */
    @SerializedName("GPUMdevName")
    private String gPUMdevNameParam;


    public Integer getGPU() {
        return gPUParam;
    }

    public void setGPU(Integer gPUParam) {
        this.gPUParam = gPUParam;
    }

    public String getGPUMdevName() {
        return gPUMdevNameParam;
    }

    public void setGPUMdevName(String gPUMdevNameParam) {
        this.gPUMdevNameParam = gPUMdevNameParam;
    }

}
