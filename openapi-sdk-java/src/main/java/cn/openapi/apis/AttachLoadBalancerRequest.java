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

public class AttachLoadBalancerRequest extends Request {

    /** 伸缩组ID，要关联负载均衡的伸缩组唯一标识符，仅支持VM类型的伸缩组 */
    @NotEmpty
    @OpenAPIParam("ASGroupID")
    private String aSGroupIDParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @NotEmpty
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 负载均衡ID，要关联的负载均衡实例ID，必须与伸缩组的虚拟机模板位于同一VPC */
    @NotEmpty
    @OpenAPIParam("LBID")
    private String lBIDParam;

    /** 负载均衡端口，伸缩成员加入负载均衡后端服务节点时使用的端口号 */
    @NotEmpty
    @OpenAPIParam("Port")
    private Integer portParam;

    /** 项目ID，资源所属的项目，用于实现资源的逻辑分组管理 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，指定负载均衡和伸缩组所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 监听器ID，要关联的VServer监听器ID，仅支持关联来源为Default的监听器（容器来源的监听器不可用） */
    @NotEmpty
    @OpenAPIParam("VServerID")
    private String vServerIDParam;

    /** 负载均衡权重，伸缩成员加入负载均衡时的权重值，若不指定则默认为1 */
    
    @OpenAPIParam("Weight")
    private Integer weightParam;


    public String getASGroupID() {
        return aSGroupIDParam;
    }

    public void setASGroupID(String aSGroupIDParam) {
        this.aSGroupIDParam = aSGroupIDParam;
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

    public String getProjectID() {
        return projectIDParam;
    }

    public void setProjectID(String projectIDParam) {
        this.projectIDParam = projectIDParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getVServerID() {
        return vServerIDParam;
    }

    public void setVServerID(String vServerIDParam) {
        this.vServerIDParam = vServerIDParam;
    }

    public Integer getWeight() {
        return weightParam;
    }

    public void setWeight(Integer weightParam) {
        this.weightParam = weightParam;
    }

}
