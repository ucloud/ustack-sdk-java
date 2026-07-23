/**
 * Copyright 2026 UCloud Technology Co., Ltd.
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

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class GetLatestInstallConfigResponse extends Response {

    /** 任务所属租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 裸金属安装配置详情 */
    @SerializedName("Config")
    private PMInstallConfig configParam;

    /** 创建时间 */
    @SerializedName("CreatedAt")
    private Integer createdAtParam;

    /** 元数据 */
    @SerializedName("Metadata")
    private InstallMetadata metadataParam;

    /** 配置模式版本 */
    @SerializedName("SchemaVersion")
    private String schemaVersionParam;

    /** 配置版本 */
    @SerializedName("Version")
    private Integer versionParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public PMInstallConfig getConfig() {
        return configParam;
    }

    public void setConfig(PMInstallConfig configParam) {
        this.configParam = configParam;
    }

    public Integer getCreatedAt() {
        return createdAtParam;
    }

    public void setCreatedAt(Integer createdAtParam) {
        this.createdAtParam = createdAtParam;
    }

    public InstallMetadata getMetadata() {
        return metadataParam;
    }

    public void setMetadata(InstallMetadata metadataParam) {
        this.metadataParam = metadataParam;
    }

    public String getSchemaVersion() {
        return schemaVersionParam;
    }

    public void setSchemaVersion(String schemaVersionParam) {
        this.schemaVersionParam = schemaVersionParam;
    }

    public Integer getVersion() {
        return versionParam;
    }

    public void setVersion(Integer versionParam) {
        this.versionParam = versionParam;
    }

}
