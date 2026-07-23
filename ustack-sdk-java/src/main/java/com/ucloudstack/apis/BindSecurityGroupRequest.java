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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class BindSecurityGroupRequest extends Request {

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 网卡ID，绑定安全组时指定的网络接口唯一标识符，Flat时传入,其他场景传空字符串 */
    
    @OpenAPIParam("NICID")
    private String nICIDParam;

    /** 网卡类型，取值LAN/WAN；对于MySQL/Redis/OSS/FS仅支持WAN */
    @NotEmpty
    @OpenAPIParam("NICType")
    private String nICTypeParam;

    /** 地域ID，用于标识资源和安全组所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源ID，指定要绑定安全组的资源唯一标识符，支持VM、ELASTIC_NIC、OSS、FS、MySQL、Redis等资源类型 */
    @NotEmpty
    @OpenAPIParam("ResourceID")
    private String resourceIDParam;

    /** 安全组ID，指定要绑定的安全组唯一标识符；安全组需处于Available状态 */
    @NotEmpty
    @OpenAPIParam("SGID")
    private String sGIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
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

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

}
