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

public class SlowLogInfo {

    /** 执行查询操作的数据库名称，标识该慢日志记录属于哪个数据库 */
    @SerializedName("DB")
    private String dBParam;

    /** InsertID，INSERT查询语句中指定的INSERT_ID值 */
    @SerializedName("InsertID")
    private Integer insertIDParam;

    /** 最后一次INSERT操作生成的AUTO_INCREMENT值，用于追踪新插入的记录ID */
    @SerializedName("LastInsertID")
    private Integer lastInsertIDParam;

    /** SQL查询获取锁的时间，单位为秒，表示在锁等待上花费的时间 */
    @SerializedName("LockTime")
    private Double lockTimeParam;

    /** SQL查询执行耗时，单位为秒，精确到小数点后多位，用于识别性能瓶颈 */
    @SerializedName("QueryTime")
    private Double queryTimeParam;

    /** MySQL服务器执行查询过程中扫描的总行数，包括被WHERE条件过滤掉的行，用于判断查询效率 */
    @SerializedName("RowsExamined")
    private Integer rowsExaminedParam;

    /** 查询返回给客户端的行数，即查询结果集的行数 */
    @SerializedName("RowsSent")
    private Integer rowsSentParam;

    /** 完整的SQL查询语句文本，包含所有执行的SQL命令 */
    @SerializedName("SQLText")
    private String sQLTextParam;

    /** MySQL服务器的唯一标识符，在主从复制环境中用于区分不同的MySQL实例 */
    @SerializedName("ServerID")
    private Integer serverIDParam;

    /** 记录时间，慢查询日志的记录时间戳 */
    @SerializedName("StartTime")
    private Integer startTimeParam;

    /** 执行查询的MySQL线程ID，用于在MySQL日志中跟踪和关联相关操作 */
    @SerializedName("ThreadID")
    private Integer threadIDParam;

    /** 客户端名称及地址，标识执行查询的客户端来源 */
    @SerializedName("UserHost")
    private String userHostParam;


    public String getDB() {
        return dBParam;
    }

    public void setDB(String dBParam) {
        this.dBParam = dBParam;
    }

    public Integer getInsertID() {
        return insertIDParam;
    }

    public void setInsertID(Integer insertIDParam) {
        this.insertIDParam = insertIDParam;
    }

    public Integer getLastInsertID() {
        return lastInsertIDParam;
    }

    public void setLastInsertID(Integer lastInsertIDParam) {
        this.lastInsertIDParam = lastInsertIDParam;
    }

    public Double getLockTime() {
        return lockTimeParam;
    }

    public void setLockTime(Double lockTimeParam) {
        this.lockTimeParam = lockTimeParam;
    }

    public Double getQueryTime() {
        return queryTimeParam;
    }

    public void setQueryTime(Double queryTimeParam) {
        this.queryTimeParam = queryTimeParam;
    }

    public Integer getRowsExamined() {
        return rowsExaminedParam;
    }

    public void setRowsExamined(Integer rowsExaminedParam) {
        this.rowsExaminedParam = rowsExaminedParam;
    }

    public Integer getRowsSent() {
        return rowsSentParam;
    }

    public void setRowsSent(Integer rowsSentParam) {
        this.rowsSentParam = rowsSentParam;
    }

    public String getSQLText() {
        return sQLTextParam;
    }

    public void setSQLText(String sQLTextParam) {
        this.sQLTextParam = sQLTextParam;
    }

    public Integer getServerID() {
        return serverIDParam;
    }

    public void setServerID(Integer serverIDParam) {
        this.serverIDParam = serverIDParam;
    }

    public Integer getStartTime() {
        return startTimeParam;
    }

    public void setStartTime(Integer startTimeParam) {
        this.startTimeParam = startTimeParam;
    }

    public Integer getThreadID() {
        return threadIDParam;
    }

    public void setThreadID(Integer threadIDParam) {
        this.threadIDParam = threadIDParam;
    }

    public String getUserHost() {
        return userHostParam;
    }

    public void setUserHost(String userHostParam) {
        this.userHostParam = userHostParam;
    }

}
