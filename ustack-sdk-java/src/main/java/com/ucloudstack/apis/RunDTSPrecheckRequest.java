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

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class RunDTSPrecheckRequest extends Request {

    /** 同步数据库列表，指定需要同步的数据库名称，多个数据库用逗号分隔；不指定则同步所有数据库 */
    
    @OpenAPIParam("Databases")
    private String databasesParam;

    /** 目标库GTID集合，用于双向同步场景，指定目标库的GTID起始位置，可通过show master status获取，用于反向增量同步 */
    
    @OpenAPIParam("DestinationEndpointBinlogGTID")
    private String destinationEndpointBinlogGTIDParam;

    /** 目标实例地址，当DestinationEndpointInstanceType为External时必填，指定外部数据库访问地址 */
    
    @OpenAPIParam("DestinationEndpointIP")
    private String destinationEndpointIPParam;

    /** 目标实例ID，当DestinationEndpointInstanceType为Internal时必填，指定平台内部数据库实例，需可用且处于Running状态 */
    
    @OpenAPIParam("DestinationEndpointInstanceID")
    private String destinationEndpointInstanceIDParam;

    /** 目标实例类型，指定目标数据库的部署位置，取值范围：Internal（平台内部数据库）、External（外部数据库） */
    @NotEmpty
    @OpenAPIParam("DestinationEndpointInstanceType")
    private String destinationEndpointInstanceTypeParam;

    /** 目标实例密码，当DestinationEngine为MYSQL时必填，用于连接目标数据库的账号密码 */
    
    @OpenAPIParam("DestinationEndpointPassword")
    private String destinationEndpointPasswordParam;

    /** 目标实例端口，当DestinationEndpointInstanceType为External时必填，MYSQL默认3306，REDIS默认6379 */
    
    @OpenAPIParam("DestinationEndpointPort")
    private Integer destinationEndpointPortParam;

    /** 目标实例用户名，当DestinationEngine为MYSQL时必填，用于连接目标数据库的账号用户名 */
    
    @OpenAPIParam("DestinationEndpointUserName")
    private String destinationEndpointUserNameParam;

    /** 目标实例数据库类型，指定目标数据库引擎类型，取值范围：MYSQL、REDIS，必须与SourceEngine一致 */
    @NotEmpty
    @OpenAPIParam("DestinationEngine")
    private String destinationEngineParam;

    /** 忽略数据库列表，指定需要排除的数据库名称，多个数据库用逗号分隔，与Databases互斥使用 */
    
    @OpenAPIParam("IgnoreDatabases")
    private String ignoreDatabasesParam;

    /** 忽略数据表列表，指定需要排除的数据表，支持通配符，格式为database.table，多个表用逗号分隔，与Tables互斥使用 */
    
    @OpenAPIParam("IgnoreTables")
    private String ignoreTablesParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** binlog GTID集合，用于MYSQL增量或全量加增量同步时基于GTID模式同步，可通过show master status获取，全量加增量任务会自动设置 */
    
    @OpenAPIParam("SourceEndpointBinlogGTID")
    private String sourceEndpointBinlogGTIDParam;

    /** binlog文件名，用于MYSQL增量或全量加增量同步时指定起始binlog位置，可通过show master status获取，全量加增量任务会自动设置 */
    
    @OpenAPIParam("SourceEndpointBinlogName")
    private String sourceEndpointBinlogNameParam;

    /** binlog位点，用于MYSQL增量或全量加增量同步时指定起始binlog偏移量，可通过show master status获取，全量加增量任务会自动设置 */
    
    @OpenAPIParam("SourceEndpointBinlogPos")
    private Integer sourceEndpointBinlogPosParam;

    /** 源实例地址，当SourceEndpointInstanceType为External时必填，指定外部数据库访问地址 */
    
    @OpenAPIParam("SourceEndpointIP")
    private String sourceEndpointIPParam;

    /** 源实例ID，当SourceEndpointInstanceType为Internal时必填，指定平台内部数据库实例，需可用且处于Running状态 */
    
    @OpenAPIParam("SourceEndpointInstanceID")
    private String sourceEndpointInstanceIDParam;

    /** 源实例类型，指定源数据库的部署位置，取值范围：Internal（平台内部数据库）、External（外部数据库） */
    @NotEmpty
    @OpenAPIParam("SourceEndpointInstanceType")
    private String sourceEndpointInstanceTypeParam;

    /** 源实例密码，当SourceEngine为MYSQL时必填，用于连接源数据库的账号密码 */
    
    @OpenAPIParam("SourceEndpointPassword")
    private String sourceEndpointPasswordParam;

    /** 源实例端口，当SourceEndpointInstanceType为External时必填，MYSQL默认3306，REDIS默认6379 */
    
    @OpenAPIParam("SourceEndpointPort")
    private Integer sourceEndpointPortParam;

    /** 服务器ID，当SourceEngine为MYSQL时必填，用于标识DTS服务作为从库的唯一ID，需确保不与现有slave的server_id重复 */
    
    @OpenAPIParam("SourceEndpointServerID")
    private String sourceEndpointServerIDParam;

    /** 源实例用户名，当SourceEngine为MYSQL时必填，用于连接源数据库的账号用户名 */
    
    @OpenAPIParam("SourceEndpointUserName")
    private String sourceEndpointUserNameParam;

    /** 源实例数据库类型，指定源数据库引擎类型，取值范围：MYSQL、REDIS，必须与DestinationEngine一致 */
    @NotEmpty
    @OpenAPIParam("SourceEngine")
    private String sourceEngineParam;

    /** 同步数据表列表，指定需要同步的数据表，支持通配符，格式为database.table，多个表用逗号分隔；不指定则同步所有数据表 */
    
    @OpenAPIParam("Tables")
    private String tablesParam;

    /** 任务类型，指定数据传输的同步模式，取值范围：full（全量迁移）、incremental（增量同步）、full+incremental（全量加增量） */
    @NotEmpty
    @OpenAPIParam("TaskMode")
    private String taskModeParam;


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

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
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

    public String getTaskMode() {
        return taskModeParam;
    }

    public void setTaskMode(String taskModeParam) {
        this.taskModeParam = taskModeParam;
    }

}
