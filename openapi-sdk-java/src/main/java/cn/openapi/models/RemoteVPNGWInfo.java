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

public class RemoteVPNGWInfo {

    /** 租户ID，标识资源所属的租户组织，用于多租户资源隔离与权限控制 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 创建时间，秒级Unix时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** 租户邮箱，资源所属租户的联系邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** 对端网关IP地址，对端VPN网关公网IP */
    @SerializedName("IPAddress")
    private String iPAddressParam;

    /** 对端网关名称，用于展示资源名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 项目ID，资源所属项目分组 */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，资源所属项目名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 地域ID，用于标识资源所属的地理区域 */
    @SerializedName("Region")
    private String regionParam;

    /** 备注，对端网关的描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** 对端网关ID，对端网关唯一标识 */
    @SerializedName("RemoteVPNGWID")
    private String remoteVPNGWIDParam;

    /** 对端网关状态，资源状态为Available时映射为Running */
    @SerializedName("State")
    private String stateParam;

    /** 标签列表，用于资源标记和分类管理 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 隧道数量，VPN隧道的数量 */
    @SerializedName("TunnelCount")
    private Integer tunnelCountParam;

    /** 更新时间，秒级Unix时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
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

    public String getIPAddress() {
        return iPAddressParam;
    }

    public void setIPAddress(String iPAddressParam) {
        this.iPAddressParam = iPAddressParam;
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

    public String getRemoteVPNGWID() {
        return remoteVPNGWIDParam;
    }

    public void setRemoteVPNGWID(String remoteVPNGWIDParam) {
        this.remoteVPNGWIDParam = remoteVPNGWIDParam;
    }

    public String getState() {
        return stateParam;
    }

    public void setState(String stateParam) {
        this.stateParam = stateParam;
    }

    public List<UnifiedTag> getTags() {
        return tagsParam;
    }

    public void setTags(List<UnifiedTag> tagsParam) {
        this.tagsParam = tagsParam;
    }

    public Integer getTunnelCount() {
        return tunnelCountParam;
    }

    public void setTunnelCount(Integer tunnelCountParam) {
        this.tunnelCountParam = tunnelCountParam;
    }

    public Integer getUpdateTime() {
        return updateTimeParam;
    }

    public void setUpdateTime(Integer updateTimeParam) {
        this.updateTimeParam = updateTimeParam;
    }

}
