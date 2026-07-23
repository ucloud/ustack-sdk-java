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
package cn.openapi.apis;

import cn.openapi.common.annotation.NotEmpty;
import cn.openapi.common.annotation.OpenAPIParam;
import cn.openapi.common.request.Request;
import java.util.List;
import java.util.Map;
import cn.openapi.models.*;

public class CreateNATGWPolicyRequest extends Request {

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 目标端口，目标虚拟机的端口号，支持单端口或端口范围（如8080或8080-8090），取值范围1-65535，协议+目标IP+目标端口组合不能与已有规则重复 */
    @NotEmpty
    @OpenAPIParam("DstPort")
    private String dstPortParam;

    /** 目标虚拟机ID，端口转发的目标虚拟机唯一标识 */
    @NotEmpty
    @OpenAPIParam("DstResourceID")
    private String dstResourceIDParam;

    /** NAT网关ID，用于定位需要添加DNAT规则的NAT网关实例，该NAT网关必须处于运行状态，同一NAT网关最多可创建200条DNAT规则 */
    @NotEmpty
    @OpenAPIParam("NATGWID")
    private String nATGWIDParam;

    /** DNAT协议，端口转发规则使用的协议类型，取值范围：TCP、UDP */
    @NotEmpty
    @OpenAPIParam("Protocol")
    private String protocolParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 源IP，DNAT规则使用的外网IP地址，必须为该NAT网关已绑定的EIP地址 */
    @NotEmpty
    @OpenAPIParam("SrcIP")
    private String srcIPParam;

    /** 源端口，DNAT规则的外网端口，支持单端口或端口范围（如80或80-90），取值范围1-65535，协议+外部IP+外部端口组合不能与已有规则重复 */
    @NotEmpty
    @OpenAPIParam("SrcPort")
    private String srcPortParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getDstPort() {
        return dstPortParam;
    }

    public void setDstPort(String dstPortParam) {
        this.dstPortParam = dstPortParam;
    }

    public String getDstResourceID() {
        return dstResourceIDParam;
    }

    public void setDstResourceID(String dstResourceIDParam) {
        this.dstResourceIDParam = dstResourceIDParam;
    }

    public String getNATGWID() {
        return nATGWIDParam;
    }

    public void setNATGWID(String nATGWIDParam) {
        this.nATGWIDParam = nATGWIDParam;
    }

    public String getProtocol() {
        return protocolParam;
    }

    public void setProtocol(String protocolParam) {
        this.protocolParam = protocolParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getSrcIP() {
        return srcIPParam;
    }

    public void setSrcIP(String srcIPParam) {
        this.srcIPParam = srcIPParam;
    }

    public String getSrcPort() {
        return srcPortParam;
    }

    public void setSrcPort(String srcPortParam) {
        this.srcPortParam = srcPortParam;
    }

}
