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
package cn.openapi.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class ASGroupInfo {

    /** 是否允许缩容，控制伸缩组是否可以自动缩减资源规模或规格 */
    @SerializedName("AllowDecrease")
    private Boolean allowDecreaseParam;

    /** 伸缩指标，触发自动伸缩的监控指标名称 */
    @SerializedName("AsMetric")
    private String asMetricParam;

    /** 伸缩模式，Horizontal表示水平伸缩，Vertical表示垂直伸缩 */
    @SerializedName("AsMode")
    private String asModeParam;

    /** 伸缩类型，VM表示虚拟机伸缩，VS表示负载均衡监听器伸缩，EIP表示弹性公网IP伸缩 */
    @SerializedName("AsType")
    private String asTypeParam;

    /** 租户ID */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，Unix时间戳（秒） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 伸缩组ID，伸缩组的唯一标识符 */
    @SerializedName("GroupID")
    private String groupIDParam;

    /** 伸缩成员列表，伸缩组当前包含的所有成员实例信息 */
    @SerializedName("InstanceInfos")
    private List<ASInstanceInfo> instanceInfosParam;

    /** 负载均衡ID，当AsType为VS时有值 */
    @SerializedName("LBID")
    private String lBIDParam;

    /** 关联负载均衡列表，伸缩组关联的所有负载均衡器信息 */
    @SerializedName("LBInfos")
    private List<LoadBalancerInfo> lBInfosParam;

    /** 负载均衡名称，当AsType为VS时有值，LBID对应的负载均衡名称 */
    @SerializedName("LBName")
    private String lBNameParam;

    /** 最大实例数，当AsMode为Horizontal时有值，伸缩组允许的最大成员数量 */
    @SerializedName("MaxInstance")
    private Integer maxInstanceParam;

    /** 最大规格，当AsMode为Vertical时有值，资源可扩容的最大规格上限 */
    @SerializedName("MaxSpecification")
    private String maxSpecificationParam;

    /** 最小实例数，当AsMode为Horizontal时有值，伸缩组维持的最小成员数量 */
    @SerializedName("MinInstance")
    private Integer minInstanceParam;

    /** 运行模式，Enabled表示已启用，Disabled表示已禁用 */
    @SerializedName("Mode")
    private String modeParam;

    /** 伸缩组名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 暂停原因，当资源状态为PAUSE时显示暂停的原因说明 */
    @SerializedName("PauseReason")
    private String pauseReasonParam;

    /** 监听端口，当AsType为VS时有值，伸缩成员加入负载均衡时使用的端口号 */
    @SerializedName("Port")
    private Integer portParam;

    /** 项目ID */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 资源状态原因，当资源处于异常状态时显示的原因说明 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的可读名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 资源状态，AVAILABLE表示可用，PAUSE表示暂停 */
    @SerializedName("Status")
    private String statusParam;

    /** 资源标签列表 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 虚拟机模板ID，当AsMode为Horizontal时有值，用于创建新伸缩成员的虚拟机配置模板 */
    @SerializedName("TemplateID")
    private String templateIDParam;

    /** 虚拟机模板名称，当AsMode为Horizontal时有值，TemplateID对应的虚拟机模板名称 */
    @SerializedName("TemplateName")
    private String templateNameParam;

    /** 指标阈值，触发伸缩的监控指标阈值 */
    @SerializedName("Threshold")
    private String thresholdParam;

    /** 监听器ID，当AsType为VS时有值 */
    @SerializedName("VSID")
    private String vSIDParam;

    /** 垂直伸缩资源ID，当AsMode为Vertical时有值，进行垂直伸缩的资源实例ID */
    @SerializedName("VerticalResourceID")
    private String verticalResourceIDParam;

    /** 预热时间（秒），当AsMode为Horizontal时有值，新创建成员的等待时长 */
    @SerializedName("WarmTime")
    private Integer warmTimeParam;

    /** 负载均衡权重，当AsType为VS时有值，伸缩成员在负载均衡中的权重值 */
    @SerializedName("Weight")
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

    public String getCompanyName() {
        return companyNameParam;
    }

    public void setCompanyName(String companyNameParam) {
        this.companyNameParam = companyNameParam;
    }

    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getGroupID() {
        return groupIDParam;
    }

    public void setGroupID(String groupIDParam) {
        this.groupIDParam = groupIDParam;
    }

    public List<ASInstanceInfo> getInstanceInfos() {
        return instanceInfosParam;
    }

    public void setInstanceInfos(List<ASInstanceInfo> instanceInfosParam) {
        this.instanceInfosParam = instanceInfosParam;
    }

    public String getLBID() {
        return lBIDParam;
    }

    public void setLBID(String lBIDParam) {
        this.lBIDParam = lBIDParam;
    }

    public List<LoadBalancerInfo> getLBInfos() {
        return lBInfosParam;
    }

    public void setLBInfos(List<LoadBalancerInfo> lBInfosParam) {
        this.lBInfosParam = lBInfosParam;
    }

    public String getLBName() {
        return lBNameParam;
    }

    public void setLBName(String lBNameParam) {
        this.lBNameParam = lBNameParam;
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

    public String getMode() {
        return modeParam;
    }

    public void setMode(String modeParam) {
        this.modeParam = modeParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getPauseReason() {
        return pauseReasonParam;
    }

    public void setPauseReason(String pauseReasonParam) {
        this.pauseReasonParam = pauseReasonParam;
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

    public String getProjectName() {
        return projectNameParam;
    }

    public void setProjectName(String projectNameParam) {
        this.projectNameParam = projectNameParam;
    }

    public String getReason() {
        return reasonParam;
    }

    public void setReason(String reasonParam) {
        this.reasonParam = reasonParam;
    }

    public String getRegion() {
        return regionParam;
    }

    public void setRegion(String regionParam) {
        this.regionParam = regionParam;
    }

    public String getRegionAlias() {
        return regionAliasParam;
    }

    public void setRegionAlias(String regionAliasParam) {
        this.regionAliasParam = regionAliasParam;
    }

    public String getRemark() {
        return remarkParam;
    }

    public void setRemark(String remarkParam) {
        this.remarkParam = remarkParam;
    }

    public String getStatus() {
        return statusParam;
    }

    public void setStatus(String statusParam) {
        this.statusParam = statusParam;
    }

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public String getTemplateID() {
        return templateIDParam;
    }

    public void setTemplateID(String templateIDParam) {
        this.templateIDParam = templateIDParam;
    }

    public String getTemplateName() {
        return templateNameParam;
    }

    public void setTemplateName(String templateNameParam) {
        this.templateNameParam = templateNameParam;
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
