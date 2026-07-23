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

public class MySQLParamTplInfo {

    /** 租户ID，模板所属租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，Unix时间戳（秒） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，模板所属租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 模板ID，参数模板ID */
    @SerializedName("ID")
    private String iDParam;

    /** 名称，模板名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 地域ID，模板所属地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 描述，模板描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 类型，模板类型 */
    @SerializedName("Type")
    private String typeParam;

    /** 更新时间，Unix时间戳（秒） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 版本，MySQL版本 */
    @SerializedName("Version")
    private String versionParam;


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

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getID() {
        return iDParam;
    }

    public void setID(String iDParam) {
        this.iDParam = iDParam;
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

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
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

    public String getVersion() {
        return versionParam;
    }

    public void setVersion(String versionParam) {
        this.versionParam = versionParam;
    }

}
