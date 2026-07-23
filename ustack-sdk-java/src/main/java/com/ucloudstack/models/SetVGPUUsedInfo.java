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

public class SetVGPUUsedInfo {

    /** 虚拟GPU可分配量，该类型vGPU当前可用于分配的数量，计算方式为Count-Used-Locked */
    @SerializedName("Allocable")
    private Integer allocableParam;

    /** 虚拟GPU总数，该类型vGPU的总数量 */
    @SerializedName("Count")
    private Integer countParam;

    /** 虚拟GPU已锁定量，该类型vGPU已锁定但尚未分配的数量，如虚拟机创建中 */
    @SerializedName("Locked")
    private Integer lockedParam;

    /** 虚拟GPU设备类型名称，Mdev设备类型标识，如nvidia-63等 */
    @SerializedName("MdevName")
    private String mdevNameParam;

    /** 虚拟GPU使用量，该类型vGPU已分配给虚拟机的数量 */
    @SerializedName("Used")
    private Integer usedParam;


    public Integer getAllocable() {
        return allocableParam;
    }

    public void setAllocable(Integer allocableParam) {
        this.allocableParam = allocableParam;
    }

    public Integer getCount() {
        return countParam;
    }

    public void setCount(Integer countParam) {
        this.countParam = countParam;
    }

    public Integer getLocked() {
        return lockedParam;
    }

    public void setLocked(Integer lockedParam) {
        this.lockedParam = lockedParam;
    }

    public String getMdevName() {
        return mdevNameParam;
    }

    public void setMdevName(String mdevNameParam) {
        this.mdevNameParam = mdevNameParam;
    }

    public Integer getUsed() {
        return usedParam;
    }

    public void setUsed(Integer usedParam) {
        this.usedParam = usedParam;
    }

}
