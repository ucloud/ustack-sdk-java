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

public class VMMigrationInfo {

    /** 迁移信息 */
    @SerializedName("Message")
    private String messageParam;

    /** 完成时间 */
    @SerializedName("MigrationTime")
    private Integer migrationTimeParam;

    /** 执行job时原节点 */
    @SerializedName("SourceNode")
    private String sourceNodeParam;

    /** 迁移建议状态，取值NotMigrated/Migrated/Changed */
    @SerializedName("Status")
    private String statusParam;

    /** 执行job时目标节点 */
    @SerializedName("TargetNode")
    private String targetNodeParam;


    public String getMessage() {
        return messageParam;
    }

    public void setMessage(String messageParam) {
        this.messageParam = messageParam;
    }

    public Integer getMigrationTime() {
        return migrationTimeParam;
    }

    public void setMigrationTime(Integer migrationTimeParam) {
        this.migrationTimeParam = migrationTimeParam;
    }

    public String getSourceNode() {
        return sourceNodeParam;
    }

    public void setSourceNode(String sourceNodeParam) {
        this.sourceNodeParam = sourceNodeParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getTargetNode() {
        return targetNodeParam;
    }

    public void setTargetNode(String targetNodeParam) {
        this.targetNodeParam = targetNodeParam;
    }

}
