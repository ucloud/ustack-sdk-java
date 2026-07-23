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

public class ExternalStorageTypeInfo {

    /**  */
    @SerializedName("Region")
    private String regionParam;

    /**  */
    @SerializedName("SetAlias")
    private String setAliasParam;

    /**  */
    @SerializedName("SetArch")
    private String setArchParam;

    /**  */
    @SerializedName("SetID")
    private String setIDParam;

    /**  */
    @SerializedName("SetType")
    private String setTypeParam;

    /**  */
    @SerializedName("SetUsage")
    private String setUsageParam;

    /**  */
    @SerializedName("StorageCap")
    private Integer storageCapParam;

    /**  */
    @SerializedName("StoragePhysicUsed")
    private Integer storagePhysicUsedParam;

    /**  */
    @SerializedName("StorageUsed")
    private Integer storageUsedParam;


    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSetAlias() {
        return setAliasParam;
    }

    public void setSetAlias(String setAliasParam) {
        this.setAliasParam = setAliasParam;
    }

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
    }

    public String getSetID() {
        return setIDParam;
    }

    public void setSetID(String setIDParam) {
        this.setIDParam = setIDParam;
    }

    public String getSetType() {
        return setTypeParam;
    }

    public void setSetType(String setTypeParam) {
        this.setTypeParam = setTypeParam;
    }

    public String getSetUsage() {
        return setUsageParam;
    }

    public void setSetUsage(String setUsageParam) {
        this.setUsageParam = setUsageParam;
    }

    public Integer getStorageCap() {
        return storageCapParam;
    }

    public void setStorageCap(Integer storageCapParam) {
        this.storageCapParam = storageCapParam;
    }

    public Integer getStoragePhysicUsed() {
        return storagePhysicUsedParam;
    }

    public void setStoragePhysicUsed(Integer storagePhysicUsedParam) {
        this.storagePhysicUsedParam = storagePhysicUsedParam;
    }

    public Integer getStorageUsed() {
        return storageUsedParam;
    }

    public void setStorageUsed(Integer storageUsedParam) {
        this.storageUsedParam = storageUsedParam;
    }

}
