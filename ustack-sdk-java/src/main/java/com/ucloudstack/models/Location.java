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

public class Location {

    /** RAID卡ControllerID，用于标识RAID控制器ID */
    @SerializedName("ControllerID")
    private String controllerIDParam;

    /** 物理设备名，用于展示物理设备名称 */
    @SerializedName("Drive")
    private String driveParam;

    /** 磁盘柜编号，磁盘所在磁盘柜编号 */
    @SerializedName("Enclosure")
    private String enclosureParam;

    /** 磁盘型号，磁盘设备型号 */
    @SerializedName("Model")
    private String modelParam;

    /** RAID级别，用于标识RAID级别 */
    @SerializedName("RAIDLevel")
    private String rAIDLevelParam;

    /** 磁盘序列号，用于标识唯一标识 */
    @SerializedName("SerialNumber")
    private String serialNumberParam;

    /** 磁盘大小，单位GiB */
    @SerializedName("Size")
    private Integer sizeParam;

    /** 磁盘插槽号，磁盘所在插槽号 */
    @SerializedName("Slot")
    private String slotParam;

    /** 磁盘状态，用于标识当前状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 磁盘类型，取值范围：1-HDD、2-SSD */
    @SerializedName("Type")
    private String typeParam;


    public String getControllerID() {
        return controllerIDParam;
    }

    public void setControllerID(String controllerIDParam) {
        this.controllerIDParam = controllerIDParam;
    }

    public String getDrive() {
        return driveParam;
    }

    public void setDrive(String driveParam) {
        this.driveParam = driveParam;
    }

    public String getEnclosure() {
        return enclosureParam;
    }

    public void setEnclosure(String enclosureParam) {
        this.enclosureParam = enclosureParam;
    }

    public String getModel() {
        return modelParam;
    }

    public void setModel(String modelParam) {
        this.modelParam = modelParam;
    }

    public String getRAIDLevel() {
        return rAIDLevelParam;
    }

    public void setRAIDLevel(String rAIDLevelParam) {
        this.rAIDLevelParam = rAIDLevelParam;
    }

    public String getSerialNumber() {
        return serialNumberParam;
    }

    public void setSerialNumber(String serialNumberParam) {
        this.serialNumberParam = serialNumberParam;
    }

    public Integer getSize() {
        return sizeParam;
    }

    public void setSize(Integer sizeParam) {
        this.sizeParam = sizeParam;
    }

    public String getSlot() {
        return slotParam;
    }

    public void setSlot(String slotParam) {
        this.slotParam = slotParam;
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
