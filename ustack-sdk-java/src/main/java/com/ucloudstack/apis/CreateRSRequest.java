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
import com.ucloudstack.common.annotation.UCloudStackParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class CreateRSRequest extends Request {

    /** 绑定资源ID，服务节点的资源ID，仅支持添加与LB相同VPC的虚拟机资源，且该虚拟机必须存在并配置有内网IP地址 */
    @NotEmpty
    @UCloudStackParam("BindResourceID")
    private String bindResourceIDParam;

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @UCloudStackParam("CompanyID")
    private Integer companyIDParam;

    /** 负载均衡ID，用于定位需要添加服务节点的负载均衡实例 */
    @NotEmpty
    @UCloudStackParam("LBID")
    private String lBIDParam;

    /** 服务端口，服务节点暴露的服务端口号 */
    @NotEmpty
    @UCloudStackParam("Port")
    private Integer portParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @UCloudStackParam("Region")
    private String regionParam;

    /** 虚拟服务器ID，用于定位需要添加服务节点的监听器实例，仅支持来源为Default的监听器（Service/Ingress来源由容器系统管理，调用会返回StatusCanNotModifyNoDefaultOriginVS错误） */
    @NotEmpty
    @UCloudStackParam("VSID")
    private String vSIDParam;

    /** 权重，服务节点的权重，用于负载均衡的加权轮训 */
    @NotEmpty
    @UCloudStackParam("Weight")
    private Integer weightParam;


    public String getBindResourceID() {
        return bindResourceIDParam;
    }

    public void setBindResourceID(String bindResourceIDParam) {
        this.bindResourceIDParam = bindResourceIDParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getLBID() {
        return lBIDParam;
    }

    public void setLBID(String lBIDParam) {
        this.lBIDParam = lBIDParam;
    }

    public Integer getPort() {
        return portParam;
    }

    public void setPort(Integer portParam) {
        this.portParam = portParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
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
