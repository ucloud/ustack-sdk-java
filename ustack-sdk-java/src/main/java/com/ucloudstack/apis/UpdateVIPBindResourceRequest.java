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

public class UpdateVIPBindResourceRequest extends Request {

    /** 关联资源ID列表，指定需要绑定的虚拟机或弹性网卡资源ID；此操作会解绑原有绑定并绑定新列表；为空表示解绑全部资源；绑定数量上限由配置GlobalConfigKeyVIPBoundLimit控制；关联资源为VM时，LAN要求与VIP同子网，WAN要求所有VM同VPC且不能已绑定NAT模式EIP */
    
    @OpenAPIParam("AssociatedResourceIDs")
    private List<String> associatedResourceIDsParam;

    /** 关联资源类型，指定绑定资源类型；VM表示虚拟机，ELASTIC_NIC表示弹性网卡；为空时默认VM */
    
    @OpenAPIParam("AssociatedResourceType")
    private String associatedResourceTypeParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** VIPID，VIP的唯一标识符 */
    @NotEmpty
    @OpenAPIParam("VIPID")
    private String vIPIDParam;


    public List<String> getAssociatedResourceIDs() {
        return associatedResourceIDsParam;
    }

    public void setAssociatedResourceIDs(List<String> associatedResourceIDsParam) {
        this.associatedResourceIDsParam = associatedResourceIDsParam;
    }

    public String getAssociatedResourceType() {
        return associatedResourceTypeParam;
    }

    public void setAssociatedResourceType(String associatedResourceTypeParam) {
        this.associatedResourceTypeParam = associatedResourceTypeParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getVIPID() {
        return vIPIDParam;
    }

    public void setVIPID(String vIPIDParam) {
        this.vIPIDParam = vIPIDParam;
    }

}
