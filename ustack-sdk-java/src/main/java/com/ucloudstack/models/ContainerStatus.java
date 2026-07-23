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

public class ContainerStatus {

    /** 容器名 */
    @SerializedName("Container")
    private String containerParam;

    /** pod名 */
    @SerializedName("PodName")
    private String podNameParam;

    /** 是否就绪 */
    @SerializedName("Ready")
    private Boolean readyParam;

    /** 状态或原因 */
    @SerializedName("Reason")
    private String reasonParam;


    public String getContainer() {
        return containerParam;
    }

    public void setContainer(String containerParam) {
        this.containerParam = containerParam;
    }

    public String getPodName() {
        return podNameParam;
    }

    public void setPodName(String podNameParam) {
        this.podNameParam = podNameParam;
    }

    public Boolean getReady() {
        return readyParam;
    }

    public void setReady(Boolean readyParam) {
        this.readyParam = readyParam;
    }

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
    }

}
