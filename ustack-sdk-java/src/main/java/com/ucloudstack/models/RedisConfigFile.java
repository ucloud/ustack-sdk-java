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

public class RedisConfigFile {

    /** 租户邮箱，模板所属租户邮箱 */
    @SerializedName("CompanyEmail")
    private String companyEmailParam;

    /** 租户ID，模板所属租户 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，模板所属租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 配置文件ID，参数模板ID */
    @SerializedName("ConfigID")
    private String configIDParam;

    /** 创建时间，Unix时间戳（秒） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 配置描述，模板描述信息 */
    @SerializedName("Description")
    private String descriptionParam;

    /** 类型，模板类型 */
    @SerializedName("FileType")
    private String fileTypeParam;

    /** 配置名称，模板名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 更新时间，Unix时间戳（秒） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 版本，Redis版本 */
    @SerializedName("Version")
    private String versionParam;


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

    public String getConfigID() {
        return configIDParam;
    }

    public void setConfigID(String configIDParam) {
        this.configIDParam = configIDParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getDescription() {
        return descriptionParam;
    }

    public void setDescription(String descriptionParam) {
        this.descriptionParam = descriptionParam;
    }

    public String getFileType() {
        return fileTypeParam;
    }

    public void setFileType(String fileTypeParam) {
        this.fileTypeParam = fileTypeParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
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
