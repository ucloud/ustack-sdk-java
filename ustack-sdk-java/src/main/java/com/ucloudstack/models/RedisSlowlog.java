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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class RedisSlowlog {

    /** 客户端地址，执行命令的客户端地址 */
    @SerializedName("ClientAddr")
    private String clientAddrParam;

    /** 客户端名称，执行命令的客户端名称 */
    @SerializedName("ClientName")
    private String clientNameParam;

    /** 执行命令，慢日志命令内容 */
    @SerializedName("Command")
    private String commandParam;

    /** 耗时（微秒），执行命令耗时 */
    @SerializedName("ExecSpend")
    private Integer execSpendParam;

    /** 执行时间，Unix时间戳（秒） */
    @SerializedName("StartTime")
    private Integer startTimeParam;


    public String getClientAddr() {
        return clientAddrParam;
    }

    public void setClientAddr(String clientAddrParam) {
        this.clientAddrParam = clientAddrParam;
    }

    public String getClientName() {
        return clientNameParam;
    }

    public void setClientName(String clientNameParam) {
        this.clientNameParam = clientNameParam;
    }

    public String getCommand() {
        return commandParam;
    }

    public void setCommand(String commandParam) {
        this.commandParam = commandParam;
    }

    public Integer getExecSpend() {
        return execSpendParam;
    }

    public void setExecSpend(Integer execSpendParam) {
        this.execSpendParam = execSpendParam;
    }

    public Integer getStartTime() {
        return startTimeParam;
    }

    public void setStartTime(Integer startTimeParam) {
        this.startTimeParam = startTimeParam;
    }

}
