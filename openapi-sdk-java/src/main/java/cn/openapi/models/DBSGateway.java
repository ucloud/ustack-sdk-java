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

public class DBSGateway {

    /** 带宽，DBS网关的带宽 */
    @SerializedName("Bandwidth")
    private Integer bandwidthParam;

    /** 租户ID，用于标识资源所属的租户，实现多租户环境下的资源隔离 */
    @SerializedName("CompanyID")
    private Integer companyIDParam;

    /** 租户名称，租户的名称 */
    @SerializedName("CompanyName")
    private String companyNameParam;

    /** 创建时间，DBS网关的创建时间戳 */
    @SerializedName("CreateTime")
    private Integer createTimeParam;

    /** DBS网关ID，DBS网关的ID */
    @SerializedName("DBSGatewayID")
    private String dBSGatewayIDParam;

    /** EIPID，外网的IPID */
    @SerializedName("EIPID")
    private String eIPIDParam;

    /** EIPName，外网的名称 */
    @SerializedName("EIPName")
    private String eIPNameParam;

    /** 租户邮箱，租户的邮箱 */
    @SerializedName("Email")
    private String emailParam;

    /** IP，DBS网关的IP */
    @SerializedName("IP")
    private String iPParam;

    /** 名称，DBS网关的名称 */
    @SerializedName("Name")
    private String nameParam;

    /** 外网线路别名，DBS网关的外网线路别名 */
    @SerializedName("OperatorAlias")
    private String operatorAliasParam;

    /** 项目组ID，项目组的ID */
    @SerializedName("ProjectID")
    private String projectIDParam;

    /** 项目名称，项目组的名称 */
    @SerializedName("ProjectName")
    private String projectNameParam;

    /** 地域，DBS网关的地域 */
    @SerializedName("Region")
    private String regionParam;

    /** 备注，DBS网关的描述信息 */
    @SerializedName("Remark")
    private String remarkParam;

    /** DBS网关状态，DBS网关的状态 */
    @SerializedName("Status")
    private String statusParam;

    /** 标签，DBS网关的标签 */
    @SerializedName("Tags")
    private List<UnifiedTag> tagsParam;

    /** 更新时间，DBS网关的更新时间戳 */
    @SerializedName("UpdateTime")
    private Integer updateTimeParam;


    public Integer getBandwidth() {
        return bandwidthParam;
    }

    public void setBandwidth(Integer bandwidthParam) {
        this.bandwidthParam = bandwidthParam;
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

    public String getDBSGatewayID() {
        return dBSGatewayIDParam;
    }

    public void setDBSGatewayID(String dBSGatewayIDParam) {
        this.dBSGatewayIDParam = dBSGatewayIDParam;
    }

    public String getEIPID() {
        return eIPIDParam;
    }

    public void setEIPID(String eIPIDParam) {
        this.eIPIDParam = eIPIDParam;
    }

    public String getEIPName() {
        return eIPNameParam;
    }

    public void setEIPName(String eIPNameParam) {
        this.eIPNameParam = eIPNameParam;
    }

    public String getEmail() {
        return emailParam;
    }

    public void setEmail(String emailParam) {
        this.emailParam = emailParam;
    }

    public String getIP() {
        return iPParam;
    }

    public void setIP(String iPParam) {
        this.iPParam = iPParam;
    }

    public String getName() {
        return nameParam;
    }

    public void setName(String nameParam) {
        this.nameParam = nameParam;
    }

    public String getOperatorAlias() {
        return operatorAliasParam;
    }

    public void setOperatorAlias(String operatorAliasParam) {
        this.operatorAliasParam = operatorAliasParam;
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

}
