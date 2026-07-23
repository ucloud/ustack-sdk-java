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

public class MulticastGroupInfo {

    /** 租户ID，资源所属的租户唯一标识 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，Unix时间戳（秒） */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，租户的联系邮箱地址 */
    @SerializedName("Email")
    private String emailParam;

    /** 接收方虚拟机ID列表，作为组播数据接收端的虚拟机唯一标识集合，系统会校验与VPCID一致性、成员数量（≤9）及跨组唯一性 */
    @SerializedName("MulticasrDest")
    private List<String> multicasrDestParam;

    /** 组播组ID，组播组的唯一标识符 */
    @SerializedName("MulticastGroupID")
    private String multicastGroupIDParam;

    /** 组播组IP地址，224.0.0.0/4网段内的组播目标地址 */
    @SerializedName("MulticastIP")
    private String multicastIPParam;

    /** 组播组端口号，组播数据传输的目标端口 */
    @SerializedName("MulticastPort")
    private Integer multicastPortParam;

    /** 发送方虚拟机ID，作为组播数据发送源的虚拟机唯一标识，需与VPCID一致；同一VPC下IP+Port+Source重复的记录会被拒绝 */
    @SerializedName("MulticastSource")
    private String multicastSourceParam;

    /** 组播组名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目ID，资源所属的项目唯一标识 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 失败原因，当组播组创建或更新失败时记录的错误信息 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，资源所属的物理区域标识 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的可读名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，组播组的说明和注释 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 状态，组播组的当前运行状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 标签列表，用于资源标记和分类管理 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，Unix时间戳（秒） */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** VPC ID，组播组所属的虚拟私有网络唯一标识符 */
    @SerializedName("VPCID")
    private String vPCIDParam;

    /** VPC名称，组播组所属的虚拟私有网络名称 */
    @SerializedName("VPCName")
    private String vPCNameParam;

    /** VPC网段，组播组所属VPC的CIDR地址范围（来自VPC详情，若VPC已删除可能为空） */
    @SerializedName("VPCNetwork")
    private String vPCNetworkParam;


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

    public List<String> getMulticasrDest() {
        return multicasrDestParam;
    }

    public void setMulticasrDest(List<String> multicasrDestParam) {
        this.multicasrDestParam = multicasrDestParam;
    }

    public String getMulticastGroupID() {
        return multicastGroupIDParam;
    }

    public void setMulticastGroupID(String multicastGroupIDParam) {
        this.multicastGroupIDParam = multicastGroupIDParam;
    }

    public String getMulticastIP() {
        return multicastIPParam;
    }

    public void setMulticastIP(String multicastIPParam) {
        this.multicastIPParam = multicastIPParam;
    }

    public Integer getMulticastPort() {
        return multicastPortParam;
    }

    public void setMulticastPort(Integer multicastPortParam) {
        this.multicastPortParam = multicastPortParam;
    }

    public String getMulticastSource() {
        return multicastSourceParam;
    }

    public void setMulticastSource(String multicastSourceParam) {
        this.multicastSourceParam = multicastSourceParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
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

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

    public String getVPCID() {
        return vPCIDParam;
    }

    public void setVPCID(String vPCIDParam) {
        this.vPCIDParam = vPCIDParam;
    }

    public String getVPCName() {
        return vPCNameParam;
    }

    public void setVPCName(String vPCNameParam) {
        this.vPCNameParam = vPCNameParam;
    }

    public String getVPCNetwork() {
        return vPCNetworkParam;
    }

    public void setVPCNetwork(String vPCNetworkParam) {
        this.vPCNetworkParam = vPCNetworkParam;
    }

}
