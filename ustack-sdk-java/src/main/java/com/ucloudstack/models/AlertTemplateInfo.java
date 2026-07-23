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

public class AlertTemplateInfo {

    /** 绑定资源数量，模板已绑定的资源数量 */
    @SerializedName("BoundTargetCount")
    private Integer boundTargetCountParam;

    /** 所属租户ID，告警模板所属租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，告警模板创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，告警模板所属租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 告警模板名称，告警模板名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 所属地域，告警模板所属地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 告警模板备注，告警模板备注信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 告警模板ID，告警模板唯一标识 */
    @SerializedName("TemplateID")
    private String templateIDParam;

    /** 告警模板类型，监控的资源类型 */
    @SerializedName("TemplateType")
    private String templateTypeParam;

    /** 更新时间，告警模板更新时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public Integer getBoundTargetCount() {
        return boundTargetCountParam;
    }

    public void setBoundTargetCount(Integer boundTargetCountParam) {
        this.boundTargetCountParam = boundTargetCountParam;
    }

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

    public String getTemplateID() {
        return templateIDParam;
    }

    public void setTemplateID(String templateIDParam) {
        this.templateIDParam = templateIDParam;
    }

    public String getTemplateType() {
        return templateTypeParam;
    }

    public void setTemplateType(String templateTypeParam) {
        this.templateTypeParam = templateTypeParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
