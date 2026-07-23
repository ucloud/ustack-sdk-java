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

public class BaseExpiredResourceInfo {

    /** 计费类型，资源的付费方式 */
    @SerializedName("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，标识该资源所属的租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，Unix时间戳(秒) */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 删除时间，Unix时间戳(秒) */
    @SerializedName("DeleteTime")
    private Integer deleteTimeParam;

    /** 过期时间，Unix时间戳(秒) */
    @SerializedName("ExpireTime")
    private Integer expireTimeParam;

    /** 资源名称，资源的显示名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 地域ID，标识该资源所属的地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 资源备注，资源的描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 资源ID，资源的唯一标识，包含资源类型前缀和14位随机字符 */
    @SerializedName("ResourceID")
    private String resourceIDParam;

    /** 资源类型，指定资源的分类 */
    @SerializedName("ResourceType")
    private String resourceTypeParam;

    /** 状态，资源的当前状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 终止时间，Unix时间戳(秒) */
    @SerializedName("TerminateTime")
    private Integer terminateTimeParam;

    /** 更新时间，Unix时间戳(秒) */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public String getChargeType() {
        return chargeTypeParam;
    }

    public void setChargeType(String chargeTypeParam) {
        this.chargeTypeParam = chargeTypeParam;
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

    public Integer getDeleteTime() {
        return deleteTimeParam;
    }

    public void setDeleteTime(Integer deleteTimeParam) {
        this.deleteTimeParam = deleteTimeParam;
    }

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
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

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public Integer getTerminateTime() {
        return terminateTimeParam;
    }

    public void setTerminateTime(Integer terminateTimeParam) {
        this.terminateTimeParam = terminateTimeParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
