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

public class RemoveASMemberRequest extends Request {

    /** 租户唯一标识ID，伸缩组所属租户，普通调用无需显式填写，系统会根据伸缩组记录自动补充 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 伸缩组ID，要移除成员的伸缩组唯一标识符，仅支持VM类型的伸缩组 */
    @NotEmpty
    @OpenAPIParam("GroupID")
    private String groupIDParam;

    /** 地域ID，指定伸缩组所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 虚拟机ID，要从伸缩组移除的虚拟机实例ID，虚拟机必须是伸缩组的有效成员 */
    @NotEmpty
    @OpenAPIParam("ResourceID")
    private String resourceIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getGroupID() {
        return groupIDParam;
    }

    public void setGroupID(String groupIDParam) {
        this.groupIDParam = groupIDParam;
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

}
