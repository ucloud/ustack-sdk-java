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

public class TrafficMirrorInfo {

    /** 创建时间，Unix时间戳，单位为秒 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 目的设备信息，包含目标类型、设备名称、链路名称和MAC地址 */
    @SerializedName("Destination")
    private TrafficMirrorDestination destinationParam;

    /** 出方向规则组数量，出站流量过滤规则的数量 */
    @SerializedName("EgressRuleCount")
    private Integer egressRuleCountParam;

    /** 出方向规则组，仅在查询单个流量镜像详情时返回，定义出站流量的过滤规则 */
    @SerializedName("EgressRules")
    private List<TrafficMirrorRule> egressRulesParam;

    /** 是否启用，true表示已启用，false表示已禁用 */
    @SerializedName("Enable")
    private Boolean enableParam;

    /** 入方向规则组数量，入站流量过滤规则的数量 */
    @SerializedName("IngressRuleCount")
    private Integer ingressRuleCountParam;

    /** 入方向规则组，仅在查询单个流量镜像详情时返回，定义入站流量的过滤规则 */
    @SerializedName("IngressRules")
    private List<TrafficMirrorRule> ingressRulesParam;

    /** 报文截取最大长度，单位为字节，取值范围为42-65535 */
    @SerializedName("MaxLength")
    private Integer maxLengthParam;

    /** 流量镜像名称，长度为1-128个字符 */
    @SerializedName("Name")
    private String nameParam;

    /** 状态原因，当状态为Failed时返回失败原因，例如destination device has been terminated 表示目的虚拟机已被销毁 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，资源所属的物理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的中文显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 流量镜像描述信息，长度为0-100个字符 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 源设备数量，当前配置的源设备总数 */
    @SerializedName("SourceCount")
    private Integer sourceCountParam;

    /** 源设备信息列表，仅在查询单个流量镜像详情时返回，包含源设备及其关联虚拟机信息，若源设备对应虚拟机已删除会通过SrcDeviceStatus标记为Terminated并在后续更新中被自动剔除 */
    @SerializedName("Sources")
    private List<TrafficMirrorSource> sourcesParam;

    /** 流量镜像状态，可能值：Available（可用）、Failed（目的虚拟机已被删除或目的端口异常）、Initializing（目的为虚拟机且尚未获取到MAC/链路信息，待Guest Agent上报） */
    @SerializedName("Status")
    private String statusParam;

    /** 标签列表，用于资源标记和分类管理 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 流量镜像ID，流量镜像的唯一标识符 */
    @SerializedName("TrafficMirrorID")
    private String trafficMirrorIDParam;


    public Integer getCreateTime() {
        return createTimeParam;
    }

    public void setCreateTime(Integer createTimeParam) {
        this.createTimeParam = createTimeParam;
    }

    public TrafficMirrorDestination getDestination() {
        return destinationParam;
    }

    public void setDestination(TrafficMirrorDestination destinationParam) {
        this.destinationParam = destinationParam;
    }

    public Integer getEgressRuleCount() {
        return egressRuleCountParam;
    }

    public void setEgressRuleCount(Integer egressRuleCountParam) {
        this.egressRuleCountParam = egressRuleCountParam;
    }

    public List<TrafficMirrorRule> getEgressRules() {
        return egressRulesParam;
    }

    public void setEgressRules(List<TrafficMirrorRule> egressRulesParam) {
        this.egressRulesParam = egressRulesParam;
    }

    public Boolean getEnable() {
        return enableParam;
    }

    public void setEnable(Boolean enableParam) {
        this.enableParam = enableParam;
    }

    public Integer getIngressRuleCount() {
        return ingressRuleCountParam;
    }

    public void setIngressRuleCount(Integer ingressRuleCountParam) {
        this.ingressRuleCountParam = ingressRuleCountParam;
    }

    public List<TrafficMirrorRule> getIngressRules() {
        return ingressRulesParam;
    }

    public void setIngressRules(List<TrafficMirrorRule> ingressRulesParam) {
        this.ingressRulesParam = ingressRulesParam;
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

    public Integer getSourceCount() {
        return sourceCountParam;
    }

    public void setSourceCount(Integer sourceCountParam) {
        this.sourceCountParam = sourceCountParam;
    }

    public List<TrafficMirrorSource> getSources() {
        return sourcesParam;
    }

    public void setSources(List<TrafficMirrorSource> sourcesParam) {
        this.sourcesParam = sourcesParam;
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

    public String getTrafficMirrorID() {
        return trafficMirrorIDParam;
    }

    public void setTrafficMirrorID(String trafficMirrorIDParam) {
        this.trafficMirrorIDParam = trafficMirrorIDParam;
    }

}
