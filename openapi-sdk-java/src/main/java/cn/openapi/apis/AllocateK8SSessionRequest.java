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

public class AllocateK8SSessionRequest extends Request {

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

    /** 容器名称 */
    
    @OpenAPIParam("ContainerName")
    private String containerNameParam;

    /** 名字空间 */
    
    @OpenAPIParam("NameSpace")
    private String nameSpaceParam;

    /** Pod名称 */
    @NotEmpty
    @OpenAPIParam("PodName")
    private String podNameParam;

    /** 地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;


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

    public String getContainerName() {
        return containerNameParam;
    }

    public void setContainerName(String containerNameParam) {
        this.containerNameParam = containerNameParam;
    }

    public String getNameSpace() {
        return nameSpaceParam;
    }

    public void setNameSpace(String nameSpaceParam) {
        this.nameSpaceParam = nameSpaceParam;
    }

    public String getPodName() {
        return podNameParam;
    }

    public void setPodName(String podNameParam) {
        this.podNameParam = podNameParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

}
