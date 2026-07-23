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

public class VMCInfo {

    /** 新虚拟机信息，克隆生成的目标及其状态 */
    @SerializedName("CloneInfo")
    private CloneInfo cloneInfoParam;

    /** 创建时间，任务创建的秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 源虚拟机信息，克隆来源及其快照信息 */
    @SerializedName("SourceInfo")
    private SourceInfo sourceInfoParam;

    /** 任务状态，克隆任务当前的执行状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 任务ID，克隆任务的唯一标识 */
    @SerializedName("VMCID")
    private String vMCIDParam;


    public CloneInfo getCloneInfo() {
        return cloneInfoParam;
    }

    public void setCloneInfo(CloneInfo cloneInfoParam) {
        this.cloneInfoParam = cloneInfoParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public SourceInfo getSourceInfo() {
        return sourceInfoParam;
    }

    public void setSourceInfo(SourceInfo sourceInfoParam) {
        this.sourceInfoParam = sourceInfoParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getVMCID() {
        return vMCIDParam;
    }

    public void setVMCID(String vMCIDParam) {
        this.vMCIDParam = vMCIDParam;
    }

}
