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

public class ISOInfo {

    /** 是否从此盘引导，true表示从此盘引导 */
    @SerializedName("Boot")
    private Boolean bootParam;

    /** ISO镜像ID，ISO镜像标识 */
    @SerializedName("ImageID")
    private String imageIDParam;

    /** ISO镜像名称，ISO镜像展示名称 */
    @SerializedName("ImageName")
    private String imageNameParam;

    /** ISO所属地域，ISO磁盘所属地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 存储集群架构，ISO磁盘所属存储集群架构 */
    @SerializedName("SetArch")
    private String setArchParam;

    /** 存储集群类型，ISO磁盘所属存储集群类型 */
    @SerializedName("SetType")
    private String setTypeParam;

    /** 磁盘大小，单位GiB */
    @SerializedName("Size")
    private Integer sizeParam;

    /** 磁盘状态，ISO磁盘当前状态 */
    @SerializedName("Status")
    private String statusParam;

    /** ISO磁盘类型，ISO磁盘类型标识 */
    @SerializedName("Type")
    private String typeParam;


    public Boolean getBoot() {
        return bootParam;
    }

    public void setBoot(Boolean bootParam) {
        this.bootParam = bootParam;
    }

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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

    public Integer getSize() {
        return sizeParam;
    }

    public void setSize(Integer sizeParam) {
        this.sizeParam = sizeParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

}
