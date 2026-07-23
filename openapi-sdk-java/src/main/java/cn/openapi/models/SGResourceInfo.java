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

public class SGResourceInfo {

    /** IP地址，按网卡粒度查询时返回网卡主IP；未获取到时为空 */
    @SerializedName("IP")
    private String iPParam;

    /** MAC地址，按网卡粒度查询时返回网卡MAC；未获取到时为空 */
    @SerializedName("MAC")
    private String mACParam;

    /** 网卡ID，按网卡粒度查询时返回绑定安全组的网卡唯一标识符；非网卡资源为空 */
    @SerializedName("NICID")
    private String nICIDParam;

    /** 网卡类型，资源绑定安全组时的网络接口类型；取值LAN/WAN */
    @SerializedName("NICType")
    private String nICTypeParam;

    /** 资源名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 资源ID，绑定安全组的资源唯一标识符 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源类型，绑定安全组的资源类型；取值包括VM、ELASTIC_NIC、MYSQL、REDIS、OSS、FS等 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 安全组ID，资源绑定的安全组唯一标识符 */
    @SerializedName("SGID")
    private String sGIDParam;


    public String getIP() {
        return iPParam;
    }

    public void setIP(String iPParam) {
        this.iPParam = iPParam;
    }

    public String getMAC() {
        return mACParam;
    }

    public void setMAC(String mACParam) {
        this.mACParam = mACParam;
    }

    public String getNICID() {
        return nICIDParam;
    }

    public void setNICID(String nICIDParam) {
        this.nICIDParam = nICIDParam;
    }

    public String getNICType() {
        return nICTypeParam;
    }

    public void setNICType(String nICTypeParam) {
        this.nICTypeParam = nICTypeParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getResourceID() {
        return resourceIDParam;
    }

    public void setResourceID(String resourceIDParam) {
        this.resourceIDParam = resourceIDParam;
    }

    public String getResourceType() {
        return resourceTypeParam;
    }

    public void setResourceType(String resourceTypeParam) {
        this.resourceTypeParam = resourceTypeParam;
    }

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

}
