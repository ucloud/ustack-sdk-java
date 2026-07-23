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
package cn.openapi.apis;

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class AttachNICRequest extends Request {

    /** 租户ID，AttachNIC接口中可选，用于权限校验 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 网卡ID，指定要绑定的网卡资源 */
    @NotEmpty
    @OpenAPIParam("NICID")
    private String nICIDParam;

    /** 物理网卡型号标准编号，用于SR-IOV直通场景；为空表示不启用SR-IOV；与网卡QoS流量整形互斥 */
    
    @OpenAPIParam("PFCode")
    private String pFCodeParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 资源ID，指定网卡要绑定的目标资源ID，通常为虚拟机ID */
    @NotEmpty
    @OpenAPIParam("ResourceID")
    private String resourceIDParam;

    /** 资源类型，指定网卡要绑定的目标资源类型；取值VM */
    @NotEmpty
    @OpenAPIParam("ResourceType")
    private String resourceTypeParam;


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

    public String getPFCode() {
        return pFCodeParam;
    }

    public void setPFCode(String pFCodeParam) {
        this.pFCodeParam = pFCodeParam;
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

}
