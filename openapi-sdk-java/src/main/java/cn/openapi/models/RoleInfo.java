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

public class RoleInfo {

    /** 租户ID，标识角色所属的租户组织 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，角色首次定义的Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 角色名称，用于在控制台显示 */
    @SerializedName("Name")
    private String nameParam;

    /** 备注，用于补充说明角色用途和权限范围 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 角色ID，系统生成的权限定义唯一标识符 */
    @SerializedName("RoleID")
    private String roleIDParam;

    /** 角色类型，标识角色来源，取值：System或Custom */
    @SerializedName("Type")
    private String typeParam;

    /** 更新时间，角色信息最后修改的Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getRoleID() {
        return roleIDParam;
    }

    public void setRoleID(String roleIDParam) {
        this.roleIDParam = roleIDParam;
    }

    public String getType() {
        return typeParam;
    }

    public void setType(String typeParam) {
        this.typeParam = typeParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
