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

public class LbRSInfo {

    /** 绑定资源ID，服务节点关联的资源ID（如VM的ID） */
    @SerializedName("BindResourceID")
    private String bindResourceIDParam;

    /** 绑定资源名称，用于展示服务节点关联资源名称（如VM名称） */
    @SerializedName("BindResourceName")
    private String bindResourceNameParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 健康检查地址，用于健康检查的IP和端口地址 */
    @SerializedName("HealthCheckAddress")
    private String healthCheckAddressParam;

    /** 内网IP地址，服务节点的内网IP地址 */
    @SerializedName("IP")
    private String iPParam;

    /** 负载均衡ID，用于标识所属负载均衡实例 */
    @SerializedName("LBID")
    private String lBIDParam;

    /** 真实服务器名称，用于标识服务节点 */
    @SerializedName("Name")
    private String nameParam;

    /** 服务端口，服务节点暴露的服务端口号，取值范围：1~65535 */
    @SerializedName("Port")
    private Integer portParam;

    /** 真实服务器ID，用于定位服务节点 */
    @SerializedName("RSID")
    private String rSIDParam;

    /** 真实服务器模式，真实服务器的模式，取值范围：Enabling（开启中）、Enable（已启用）、Disabling（禁用中）、Disable（已禁用） */
    @SerializedName("RSMode")
    private String rSModeParam;

    /** 真实服务器状态，真实服务器的状态，取值范围：Creating（创建中）、Inactive（无效/异常）、Active（有效/健康）、Updating（更新中）、Deleting（删除中）、Deleted（已删除） */
    @SerializedName("RSStatus")
    private String rSStatusParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** 虚拟服务器ID，用于标识所属监听器 */
    @SerializedName("VSID")
    private String vSIDParam;

    /** 权重，服务节点的权重，取值范围：1~100 */
    @SerializedName("Weight")
    private Integer weightParam;


    public String getBindResourceID() {
        return bindResourceIDParam;
    }

    public void setBindResourceID(String bindResourceIDParam) {
        this.bindResourceIDParam = bindResourceIDParam;
    }

    public String getBindResourceName() {
        return bindResourceNameParam;
    }

    public void setBindResourceName(String bindResourceNameParam) {
        this.bindResourceNameParam = bindResourceNameParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getHealthCheckAddress() {
        return healthCheckAddressParam;
    }

    public void setHealthCheckAddress(String healthCheckAddressParam) {
        this.healthCheckAddressParam = healthCheckAddressParam;
    }

    public String getIP() {
        return iPParam;
    }

    public void setIP(String iPParam) {
        this.iPParam = iPParam;
    }

    public String getLBID() {
        return lBIDParam;
    }

    public void setLBID(String lBIDParam) {
        this.lBIDParam = lBIDParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public Integer getPort() {
        return portParam;
    }

    public void setPort(Integer portParam) {
        this.portParam = portParam;
    }

    public String getRSID() {
        return rSIDParam;
    }

    public void setRSID(String rSIDParam) {
        this.rSIDParam = rSIDParam;
    }

    public String getRSMode() {
        return rSModeParam;
    }

    public void setRSMode(String rSModeParam) {
        this.rSModeParam = rSModeParam;
    }

    public String getRSStatus() {
        return rSStatusParam;
    }

    public void setRSStatus(String rSStatusParam) {
        this.rSStatusParam = rSStatusParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getVSID() {
        return vSIDParam;
    }

    public void setVSID(String vSIDParam) {
        this.vSIDParam = vSIDParam;
    }

    public Integer getWeight() {
        return weightParam;
    }

    public void setWeight(Integer weightParam) {
        this.weightParam = weightParam;
    }

}
