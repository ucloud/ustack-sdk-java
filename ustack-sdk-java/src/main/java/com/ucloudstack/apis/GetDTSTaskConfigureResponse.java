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
package com.ucloudstack.apis;

import com.ucloudstack.common.response.Response;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class GetDTSTaskConfigureResponse extends Response {

    /** 单批写入大小，用于控制 sinker 每次批量写入的记录数；为0时使用系统默认值1000 */
    @SerializedName("BatchSize")
    private Integer batchSizeParam;

    /** DTS任务ID，数据传输任务唯一标识 */
    @SerializedName("DTSID")
    private String dTSIDParam;

    /** 数据标记表，用于双向同步场景记录已同步数据，格式为database.table_name，未指定则自动创建 */
    @SerializedName("DataMarkTable")
    private String dataMarkTableParam;

    /** 同步数据库列表，未指定则同步所有数据库 */
    @SerializedName("Databases")
    private String databasesParam;

    /** 目标库GTID集合，用于双向同步场景的反向增量同步 */
    @SerializedName("DestinationEndpointBinlogGTID")
    private String destinationEndpointBinlogGTIDParam;

    /** 目标实例地址，当DestinationEndpointInstanceType为External时返回外部地址 */
    @SerializedName("DestinationEndpointIP")
    private String destinationEndpointIPParam;

    /** 目标实例ID，当DestinationEndpointInstanceType为Internal时返回实例ID */
    @SerializedName("DestinationEndpointInstanceID")
    private String destinationEndpointInstanceIDParam;

    /** 目标实例名称，目标端内部实例名称 */
    @SerializedName("DestinationEndpointInstanceName")
    private String destinationEndpointInstanceNameParam;

    /** 目标实例类型，取值范围：Internal、External */
    @SerializedName("DestinationEndpointInstanceType")
    private String destinationEndpointInstanceTypeParam;

    /** 目标实例密码，连接目标库的账号密码 */
    @SerializedName("DestinationEndpointPassword")
    private String destinationEndpointPasswordParam;

    /** 目标实例端口，当DestinationEndpointInstanceType为External时返回外部端口 */
    @SerializedName("DestinationEndpointPort")
    private Integer destinationEndpointPortParam;

    /** 目标实例用户名，连接目标库的账号用户名 */
    @SerializedName("DestinationEndpointUserName")
    private String destinationEndpointUserNameParam;

    /** 目标实例数据库类型，取值范围：MYSQL、REDIS */
    @SerializedName("DestinationEngine")
    private String destinationEngineParam;

    /** 心跳间隔秒数，用于推进binlog位点的时间间隔（秒） */
    @SerializedName("HeartbeatInterval")
    private Integer heartbeatIntervalParam;

    /** 心跳表名称，用于增量或双向同步场景定时推进binlog位点，格式为database.table_name，未指定则自动创建 */
    @SerializedName("HeartbeatTable")
    private String heartbeatTableParam;

    /** 忽略数据库列表，用于排除不需要同步的数据库 */
    @SerializedName("IgnoreDatabases")
    private String ignoreDatabasesParam;

    /** 忽略数据表列表，用于排除不需要同步的数据表 */
    @SerializedName("IgnoreTables")
    private String ignoreTablesParam;

    /** 增量同步阶段的 DTS 自恢复策略；为空表示沿用 DTS 默认自恢复策略 */
    @SerializedName("IncrementalRestart")
    private DTSServiceRestartPolicy incrementalRestartParam;

    /** binlog GTID集合，用于增量或全量加增量同步 */
    @SerializedName("SourceEndpointBinlogGTID")
    private String sourceEndpointBinlogGTIDParam;

    /** binlog文件名，用于增量或全量加增量同步 */
    @SerializedName("SourceEndpointBinlogName")
    private String sourceEndpointBinlogNameParam;

    /** binlog位点，用于增量或全量加增量同步 */
    @SerializedName("SourceEndpointBinlogPos")
    private Integer sourceEndpointBinlogPosParam;

    /** 源实例地址，当SourceEndpointInstanceType为External时返回外部地址 */
    @SerializedName("SourceEndpointIP")
    private String sourceEndpointIPParam;

    /** 源实例ID，当SourceEndpointInstanceType为Internal时返回实例ID */
    @SerializedName("SourceEndpointInstanceID")
    private String sourceEndpointInstanceIDParam;

    /** 源实例名称，源端内部实例名称 */
    @SerializedName("SourceEndpointInstanceName")
    private String sourceEndpointInstanceNameParam;

    /** 源实例类型，平台内部或外部数据库，取值范围：Internal、External */
    @SerializedName("SourceEndpointInstanceType")
    private String sourceEndpointInstanceTypeParam;

    /** 源实例密码，连接源库的账号密码 */
    @SerializedName("SourceEndpointPassword")
    private String sourceEndpointPasswordParam;

    /** 源实例端口，当SourceEndpointInstanceType为External时返回外部端口 */
    @SerializedName("SourceEndpointPort")
    private Integer sourceEndpointPortParam;

    /** 服务器ID，用于标识DTS服务作为从库的唯一ID */
    @SerializedName("SourceEndpointServerID")
    private String sourceEndpointServerIDParam;

    /** 源实例用户名，连接源库的账号用户名 */
    @SerializedName("SourceEndpointUserName")
    private String sourceEndpointUserNameParam;

    /** 源实例数据库类型，取值范围：MYSQL、REDIS */
    @SerializedName("SourceEngine")
    private String sourceEngineParam;

    /** 同步数据表列表，支持通配符，未指定则同步所有数据表 */
    @SerializedName("Tables")
    private String tablesParam;


    public Integer getBatchSize() {
        return batchSizeParam;
    }

    public void setBatchSize(Integer batchSizeParam) {
        this.batchSizeParam = batchSizeParam;
    }

    public String getDTSID() {
        return dTSIDParam;
    }

    public void setDTSID(String dTSIDParam) {
        this.dTSIDParam = dTSIDParam;
    }

    public String getDataMarkTable() {
        return dataMarkTableParam;
    }

    public void setDataMarkTable(String dataMarkTableParam) {
        this.dataMarkTableParam = dataMarkTableParam;
    }

    public String getDatabases() {
        return databasesParam;
    }

    public void setDatabases(String databasesParam) {
        this.databasesParam = databasesParam;
    }

    public String getDestinationEndpointBinlogGTID() {
        return destinationEndpointBinlogGTIDParam;
    }

    public void setDestinationEndpointBinlogGTID(String destinationEndpointBinlogGTIDParam) {
        this.destinationEndpointBinlogGTIDParam = destinationEndpointBinlogGTIDParam;
    }

    public String getDestinationEndpointIP() {
        return destinationEndpointIPParam;
    }

    public void setDestinationEndpointIP(String destinationEndpointIPParam) {
        this.destinationEndpointIPParam = destinationEndpointIPParam;
    }

    public String getDestinationEndpointInstanceID() {
        return destinationEndpointInstanceIDParam;
    }

    public void setDestinationEndpointInstanceID(String destinationEndpointInstanceIDParam) {
        this.destinationEndpointInstanceIDParam = destinationEndpointInstanceIDParam;
    }

    public String getDestinationEndpointInstanceName() {
        return destinationEndpointInstanceNameParam;
    }

    public void setDestinationEndpointInstanceName(String destinationEndpointInstanceNameParam) {
        this.destinationEndpointInstanceNameParam = destinationEndpointInstanceNameParam;
    }

    public String getDestinationEndpointInstanceType() {
        return destinationEndpointInstanceTypeParam;
    }

    public void setDestinationEndpointInstanceType(String destinationEndpointInstanceTypeParam) {
        this.destinationEndpointInstanceTypeParam = destinationEndpointInstanceTypeParam;
    }

    public String getDestinationEndpointPassword() {
        return destinationEndpointPasswordParam;
    }

    public void setDestinationEndpointPassword(String destinationEndpointPasswordParam) {
        this.destinationEndpointPasswordParam = destinationEndpointPasswordParam;
    }

    public Integer getDestinationEndpointPort() {
        return destinationEndpointPortParam;
    }

    public void setDestinationEndpointPort(Integer destinationEndpointPortParam) {
        this.destinationEndpointPortParam = destinationEndpointPortParam;
    }

    public String getDestinationEndpointUserName() {
        return destinationEndpointUserNameParam;
    }

    public void setDestinationEndpointUserName(String destinationEndpointUserNameParam) {
        this.destinationEndpointUserNameParam = destinationEndpointUserNameParam;
    }

    public String getDestinationEngine() {
        return destinationEngineParam;
    }

    public void setDestinationEngine(String destinationEngineParam) {
        this.destinationEngineParam = destinationEngineParam;
    }

    public Integer getHeartbeatInterval() {
        return heartbeatIntervalParam;
    }

    public void setHeartbeatInterval(Integer heartbeatIntervalParam) {
        this.heartbeatIntervalParam = heartbeatIntervalParam;
    }

    public String getHeartbeatTable() {
        return heartbeatTableParam;
    }

    public void setHeartbeatTable(String heartbeatTableParam) {
        this.heartbeatTableParam = heartbeatTableParam;
    }

    public String getIgnoreDatabases() {
        return ignoreDatabasesParam;
    }

    public void setIgnoreDatabases(String ignoreDatabasesParam) {
        this.ignoreDatabasesParam = ignoreDatabasesParam;
    }

    public String getIgnoreTables() {
        return ignoreTablesParam;
    }

    public void setIgnoreTables(String ignoreTablesParam) {
        this.ignoreTablesParam = ignoreTablesParam;
    }

    public DTSServiceRestartPolicy getIncrementalRestart() {
        return incrementalRestartParam;
    }

    public void setIncrementalRestart(DTSServiceRestartPolicy incrementalRestartParam) {
        this.incrementalRestartParam = incrementalRestartParam;
    }

    public String getSourceEndpointBinlogGTID() {
        return sourceEndpointBinlogGTIDParam;
    }

    public void setSourceEndpointBinlogGTID(String sourceEndpointBinlogGTIDParam) {
        this.sourceEndpointBinlogGTIDParam = sourceEndpointBinlogGTIDParam;
    }

    public String getSourceEndpointBinlogName() {
        return sourceEndpointBinlogNameParam;
    }

    public void setSourceEndpointBinlogName(String sourceEndpointBinlogNameParam) {
        this.sourceEndpointBinlogNameParam = sourceEndpointBinlogNameParam;
    }

    public Integer getSourceEndpointBinlogPos() {
        return sourceEndpointBinlogPosParam;
    }

    public void setSourceEndpointBinlogPos(Integer sourceEndpointBinlogPosParam) {
        this.sourceEndpointBinlogPosParam = sourceEndpointBinlogPosParam;
    }

    public String getSourceEndpointIP() {
        return sourceEndpointIPParam;
    }

    public void setSourceEndpointIP(String sourceEndpointIPParam) {
        this.sourceEndpointIPParam = sourceEndpointIPParam;
    }

    public String getSourceEndpointInstanceID() {
        return sourceEndpointInstanceIDParam;
    }

    public void setSourceEndpointInstanceID(String sourceEndpointInstanceIDParam) {
        this.sourceEndpointInstanceIDParam = sourceEndpointInstanceIDParam;
    }

    public String getSourceEndpointInstanceName() {
        return sourceEndpointInstanceNameParam;
    }

    public void setSourceEndpointInstanceName(String sourceEndpointInstanceNameParam) {
        this.sourceEndpointInstanceNameParam = sourceEndpointInstanceNameParam;
    }

    public String getSourceEndpointInstanceType() {
        return sourceEndpointInstanceTypeParam;
    }

    public void setSourceEndpointInstanceType(String sourceEndpointInstanceTypeParam) {
        this.sourceEndpointInstanceTypeParam = sourceEndpointInstanceTypeParam;
    }

    public String getSourceEndpointPassword() {
        return sourceEndpointPasswordParam;
    }

    public void setSourceEndpointPassword(String sourceEndpointPasswordParam) {
        this.sourceEndpointPasswordParam = sourceEndpointPasswordParam;
    }

    public Integer getSourceEndpointPort() {
        return sourceEndpointPortParam;
    }

    public void setSourceEndpointPort(Integer sourceEndpointPortParam) {
        this.sourceEndpointPortParam = sourceEndpointPortParam;
    }

    public String getSourceEndpointServerID() {
        return sourceEndpointServerIDParam;
    }

    public void setSourceEndpointServerID(String sourceEndpointServerIDParam) {
        this.sourceEndpointServerIDParam = sourceEndpointServerIDParam;
    }

    public String getSourceEndpointUserName() {
        return sourceEndpointUserNameParam;
    }

    public void setSourceEndpointUserName(String sourceEndpointUserNameParam) {
        this.sourceEndpointUserNameParam = sourceEndpointUserNameParam;
    }

    public String getSourceEngine() {
        return sourceEngineParam;
    }

    public void setSourceEngine(String sourceEngineParam) {
        this.sourceEngineParam = sourceEngineParam;
    }

    public String getTables() {
        return tablesParam;
    }

    public void setTables(String tablesParam) {
        this.tablesParam = tablesParam;
    }

}
