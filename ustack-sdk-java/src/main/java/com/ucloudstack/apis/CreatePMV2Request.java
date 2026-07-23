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

public class CreatePMV2Request extends Request {

    /** BMC类型名称，标识硬件厂商的BMC类型（如Dell iDRAC、HP iLO等） */
    
    @OpenAPIParam("BMCTypeName")
    private String bMCTypeNameParam;

    /** 租户ID，指定裸金属所属的租户，若为0或超级管理员ID则表示未分配租户 */
    
    @OpenAPIParam("CompanyID")
    private Integer companyIDParam;

    /** 自定义监控地址，用于Prometheus等监控系统采集指标 */
    
    @OpenAPIParam("CustomMetricsPath")
    private String customMetricsPathParam;

    /** 过期时间，Unix时间戳（秒），到期后资源可能被回收 */
    
    @OpenAPIParam("ExpireTime")
    private Integer expireTimeParam;

    /** IPMI管理IP地址，用于带外管理访问 */
    
    @OpenAPIParam("IPMIIP")
    private String iPMIIPParam;

    /** IPMI密码，用于IPMI身份验证 */
    
    @OpenAPIParam("IPMIPassword")
    private String iPMIPasswordParam;

    /** IPMI用户名，用于IPMI身份验证 */
    
    @OpenAPIParam("IPMIUsername")
    private String iPMIUsernameParam;

    /** 资源名称，长度为1-128个字符，名称只能包含中英文、数字、点（.）、下划线（_）和中划线（-） */
    @NotEmpty
    @OpenAPIParam("Name")
    private String nameParam;

    /** 项目ID，用于实现资源的逻辑分组管理，当CompanyID为超级管理员或0时不需要ProjectID */
    
    @OpenAPIParam("ProjectID")
    private String projectIDParam;

    /** 机架位置，标识裸金属在数据中心的物理位置 */
    
    @OpenAPIParam("RackLocation")
    private String rackLocationParam;

    /** 申请原因，说明申请该裸金属资源的用途和目的 */
    
    @OpenAPIParam("Reason")
    private String reasonParam;

    /** 地域ID，指定资源所属的物理区域 */
    @NotEmpty
    @OpenAPIParam("Region")
    private String regionParam;

    /** 备注，用于进行说明和注释，长度为0-100个英文或中文字符，不能使用http://或https://等非法字符，可为空 */
    
    @OpenAPIParam("Remark")
    private String remarkParam;

    /** 标签键值对，用于资源标记和分类管理，格式为key:value的字符串，传入Base64编码的字符串 */
    
    @OpenAPIParam("TagKeyValuePairs")
    private List<String> tagKeyValuePairsParam;


    public String getBMCTypeName() {
        return bMCTypeNameParam;
    }

    public void setBMCTypeName(String bMCTypeNameParam) {
        this.bMCTypeNameParam = bMCTypeNameParam;
    }

    public Integer getCompanyID() {
        return companyIDParam;
    }

    public void setCompanyID(Integer companyIDParam) {
        this.companyIDParam = companyIDParam;
    }

    public String getCustomMetricsPath() {
        return customMetricsPathParam;
    }

    public void setCustomMetricsPath(String customMetricsPathParam) {
        this.customMetricsPathParam = customMetricsPathParam;
    }

    public Integer getExpireTime() {
        return expireTimeParam;
    }

    public void setExpireTime(Integer expireTimeParam) {
        this.expireTimeParam = expireTimeParam;
    }

    public String getIPMIIP() {
        return iPMIIPParam;
    }

    public void setIPMIIP(String iPMIIPParam) {
        this.iPMIIPParam = iPMIIPParam;
    }

    public String getIPMIPassword() {
        return iPMIPasswordParam;
    }

    public void setIPMIPassword(String iPMIPasswordParam) {
        this.iPMIPasswordParam = iPMIPasswordParam;
    }

    public String getIPMIUsername() {
        return iPMIUsernameParam;
    }

    public void setIPMIUsername(String iPMIUsernameParam) {
        this.iPMIUsernameParam = iPMIUsernameParam;
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

    public String getRackLocation() {
        return rackLocationParam;
    }

    public void setRackLocation(String rackLocationParam) {
        this.rackLocationParam = rackLocationParam;
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

}
