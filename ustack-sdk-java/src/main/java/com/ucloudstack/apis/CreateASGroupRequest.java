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

public class CreateASGroupRequest extends Request {

    /** 是否允许缩容，当AsMode为Horizontal或Vertical时必填，控制伸缩组是否可以自动缩减资源规模或规格，水平伸缩时控制是否允许删除实例，垂直伸缩时控制是否允许降低规格 */
    
    @OpenAPIParam("AllowDecrease")
    private Boolean allowDecreaseParam;

    /** 伸缩指标，用于触发自动伸缩的监控指标名称，支持的指标：cpu（CPU使用率，百分比）、memory（内存使用率，百分比，需镜像支持QGA）、vs_connection_l7（七层连接数）、vs_qps_l7（七层QPS）、vs_rt_l7（七层响应时间，毫秒）、vs_connection_l4（四层连接数）、vs_cps_l4（四层CPS）、bandwidth（EIP带宽，Mbps），水平伸缩支持所有指标除bandwidth外，垂直伸缩支持cpu、memory、bandwidth，HTTP/HTTPS协议的VServer仅支持L7指标，TCP/UDP协议仅支持L4指标 */
    @NotEmpty
    @OpenAPIParam("AsMetric")
    private String asMetricParam;

    /** 伸缩模式，Horizontal表示水平伸缩（增加/减少实例数量），Vertical表示垂直伸缩（调整单个资源规格） */
    @NotEmpty
    @OpenAPIParam("AsMode")
    private String asModeParam;

    /** 伸缩类型，决定伸缩组管理的资源类型，VM表示虚拟机伸缩（扩缩虚拟机实例），VS表示负载均衡监听器伸缩（扩缩后端服务节点），EIP表示弹性公网IP伸缩（调整带宽规格） */
    @NotEmpty
    @OpenAPIParam("AsType")
    private String asTypeParam;

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 负载均衡ID，当AsType为VS时必填，指定伸缩组关联的负载均衡实例，要求与虚拟机模板位于同一VPC */
    
    @OpenAPIParam("LBID")
    private String lBIDParam;

    /** 最大实例数，当AsMode为Horizontal时必填，伸缩组允许的最大成员数量，必须大于等于MinInstance，取值范围0-100，当AsType为VM且当前成员数超过MaxInstance时，系统会自动缩容至MaxInstance */
    
    @OpenAPIParam("MaxInstance")
    private Integer maxInstanceParam;

    /** 最大规格，当AsMode为Vertical时必填，指定资源可扩容的最大规格上限，对于VM类型，若AsMetric为cpu则表示最大CPU核数，若AsMetric为memory则表示最大内存GB数；对于EIP类型，表示最大带宽Mbps，必须大于当前资源的规格，且资源必须支持热升级（镜像需支持Hotplug） */
    
    @OpenAPIParam("MaxSpecification")
    private String maxSpecificationParam;

    /** 最小实例数，当AsMode为Horizontal时必填，伸缩组维持的最小成员数量，取值范围0-100，当AsType为VM且当前成员数少于MinInstance时，系统会自动扩容至MinInstance */
    
    @OpenAPIParam("MinInstance")
    private Integer minInstanceParam;

    /** 伸缩组名称，长度为1-128个字符，名称只能包含中英文、数字、点、下划线和中划线 */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 监听端口，当AsType为VS时必填，用于指定伸缩成员加入负载均衡后端服务节点时使用的端口号 */
    
    @OpenAPIParam("Port")
    private Integer portParam;

    /** 项目ID，用于实现资源的逻辑分组管理，伸缩组将归属于指定项目，未传时尝试分配默认项目 */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 地域ID，指定伸缩组所属的物理区域，伸缩组创建后无法修改地域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 标签键值对，用于资源标记和分类管理，格式为key:value的字符串，传入Base64编码的字符串 */
    @NotEmpty
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;

    /** 虚拟机模板ID，当AsMode为Horizontal时必填，用于创建新伸缩成员时的虚拟机配置模板，模板中的VPC必须与关联的负载均衡（如有）保持一致，若AsMetric为memory，则模板使用的镜像必须支持QGA（QEMU Guest Agent） */
    
    @OpenAPIParam("TemplateID")
    private String templateIDParam;

