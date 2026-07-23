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

public class CreateDTSTaskRequest extends Request {

    /** 单批写入大小，用于控制 sinker 每次批量写入的记录数；为0时使用系统默认值1000 */
    
    @OpenAPIParam("BatchSize")
    private Integer batchSizeParam;

    /** CPU核数，用于指定DTS实例的CPU配置 */
    @NotEmpty
    @OpenAPIParam("CPU")
    private Integer cPUParam;

    /** 计费类型，用于指定计费模式，取值范围：Dynamic（按小时计费）、Month（按月计费）、Year（按年计费）；兼容历史值：hour、month、year，别名映射：Dynamic->HOUR、Month->MONTH、Year->YEAR */
    @NotEmpty
    @OpenAPIParam("ChargeType")
    private String chargeTypeParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 计算集群类型，用于指定DTS实例运行的计算集群，需具备集群权限 */
    @NotEmpty
    @OpenAPIParam("ComputeClass")
    private String computeClassParam;

    /** 数据标记表，用于双向同步场景记录已同步数据，格式为database.table_name，若不指定则同步服务自动创建，需确保数据库账户有创建表权限 */
    
    @OpenAPIParam("DataMarkTable")
    private String dataMarkTableParam;

    /** 同步数据库列表，指定需要同步的数据库名称，多个数据库用逗号分隔；不指定则默认同步所有数据库 */
    
    @OpenAPIParam("Databases")
    private String databasesParam;

    /** 目标库GTID集合，用于双向同步场景，指定目标库GTID起始位置，可通过show master status获取，用于反向增量同步 */
    
    @OpenAPIParam("DestinationEndpointBinlogGTID")
    private String destinationEndpointBinlogGTIDParam;

    /** 目标实例地址，当DestinationEndpointInstanceType为External时必填，指定外部数据库访问地址，源与目标地址端口不可完全相同 */
    
    @OpenAPIParam("DestinationEndpointIP")
    private String destinationEndpointIPParam;

    /** 目标实例ID，当DestinationEndpointInstanceType为Internal时必填，指定平台内部数据库实例，需可用且归属当前租户，且类型与DestinationEngine一致，不能与源实例ID相同 */
    
    @OpenAPIParam("DestinationEndpointInstanceID")
    private String destinationEndpointInstanceIDParam;

    /** 目标实例类型，指定目标数据库的部署位置，取值范围：Internal（平台内部数据库）、External（外部数据库） */
    @NotEmpty
    @OpenAPIParam("DestinationEndpointInstanceType")
    private String destinationEndpointInstanceTypeParam;

    /** 目标实例密码，当DestinationEngine为MYSQL时必填，用于连接目标数据库的账号密码 */
    
    @OpenAPIParam("DestinationEndpointPassword")
    private String destinationEndpointPasswordParam;

    /** 目标实例端口，当DestinationEndpointInstanceType为External时必填，MYSQL默认3306，REDIS默认6379，源与目标地址端口不可完全相同 */
    
    @OpenAPIParam("DestinationEndpointPort")
    private Integer destinationEndpointPortParam;

    /** 目标实例用户名，当DestinationEngine为MYSQL时必填，用于连接目标数据库的账号用户名，需具备写入权限 */
    
    @OpenAPIParam("DestinationEndpointUserName")
    private String destinationEndpointUserNameParam;

    /** 目标实例数据库类型，指定目标数据库引擎类型，取值范围：MYSQL、REDIS，必须与SourceEngine一致 */
    @NotEmpty
    @OpenAPIParam("DestinationEngine")
    private String destinationEngineParam;

    /** 弹性公网IPID，当源端或目的端为External时必填，用于DTS与外部数据库建立网络连接，EIP需未绑定其他资源 */
    
    @OpenAPIParam("EIPID")
    private String eIPIDParam;

    /** 心跳间隔秒数，指定推进binlog位点的时间间隔（秒），用于防止长时间无数据变更导致位点不更新 */
    
    @OpenAPIParam("HeartbeatInterval")
    private Integer heartbeatIntervalParam;

    /** 心跳表名称，用于增量或双向同步场景定时推进binlog位点，格式为database.table_name，若不指定则同步服务自动创建，需确保数据库账户有创建表权限 */
    
    @OpenAPIParam("HeartbeatTable")
    private String heartbeatTableParam;

    /** 忽略数据库列表，指定需要排除的数据库名称，多个数据库用逗号分隔，与Databases互斥使用 */
    
    @OpenAPIParam("IgnoreDatabases")
    private String ignoreDatabasesParam;

    /** 忽略数据表列表，指定需要排除的数据表，支持通配符，格式为database.table，多个表用逗号分隔，与Tables互斥使用 */
    
    @OpenAPIParam("IgnoreTables")
    private String ignoreTablesParam;

    /** 增量同步阶段的 DTS 自恢复策略；不传表示沿用 DTS 默认自恢复策略，显式 Enabled=false 表示关闭 DTS 自恢复 */
    
    @OpenAPIParam("IncrementalRestart")
    private DTSServiceRestartPolicy incrementalRestartParam;

    /** 最大每秒同步记录数，用于限制数据同步速率，取值最小范围为100，最大范围根据DTS实例CPU核数确定，1核上限为20000，2核上限为40000 */
    @NotEmpty
    @OpenAPIParam("MaxRPS")
    private Integer maxRPSParam;

    /** 内存大小，单位GB，用于指定DTS实例的内存配置 */
    @NotEmpty
    @OpenAPIParam("Memory")
    private Integer memoryParam;

