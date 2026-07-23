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

public class ControllerPlaneStatus {

    /** 集群svc插件状态 */
    @SerializedName("CCM")
    private ComponentStatus cCMParam;

    /** 集群存储插件状态 */
    @SerializedName("CSI")
    private ComponentStatus cSIParam;

    /** 集群ETCD状态 */
    @SerializedName("ETCD")
    private ComponentStatus eTCDParam;

    /** 集群KubeApiserver状态 */
    @SerializedName("KubeApiserver")
    private ComponentStatus kubeApiserverParam;

    /** 集群KubeControllerManager状态 */
    @SerializedName("KubeControllerManager")
    private ComponentStatus kubeControllerManagerParam;

    /** 集群KubeScheduler状态 */
    @SerializedName("KubeScheduler")
    private ComponentStatus kubeSchedulerParam;

    /** 集群Kubeutil状态 */
    @SerializedName("KubeTerminal")
    private ComponentStatus kubeTerminalParam;

    /** 集群默认超级节点状态 */
    @SerializedName("VK")
    private ComponentStatus vKParam;


    public ComponentStatus getCCM() {
        return cCMParam;
    }

    public void setCCM(ComponentStatus cCMParam) {
        this.cCMParam = cCMParam;
    }

    public ComponentStatus getCSI() {
        return cSIParam;
    }

    public void setCSI(ComponentStatus cSIParam) {
        this.cSIParam = cSIParam;
    }

    public ComponentStatus getETCD() {
        return eTCDParam;
    }

    public void setETCD(ComponentStatus eTCDParam) {
        this.eTCDParam = eTCDParam;
    }

    public ComponentStatus getKubeApiserver() {
        return kubeApiserverParam;
    }

    public void setKubeApiserver(ComponentStatus kubeApiserverParam) {
        this.kubeApiserverParam = kubeApiserverParam;
    }

    public ComponentStatus getKubeControllerManager() {
        return kubeControllerManagerParam;
    }

    public void setKubeControllerManager(ComponentStatus kubeControllerManagerParam) {
        this.kubeControllerManagerParam = kubeControllerManagerParam;
    }

    public ComponentStatus getKubeScheduler() {
        return kubeSchedulerParam;
    }

    public void setKubeScheduler(ComponentStatus kubeSchedulerParam) {
        this.kubeSchedulerParam = kubeSchedulerParam;
    }

    public ComponentStatus getKubeTerminal() {
        return kubeTerminalParam;
    }

    public void setKubeTerminal(ComponentStatus kubeTerminalParam) {
        this.kubeTerminalParam = kubeTerminalParam;
    }

    public ComponentStatus getVK() {
        return vKParam;
    }

    public void setVK(ComponentStatus vKParam) {
        this.vKParam = vKParam;
    }

}
