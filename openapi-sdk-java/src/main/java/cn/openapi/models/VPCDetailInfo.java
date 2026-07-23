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

public class VPCDetailInfo {

    /** 租户唯一标识ID，标识用户所属的租户组织，用于实现多租户环境下的资源隔离和权限控制，系统根据此ID确定用户的资源访问范围 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，资源所属租户名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，资源所属租户的联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** VPC名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 网段，VPC主网段的CIDR地址范围 */
    @SerializedName("Network")
    private String networkParam;

    /** 对等连接详情列表，包含与该VPC建立的所有对等连接及其状态 */
    @SerializedName("PeeringInfos")
    private List<PeeringInfo> peeringInfosParam;

    /** 项目ID，资源所属项目分组标识 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，资源所属项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 创建失败原因 */
    @SerializedName("Reason")
    private String reasonParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 地域别名，地域的人性化显示名称 */
    @SerializedName("RegionAlias")
    private String regionAliasParam;

    /** 备注，用于补充说明 */
    @SerializedName("Remark")
    private String remarkParam;

    /** VPC状态，资源生命周期状态，当资源状态非Available时返回资源状态 */
    @SerializedName("State")
    private String stateParam;

    /** 子网数量，展示该VPC下已划分的子网总数 */
    @SerializedName("SubnetCount")
    private Integer subnetCountParam;

    /** 子网详情列表，包含该VPC下所有子网的配置及状态信息 */
    @SerializedName("SubnetInfos")
    private List<SubnetInfo> subnetInfosParam;

    /** 资源标签列表，用于资源分类和检索 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;

    /** VPCID，虚拟私有网络的唯一标识符 */
    @SerializedName("VPCID")
    private String vPCIDParam;


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

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getNetwork() {
        return networkParam;
    }

    public void setNetwork(String networkParam) {
        this.networkParam = networkParam;
    }

    public List<PeeringInfo> getPeeringInfos() {
        return peeringInfosParam;
    }

    public void setPeeringInfos(List<PeeringInfo> peeringInfosParam) {
        this.peeringInfosParam = peeringInfosParam;
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

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public Integer getSubnetCount() {
        return subnetCountParam;
    }

    public void setSubnetCount(Integer subnetCountParam) {
        this.subnetCountParam = subnetCountParam;
    }

    public List<SubnetInfo> getSubnetInfos() {
        return subnetInfosParam;
    }

    public void setSubnetInfos(List<SubnetInfo> subnetInfosParam) {
        this.subnetInfosParam = subnetInfosParam;
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

}
