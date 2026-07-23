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

public class VmCDROMInfo {

    /** CDROM镜像ID，为空时表示只有CDROM插槽 */
    @SerializedName("ImageID")
    private String imageIDParam;

    /** CDROM镜像名称 */
    @SerializedName("ImageName")
    private String imageNameParam;


    public String getImageID() {
        return imageIDParam;
    }

    public void setImageID(String imageIDParam) {
        this.imageIDParam = imageIDParam;
    }

    public String getImageName() {
        return imageNameParam;
    }

    public void setImageName(String imageNameParam) {
        this.imageNameParam = imageNameParam;
    }

}
