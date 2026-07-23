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

public class SMCSubtask {

    /** 子任务名称，通常为磁盘分区名称或功能阶段名称，用于标识具体的迁移子任务 */
    @SerializedName("Name")
    private String nameParam;

    /** 子任务完成进度，0-100的百分比值，表示该子任务的完成百分比 */
    @SerializedName("Progress")
    private Double progressParam;

    /** 数据传输速率，用易读格式表示当前的传输吞吐量，如100MB/s或1Gbps */
    @SerializedName("Speed")
    private String speedParam;


    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public Double getProgress() {
        return progressParam;
    }

    public void setProgress(Double progressParam) {
        this.progressParam = progressParam;
    }

    public String getSpeed() {
        return speedParam;
    }

    public void setSpeed(String speedParam) {
        this.speedParam = speedParam;
    }

}
