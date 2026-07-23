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
package com.ucloudstack.apis;

import com.ucloudstack.common.annotation.NotEmpty;
import com.ucloudstack.common.annotation.OpenAPIParam;
import com.ucloudstack.common.request.Request;
import java.util.List;
import java.util.Map;
import com.ucloudstack.models.*;

public class AllocateVMSSHSessionRequest extends Request {

    /** 执行命令，连接后自动执行的命令 */
    
    @OpenAPIParam("CmdName")
    private String cmdNameParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 私钥内容，用于SSH认证的私钥 */
    
    @OpenAPIParam("IdentityContent")
    private String identityContentParam;

    /** 密码，SSH登录密码 */
    
    @OpenAPIParam("Password")
    private String passwordParam;

    /** 端口号，SSH服务的端口 */
    
    @OpenAPIParam("Port")
    private String portParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 用户名，SSH登录的用户名 */
    
    @OpenAPIParam("User")
    private String userParam;

    /** 虚拟机ID，待获取SSH会话的虚拟机标识 */
    @NotEmpty
    @OpenAPIParam("VMID")
    private String vMIDParam;


    public String getCmdName() {
        return cmdNameParam;
    }

    public void setCmdName(String cmdNameParam) {
        this.cmdNameParam = cmdNameParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getIdentityContent() {
        return identityContentParam;
    }

    public void setIdentityContent(String identityContentParam) {
        this.identityContentParam = identityContentParam;
    }

    public String getPassword() {
        return passwordParam;
    }

    public void setPassword(String passwordParam) {
        this.passwordParam = passwordParam;
    }

    public String getPort() {
        return portParam;
    }

    public void setPort(String portParam) {
        this.portParam = portParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getUser() {
        return userParam;
    }

    public void setUser(String userParam) {
        this.userParam = userParam;
    }

    public String getVMID() {
        return vMIDParam;
    }

    public void setVMID(String vMIDParam) {
        this.vMIDParam = vMIDParam;
    }

}
