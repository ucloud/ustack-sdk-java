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

public class ImageOSInfo {

    /** 操作系统版本ID，标识特定操作系统枚举记录 */
    @SerializedName("ImageOSID")
    private String imageOSIDParam;

    /** 网络配置模式，取值NetworkScripts、Interfaces、Netplan、None */
    @SerializedName("NetworkMode")
    private String networkModeParam;

    /** 发行版名称，操作系统的具体品牌或系列 */
    @SerializedName("OSDistribution")
    private String oSDistributionParam;

    /** 操作系统类型，如Linux、Windows */
    @SerializedName("OSType")
    private String oSTypeParam;

    /** 具体版本号，标识发行版内部的具体版本信息 */
    @SerializedName("OSVersion")
    private String oSVersionParam;

    /** 备注信息，对该操作系统版本的补充说明 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 架构类型，基于计算集群支持的指令集，如x86_64、aarch64 */
    @SerializedName("SetArch")
    private String setArchParam;

    /** 就绪状态，标识该操作系统版本是否可用 */
    @SerializedName("Status")
    private String statusParam;


    public String getImageOSID() {
        return imageOSIDParam;
    }

    public void setImageOSID(String imageOSIDParam) {
        this.imageOSIDParam = imageOSIDParam;
    }

    public String getNetworkMode() {
        return networkModeParam;
    }

    public void setNetworkMode(String networkModeParam) {
        this.networkModeParam = networkModeParam;
    }

    public String getOSDistribution() {
        return oSDistributionParam;
    }

    public void setOSDistribution(String oSDistributionParam) {
        this.oSDistributionParam = oSDistributionParam;
    }

    public String getOSType() {
        return oSTypeParam;
    }

    public void setOSType(String oSTypeParam) {
        this.oSTypeParam = oSTypeParam;
    }

    public String getOSVersion() {
        return oSVersionParam;
    }

    public void setOSVersion(String oSVersionParam) {
        this.oSVersionParam = oSVersionParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getSetArch() {
        return setArchParam;
    }

    public void setSetArch(String setArchParam) {
        this.setArchParam = setArchParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

}
