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

public class HostVGPUUsedInfo {

    /** 可用vGPU，该规格剩余可分配数量 */
    @SerializedName("Allocable")
    private Integer allocableParam;

    /** vGPU总量，该规格可分配总数 */
    @SerializedName("Count")
    private Integer countParam;

    /** 锁定vGPU，该规格已锁定待分配数量 */
    @SerializedName("Locked")
    private Integer lockedParam;

    /** vGPU规格名称，虚拟GPU配置规格 */
    @SerializedName("MdevName")
    private String mdevNameParam;

    /** 已用vGPU，该规格已分配数量 */
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
