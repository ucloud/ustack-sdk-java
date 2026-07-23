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

public class ExternalStorageSetInfo {

    /**  */
    @SerializedName("CSIPluginAddress")
    private String cSIPluginAddressParam;

    /**  */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /**  */
    @SerializedName("DisableTargetIQNs")
    private List<String> disableTargetIQNsParam;

    /**  */
    @SerializedName("EnableTargetIQNs")
    private List<String> enableTargetIQNsParam;

    /**  */
    @SerializedName("LUNCount")
    private Integer lUNCountParam;

    /**  */
    @SerializedName("Reason")
    private String reasonParam;

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
    @SerializedName("Status")
    private String statusParam;

    /**  */
    @SerializedName("StorageCap")
    private Integer storageCapParam;

    /**  */
    @SerializedName("UserName")
    private String userNameParam;


    public String getCSIPluginAddress() {
        return cSIPluginAddressParam;
    }

    public void setCSIPluginAddress(String cSIPluginAddressParam) {
        this.cSIPluginAddressParam = cSIPluginAddressParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public List<String> getDisableTargetIQNs() {
        return disableTargetIQNsParam;
    }

    public void setDisableTargetIQNs(List<String> disableTargetIQNsParam) {
        this.disableTargetIQNsParam = disableTargetIQNsParam;
    }

    public List<String> getEnableTargetIQNs() {
        return enableTargetIQNsParam;
    }

    public void setEnableTargetIQNs(List<String> enableTargetIQNsParam) {
        this.enableTargetIQNsParam = enableTargetIQNsParam;
    }

    public Integer getLUNCount() {
        return lUNCountParam;
    }

    public void setLUNCount(Integer lUNCountParam) {
        this.lUNCountParam = lUNCountParam;
    }

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
    }

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

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public Integer getStorageCap() {
        return storageCapParam;
    }

    public void setStorageCap(Integer storageCapParam) {
        this.storageCapParam = storageCapParam;
    }

    public String getUserName() {
        return userNameParam;
    }

    public void setUserName(String userNameParam) {
        this.userNameParam = userNameParam;
    }

}
