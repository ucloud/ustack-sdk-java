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
package com.ucloudstack.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class TrafficMirrorSourceInfo {

    /** 关联的资源ID，虚拟机的唯一标识符 */
    @SerializedName("AssociatedResourceID")
    private String associatedResourceIDParam;

    /** 关联的资源名称，虚拟机的显示名称 */
    @SerializedName("AssociatedResourceName")
    private String associatedResourceNameParam;

    /** 源设备信息列表，将该虚拟机下所有非Psbr网卡拆分为入/出两个方向返回，配合Available字段判断该方向是否已被其他流量镜像占用 */
    @SerializedName("Sources")
    private List<TrafficMirrorSimpleSource> sourcesParam;


    public String getAssociatedResourceID() {
        return associatedResourceIDParam;
    }

    public void setAssociatedResourceID(String associatedResourceIDParam) {
        this.associatedResourceIDParam = associatedResourceIDParam;
    }

    public String getAssociatedResourceName() {
        return associatedResourceNameParam;
    }

    public void setAssociatedResourceName(String associatedResourceNameParam) {
        this.associatedResourceNameParam = associatedResourceNameParam;
    }

    public List<TrafficMirrorSimpleSource> getSources() {
        return sourcesParam;
    }

    public void setSources(List<TrafficMirrorSimpleSource> sourcesParam) {
        this.sourcesParam = sourcesParam;
    }

}
