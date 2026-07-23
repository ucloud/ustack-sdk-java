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

public class UpdateStorageSetSortPolicyRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，普通租户需填写自身CompanyID；管理员租户（CompanyID=200000231）或留空时按管理员权限操作存储排序策略 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 排序策略，存储集群的排序策略，用于确定虚拟机创建时选择存储集群的优先级顺序，支持类型：default（默认排序）、available（按可用容量降序）、ssd（SSD类型优先）、hdd（HDD类型优先）、defined（自定义顺序，需配合SetIDs使用） */
    @NotEmpty
    @OpenAPIParam("Policy")
    private String policyParam;

    /** 地域ID，指定存储集群所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 自定义集群ID列表，当Policy为defined时必填，指定存储集群的优先级顺序，按数组顺序依次选择，当Policy为其他值时此字段应为空列表，通过SetStorageSetSortPolicy接口设置排序策略 */
    
    @OpenAPIParam("SetIDs")
    private List<String> setIDsParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getPolicy() {
        return policyParam;
    }

    public void setPolicy(String policyParam) {
        this.policyParam = policyParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public List<String> getSetIDs() {
        return setIDsParam;
    }

    public void setSetIDs(List<String> setIDsParam) {
        this.setIDsParam = setIDsParam;
    }

}
