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

public class CreateTrafficMirrorRequest extends Request {

    /** 目的设备信息，JSON字符串，需指定dstType（PhysicalPort物理端口或VM虚拟机）、dstDevice（PhysicalPort时为物理网卡名称如bond0，VM时为虚拟机ID）以及vlan（仅PhysicalPort可配，取值0-4094，0表示不加VLAN，非0时实际目的会拼接为bond0.100），PhysicalPort类型会调用ValidatePhysicalVlan校验与管理/存储/隧道等物理网络是否冲突，冲突将返回StatusNICOrVlANConflictWithPhysicalNetwork错误 */
    @NotEmpty
    @OpenAPIParam("Destination")
    private String destinationParam;

    /** 是否启用流量镜像，true表示启用，false表示禁用 */
    
    @OpenAPIParam("Enable")
    private Boolean enableParam;

    /** 报文截取最大长度，单位为字节，取值范围为42-65535，若不指定则使用默认值 */
    
    @OpenAPIParam("MaxLength")
    private Integer maxLengthParam;

    /** 流量镜像名称，长度为1-128个字符，名称只能包含中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 源设备信息列表，JSON数组的每个元素都是JSON字符串，需包含srcDevice（从DescribeTrafficMirrorSources返回的网卡ID）和direction（取值inbound入方向、outbound出方向、all双向），direction为all时会同时占用该网卡的入/出方向，同一网卡的同一方向在任一流量镜像里只能配置一次，重复或被其他流量镜像占用会返回StatusSourceDeviceDirectionHasBeenUsed错误 */
    @NotEmpty
    @OpenAPIParam("Sources")
    private List<String> sourcesParam;


    public String getDestination() {
        return destinationParam;
    }

    public void setDestination(String destinationParam) {
        this.destinationParam = destinationParam;
    }

    public Boolean getEnable() {
        return enableParam;
    }

    public void setEnable(Boolean enableParam) {
        this.enableParam = enableParam;
    }

    public Integer getMaxLength() {
        return maxLengthParam;
    }

    public void setMaxLength(Integer maxLengthParam) {
        this.maxLengthParam = maxLengthParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public List<String> getSources() {
        return sourcesParam;
    }

    public void setSources(List<String> sourcesParam) {
        this.sourcesParam = sourcesParam;
    }

}
