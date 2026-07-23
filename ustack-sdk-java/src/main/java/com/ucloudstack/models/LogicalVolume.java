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

public class LogicalVolume {

    /** 逻辑卷路径，逻辑卷设备路径 */
    @SerializedName("LVDMPath")
    private String lVDMPathParam;

    /** 逻辑卷大小，逻辑卷容量 */
    @SerializedName("LVMSize")
    private Integer lVMSizeParam;

    /** 逻辑卷名，逻辑卷名称 */
    @SerializedName("LVName")
    private String lVNameParam;

    /** 逻辑卷标签，逻辑卷标签信息 */
    @SerializedName("LVTAGs")
    private String lVTAGsParam;

    /** 卷组名，卷组名称 */
    @SerializedName("VGName")
    private String vGNameParam;


    public String getLVDMPath() {
        return lVDMPathParam;
    }

    public void setLVDMPath(String lVDMPathParam) {
        this.lVDMPathParam = lVDMPathParam;
    }

    public Integer getLVMSize() {
        return lVMSizeParam;
    }

    public void setLVMSize(Integer lVMSizeParam) {
        this.lVMSizeParam = lVMSizeParam;
    }

    public String getLVName() {
        return lVNameParam;
    }

    public void setLVName(String lVNameParam) {
        this.lVNameParam = lVNameParam;
    }

    public String getLVTAGs() {
        return lVTAGsParam;
    }

    public void setLVTAGs(String lVTAGsParam) {
        this.lVTAGsParam = lVTAGsParam;
    }

    public String getVGName() {
        return vGNameParam;
    }

    public void setVGName(String vGNameParam) {
        this.vGNameParam = vGNameParam;
    }

}
