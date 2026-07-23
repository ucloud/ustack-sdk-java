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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class StorageUsageInfo {

    /** 地域ID */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 集群ID，存储集群的唯一标识符 */
    @SerializedName("SetID")
    private String setIDParam;

    /** 存储总量，集群的存储容量总和，单位GB */
    @SerializedName("StorageCap")
    private Integer storageCapParam;

    /** 存储实际使用率，物理存储已使用占总量的百分比 */
    @SerializedName("StoragePhysicUsageRate")
    private Double storagePhysicUsageRateParam;

    /** 物理存储已使用，集群中实际消耗的物理存储容量，单位GB */
    @SerializedName("StoragePhysicUsed")
    private Integer storagePhysicUsedParam;

    /** 存储使用率，已使用存储占总量的百分比 */
    @SerializedName("StorageUsageRate")
    private Double storageUsageRateParam;

    /** 存储已使用，集群中已分配的存储容量，单位GB */
    @SerializedName("StorageUsed")
    private Integer storageUsedParam;


    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRegionAlias() {
        return regionAliasParam;
    }

    public void setRegionAlias(String regionAliasParam) {
        this.regionAliasParam = regionAliasParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public Integer getStorageCap() {
        return storageCapParam;
    }

    public void setStorageCap(Integer storageCapParam) {
        this.storageCapParam = storageCapParam;
    }

    public Double getStoragePhysicUsageRate() {
        return storagePhysicUsageRateParam;
    }

    public void setStoragePhysicUsageRate(Double storagePhysicUsageRateParam) {
        this.storagePhysicUsageRateParam = storagePhysicUsageRateParam;
    }

    public Integer getStoragePhysicUsed() {
        return storagePhysicUsedParam;
    }

    public void setStoragePhysicUsed(Integer storagePhysicUsedParam) {
        this.storagePhysicUsedParam = storagePhysicUsedParam;
    }

    public Double getStorageUsageRate() {
        return storageUsageRateParam;
    }

    public void setStorageUsageRate(Double storageUsageRateParam) {
        this.storageUsageRateParam = storageUsageRateParam;
    }

    public Integer getStorageUsed() {
        return storageUsedParam;
    }

    public void setStorageUsed(Integer storageUsedParam) {
        this.storageUsedParam = storageUsedParam;
    }

}
