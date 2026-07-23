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

public class TopMap {

    /** 名称，资源或进程的名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 进程ID，进程标识符 */
    @SerializedName("Pid")
    private String pidParam;

    /** 大小，资源大小或内存占用 */
    @SerializedName("Size")
    private String sizeParam;

    /** 状态，资源或进程的当前状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 使用量，资源使用量或占用率 */
    @SerializedName("Use")
    private String useParam;


    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPid() {
        return pidParam;
    }

    public void setPid(String pidParam) {
        this.pidParam = pidParam;
    }

    public String getSize() {
        return sizeParam;
    }

    public void setSize(String sizeParam) {
        this.sizeParam = sizeParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public String getUse() {
        return useParam;
    }

    public void setUse(String useParam) {
        this.useParam = useParam;
    }

}
