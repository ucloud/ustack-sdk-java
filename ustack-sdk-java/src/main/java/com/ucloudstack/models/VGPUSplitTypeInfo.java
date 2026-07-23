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

public class VGPUSplitTypeInfo {

    /** 帧率限制，vGPU最大帧率 */
    @SerializedName("FRL")
    private String fRLParam;

    /** 显存大小，vGPU显存容量 */
    @SerializedName("Framebuffer")
    private String framebufferParam;

    /** 最大分辨率，vGPU支持的最高分辨率 */
    @SerializedName("MaxResolution")
    private String maxResolutionParam;

    /** Mdev设备名称，vGPU规格名称 */
    @SerializedName("MdevName")
    private String mdevNameParam;

    /** 分割比例，物理GPU分割比例 */
    @SerializedName("SplitRatio")
    private String splitRatioParam;


    public String getFRL() {
        return fRLParam;
    }

    public void setFRL(String fRLParam) {
        this.fRLParam = fRLParam;
    }

    public String getFramebuffer() {
        return framebufferParam;
    }

    public void setFramebuffer(String framebufferParam) {
        this.framebufferParam = framebufferParam;
    }

    public String getMaxResolution() {
        return maxResolutionParam;
    }

    public void setMaxResolution(String maxResolutionParam) {
        this.maxResolutionParam = maxResolutionParam;
    }

    public String getMdevName() {
        return mdevNameParam;
    }

    public void setMdevName(String mdevNameParam) {
        this.mdevNameParam = mdevNameParam;
    }

    public String getSplitRatio() {
        return splitRatioParam;
    }

    public void setSplitRatio(String splitRatioParam) {
        this.splitRatioParam = splitRatioParam;
    }

}
