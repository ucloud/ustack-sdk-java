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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class ProjectInfo {

    /** 租户邮箱，该项目所属租户的主账号邮箱 */
    @SerializedName("CompanyEmail")
    private String companyEmailParam;

    /** 租户ID，标识项目所属的租户组织 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，所属租户的显示名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，项目创建的Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 默认项目，标识该项目是否为系统默认项目 */
    @SerializedName("IsDefault")
    private Boolean isDefaultParam;

    /** 项目名称，资源逻辑分组的显示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目ID，用于对云资源进行逻辑分组的唯一标识符 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 备注，对项目用途或管理范围的补充说明 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 更新时间，项目配置最后修改的Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public String getCompanyEmail() {
        return companyEmailParam;
    }

    public void setCompanyEmail(String companyEmailParam) {
        this.companyEmailParam = companyEmailParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getCompanyName() {
        return companyNameParam;
    }

    public void setCompanyName(String companyNameParam) {
        this.companyNameParam = companyNameParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public Boolean getIsDefault() {
        return isDefaultParam;
    }

    public void setIsDefault(Boolean isDefaultParam) {
        this.isDefaultParam = isDefaultParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
