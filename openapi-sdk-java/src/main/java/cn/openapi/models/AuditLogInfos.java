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

public class AuditLogInfos {

    /** 账户名，执行SQL语句的数据库账户名称 */
    @SerializedName("AccountName")
    private String accountNameParam;

    /** 客户端IP，执行SQL语句的客户端IP地址 */
    @SerializedName("ClientIP")
    private String clientIPParam;

    /** 操作数据库，SQL语句操作的数据库名称 */
    @SerializedName("ExecutionDB")
    private String executionDBParam;

    /** 执行结果，MySQL审计日志中的ReturnCode，0表示成功，非0表示失败 */
    @SerializedName("ExecutionResult")
    private Integer executionResultParam;

    /** 执行时间，日志时间戳（Unix时间），由Agent返回的LogMessage.Timestamp转换 */
    @SerializedName("ExecutionTime")
    private Integer executionTimeParam;

    /** 日志类型，审计日志的事件类型，如QUERY、QUERY_DDL等 */
    @SerializedName("LogType")
    private String logTypeParam;

    /** 执行命令，实际执行的SQL语句内容 */
    @SerializedName("SQLCommand")
    private String sQLCommandParam;


    public String getAccountName() {
        return accountNameParam;
    }

    public void setAccountName(String accountNameParam) {
        this.accountNameParam = accountNameParam;
    }

    public String getClientIP() {
        return clientIPParam;
    }

    public void setClientIP(String clientIPParam) {
        this.clientIPParam = clientIPParam;
    }

    public String getExecutionDB() {
        return executionDBParam;
    }

    public void setExecutionDB(String executionDBParam) {
        this.executionDBParam = executionDBParam;
    }

    public Integer getExecutionResult() {
        return executionResultParam;
    }

    public void setExecutionResult(Integer executionResultParam) {
        this.executionResultParam = executionResultParam;
    }

    public Integer getExecutionTime() {
        return executionTimeParam;
    }

    public void setExecutionTime(Integer executionTimeParam) {
        this.executionTimeParam = executionTimeParam;
    }

    public String getLogType() {
        return logTypeParam;
    }

    public void setLogType(String logTypeParam) {
        this.logTypeParam = logTypeParam;
    }

    public String getSQLCommand() {
        return sQLCommandParam;
    }

    public void setSQLCommand(String sQLCommandParam) {
        this.sQLCommandParam = sQLCommandParam;
    }

}