    /** DTS任务名称，支持中文、英文字母、数字、点、下划线和中划线，长度1-128字符 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 项目ID，用于标识资源所属项目分组，未传时尝试分配默认项目 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 计费数量，用于指定购买时长的数量，按月/年计费时表示购买的月/年数，按小时计费时默认为1， */
    @NotEmpty
    @OpenAPIParam("Quantity")
    private Integer quantityParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，长度0-100字符，禁止http://或https://等非法字符 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** binlog GTID集合，用于MYSQL增量或全量加增量同步时基于GTID模式同步，可通过show master status获取， */
    
    @OpenAPIParam("SourceEndpointBinlogGTID")
    private String sourceEndpointBinlogGTIDParam;

    /** binlog文件名，用于MYSQL增量或全量加增量同步时指定起始binlog位置，可通过show master status获取， */
    
    @OpenAPIParam("SourceEndpointBinlogName")
    private String sourceEndpointBinlogNameParam;

    /** binlog位点，用于MYSQL增量或全量加增量同步时指定起始binlog偏移量，可通过show master status获取， */
    
    @OpenAPIParam("SourceEndpointBinlogPos")
    private Integer sourceEndpointBinlogPosParam;

    /** 源实例地址，当SourceEndpointInstanceType为External时必填，指定外部数据库访问地址，源与目标地址端口不可完全相同 */
    
    @OpenAPIParam("SourceEndpointIP")
    private String sourceEndpointIPParam;

    /** 源实例ID，当SourceEndpointInstanceType为Internal时必填，指定平台内部数据库实例，需可用且归属当前租户，且类型与SourceEngine一致 */
    
    @OpenAPIParam("SourceEndpointInstanceID")
    private String sourceEndpointInstanceIDParam;

    /** 源实例类型，指定源数据库的部署位置，取值范围：Internal（平台内部数据库）、External（外部数据库） */
    @NotEmpty
    @OpenAPIParam("SourceEndpointInstanceType")
    private String sourceEndpointInstanceTypeParam;

    /** 源实例密码，当SourceEngine为MYSQL时必填，用于连接源数据库的账号密码 */
    
    @OpenAPIParam("SourceEndpointPassword")
    private String sourceEndpointPasswordParam;

    /** 源实例端口，当SourceEndpointInstanceType为External时必填，MYSQL默认3306，REDIS默认6379，源与目标地址端口不可完全相同 */
    
    @OpenAPIParam("SourceEndpointPort")
    private Integer sourceEndpointPortParam;

    /** 服务器ID，当SourceEngine为MYSQL时必填，用于标识DTS服务作为从库的唯一ID，需确保不与现有slave的server_id重复 */
    
    @OpenAPIParam("SourceEndpointServerID")
    private String sourceEndpointServerIDParam;

    /** 源实例用户名，当SourceEngine为MYSQL时必填，用于连接源数据库的账号用户名，需具备读取权限 */
    
    @OpenAPIParam("SourceEndpointUserName")
    private String sourceEndpointUserNameParam;

    /** 源实例数据库类型，指定源数据库引擎类型，取值范围：MYSQL、REDIS，必须与DestinationEngine一致 */
    @NotEmpty
    @OpenAPIParam("SourceEngine")
    private String sourceEngineParam;

    /** 存储集群类型，用于指定DTS实例系统盘所在存储集群，需具备集群权限 */
    @NotEmpty
    @OpenAPIParam("StorageClass")
    private String storageClassParam;

    /** 同步数据表列表，指定需要同步的数据表，支持通配符，格式为database.table，多个表用逗号分隔；不指定则同步所有数据表 */
    
    @OpenAPIParam("Tables")
    private String tablesParam;

    /** 标签键值对，格式为Base64编码的key:value字符串，用于资源标记和分类管理 */
    
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** 任务类型，指定数据传输的同步模式，取值范围：full（全量迁移）、incremental（增量同步）、full+incremental（全量加增量） */
    @NotEmpty
    @OpenAPIParam("TaskMode")
    private String taskModeParam;


    public Integer getBatchSize() {
        return batchSizeParam;
    }

    public void setBatchSize(Integer batchSizeParam) {
        this.batchSizeParam = batchSizeParam;
    }

    public Integer getCPU() {
        return cPUParam;
    }

    public void setCPU(Integer cPUParam) {
        this.cPUParam = cPUParam;
    }

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

    public String getComputeClass() {
        return computeClassParam;
    }

    public void setComputeClass(String computeClassParam) {
        this.computeClassParam = computeClassParam;
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

    public String getEIPID() {
        return eIPIDParam;
    }

    public void setEIPID(String eIPIDParam) {
        this.eIPIDParam = eIPIDParam;
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

    public Integer getMaxRPS() {
        return maxRPSParam;
    }

    public void setMaxRPS(Integer maxRPSParam) {
        this.maxRPSParam = maxRPSParam;
    }

    public Integer getMemory() {
        return memoryParam;
    }

    public void setMemory(Integer memoryParam) {
        this.memoryParam = memoryParam;
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

    public Integer getQuantity() {
        return quantityParam;
    }

    public void setQuantity(Integer quantityParam) {
        this.quantityParam = quantityParam;
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

    public String getStorageClass() {
        return storageClassParam;
    }

    public void setStorageClass(String storageClassParam) {
        this.storageClassParam = storageClassParam;
    }

    public String getTables() {
        return tablesParam;
    }

    public void setTables(String tablesParam) {
        this.tablesParam = tablesParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

    public String getTaskMode() {
        return taskModeParam;
    }

    public void setTaskMode(String taskModeParam) {
        this.taskModeParam = taskModeParam;
    }

}
