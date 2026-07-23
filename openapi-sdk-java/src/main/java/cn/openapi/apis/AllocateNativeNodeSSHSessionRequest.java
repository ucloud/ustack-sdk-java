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

public class AllocateNativeNodeSSHSessionRequest extends Request {

    /** 集群Id */
    @NotEmpty
    @OpenAPIParam("ClusterID")
    private String clusterIDParam;

    /** 执行命令 */
    
    @OpenAPIParam("CmdName")
    private String cmdNameParam;

    /** 租户ID */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 私钥 */
    
    @OpenAPIParam("IdentityContent")
    private String identityContentParam;

    /** 节点名称 */
    @NotEmpty
    @OpenAPIParam("NodeName")
    private String nodeNameParam;

    /** 密码 */
    
    @OpenAPIParam("Password")
    private String passwordParam;

    /** 端口 */
    
    @OpenAPIParam("Port")
    private String portParam;

    /** 地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 用户 */
    
    @OpenAPIParam("User")
    private String userParam;


    public String getClusterID() {
        return clusterIDParam;
    }

    public void setClusterID(String clusterIDParam) {
        this.clusterIDParam = clusterIDParam;
    }

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

    public String getNodeName() {
        return nodeNameParam;
    }

    public void setNodeName(String nodeNameParam) {
        this.nodeNameParam = nodeNameParam;
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

}
