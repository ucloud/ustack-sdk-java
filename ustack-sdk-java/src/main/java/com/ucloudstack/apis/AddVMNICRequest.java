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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class AddVMNICRequest extends Request {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 扁平网络ID */
    @NotEmpty
    @OpenAPIParam("FlatNetworkID")
    private String flatNetworkIDParam;

    /** ip地址，可选参数，为空则由平台分配 */
    
    @OpenAPIParam("IP")
    private String iPParam;

    /** 入向平均带宽，用于QoS流量整形；0表示不限制，单位Mbps */
    
    @OpenAPIParam("InAverageBandwidth")
    private Integer inAverageBandwidthParam;

    /** 启用状态，可选值：up（默认），down，可选参数 */
    
    @OpenAPIParam("LinkState")
    private String linkStateParam;

    /** mac地址，可选参数，为空则由平台分配 */
    
    @OpenAPIParam("MAC")
    private String mACParam;

    /** 网卡型号，支持e1000，virtio（默认），可选参数 */
    
    @OpenAPIParam("Model")
    private String modelParam;

    /** 出向平均带宽，用于QoS流量整形；0表示不限制，单位Mbps */
    
    @OpenAPIParam("OutAverageBandwidth")
    private Integer outAverageBandwidthParam;

    /** 网卡队列数，可选参数，为0则根据cpu计算 */
    
    @OpenAPIParam("Queues")
    private Integer queuesParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 安全组ID，可选参数 */
    
    @OpenAPIParam("SGID")
    private String sGIDParam;

    /** 虚拟机ID */
    @NotEmpty
    @OpenAPIParam("VMID")
    private String vMIDParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getFlatNetworkID() {
        return flatNetworkIDParam;
    }

    public void setFlatNetworkID(String flatNetworkIDParam) {
        this.flatNetworkIDParam = flatNetworkIDParam;
    }

    public String getIP() {
        return iPParam;
    }

    public void setIP(String iPParam) {
        this.iPParam = iPParam;
    }

    public Integer getInAverageBandwidth() {
        return inAverageBandwidthParam;
    }

    public void setInAverageBandwidth(Integer inAverageBandwidthParam) {
        this.inAverageBandwidthParam = inAverageBandwidthParam;
    }

    public String getLinkState() {
        return linkStateParam;
    }

    public void setLinkState(String linkStateParam) {
        this.linkStateParam = linkStateParam;
    }

    public String getMAC() {
        return mACParam;
    }

    public void setMAC(String mACParam) {
        this.mACParam = mACParam;
    }

    public String getModel() {
        return modelParam;
    }

    public void setModel(String modelParam) {
        this.modelParam = modelParam;
    }

    public Integer getOutAverageBandwidth() {
        return outAverageBandwidthParam;
    }

    public void setOutAverageBandwidth(Integer outAverageBandwidthParam) {
        this.outAverageBandwidthParam = outAverageBandwidthParam;
    }

    public Integer getQueues() {
        return queuesParam;
    }

    public void setQueues(Integer queuesParam) {
        this.queuesParam = queuesParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSGID() {
        return sGIDParam;
    }

    public void setSGID(String sGIDParam) {
        this.sGIDParam = sGIDParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