    /** 伸缩阈值，当监控指标超过此阈值时触发扩容，低于此阈值时触发缩容（若AllowDecrease为true），单位：cpu/memory为百分号（0-100），vs_connection_l7/vs_connection_l4为连接数（个），vs_qps_l7为请求数（requests/s），vs_rt_l7为毫秒（ms），vs_cps_l4为连接数（connections/s），bandwidth为Mbps */
    @NotEmpty
    @OpenAPIParam("Threshold")
    private String thresholdParam;

    /** 监听器ID，当AsType为VS时必填，指定伸缩组关联的VServer监听器，仅支持关联来源为Default的监听器（容器来源的监听器不可用），且监听器不能被其他伸缩组占用 */
    
    @OpenAPIParam("VSID")
    private String vSIDParam;

    /** 垂直伸缩资源ID，当AsMode为Vertical时必填，指定要进行垂直伸缩的具体资源实例ID（虚拟机ID或EIP ID），资源不能同时关联多个伸缩组，且虚拟机不能同时作为水平伸缩组的成员 */
    
    @OpenAPIParam("VerticalResourceID")
    private String verticalResourceIDParam;

    /** 预热时间，当AsMode为Horizontal时必填，新创建的伸缩成员从加入伸缩组到开始参与指标计算的等待时长（秒），用于避免新实例启动期间触发误扩容，取值范围1-3600秒 */
    
    @OpenAPIParam("WarmTime")
    private Integer warmTimeParam;

    /** 负载均衡权重，当AsType为VS时必填，用于指定伸缩成员加入负载均衡后端服务节点时的权重值，权重越高分配流量越多（1-100） */
    
    @OpenAPIParam("Weight")
    private Integer weightParam;


    public Boolean getAllowDecrease() {
        return allowDecreaseParam;
    }

    public void setAllowDecrease(Boolean allowDecreaseParam) {
        this.allowDecreaseParam = allowDecreaseParam;
    }

    public String getAsMetric() {
        return asMetricParam;
    }

    public void setAsMetric(String asMetricParam) {
        this.asMetricParam = asMetricParam;
    }

    public String getAsMode() {
        return asModeParam;
    }

    public void setAsMode(String asModeParam) {
        this.asModeParam = asModeParam;
    }

    public String getAsType() {
        return asTypeParam;
    }

    public void setAsType(String asTypeParam) {
        this.asTypeParam = asTypeParam;
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

    public Integer getMaxInstance() {
        return maxInstanceParam;
    }

    public void setMaxInstance(Integer maxInstanceParam) {
        this.maxInstanceParam = maxInstanceParam;
    }

    public String getMaxSpecification() {
        return maxSpecificationParam;
    }

    public void setMaxSpecification(String maxSpecificationParam) {
        this.maxSpecificationParam = maxSpecificationParam;
    }

    public Integer getMinInstance() {
        return minInstanceParam;
    }

    public void setMinInstance(Integer minInstanceParam) {
        this.minInstanceParam = minInstanceParam;
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

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public List<String> getTagKeyValuePairs() {
        return tagKeyValuePairsParam;
    }

    public void setTagKeyValuePairs(List<String> tagKeyValuePairsParam) {
        this.tagKeyValuePairsParam = tagKeyValuePairsParam;
    }

    public String getTemplateID() {
        return templateIDParam;
    }

    public void setTemplateID(String templateIDParam) {
        this.templateIDParam = templateIDParam;
    }

    public String getThreshold() {
        return thresholdParam;
    }

    public void setThreshold(String thresholdParam) {
        this.thresholdParam = thresholdParam;
    }

    public String getVSID() {
        return vSIDParam;
    }

    public void setVSID(String vSIDParam) {
        this.vSIDParam = vSIDParam;
    }

    public String getVerticalResourceID() {
        return verticalResourceIDParam;
    }

    public void setVerticalResourceID(String verticalResourceIDParam) {
        this.verticalResourceIDParam = verticalResourceIDParam;
    }

    public Integer getWarmTime() {
        return warmTimeParam;
    }

    public void setWarmTime(Integer warmTimeParam) {
        this.warmTimeParam = warmTimeParam;
    }

    public Integer getWeight() {
        return weightParam;
    }

    public void setWeight(Integer weightParam) {
        this.weightParam = weightParam;
    }

}
